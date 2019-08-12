package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DependencyInjectionAutowiring {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"applicationContext.xml");

		Coach coach = applicationContext.getBean("tennisCoach", Coach.class);

		System.out.println(coach.getDailyWorkout());

		System.out.println(coach.getDailyFortune());

		applicationContext.close();
	}

}
