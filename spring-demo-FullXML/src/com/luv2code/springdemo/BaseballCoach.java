package com.luv2code.springdemo;

public class BaseballCoach implements Coach {
	
	// define private field for the dependency
	private FortuneService fortuneService;
	
	// define a constructor for dependency injection
	public BaseballCoach(FortuneService fortuneService) {
		super();
		this.fortuneService=fortuneService;
	}
	public BaseballCoach() {
		super();
	}
	
	@Override
	public String getDailyWorkout() {
		return "Spend 30 minutes on batting practice";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
}
