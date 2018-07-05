package com.yatish.start;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.yatish")
public class WebServicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebServicesApplication.class, args);
	}
}
