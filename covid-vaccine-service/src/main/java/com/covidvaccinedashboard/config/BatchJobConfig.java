package com.covidvaccinedashboard.config;

import com.covidvaccinedashboard.dto.CovidVaccineDto;
import com.covidvaccinedashboard.entity.CovidVaccine;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.batch.item.ItemWriter;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.batch.item.file.builder.FlatFileItemReaderBuilder;
import org.springframework.batch.item.file.mapping.BeanWrapperFieldSetMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ResourceLoader;

@Configuration
@EnableBatchProcessing
public class BatchJobConfig {

    public JobBuilderFactory jobBuilderFactory;

    public StepBuilderFactory stepBuilderFactory;

    private ResourceLoader resourceLoader;

    @Autowired
    public BatchJobConfig(JobBuilderFactory jobBuilderFactory, StepBuilderFactory stepBuilderFactory,
            ResourceLoader resourceLoader) {
        this.jobBuilderFactory = jobBuilderFactory;
        this.stepBuilderFactory = stepBuilderFactory;
        this.resourceLoader = resourceLoader;
    }

    @Bean
    public FlatFileItemReader<CovidVaccineDto> reader() {
        return new FlatFileItemReaderBuilder<CovidVaccineDto>().name("covidVaccineItemReader")
                .resource(resourceLoader.getResource("s3://covid-vaccine-data/country_vaccinations.csv")).delimited()
                .names(new String[] { "country", "iso_code", "date", "total_vaccinations", "people_vaccinated",
                        "people_fully_vaccinated", "daily_vaccinations_raw", "daily_vaccinations",
                        "total_vaccinations_per_hundred", "people_vaccinated_per_hundred",
                        "people_fully_vaccinated_per_hundred", "daily_vaccinations_per_million", "vaccines",
                        "source_name", "source_website" })
                .fieldSetMapper(new BeanWrapperFieldSetMapper<CovidVaccineDto>() {
                    {
                        setTargetType(CovidVaccineDto.class);
                    }
                }).linesToSkip(1).build();
    }

    @Bean
    public CovidDataItemProcessor processor() {
        return new CovidDataItemProcessor();
    }

    @Bean
    public Job importUserJob(JobCompletionNotificationListener listener, Step step1) {
        return jobBuilderFactory.get("importUserJob").incrementer(new RunIdIncrementer()).listener(listener).flow(step1)
                .end().build();
    }

    @Bean
    public Step step1(ItemWriter<CovidVaccine> writer) {
        return stepBuilderFactory.get("step1").<CovidVaccineDto, CovidVaccine>chunk(10).reader(reader())
                .processor(processor()).writer(writer).build();
    }

}
