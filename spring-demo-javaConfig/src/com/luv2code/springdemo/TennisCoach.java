package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component("thatSillyCoach")
@Component
//@Scope("prototype")
public class TennisCoach implements Coach {

	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;

	// constructor injection
//	@Autowired
//	public TennisCoach(FortuneService fortuneService) {
//		super();
//		this.fortuneService = fortuneService;
//	}

	public TennisCoach() {
		super();
		System.out.println(">> TennisCoach: inside default constructor");
	}

	// define my initiation method (doesn't work in java9,10,11)
//	@PostConstruct
	public void doMyStartupStuff() {
		System.out.println(">> TennisCoach: inside doMyStartupStuff");
	}

	// define my destroy method (doesn't work in java9,10,11) 
//	@PreDestroy
	public void doMyCleanUpStuff() {
		System.out.println(">> TennisCoach: inside doMyCleanUpStuff");
	}

	@Override
	public String getDailyWorkout() {
		return "practice your back hand volley";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

	// setter injection
	// define setter method
//	@Autowired
//	public void setFortuneService(FortuneService fortuneService) {
//		System.out.println(">> TennisCoach: inside setFortuneService() method");
//		this.fortuneService = fortuneService;
//	}

}
