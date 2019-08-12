package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"beanLifeCycle-applicationContext.xml");

		Coach coach = applicationContext.getBean("trackCoach", Coach.class);
		
		System.out.println(coach.getDailyWorkout());
		
		applicationContext.close();

	}

}
