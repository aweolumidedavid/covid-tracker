package io.techie.covidtracker.model;

import com.fasterxml.jackson.annotation.JsonProperty;


public class Cases {
    @JsonProperty("new")
    private String newCases;

    private int active;
    private int critical;
    private int recovered;

    @JsonProperty("1M_pop")
    private String m_pop;

    private int total;


    public String getNewCases() {
        return newCases;
    }


    public void setNewCases(String newCases) {
        this.newCases = newCases;
    }

    public int getActive() {
        return active;
    }

    public void setActive(int active) {
        this.active = active;
    }

    public int getCritical() {
        return critical;
    }

    public void setCritical(int critical) {
        this.critical = critical;
    }

    public int getRecovered() {
        return recovered;
    }

    public void setRecovered(int recovered) {
        this.recovered = recovered;
    }

    @JsonProperty("1M_pop")
    public String getM_pop() {
        return m_pop;
    }

    @JsonProperty("1M_pop")
    public void setM_pop(String m_pop) {
        this.m_pop = m_pop;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "Cases{" +
                "newCases='" + newCases + '\'' +
                ", active=" + active +
                ", critical=" + critical +
                ", recovered=" + recovered +
                ", m_pop='" + m_pop + '\'' +
                ", total=" + total +
                '}';
    }
}
