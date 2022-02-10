package com.javatuttorial;


public class MethodVariabelArgument {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] values = {65, 65, 65, 65,};
		sayCongrats("Eko", values);
		
		sayCongrats("Budi", 80, 80, 80,80);
	
		
	}
	
	
	static void sayCongrats(String nama, int... values) {
		var total = 0;
		for (var value : values) {
			total += value;
		}
		
		var finalValue = total / values.length;
		
		if(finalValue >= 75) {
			System.out.println("Selamat "+ nama +", Anda Lulus");
		}else {
			System.out.println("Maaf " + nama + ", Anda Tidak Lulus");
		}
	}

}
