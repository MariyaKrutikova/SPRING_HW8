package com.example.spingDataHW5;

import com.example.spingDataHW5.services.TaskService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class SpingDataHw5Application {

	public static void main(String[] args) {

		SpringApplication.run(SpingDataHw5Application.class, args);

		var c = new AnnotationConfigApplicationContext(SpingDataHw5Application.class);
		var service = c.getBean(TaskService.class);
		service.deleteTask( 1L);
//		service.addTask(Task task);
//		service.getTaskById(Long id);
	}

}
