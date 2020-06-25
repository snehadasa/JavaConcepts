package com.javaProject.oops;

public class BookRunner {
	public static void main(String[] args) {
		Book artOfComputing = new Book(20);
		Book effectiveJava = new Book(30);
		Book cleanCode = new Book(50);
		
		System.out.println(artOfComputing.getCopies());
		System.out.println(effectiveJava.getCopies());
		System.out.println(cleanCode.getCopies());
		
		artOfComputing.open();
		effectiveJava.open();
		cleanCode.open();
		
		//artOfComputing.setCopies(30);
		//effectiveJava.setCopies(50);
		//cleanCode.setCopies(30);
		
		artOfComputing.increaseNoOfCopies(40);
		effectiveJava.increaseNoOfCopies(20);
		cleanCode.increaseNoOfCopies(60);
		
		System.out.println(artOfComputing.getCopies());
		System.out.println(effectiveJava.getCopies());
		System.out.println(cleanCode.getCopies());
		
		artOfComputing.decreaseNoOfCopies(10);
		effectiveJava.decreaseNoOfCopies(5);
		cleanCode.decreaseNoOfCopies(20);
		
		System.out.println(artOfComputing.getCopies());
		System.out.println(effectiveJava.getCopies());
		System.out.println(cleanCode.getCopies());

	}
}
