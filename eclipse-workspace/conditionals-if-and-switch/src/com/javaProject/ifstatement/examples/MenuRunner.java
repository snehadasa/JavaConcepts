package com.javaProject.ifstatement.examples;

import java.util.Scanner;

public class MenuRunner {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Number1: ");
		int number1 = scanner.nextInt();
		
		System.out.print("Enter Number2: ");
		int number2 = scanner.nextInt();
		
		System.out.print("Available Choices are ");
		System.out.print("1: Add");
		System.out.print("2: Subtract");
		System.out.print("3: Multiply");
		System.out.print("4: Divide");
		
		System.out.print("Enter Choice: ");
		int choice = scanner.nextInt();
		
		System.out.print("Your Choices are, ");
		System.out.print("Number1: " + number1 + ";");
		System.out.print("Number2: " + number2 + ";");
		System.out.print("Choice: " + choice + ";");
		
		//performOperationUsingNestedIfElse(number1, number2, choice);
		performOperationUsingSwitch(number1, number2, choice);

	}

	private static void performOperationUsingNestedIfElse(int number1, int number2, int choice) {
		if(choice == 1) {
			System.out.print("Result " + (number1 + number2));
		}
		if(choice == 2) {
			System.out.print("Result " + (number1 - number2));
		}
		if(choice == 3) {
			System.out.print("Result " + (number1 * number2));
		}
		if(choice == 4) {
			System.out.print("Result " + (number1/number2));
		}
		else {
			System.out.print("Invalid operation");
		}
	}
	
	private static void performOperationUsingSwitch(int number1, int number2, int choice) {
		switch(choice) {
		case 1: System.out.print("Result " + (number1 + number2)); break;
		case 2: System.out.print("Result " + (number1 - number2)); break;
		case 3: System.out.print("Result " + (number1 * number2)); break;
		case 4: System.out.print("Result " + (number1/number2)); break;
		default : System.out.print("Invalid operation");

		}
	}
}
