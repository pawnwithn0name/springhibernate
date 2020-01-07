package com.spring.di;

public class JavaInstructor implements Instructor {
	
	/*
	private FortuneService fortuneService; 
	
	public JavaInstructor(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	
	*/
	
	
	private FortuneService fortuneService;
	
	
	public JavaInstructor(FortuneService theFortuneService) {
		
		fortuneService = theFortuneService;
	}

	@Override
	public String getDailyInstructions() {
		
		return "Practice Multi_Threading!";
	}

	@Override
	public String getDailyFortune() {	
		return fortuneService.getFortune();
	}
}




