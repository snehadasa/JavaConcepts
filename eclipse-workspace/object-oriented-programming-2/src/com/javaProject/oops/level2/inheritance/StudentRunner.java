package com.javaProject.oops.level2.inheritance;

public class StudentRunner {

	public static void main(String[] args) {

		//Student student = new Student();
		//student.setName("Sneha");
		//student.setEmail("snehadasa@gmail.com");
		
		Employee employee = new Employee("Sneha");
		employee.setName("Sneha");
		employee.setEmail("snehadasa@gmail.com");
		employee.setPhoneNumber("2295731501");
		employee.setEmployeeGrade('A');
		employee.setEmployerName("Sujith");
		employee.setTitle("Programmer Analyst");
		employee.setType("afkjhalk");
		//String value = person.toString();
		//System.out.println(value);
		//System.out.println(person);
		
		System.out.println(employee);
	}

}
