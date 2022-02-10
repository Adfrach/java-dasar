package com.javatuttorial;

public class Scope {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sayHello("Adithya");
	}

	
	static void sayHello(String name) {
		String hello = "Hello" + name;
		
		if(!name.isBlank()) {
			String hi = "Hi " + name;
			System.out.println(hi);
		}
		
		System.out.println(hello);
	}
}
