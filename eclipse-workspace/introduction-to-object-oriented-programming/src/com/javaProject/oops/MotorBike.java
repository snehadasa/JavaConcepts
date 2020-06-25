package com.javaProject.oops;

public class MotorBike {
	private int totalSpeed;
	
	MotorBike(int speed) {
		this.totalSpeed = speed;
	}
	
	public void setSpeed(int speed) {
		if(speed > 0)
			this.totalSpeed = speed;
	}
	
	public int getSpeed() {
		return this.totalSpeed;
	}
	
	public void increaseSpeed(int howMuch) {
		setSpeed(this.totalSpeed + howMuch);
	}
	
	public void decreaseSpeed(int howMuch) {
			setSpeed(this.totalSpeed - howMuch);
	}
	
	void start() {
		System.out.println("Bike Started");
	}
}
