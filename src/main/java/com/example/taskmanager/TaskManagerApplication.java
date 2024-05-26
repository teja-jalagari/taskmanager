package com.example.taskmanager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
// import org.springframework.data.jpa.entity.annotation.EntityScan;

@SpringBootApplication
@EnableJpaRepositories("com.example.taskmanager.repository")
@org.springframework.boot.autoconfigure.domain.EntityScan("com.example.taskmanager.model")
public class TaskManagerApplication {

    public static void main(String[] args) {
        SpringApplication.run(TaskManagerApplication.class, args);
    }
}
