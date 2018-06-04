package com.luv2code.springdemo;

public class TrackCoach implements Coach {

	private CoachFee coachFee;
	
	
	
	public TrackCoach(CoachFee totalCoachFee) {
		coachFee=totalCoachFee;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Do warm up workout for 20 Min on Sprint Ground";
	}

	public String whoAmI() {
		return "I am Track Coach";
	}

	@Override
	public String myFee() {
		// TODO Auto-generated method stub
		return coachFee.getCoachFee() +"10,000/- per month";
	}
}
