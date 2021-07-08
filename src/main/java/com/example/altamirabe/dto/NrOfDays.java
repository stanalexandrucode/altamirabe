package com.example.altamirabe.dto;


public class NrOfDays {

    private int nrOfDays;

    public NrOfDays(int nrOfDays) {
        this.nrOfDays = nrOfDays;
    }

    public NrOfDays() {
    }

    public int getNrOfDays() {
        return nrOfDays;
    }

    public void setNrOfDays(int nrOfDays) {
        this.nrOfDays = nrOfDays;
    }

    @Override
    public String toString() {
        return "NrOfDays{" +
                "nrOfDays=" + nrOfDays +
                '}';
    }
}
