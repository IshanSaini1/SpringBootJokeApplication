package com.wolfspring.starterpack;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class JokeAppApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(JokeAppApplication.class, args);
	}

}
