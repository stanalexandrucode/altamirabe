package com.example.altamirabe.model;


import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Task {

    @Id
    @SequenceGenerator(
            name = "meal_sequence",
            sequenceName = "meal_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "meal_sequence"
    )
    @Column(name = "id")
    private Long id;

    private String tipTask;

    private String name;

    private String durataLimita;

    private String durataEstimata;

    private int numberOfDaysRemaining;

    private LocalDateTime localDateTime;

    public Task(Long id, String tipTask, String name, String durataLimita, String durataEstimata, int numberOfDaysRemaining, LocalDateTime localDateTime) {
        this.id = id;
        this.tipTask = tipTask;
        this.name = name;
        this.durataLimita = durataLimita;
        this.durataEstimata = durataEstimata;
        this.numberOfDaysRemaining = numberOfDaysRemaining;
        this.localDateTime = localDateTime;
    }

    public Task() {
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public int getNumberOfDaysRemaining() {
        return numberOfDaysRemaining;
    }

    public void setNumberOfDaysRemaining(int numberOfDaysRemaining) {
        this.numberOfDaysRemaining = numberOfDaysRemaining;
    }

    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }

    public void setLocalDateTime(LocalDateTime localDateTime) {
        this.localDateTime = localDateTime;
    }
}
