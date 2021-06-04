package com.covidvaccinedashboard.controller;

import com.covidvaccinedashboard.repository.CovidVaccineRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class CovidVaccineController {

    private CovidVaccineRepository covidVaccineRepository;

    @Autowired
    public CovidVaccineController(CovidVaccineRepository covidVaccineRepository) {
        this.covidVaccineRepository = covidVaccineRepository;
    }

    @GetMapping("/covidvaccine")
    public ResponseEntity<?> getCovidVaccineDetailsOfCountryCode(@RequestParam("iso") String iso) {
        try {
            return ResponseEntity.ok(covidVaccineRepository.findByIsoCode(iso));
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("{\"message\":\"Something went wrong\"}");
        }

    }
}