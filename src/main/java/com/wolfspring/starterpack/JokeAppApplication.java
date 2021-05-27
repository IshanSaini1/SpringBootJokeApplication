package com.wolfspring.starterpack;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.wolfspring.starterpack.controllers.JokeController;

@SpringBootApplication
public class JokeAppApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(JokeAppApplication.class, args);
		JokeController controller = (JokeController)ctx.getBean("jokeController");
		System.out.println(controller.returnJoke());
	}

}
