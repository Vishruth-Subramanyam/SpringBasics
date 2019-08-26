package com.dev.app;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dev.dao.Coach;

public class SpringHelloApp {

	public static void main(String[] args) {
		
		// Load the  Configuration File
		ClassPathXmlApplicationContext xml = new ClassPathXmlApplicationContext("applicationContext.xml");
		
				
		//Retrieve the Bean
		
		Coach ch = xml.getBean("myCoach",Coach.class);
		Coach ch1 = xml.getBean("mc",Coach.class);
		
		// Call the methods
		System.out.println("BaseballCoach");
		System.out.println(ch.getDailyWorkout()); 
		System.out.println(ch.getDailyFortune());
		System.out.println("*****************************************");
		System.out.println("TrackCoach");
		System.out.println(ch1.getDailyWorkout());
		System.out.println(ch1.getDailyFortune());
		
		//new method for constructor injection
		
		//Close the Context
		
		xml.close();
		
	}
}
