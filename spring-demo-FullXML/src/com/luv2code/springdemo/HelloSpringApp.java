package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		// load the spring configuration file
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// Retrieve trackCoach bean from spring container
		Coach coach = applicationContext.getBean("trackCoach",Coach.class);
		
		// call methods on the bean
		System.out.println(coach.getDailyWorkout());
		System.out.println(coach.getDailyFortune());
		
		// Retrieve baseballCoach bean from spring container
		coach = applicationContext.getBean("baseballCoach",Coach.class);
		
		// call methods on the bean
		System.out.println(coach.getDailyWorkout());
		System.out.println(coach.getDailyFortune());
		
		// close the context
		applicationContext.close(); 
	}

}
