package com.javaProject.functionalprogramming;

import java.util.List;

public class FPNumberRunner {

	public static void main(String[] args) {
		List<Integer> num = List.of(1,4,6,5,3,7);
		printNumbersOfList(num);
		//sum of all numbers
		int sumOfAll = fpSumOfAllNumbers(num);
		//sum of odd numbers
		int sumOfOdd = fpSumOfOddNumbers(num);
	
		//int sum = normalSum(num);
		System.out.println(sumOfAll);
		System.out.println(sumOfOdd);
	}

	private static void printNumbersOfList(List<Integer> num) {
		num.stream().forEach(n -> System.out.println(n));
	}

	private static int fpSumOfAllNumbers(List<Integer> num) {
		int sumOfAll = num.stream().reduce(0, (n1, n2) -> n1 + n2);
		return sumOfAll;
	}

	private static int fpSumOfOddNumbers(List<Integer> num) {
		int sumOfOdd = num.stream().filter(n -> n%2 == 1).reduce(0, (n1, n2) -> n1 + n2);
		return sumOfOdd;
	}

	private static int normalSum(List<Integer> num) {
		int sum = 0;
		for(int number:num) {
			sum += number;
		}
		return sum;
	}
	

}
