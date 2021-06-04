package com.covidvaccinedashboard.config;

import com.covidvaccinedashboard.dto.CovidVaccineDto;
import com.covidvaccinedashboard.entity.CovidVaccine;

import org.springframework.batch.item.ItemProcessor;

public class CovidDataItemProcessor implements ItemProcessor<CovidVaccineDto,CovidVaccine> {

    @Override
    public CovidVaccine process(CovidVaccineDto arg0) throws Exception {
        CovidVaccine covidVaccine = new CovidVaccine();
        covidVaccine.setCountry(arg0.getCountry());
        covidVaccine.setIsoCode(arg0.getIso_code());
        covidVaccine.setTotalVaccinations(arg0.getTotal_vaccinations());
        covidVaccine.setPeopleVaccinated(arg0.getPeople_vaccinated());
        covidVaccine.setPeopleFullyVaccinated(arg0.getPeople_fully_vaccinated());
        covidVaccine.setDailyVaccinations(arg0.getDaily_vaccinations());
        covidVaccine.setTotalVaccinationsPerHundred(arg0.getTotal_vaccinations_per_hundred());
        covidVaccine.setPeopleVaccinatedPerHundred(arg0.getPeople_vaccinated_per_hundred());
        covidVaccine.setPeopleFullyVaccinatedPerHundred(arg0.getPeople_fully_vaccinated_per_hundred());
        covidVaccine.setVaccines(arg0.getVaccines());
        covidVaccine.setDate(arg0.getDate());
        return covidVaccine;
    }

}
