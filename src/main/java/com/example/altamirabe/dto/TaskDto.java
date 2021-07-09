package com.example.altamirabe.dto;

public class TaskDto {
    private String typeTask;

    private String name;

    private String timeLimit;

    private String estimatedTime;


    public TaskDto(String typeTask, String name, String timeLimit, String estimatedTime) {
        this.typeTask = typeTask;
        this.name = name;
        this.timeLimit = timeLimit;
        this.estimatedTime = estimatedTime;
    }

    public TaskDto() {
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

    @Override
    public String toString() {
        return "TaskDto{" +
                "typeTask='" + typeTask + '\'' +
                ", name='" + name + '\'' +
                ", timeLimit='" + timeLimit + '\'' +
                ", estimatedTime='" + estimatedTime + '\'' +
                '}';
    }
}
