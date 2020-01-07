package com.spring.beanlcscope;

public class JavaInstructor implements Instructor {
	
	public String getDailyInstructions() {
		
		return "Practice Multi_Threading!";
	}
	
	//add an init method
	public void doMyStartUpStuff() {
		System.out.println("JavaInstructor: inside method doMyStartUpStuff.");
	}
	
	public void doMyCleanUpStuff() {
		System.out.println("JavaInstructor: inside method doMyCleanUpStuff.");
	}
	
	

}
