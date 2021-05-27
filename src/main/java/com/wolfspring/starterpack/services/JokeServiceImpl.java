package com.wolfspring.starterpack.services;

import org.springframework.stereotype.Service;
import guru.springframework.norris.chuck.*;

@Service
public class JokeServiceImpl implements JokeService {
	private final ChuckNorrisQuotes randomJokes;
	
	public JokeServiceImpl() {
		this.randomJokes = new ChuckNorrisQuotes();
	}

	@Override
	public String getJoke() {
		return randomJokes.getRandomQuote();
	}

}
