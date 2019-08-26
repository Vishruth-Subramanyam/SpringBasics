package com.dev.demo;

import com.dev.dao.FortuneService;

public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		
		return "Today is Your Lucky Day";
	}

}
