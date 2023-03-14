package com.example.ToDo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;
@Entity
@Data
public class User {
    @Id
    private Long id;
    private String userName;
    private String password;

    @OneToMany
    private List<Todo> toDoList = new ArrayList<>();
}
