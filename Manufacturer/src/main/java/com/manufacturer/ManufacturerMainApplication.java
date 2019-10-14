package com.manufacturer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ManufacturerMainApplication {

	public static void main(String[] args) {
		SpringApplication.run(ManufacturerMainApplication.class, args);
		/*
		 * SpringApplication application = new SpringApplication(MainApplication.class);
		 * application.run(args);
		 */
	}
	
}
