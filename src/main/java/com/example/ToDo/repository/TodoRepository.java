package com.example.ToDo.repository;

import com.example.ToDo.entity.Todo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository <Todo, Long> {
}
