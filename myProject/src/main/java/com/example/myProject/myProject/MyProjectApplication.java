package com.example.myProject.myProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class MyProjectApplication {

	public static void main(String[] args) {
		int i = 7;
		System.out.print( i);

		SpringApplication.run(MyProjectApplication.class, args);
	}
}
