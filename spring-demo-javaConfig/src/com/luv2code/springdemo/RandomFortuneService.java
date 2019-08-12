package com.luv2code.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	// create an array of strings
	private String[] data = new String[] { "Beware of the wolf in sheep's clothing",
			"Diligence is the mother of good luck", "The journey is the reward" };

	// Random number generator
	private Random random = new Random();

	@Override
	public String getFortune() {

		// pick a random string from the array
		int index = random.nextInt(data.length);
		return data[index];
	}

}
