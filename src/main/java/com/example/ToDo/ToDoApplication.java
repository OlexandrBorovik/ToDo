package com.example.ToDo;

import com.example.ToDo.entity.Todo;
import com.example.ToDo.entity.User;
import com.example.ToDo.repository.TodoRepository;
import com.example.ToDo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ToDoApplication implements CommandLineRunner {
	@Autowired
	private UserRepository userRepository;
	private TodoRepository todoRepository;
	public static void main(String[] args) {
		SpringApplication.run(ToDoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		User user = new User();
		user.setId(1L);
		user.setPassword("hashed");
		user.setUserName("Ted");

		Todo todo = new Todo();
		todo.setId(1L);
		todo.setContent("Cut my cat");

		user.getToDoList().add(todo);
userRepository.save(user);
todoRepository.save(todo);
	}
}
