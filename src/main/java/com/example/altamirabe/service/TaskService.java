package com.example.altamirabe.service;

import com.example.altamirabe.dto.TaskDto;
import com.example.altamirabe.model.Task;
import com.example.altamirabe.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class TaskService {
    private final TaskRepository taskRepository;

    @Autowired
    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public void addTask(TaskDto taskDto) {
        Task task = new Task();
        task.setTipTask(taskDto.getTipTask());
        task.setName(taskDto.getName());
        task.setDurataLimita(taskDto.getDurataLimita());
        task.setDurataEstimata(taskDto.getDurataEstimata());
        task.setTaskCreatedAt(LocalDateTime.now());
        taskRepository.save(task);
    }

    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }
}
