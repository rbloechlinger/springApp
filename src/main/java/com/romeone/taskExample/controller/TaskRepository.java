package com.romeone.taskExample.controller;

import com.romeone.taskExample.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {

}