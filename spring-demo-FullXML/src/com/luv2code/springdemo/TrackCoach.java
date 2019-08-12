package com.luv2code.springdemo;

public class TrackCoach implements Coach {
	
	// private field for the dependency
	private FortuneService fortuneService;
	
	// define the constructor for dependency injection
	public TrackCoach(FortuneService fortuneService) {
		super();
		this.fortuneService=fortuneService;
	}
	public TrackCoach() {
		super();
	}
	
	@Override
	public String getDailyWorkout() {
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}
	
	// add an init method
	public void doMyStartupStuff() {
		System.out.println("TrackCoach: inside method doMyStartupStuff");
	}
	
	// add a destroy method
	public void doMyCleanupStuff() {
		System.out.println("TrackCoach: inside method doMyCleanupStuff");
	}
}
