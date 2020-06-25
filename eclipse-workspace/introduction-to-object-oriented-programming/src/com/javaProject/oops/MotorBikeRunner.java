package com.javaProject.oops;

public class MotorBikeRunner {

	public static void main(String[] args) {
		MotorBike ducati = new MotorBike(100);
 		MotorBike honda = new MotorBike(200);
 		
 		System.out.println(ducati.getSpeed());
		System.out.println(honda.getSpeed());
		
		ducati.start();
		honda.start();
		
		//ducati.setSpeed(100);
		//honda.setSpeed(80);
		
		ducati.increaseSpeed(100);
		honda.increaseSpeed(90);
		
		System.out.println(ducati.getSpeed());
		System.out.println(honda.getSpeed());
		
		ducati.decreaseSpeed(150);
		honda.decreaseSpeed(260);
		
		System.out.println(ducati.getSpeed());
		System.out.println(honda.getSpeed());
	}
}
