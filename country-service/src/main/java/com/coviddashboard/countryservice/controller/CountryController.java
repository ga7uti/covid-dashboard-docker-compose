package com.coviddashboard.countryservice.controller;

import com.coviddashboard.countryservice.repository.CountryRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class CountryController {

    private CountryRepository countryRepository;

    @Autowired
    public CountryController(CountryRepository countryRepository) {
        this.countryRepository = countryRepository;
    }

    @GetMapping("/country")
    public ResponseEntity<?> getCountries() {
        return ResponseEntity.ok().body(countryRepository.findAll());
    }
}
