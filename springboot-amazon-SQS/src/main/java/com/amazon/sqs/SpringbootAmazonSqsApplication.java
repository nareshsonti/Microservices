package com.amazon.sqs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.amazon.sqs")
public class SpringbootAmazonSqsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootAmazonSqsApplication.class, args);
	}

}
