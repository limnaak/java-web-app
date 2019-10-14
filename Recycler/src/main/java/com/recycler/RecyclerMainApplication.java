package com.recycler;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class RecyclerMainApplication {

	public static void main(String[] args) {
		SpringApplication.run(RecyclerMainApplication.class, args);
		/*
		 * SpringApplication application = new SpringApplication(MainApplication.class);
		 * application.run(args);
		 */
	}
	
}
