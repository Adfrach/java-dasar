package com.javatuttorial;

public class MethodParameter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		sayHello("Adithya", "Frachmansyah");
		
	}
	
	
	static void sayHello(String firstName, String lastName) {
		System.out.println("Hello " + firstName + " " + lastName);
	}

}
