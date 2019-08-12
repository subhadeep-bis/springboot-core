package com.luv2code.springdemo;

import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@ComponentScan("com.luv2code.springdemo")
@PropertySource("classpath:sport.properties")
public class SportConfig {
	
	// define bean for our SadFortuneService
	@Bean
	public FortuneService sadFortuneService() {
		return new SadFortuneService();
	}
	
	// define bean for our SwimCoach and add dependency
	@Bean
	public Coach swimCoach(FortuneService fortuneService) {
		return new SwimCoach(sadFortuneService());
	}
	
}
