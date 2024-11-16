package com.Task.MiniProject;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class
MiniProject {
	@Bean
	ModelMapper getModelMapper(){
		return new ModelMapper();
	}

	public static void main(String[] args) {
		SpringApplication.run(MiniProject.class, args);
	}


}
