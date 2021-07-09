package com.example.altamirabe.service;

import com.example.altamirabe.dto.NrOfDays;
import com.example.altamirabe.dto.TaskDto;
import com.example.altamirabe.exceptions.TimeEstimatedException;
import com.example.altamirabe.exceptions.TimeExpiredException;
import com.example.altamirabe.model.Task;
import com.example.altamirabe.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
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
    public void addTask(TaskDto taskDto) throws TimeExpiredException, TimeEstimatedException {
        isInThePast(taskDto.getTimeLimit());
        isEstimatedTimeNegative(taskDto.getEstimatedTime());
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

    private boolean isInThePast(String limitDate) throws TimeExpiredException {
        LocalDate dateTime = LocalDate.parse(limitDate);
        LocalDate currentDate = LocalDate.now();
        boolean isBefore = dateTime.isBefore(currentDate);
        if (isBefore) {
            throw new TimeExpiredException("Time is in the past, select another date");
        }
        return false;
    }

    private boolean isEstimatedTimeNegative(String estimatedTime) throws TimeEstimatedException {
        int time = Integer.parseInt(estimatedTime);
        if (time < 0) {
            throw new TimeEstimatedException("Estimated time can not be negative");
        }
        return false;
    }

}
