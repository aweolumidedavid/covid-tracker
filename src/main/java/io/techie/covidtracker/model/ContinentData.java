package io.techie.covidtracker.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

public class ContinentData {
    @JsonProperty("continent")
    private String continent;
    @JsonProperty("country")
    private String country;
    @JsonProperty("population")
    private long population;

    @JsonProperty("cases")
    private Cases cases;
    @JsonProperty("deaths")
    private Deaths deaths;
    @JsonProperty("tests")
    private Tests tests;

    @JsonProperty("day")
    private String day;
    @JsonProperty("time")
    private String time;

    private List<ContinentData> continentDataList = new ArrayList<>();

    public List<ContinentData> getContinentDataList() {
        return continentDataList;
    }

    public void setContinentDataList(List<ContinentData> continentDataList) {
        this.continentDataList = continentDataList;
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public long getPopulation() {
        return population;
    }

    public void setPopulation(long population) {
        this.population = population;
    }

    public Cases getCases() {
        return cases;
    }

    public void setCases(Cases cases) {
        this.cases = cases;
    }

    public Deaths getDeaths() {
        return deaths;
    }

    public void setDeaths(Deaths deaths) {
        this.deaths = deaths;
    }

    public Tests getTests() {
        return tests;
    }

    public void setTests(Tests tests) {
        this.tests = tests;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "ContinentData{" +
                "continent='" + continent + '\'' +
                ", country='" + country + '\'' +
                ", population=" + population +
                ", cases=" + cases +
                ", deaths=" + deaths +
                ", tests=" + tests +
                ", day='" + day + '\'' +
                ", time='" + time + '\'' +
                '}';
    }
}
