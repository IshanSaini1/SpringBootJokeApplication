package com.wolfspring.starterpack.controllers;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.wolfspring.starterpack.services.JokeService;

@Controller
public class JokeController {
	private JokeService jokeService;

	public JokeController(@Qualifier("jokeServiceImpl") JokeService jokeService) {
		super();
		this.jokeService = jokeService;
	}

	public String returnJoke() {
		return jokeService.getJoke();
	}
}
