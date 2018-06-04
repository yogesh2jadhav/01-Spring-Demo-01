package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Value;

public class CricketCoach implements Coach {

	public CoachFee coachFee;
	public String emailId;
	
	@Value("${demo.phone}")
	public String phoneNo;
	
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public void setCoachFee(CoachFee totalCoachFee) {
		this.coachFee = totalCoachFee;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Alway use pad for batting and hand gloves";
	}

	@Override
	public String whoAmI() {
		// TODO Auto-generated method stub
		return "I am Cricket Coach";
	}

	@Override
	public String myFee() {
		// TODO Auto-generated method stub
		System.out.println(emailId);
		System.out.println(phoneNo);
		return  coachFee.getCoachFee()+". My fee will be 50k per month since I am Cricket Coach";
	}

}
