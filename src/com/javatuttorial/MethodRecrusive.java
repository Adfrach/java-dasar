package com.javatuttorial;

public class MethodRecrusive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Recrusive method -> method yang manggil method dirinya sendiri
		System.out.println(factorialLoop(10));
		System.out.println(factorialRecursive(10));
		
	}
	
	//tanpa recrusive
	static int factorialLoop(int value) {
		var result = 1;
		
		
		for(var counter = 1; counter <= value; counter++) {
			result *= counter;
		}
		
		return result;
	}
	
	//dengan recrusive
	static int factorialRecursive(int value) {
		if(value == 1) {
			return 1;
		}else {
			return value * factorialLoop(value - 1);
		}
	}
}
