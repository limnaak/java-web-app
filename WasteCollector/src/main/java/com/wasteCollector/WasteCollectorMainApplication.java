package com.wasteCollector;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class WasteCollectorMainApplication {

	public static void main(String[] args) {
		SpringApplication.run(WasteCollectorMainApplication.class, args);
		/*
		 * SpringApplication application = new SpringApplication(MainApplication.class);
		 * application.run(args);
		 */
	}
	
}
