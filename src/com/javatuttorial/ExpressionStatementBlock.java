package com.javatuttorial;


public class ExpressionStatementBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int value; //expression (Ekspresi) Bisa juga Statement
		value = 10;//expression (Ekspresi) Bisa juga Statement
		System.out.println(value); //statement (kumpulan dari expression)
		
		// assignment statement 
		double aValue = 8933.234;
		System.out.println(aValue);
		
		// increment statement
		aValue++;
		
		// method invocation statement
		System.out.println("Helloword");
		
		
		// Object creation statement
		//Date date = new date();
		
		// Block =  kumpulan statement
		// kaya public static void ..... {
		// }
		
		{
			System.out.println("Hello World 1");
			System.out.println("Hello world 2");
		}
		
	}

}
