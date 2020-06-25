package com.javaProject.functionalprogramming;

import java.util.List;

public class FunctionalProgrammingRunner {

	public static void main(String[] args) {
		List<String> list = List.of("Apple", "Bat", "Cat", "Dog");
		
		//printBasic(list);
		//printWithFp(list);
		//printBasicWithFiltering(list);
		printWithFpWithFiltering(list);

	}

	private static void printBasic(List<String> list) {
		for(String li:list) {
			System.out.println(li);
		}
	}
	
	private static void printWithFp(List<String> list) {
		list.stream().forEach(
				element -> System.out.println(element));
	}
	
	private static void printBasicWithFiltering(List<String> list) {
		for(String li:list) {
			if(li.endsWith("at")) {
				System.out.println(li);
			}
		}
	}
	
	private static void printWithFpWithFiltering(List<String> list) {
		list.stream().filter(element -> element.endsWith("at")).forEach(
				element -> System.out.println(element));
	}
}
