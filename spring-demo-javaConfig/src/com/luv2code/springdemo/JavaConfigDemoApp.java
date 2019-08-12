package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigDemoApp {

	public static void main(String[] args) {

		// read Spring configuration (spring configuration java class) file
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SportConfig.class);

		// get the bean form spring container
		Coach coach = applicationContext.getBean("tennisCoach", Coach.class);

		// call a method on the bean
		System.out.println(coach.getDailyWorkout());
		System.out.println(coach.getDailyFortune());

		// close the context
		applicationContext.close();

	}

}
