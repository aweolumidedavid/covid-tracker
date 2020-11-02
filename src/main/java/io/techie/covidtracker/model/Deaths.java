package io.techie.covidtracker.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Deaths {

    @JsonProperty("deaths")
    private String newDeaths;

    @JsonProperty(value="1M_pop")
    private String m_pop;

    private int total;

    @JsonProperty("deaths")
    public String getNewDeaths() {
        return newDeaths;
    }

    @JsonProperty("deaths")
    public void setNewDeaths(String newDeaths) {
        this.newDeaths = newDeaths;
    }

    @JsonProperty(value="1M_pop")
    public String getM_pop() {
        return m_pop;
    }

    @JsonProperty(value="1M_pop")
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
        return "Deaths{" +
                "newDeaths='" + newDeaths + '\'' +
                ", m_pop='" + m_pop + '\'' +
                ", total=" + total +
                '}';
    }
}
