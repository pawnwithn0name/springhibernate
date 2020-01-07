package com.spring.ioc;

public class MyMainApp {

	public static void main(String[] args) {
		
		
		Instructor objInstructor = new PythonInstructor();
		
		System.out.println(objInstructor.getDailyInstructions()); 

	}

}
