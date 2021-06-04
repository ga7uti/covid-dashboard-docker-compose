package com.covidvaccinedashboard.repository;

import java.util.List;

import com.covidvaccinedashboard.entity.CovidVaccine;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CovidVaccineRepository extends JpaRepository<CovidVaccine, Integer> {

    public List<CovidVaccine> findByCountry(String country);

    public List<CovidVaccine> findByIsoCode(String isoCode);
}
