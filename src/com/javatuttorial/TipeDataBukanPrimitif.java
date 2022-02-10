package com.javatuttorial;

public class TipeDataBukanPrimitif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Default dari variabel Non-Primitif adalah null
		// Primitif -> TidakPrimitf
		int iniInteger = 100;
		Integer iniInteger2 = iniInteger;
		System.out.println(iniInteger2);
		
		long iniLong = 10000L;
		Long iniLong2 = iniLong;
		System.out.println(iniLong2);
		
		byte iniByte = 64;
		Byte iniByte2 = iniByte;
		System.out.println(iniByte2);
	
		//Konversi dari Primitif -> Non-Primitif -> Non-Primitif lain ( yang tidak saling kompatibel )
		
		//Primitif -> Non-Primitif -> Primitif lagi
		int ageInteger = 30;
		Integer ageInteger2 = ageInteger;
		
		//Non-primitf -> Non-Primitf ( Beda type )
		short ageShort = ageInteger2.shortValue();
		long ageLong = ageInteger2.longValue();
		double ageDouble = ageInteger2.doubleValue();
		System.out.println(ageShort);
		System.out.println(ageLong);
		System.out.println(ageDouble);
		
	}

}
