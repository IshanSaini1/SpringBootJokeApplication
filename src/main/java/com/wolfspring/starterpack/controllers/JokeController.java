package com.wolfspring.starterpack.controllers;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wolfspring.starterpack.services.JokeService;

@Controller
public class JokeController {
	private JokeService jokeService;

	public JokeController(@Qualifier("jokeServiceImpl") JokeService jokeService) {
		super();
		this.jokeService = jokeService;
	}
	
	@RequestMapping("/joke")
	public String returnJoke(Model model) {
		model.addAttribute("joke", jokeService.getJoke());
		return "/jokes/norris";
	}
}
