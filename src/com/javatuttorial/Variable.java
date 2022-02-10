package com.javatuttorial;

public class Variable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "Adithya Frachmansyah";
		int age = 30;
		String address = "Jalan Bintara 12a no 60b";
		
		System.out.println("NaSme: " + name);
		System.out.println("Age: " + age);
		System.out.println("Address: " + address);
		System.out.println("======");
		
		int testString = 10;
		float testInteger = testString;
		System.out.println(testInteger);
		System.out.println("====");
		
		// KataKunciVar
		var firstName = "Adithya ";
		var middleName = "Frachmansyah ";
		var lastName = "Widjaya";
		System.out.println("Nama saya: "+firstName+middleName+lastName);
		
		//KataKunciFinal
		final var application = "Belajar PHP";
		System.out.println(application);
		
		
		
		
	}

}
