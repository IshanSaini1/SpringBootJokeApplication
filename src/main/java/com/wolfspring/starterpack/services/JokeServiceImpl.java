package com.wolfspring.starterpack.services;

import org.springframework.stereotype.Service;

@Service
public class JokeServiceImpl implements JokeService {

	@Override
	public String getJoke() {
		return "Hello World";
	}

}
