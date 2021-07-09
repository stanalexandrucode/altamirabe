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

    private String typeTask;

    private String name;

    private String timeLimit;

    private String estimatedTime;

    private int numberOfDaysRemaining;

    private LocalDateTime taskCreatedAt;

    private LocalDateTime completedAt;

    private int dayTakenToComplete;

    private boolean isCompleted;

    public Task(Long id, String typeTask, String name, String timeLimit, String estimatedTime, int numberOfDaysRemaining, LocalDateTime taskCreatedAt, LocalDateTime completedAt, int dayTakenToComplete, boolean isCompleted) {
        this.id = id;
        this.typeTask = typeTask;
        this.name = name;
        this.timeLimit = timeLimit;
        this.estimatedTime = estimatedTime;
        this.numberOfDaysRemaining = numberOfDaysRemaining;
        this.taskCreatedAt = taskCreatedAt;
        this.completedAt = completedAt;
        this.dayTakenToComplete = dayTakenToComplete;
        this.isCompleted = isCompleted;
    }

    public Task() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTypeTask() {
        return typeTask;
    }

    public void setTypeTask(String typeTask) {
        this.typeTask = typeTask;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTimeLimit() {
        return timeLimit;
    }

    public void setTimeLimit(String timeLimit) {
        this.timeLimit = timeLimit;
    }

    public String getEstimatedTime() {
        return estimatedTime;
    }

    public void setEstimatedTime(String estimatedTime) {
        this.estimatedTime = estimatedTime;
    }

    public int getNumberOfDaysRemaining() {
        return numberOfDaysRemaining;
    }

    public void setNumberOfDaysRemaining(int numberOfDaysRemaining) {
        this.numberOfDaysRemaining = numberOfDaysRemaining;
    }

    public LocalDateTime getTaskCreatedAt() {
        return taskCreatedAt;
    }

    public void setTaskCreatedAt(LocalDateTime taskCreatedAt) {
        this.taskCreatedAt = taskCreatedAt;
    }

    public LocalDateTime getCompletedAt() {
        return completedAt;
    }

    public void setCompletedAt(LocalDateTime completedAt) {
        this.completedAt = completedAt;
    }

    public int getDayTakenToComplete() {
        return dayTakenToComplete;
    }

    public void setDayTakenToComplete(int dayTakenToComplete) {
        this.dayTakenToComplete = dayTakenToComplete;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void setCompleted(boolean completed) {
        isCompleted = completed;
    }

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", typeTask='" + typeTask + '\'' +
                ", name='" + name + '\'' +
                ", timeLimit='" + timeLimit + '\'' +
                ", estimatedTime='" + estimatedTime + '\'' +
                ", numberOfDaysRemaining=" + numberOfDaysRemaining +
                ", taskCreatedAt=" + taskCreatedAt +
                ", completedAt=" + completedAt +
                ", dayTakenToComplete=" + dayTakenToComplete +
                ", isCompleted=" + isCompleted +
                '}';
    }
}
