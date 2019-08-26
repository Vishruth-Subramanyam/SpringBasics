package com.dev.app;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dev.dao.Coach;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		
		//Load the spring config
		
		ClassPathXmlApplicationContext config = new ClassPathXmlApplicationContext("BeanScope.xml");
		
		//retreive the bean from spring context 
		
		Coach ch = config.getBean("myCoach",Coach.class);
		
		Coach ch1 = config.getBean("myCoach",Coach.class);
		
		//check if they are the same beans
		
		boolean result = (ch==ch1);
		
		//print out the results
		
		System.out.println("Pointing to the same objects:" + result);
		
		System.out.println("Memory location for the first coach :" + ch);
		
		System.out.println("Memory location for the second coach :" + ch1);
		
		
		//close the context
		
		config.close();
		
	}
}
