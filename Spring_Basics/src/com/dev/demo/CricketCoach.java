package com.dev.demo;

import com.dev.dao.Coach;
import com.dev.dao.FortuneService;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	private String playerName;
	private String team;
	
	
	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		System.out.println("Inside setter method to set playername");
		this.playerName = playerName;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		System.out.println("Inside the setter method to set the team");
		this.team = team;
	}

	public CricketCoach() {
		System.out.println("Inside the Cricket Coach no-arguments Constructor");	
	}

	public FortuneService getFortuneService() {
		return fortuneService;
	}
	// spring uses this setter method to inject the dependencies in the config file
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("Inside the Cricket Coach setter method ");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {

		return "Ravi Sastri is your Cricket Coach";
	}

	@Override
	public String getDailyFortune() {
		
		return fortuneService.getFortune();
	}


}
