package com.example.altamirabe.repository;

import com.example.altamirabe.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public interface TaskRepository extends JpaRepository<Task, Long> {
}
