package com.covidvaccinedashboard.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CovidVaccine {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String country;
    private String isoCode;
    private String totalVaccinations;
    private String peopleVaccinated;
    private String peopleFullyVaccinated;
    private String dailyVaccinations;
    private String date;
    private String totalVaccinationsPerHundred;
    private String peopleVaccinatedPerHundred;
    private String peopleFullyVaccinatedPerHundred;
    private String dailyVaccinationsPerMillion;
    private String vaccines;

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getIsoCode() {
        return isoCode;
    }

    public void setIsoCode(String isoCode) {
        this.isoCode = isoCode;
    }

    public String getTotalVaccinations() {
        return totalVaccinations;
    }

    public void setTotalVaccinations(String totalVaccinations) {
        this.totalVaccinations = totalVaccinations;
    }

    public String getPeopleVaccinated() {
        return peopleVaccinated;
    }

    public void setPeopleVaccinated(String peopleVaccinated) {
        this.peopleVaccinated = peopleVaccinated;
    }

    public String getPeopleFullyVaccinated() {
        return peopleFullyVaccinated;
    }

    public void setPeopleFullyVaccinated(String peopleFullyVaccinated) {
        this.peopleFullyVaccinated = peopleFullyVaccinated;
    }

    public String getDailyVaccinations() {
        return dailyVaccinations;
    }

    public void setDailyVaccinations(String dailyVaccinations) {
        this.dailyVaccinations = dailyVaccinations;
    }

    public String getTotalVaccinationsPerHundred() {
        return totalVaccinationsPerHundred;
    }

    public void setTotalVaccinationsPerHundred(String totalVaccinationsPerHundred) {
        this.totalVaccinationsPerHundred = totalVaccinationsPerHundred;
    }

    public String getPeopleVaccinatedPerHundred() {
        return peopleVaccinatedPerHundred;
    }

    public void setPeopleVaccinatedPerHundred(String peopleVaccinatedPerHundred) {
        this.peopleVaccinatedPerHundred = peopleVaccinatedPerHundred;
    }

    public String getPeopleFullyVaccinatedPerHundred() {
        return peopleFullyVaccinatedPerHundred;
    }

    public void setPeopleFullyVaccinatedPerHundred(String peopleFullyVaccinatedPerHundred) {
        this.peopleFullyVaccinatedPerHundred = peopleFullyVaccinatedPerHundred;
    }

    public String getDailyVaccinationsPerMillion() {
        return dailyVaccinationsPerMillion;
    }

    public void setDailyVaccinationsPerMillion(String dailyVaccinationsPerMillion) {
        this.dailyVaccinationsPerMillion = dailyVaccinationsPerMillion;
    }

    public String getVaccines() {
        return vaccines;
    }

    public void setVaccines(String vaccines) {
        this.vaccines = vaccines;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "CovidVaccine [country=" + country + ", dailyVaccinations=" + dailyVaccinations
                + ", dailyVaccinationsPerMillion=" + dailyVaccinationsPerMillion + ", isoCode=" + isoCode
                + ", peopleFullyVaccinated=" + peopleFullyVaccinated + ", peopleFullyVaccinatedPerHundred="
                + peopleFullyVaccinatedPerHundred + ", peopleVaccinated=" + peopleVaccinated
                + ", peopleVaccinatedPerHundred=" + peopleVaccinatedPerHundred + ", totalVaccinations="
                + totalVaccinations + ", totalVaccinationsPerHundred=" + totalVaccinationsPerHundred + ", vaccines="
                + vaccines + "]";
    }

}
