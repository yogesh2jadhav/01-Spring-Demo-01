package com.luv2code.springdemo;

public class FootBallCoach implements Coach {

	private CoachFee coachFee;
	
	
	public FootBallCoach(CoachFee TotalcoachFee) {

		coachFee = TotalcoachFee;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "10 rounds of football ground...";
	}

	public String whoAmI() {
		return "I am Foot Ball Coach";
	}

	@Override
	public String myFee() {
		
		return coachFee.getCoachFee();
	}
}
