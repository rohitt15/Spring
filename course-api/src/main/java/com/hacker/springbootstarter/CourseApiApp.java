package com.hacker.springbootstarter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CourseApiApp {

	public static void main(String[] args) {
	//here we are calling the static run method from SpringApplication
		SpringApplication.run(CourseApiApp.class, args); 
	}

}
