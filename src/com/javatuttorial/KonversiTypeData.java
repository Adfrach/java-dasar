package com.javatuttorial;

public class KonversiTypeData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte iniByte = 10;
		short iniShort = iniByte;
		int iniInt = iniShort;
		System.out.println(iniInt);
		
		int iniInt2 = 100;
		byte iniByte2 = (byte) iniInt2;
		System.out.println(iniByte2);
	}

}
