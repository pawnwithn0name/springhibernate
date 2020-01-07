package com.spring.di;

public class PythonInstructor implements Instructor {

	private FortuneService fortuneService;
	
	
	public PythonInstructor() {}
	public PythonInstructor(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyInstructions() {
		
		return "Learn duck typing in python!";
	}

	@Override
	public String getDailyFortune() {
		
		return "Just do it: " + fortuneService.getFortune();
	}

}
