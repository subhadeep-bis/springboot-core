package com.luv2code.springdemo;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	private String emailAddress;
	private String team;
	
	// create a no-arg constructor	
	public CricketCoach() {
		System.out.println("CricketCoach: Inside no-arg cnstructor");
	}
	
	// create a setter method
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("CricketCoach: Inside Setter method - setFortuneService");
		this.fortuneService = fortuneService;
	}
	
	// setter method for literal values
	public void setEmailAddress(String emailAddress) {
		System.out.println("CricketCoach: Inside Setter method - setEmailAddress");
		this.emailAddress = emailAddress;
	}

	public void setTeam(String team) {
		System.out.println("CricketCoach: Inside Setter method - setTeam");
		this.team = team;
	}

	@Override
	public String getDailyWorkout() {
		return "Spend 30 minutes on catching practice";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

	// getter method for retrieving the values;
	public String getEmailAddress() {
		return emailAddress;
	}

	public String getTeam() {
		return team;
	}
	
}
