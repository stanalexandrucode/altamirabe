package com.example.altamirabe.dto;

public class TaskDto {
    private String tipTask;

    private String name;

    private String durataLimita;

    private String durataEstimata;


    public TaskDto(String tipTask, String name, String durataLimita, String durataEstimata) {
        this.tipTask = tipTask;
        this.name = name;
        this.durataLimita = durataLimita;
        this.durataEstimata = durataEstimata;
    }

    public TaskDto() {
    }

    public String getTipTask() {
        return tipTask;
    }

    public void setTipTask(String tipTask) {
        this.tipTask = tipTask;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDurataLimita() {
        return durataLimita;
    }

    public void setDurataLimita(String durataLimita) {
        this.durataLimita = durataLimita;
    }

    public String getDurataEstimata() {
        return durataEstimata;
    }

    public void setDurataEstimata(String durataEstimata) {
        this.durataEstimata = durataEstimata;
    }

    @Override
    public String toString() {
        return "TaskDto{" +
                "tipTask='" + tipTask + '\'' +
                ", name='" + name + '\'' +
                ", durataLimita='" + durataLimita + '\'' +
                ", durataEstimata='" + durataEstimata + '\'' +
                '}';
    }
}
