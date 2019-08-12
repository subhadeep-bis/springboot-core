package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimJavaConfigDemoApp {

	public static void main(String[] args) {

		// read Spring configuration (spring configuration java class) file
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SportConfig.class);

		// get the bean form spring container
		SwimCoach coach = (SwimCoach) applicationContext.getBean("swimCoach", Coach.class);

		// call a method on the bean
		System.out.println(coach.getDailyWorkout());
		System.out.println(coach.getDailyFortune());
		System.out.println("Email: " + coach.getEmail());
		System.out.println("Team: " + coach.getTeam());

		// close the context
		applicationContext.close();

	}

}
