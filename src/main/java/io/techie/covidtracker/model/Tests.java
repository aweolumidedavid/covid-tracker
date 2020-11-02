package io.techie.covidtracker.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Tests {

    @JsonProperty("1M_pop")
    private String m_pop;
    private int total;

    public String getM_pop() {
        return m_pop;
    }

    public void setM_pop(String m_pop) {
        this.m_pop = m_pop;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}
