package com.dev.demo;

import com.dev.dao.Coach;
import com.dev.dao.FortuneService;

public class TrackCoach implements Coach{

	private FortuneService fortuneService;
	
	public TrackCoach(FortuneService fortuneService) {
		
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {

			return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		
		return fortuneService.getFortune();
	}
}
