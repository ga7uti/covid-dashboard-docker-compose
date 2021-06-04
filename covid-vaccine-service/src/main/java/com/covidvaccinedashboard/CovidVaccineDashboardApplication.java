package com.covidvaccinedashboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class CovidVaccineDashboardApplication {

	public static void main(String[] args) {
		SpringApplication.run(CovidVaccineDashboardApplication.class, args);
	}

}
