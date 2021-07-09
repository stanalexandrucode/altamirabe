package com.example.altamirabe.service;

import com.example.altamirabe.dto.NrOfDays;
import com.example.altamirabe.dto.TaskDto;
import com.example.altamirabe.model.Task;
import com.example.altamirabe.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class TaskService {
    private final TaskRepository taskRepository;

    @Autowired
    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @Transactional
    public void addTask(TaskDto taskDto) {


        Task task = new Task();
        task.setTypeTask(taskDto.getTypeTask());
        task.setName(taskDto.getName());
        task.setTimeLimit(taskDto.getTimeLimit());
        task.setEstimatedTime(taskDto.getEstimatedTime());
        task.setTaskCreatedAt(LocalDateTime.now());
        task.setCompleted(false);
        taskRepository.save(task);
    }

    @Transactional
    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }

    @Transactional
    public void deleteTask(Long id) {
        taskRepository.deleteTasksById(id);
    }

    public Task updateTask(NrOfDays nrOfDays, Long id) {
        Task currentTask = taskRepository.findTaskById(id);
        currentTask.setCompletedAt(LocalDateTime.now());
        currentTask.setCompleted(true);
        currentTask.setDayTakenToComplete(nrOfDays.getNrOfDays());
        taskRepository.save(currentTask);
        return currentTask;

    }

}
