package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext CPXAppContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		Coach footballCoach = CPXAppContext.getBean("FootBallCoach", Coach.class);
		
		System.out.println(footballCoach.getDailyWorkout());
		System.out.println("==============================");
		System.out.println(footballCoach.whoAmI());
		System.out.println("==============================");
		System.out.println(footballCoach.myFee());
		System.out.println("========================================================");
		
		Coach trackCoach = CPXAppContext.getBean("TrackCoach", Coach.class);
		
		System.out.println(trackCoach.getDailyWorkout());
		System.out.println("==============================");
		System.out.println(trackCoach.whoAmI());
		System.out.println("==============================");
		System.out.println(trackCoach.myFee());
		System.out.println("========================================================");
		CycleCoach cycleCoach = CPXAppContext.getBean("CycleCoach", CycleCoach.class);		
		
		System.out.println(cycleCoach.getDailyWorkout());
		System.out.println("==============================");
		System.out.println(cycleCoach.whoAmI());
		System.out.println("==============================");
		System.out.println(cycleCoach.whatToDo());
		System.out.println("========================================================");
		
		Coach criketCoach = CPXAppContext.getBean("CricketCoach", Coach.class);		
		
		System.out.println(criketCoach.getDailyWorkout());
		System.out.println("==============================");
		System.out.println(criketCoach.whoAmI());
		System.out.println("==============================");
		System.out.println(criketCoach.myFee());
		System.out.println("========================================================");
		
	}
}
