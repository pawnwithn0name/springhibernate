package com.spring.di;

public class MyMainApp {

	public static void main(String[] args) {
		
		
		Instructor objInstructor = new PythonInstructor();
		
		System.out.println(objInstructor.getDailyInstructions()); 

	}

}
