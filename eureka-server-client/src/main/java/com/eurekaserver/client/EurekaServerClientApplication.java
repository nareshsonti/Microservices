package com.eurekaserver.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EurekaServerClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServerClientApplication.class, args);
	}

}
