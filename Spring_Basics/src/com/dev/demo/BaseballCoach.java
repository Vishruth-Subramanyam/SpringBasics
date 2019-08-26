package com.dev.demo;

import com.dev.dao.Coach;
import com.dev.dao.FortuneService;

public class BaseballCoach implements Coach {

	//define the private field for the  dependency
	private FortuneService fortuneService;
	
	//define a constructor for dependency injection
	public BaseballCoach(FortuneService fortuneService) {
		this.fortuneService=fortuneService;
	}
	
	
	public String getDailyWorkout()
	{
		return "Go to Gym EveryDay at 8:30";
	}

	@Override
	public String getDailyFortune() {
		
		//2nd Step :- Dependency Injection
		//use my fortune service to get a fortune
		return fortuneService.getFortune();
	}
	
	//add init method 
	public void init()
	{
		System.out.println("Custom init method in a bean life cycle ");
	}
	
	//add custom destroy method
	public void destroy()
	{
		System.out.println("Custom destroy method in a bean life cycle ");
	}
}
