package com.javatuttorial;


public class ForEacch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] array = {
				"Eko", "Kurniawan", "Khanedy",
				"Programmer", "Zaman", "Now"
		};
		
		
		//tanpa for each
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		
		System.out.println("==================");
		
		//dengan for each
		for(var item : array) {
			System.out.println(item);
		}
		
		
	}

}
