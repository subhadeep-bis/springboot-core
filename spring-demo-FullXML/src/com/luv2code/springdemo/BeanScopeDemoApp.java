package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"beanScope-applicationContext.xml");

		Coach coach = applicationContext.getBean("trackCoach", Coach.class);

		Coach alphaCoach = applicationContext.getBean("trackCoach", Coach.class);

		// Checking the reference
		System.out.println(coach.toString());
		System.out.println(alphaCoach.toString());

		// Check if they are same
		System.out.println("Pointing out to the same object:" + (coach == alphaCoach));

		coach = applicationContext.getBean("baseballCoach", Coach.class);

		alphaCoach = applicationContext.getBean("baseballCoach", Coach.class);

		// Checking the reference
		System.out.println(coach.toString());
		System.out.println(alphaCoach.toString());

		// Check if they are same
		System.out.println("Pointing out to the same object:" + (coach == alphaCoach));

		applicationContext.close();

	}

}
