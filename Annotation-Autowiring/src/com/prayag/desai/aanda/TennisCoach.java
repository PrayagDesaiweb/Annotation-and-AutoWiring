package com.prayag.desai.aanda;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
	
	@Autowired // this is the field injection.
	@Qualifier("bservice")
	private FortuneService fortuneService;
	
	/*
	THIS IS CONSTRUCTOR INJECTION
	@Autowired
	public TennisCoach(FortuneService thefortuneService) {
		fortuneService = thefortuneService;
	}
	*/
	
	public TennisCoach() {
		// default no-arg constructor
		System.out.println("inside default no-arg constructor");
	}
	
	/* 
	// define a setter method
	@Autowired
	public void setFortuneService(FortuneService thefortuneService) {
		System.out.println("Inside the setter method");
		fortuneService = thefortuneService;
	}
	
	@Autowired
	public void thisisanewMethod(FortuneService thefortuneService) {
		System.out.println("Inside the method dependency injection");
		fortuneService = thefortuneService;
	}
	*/
	
	@Override
	public String getDailyWorkout() {
			return "Practice forehand and top-spin";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}
	
	

}
