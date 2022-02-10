package com.javatuttorial;

public class OperasiBoolean {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// && => Dan (kalau ada salah satu aja dari variabel yang false, hasil nya false)
		// || => Atau (kalau ada salah satu aja dari variabel yang true, hasilnya ture)
		// ! +> Kebalikan(true -> false, false->true)
		
		var absen = 70;
		var nilaiAkhir = 80;
		
		boolean lulusAbsen = absen >= 75;
		boolean lulusNilaiAkhir = nilaiAkhir >= 75;
		
		var lulus = lulusAbsen && lulusNilaiAkhir;
		System.out.println(lulus);
	}

}
