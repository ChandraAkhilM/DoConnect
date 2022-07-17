package com.doconnect;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import io.swagger.v3.oas.annotations.OpenAPIDefinition;

@OpenAPIDefinition
@SpringBootApplication
public class SpringbootapplicationApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootapplicationApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

	}

}
