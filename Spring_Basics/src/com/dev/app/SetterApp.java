package com.dev.app;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dev.demo.CricketCoach;

public class SetterApp {

	public static void main(String[] args) {
		
	//Load the confif file	
		ClassPathXmlApplicationContext xml = new ClassPathXmlApplicationContext("applicationContext.xml");
				
	// retrieve the bean from app context
				
	CricketCoach ch = xml.getBean("myCC",CricketCoach.class);
	//call the methods
	System.out.println(ch.getDailyWorkout());
	System.out.println(ch.getDailyFortune());
	
	System.out.println("*****************************************************");
	// calling the new methods called during literal injections
	System.out.println(ch.getPlayerName());
	System.out.println(ch.getTeam());
	
	//close the context
	
	xml.close();
	} 
}
