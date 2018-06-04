package com.luv2code.springdemo;

public class CycleCoach {
	private HealthCoach healthCoach;
	
	public void setHealthCoach (HealthCoach healthCoachPool) {
		this.healthCoach=healthCoachPool;
	}
	 
 	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Do warm up workout for 20 Min on Sprint Ground";
	}

	public String whoAmI() {
		return "I am Track Coach";
	}

	public HealthCoach getCoachFee() {
		// TODO Auto-generated method stub
		return healthCoach;
	}
	
	public String whatToDo() {
		// TODO Auto-generated method stub
		return healthCoach.doExc();
	}
}
