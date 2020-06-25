package com.javaProject.oops;

public class Book {
	
	private int noOfCopies;
	
	Book(int copies) {
		this.noOfCopies = copies;
	}
	
	public void setCopies(int copies) {
		this.noOfCopies = copies;
	}
	
	public void increaseNoOfCopies(int howMuch) {
		setCopies(this.noOfCopies + howMuch);
	}
	
	public void decreaseNoOfCopies(int howMuch) {
		setCopies(this.noOfCopies - howMuch);
	}
	
	public int getCopies() {
		return this.noOfCopies;
	}
	
	void open() {
		System.out.println("Book has been opened");
	}

}
