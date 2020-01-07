package com.spring.beanlcscope;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainSpringClass {

	public static void main(String[] args) {
	
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("beanlifecycle-applicationContext.xml");
		
		Instructor objInstructor = context.getBean("myInstructor", Instructor.class);
		
		/*
		
		Instructor objInstructor2 = context.getBean("myInstructor", Instructor.class);
		
		boolean checkSame = (objInstructor == objInstructor2);
		
		*/
		
	
		
		System.out.println(objInstructor.getDailyInstructions());
		
		context.close();
		

	}

}
