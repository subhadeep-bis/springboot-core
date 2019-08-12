package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterInjection {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// cricketCoach is for injecting literal values	and cricketcoach2 is for injecting using properties file	
		CricketCoach cricketCoach = (CricketCoach) applicationContext.getBean("cricketCoach2",Coach.class);
		
		System.out.println(cricketCoach.getDailyWorkout());
		System.out.println(cricketCoach.getDailyFortune());
		System.out.println(cricketCoach.getEmailAddress());
		System.out.println(cricketCoach.getTeam());
		
		applicationContext.close();

	}

}
