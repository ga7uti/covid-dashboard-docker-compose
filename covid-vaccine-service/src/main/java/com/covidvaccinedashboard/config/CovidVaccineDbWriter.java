package com.covidvaccinedashboard.config;

import java.util.List;

import com.covidvaccinedashboard.entity.CovidVaccine;
import com.covidvaccinedashboard.repository.CovidVaccineRepository;

import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CovidVaccineDbWriter implements ItemWriter<CovidVaccine> {

    private CovidVaccineRepository covidVaccineRepository;

    @Autowired
    public CovidVaccineDbWriter(CovidVaccineRepository covidVaccineRepository) {
        this.covidVaccineRepository = covidVaccineRepository;
    }

    @Override
    public void write(List<? extends CovidVaccine> vaccineData) throws Exception {
        covidVaccineRepository.saveAll(vaccineData);
    }

}
