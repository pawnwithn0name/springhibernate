package com.spring.di;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainSpringClass {

	public static void main(String[] args) {
	
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Instructor objInstructor = 
				context.getBean("myInstructor", Instructor.class);
		
		
		System.out.println(objInstructor.getDailyInstructions());
		
		System.out.println(objInstructor.getDailyFortune());
		
		context.close();
		

	}

}
