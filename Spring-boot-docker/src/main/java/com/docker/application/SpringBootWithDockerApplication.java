package com.docker.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.docker.employee")
public class SpringBootWithDockerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootWithDockerApplication.class, args);
	}

}
