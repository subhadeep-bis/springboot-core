package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {
	public static void main(String[] args) {
		//load spring config file
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// retrieve bean from spring container
		Coach coach = applicationContext.getBean("tennisCoach", Coach.class);
		
		Coach coach2 = applicationContext.getBean("tennisCoach", Coach.class);
		
		// check if they are same
		System.out.println("\nPointing to the same object: "+ (coach == coach2));
		System.out.println("\nMemory location for coach: " + coach);
		System.out.println("\nMemory location for coach2: " + coach2);
		
		applicationContext.close();
	}
}
