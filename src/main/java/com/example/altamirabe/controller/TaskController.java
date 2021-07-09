package com.example.altamirabe.controller;


import com.example.altamirabe.dto.NrOfDays;
import com.example.altamirabe.dto.TaskDto;
import com.example.altamirabe.exceptions.TimeEstimatedException;
import com.example.altamirabe.exceptions.TimeExpiredException;
import com.example.altamirabe.model.Task;
import com.example.altamirabe.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.HttpStatus.OK;

@RestController
@RequestMapping("/task")
@CrossOrigin(origins = "http://localhost:3000")
public class TaskController {
    TaskService taskService;

    @Autowired
    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @PostMapping("/add")
    public ResponseEntity<Void> addNewTask(@RequestBody TaskDto taskDto) throws TimeExpiredException, TimeEstimatedException {
        taskService.addTask(taskDto);
        System.out.println(taskDto.getTimeLimit());
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<Task>> getAllTasks() {
        List<Task> tasks = taskService.getAllTasks();
        return new ResponseEntity<>(tasks, OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteTask(@PathVariable("id") Long id) {
        taskService.deleteTask(id);
        return new ResponseEntity<>(OK);
    }

    @PostMapping("/update/{id}")
    public ResponseEntity<Task> addNewUser(@RequestBody NrOfDays nrOfDays, @PathVariable("id") Long id) {
        Task task = taskService.updateTask(nrOfDays, id);
        return new ResponseEntity<>(task, OK);
    }
}
