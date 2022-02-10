package com.javatuttorial;

public class SwitchStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		var nilai = "A";

		switch (nilai) {
			case "A" :
				System.out.println("Wow, Anda Lulus Dengan Baik!");
				break;
			case "B" :
			case "C" :
				System.out.println("Nilai Anda Cukup Baik");
				break;
			case "D" :
				System.out.println("Anda Tidak Lulus");
				break;
			default :
				System.out.println("Mungkin Anda Salah jurusan");

		}

		// Switch Lambda hanya bisa jalan di java 14 keatas
		switch (nilai) {
			case "A" -> System.out.println("Wow,Anda lulus dengan Baik!");
			case "B", "C" -> System.out.println("Nilai anda Cukup baik");
			case "D" -> System.out.println("Anda Tidak Lulus");
			default -> {
				System.out.println("Mungkin Anda Salah Jurusan");
			}
		}

		// Kata kunci yield = mengembalikan nilai pada swiitch statement
		// Tanpa yield
		String ucapan;
		
		switch (nilai) {
			case "A" -> ucapan = "Wow,Anda lulus dengan Baik!";
			case "B", "C" -> ucapan = "Nilai Anda cukup baik";
			case "D" -> ucapan = "Anda Tidak Lulus";
			default -> {
				ucapan = "Anda Salah Jurussan";

			}
		}

		System.out.println(ucapan);
		
		// Dengan yield
		ucapan = switch (nilai) {
			case "A": 
				yield "Wow,Anda lulus dengan Baik!";
			case "B", "C": 
				yield "Nilai Anda cukup baik";
			case "D": 
				yield "Anda Tidak Lulus";
			default :
				yield "Anda Salah Jurussan";
			
		};
		
		System.out.println(ucapan);
		
	}

}
