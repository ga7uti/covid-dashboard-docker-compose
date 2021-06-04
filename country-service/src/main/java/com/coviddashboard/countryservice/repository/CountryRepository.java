package com.coviddashboard.countryservice.repository;

import com.coviddashboard.countryservice.entity.Country;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryRepository extends CrudRepository<Country, Integer> {

}
