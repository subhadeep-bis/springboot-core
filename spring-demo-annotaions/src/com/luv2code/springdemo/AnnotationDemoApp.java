package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {

		// read Spring config file
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"applicationContext.xml");

		// get the bean form spring container
		Coach coach = applicationContext.getBean("thatSillyCoach", Coach.class);

		// call a method on the bean
		System.out.println(coach.getDailyWorkout());

		// close the context
		applicationContext.close();

	}

}
