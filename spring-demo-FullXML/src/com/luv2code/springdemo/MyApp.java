package com.luv2code.springdemo;

public class MyApp {

	public static void main(String[] args) {
		
		// create the object
		Coach coach = new TrackCoach();
		
		// use the object
		System.out.println(coach.getDailyWorkout());
	}

}
