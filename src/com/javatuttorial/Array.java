package com.javatuttorial;

public class Array {
	public static void main(String[] args) {
		String [] stringArray = new String[2];
		stringArray[0] = "Adithya";
		stringArray [1] = "Frachmansyah";
		
		System.out.println(stringArray[0]);
		System.out.println(stringArray[1]);
		
		
		// Array Initializer versi short
		String [] namaSaya = {
				"Adithya", "Frachmansyah"
		};
		System.out.println(namaSaya [0]);
		System.out.println(namaSaya [1]);
		
		
		//atau
		
		String [] tempatTanggalLahir = new String []{
			"Jakarta, ", "30", "Juni", "1997"
		};
		
		//Mengubah isi array
		tempatTanggalLahir [1] = null;
		
		System.out.print(tempatTanggalLahir[0]);
		System.out.print(tempatTanggalLahir[1]);
		System.out.print(tempatTanggalLahir[2]);
		System.out.println(tempatTanggalLahir[3]);
		
		//mengethaui panjang/banyak araay
		System.out.println("Panjang Arraynya: " + tempatTanggalLahir.length);
		
		String [][] members =  {
				{"Eko", "Kuntadi"},
				{"Budi", "Sudarsono"},
				{"Joko"}
		};
		
		System.out.println(members[0][0]); //ngambil kuntadi
		System.out.println(members[2][0]); //ngambil Joko
		
		
		
	}

}
