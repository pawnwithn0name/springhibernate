package com.spring.di;

public class GoLangInstructor implements Instructor {

	private FortuneService fortuneService;
	
	// no-args c'tor
	public GoLangInstructor() {
		System.out.println("inside no-args c'tor: GoLangInstructor");
	}
	
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
		System.out.println("inside setter method: setFortuneService");
	}

	@Override
	public String getDailyInstructions() {
		
		return "GoLang is revolutionary!";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
}
