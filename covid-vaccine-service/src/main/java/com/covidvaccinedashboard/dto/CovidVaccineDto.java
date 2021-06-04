package com.covidvaccinedashboard.dto;

public class CovidVaccineDto {

    private String country;
    private String iso_code;
    private String date;
    private String total_vaccinations;
    private String people_vaccinated;
    private String people_fully_vaccinated;
    private String daily_vaccinations_raw;
    private String daily_vaccinations;
    private String total_vaccinations_per_hundred;
    private String people_vaccinated_per_hundred;
    private String people_fully_vaccinated_per_hundred;
    private String daily_vaccinations_per_million;
    private String vaccines;
    private String source_name;
    private String source_website;

    
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getIso_code() {
        return iso_code;
    }

    public void setIso_code(String iso_code) {
        this.iso_code = iso_code;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTotal_vaccinations() {
        return total_vaccinations;
    }

    public void setTotal_vaccinations(String total_vaccinations) {
        this.total_vaccinations = total_vaccinations;
    }

    public String getPeople_vaccinated() {
        return people_vaccinated;
    }

    public void setPeople_vaccinated(String people_vaccinated) {
        this.people_vaccinated = people_vaccinated;
    }

    public String getPeople_fully_vaccinated() {
        return people_fully_vaccinated;
    }

    public void setPeople_fully_vaccinated(String people_fully_vaccinated) {
        this.people_fully_vaccinated = people_fully_vaccinated;
    }

    public String getDaily_vaccinations_raw() {
        return daily_vaccinations_raw;
    }

    public void setDaily_vaccinations_raw(String daily_vaccinations_raw) {
        this.daily_vaccinations_raw = daily_vaccinations_raw;
    }

    public String getDaily_vaccinations() {
        return daily_vaccinations;
    }

    public void setDaily_vaccinations(String daily_vaccinations) {
        this.daily_vaccinations = daily_vaccinations;
    }

    public String getTotal_vaccinations_per_hundred() {
        return total_vaccinations_per_hundred;
    }

    public void setTotal_vaccinations_per_hundred(String total_vaccinations_per_hundred) {
        this.total_vaccinations_per_hundred = total_vaccinations_per_hundred;
    }

    public String getPeople_vaccinated_per_hundred() {
        return people_vaccinated_per_hundred;
    }

    public void setPeople_vaccinated_per_hundred(String people_vaccinated_per_hundred) {
        this.people_vaccinated_per_hundred = people_vaccinated_per_hundred;
    }

    public String getPeople_fully_vaccinated_per_hundred() {
        return people_fully_vaccinated_per_hundred;
    }

    public void setPeople_fully_vaccinated_per_hundred(String people_fully_vaccinated_per_hundred) {
        this.people_fully_vaccinated_per_hundred = people_fully_vaccinated_per_hundred;
    }

    public String getDaily_vaccinations_per_million() {
        return daily_vaccinations_per_million;
    }

    public void setDaily_vaccinations_per_million(String daily_vaccinations_per_million) {
        this.daily_vaccinations_per_million = daily_vaccinations_per_million;
    }

    public String getVaccines() {
        return vaccines;
    }

    public void setVaccines(String vaccines) {
        this.vaccines = vaccines;
    }

    public String getSource_name() {
        return source_name;
    }

    public void setSource_name(String source_name) {
        this.source_name = source_name;
    }

    public String getSource_website() {
        return source_website;
    }

    public void setSource_website(String source_website) {
        this.source_website = source_website;
    }

    public CovidVaccineDto() {
    }

    @Override
    public String toString() {
        return "CovidVaccineDto [country=" + country + ", daily_vaccinations=" + daily_vaccinations
                + ", daily_vaccinations_per_million=" + daily_vaccinations_per_million + ", daily_vaccinations_raw="
                + daily_vaccinations_raw + ", date=" + date + ", iso_code=" + iso_code + ", people_fully_vaccinated="
                + people_fully_vaccinated + ", people_fully_vaccinated_per_hundred="
                + people_fully_vaccinated_per_hundred + ", people_vaccinated=" + people_vaccinated
                + ", people_vaccinated_per_hundred=" + people_vaccinated_per_hundred + ", source_name=" + source_name
                + ", source_website=" + source_website + ", total_vaccinations=" + total_vaccinations
                + ", total_vaccinations_per_hundred=" + total_vaccinations_per_hundred + ", vaccines=" + vaccines + "]";
    }

    
}
