package com.drivingschool.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication(scanBasePackages="com.drivingschool")
public class MainApp extends SpringBootServletInitializer{
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
	
		return builder.sources(MainApp.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(MainApp.class, args);
			
	}

}
