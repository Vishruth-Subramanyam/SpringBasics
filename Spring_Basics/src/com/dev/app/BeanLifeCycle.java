package com.dev.app;
 
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dev.dao.Coach;

public class BeanLifeCycle {

	public static void main(String[] args) {
		
		//Load the spring config
		
		ClassPathXmlApplicationContext config = new ClassPathXmlApplicationContext("BeanLifeCycle.xml");
		
		//retreive the bean from spring context 
		
		Coach ch = config.getBean("myCoach",Coach.class);
		
		//get the methods
		System.out.println(ch.getDailyWorkout());
		
		//close the context
		
		config.close();
		
	}
}
