package com.example.ToDo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Todo {
@Id
    private Long id;
    private String content;
    private boolean completed =false;
}
