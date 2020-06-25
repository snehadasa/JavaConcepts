package com.javaProject.oops.level2;

public class CustomerRunner {

	public static void main(String[] args) {
		
		Address homeAddress = new Address("line1", "Bangalore", "560070");
		Customer customer = new Customer("Sneha", homeAddress);
		
		Address workAddress = new Address("line1 for work", "Bangalore", "560070");
		customer.setWorkAddress(workAddress);
		
		System.out.println(customer);
	}

}
