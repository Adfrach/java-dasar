package com.javatuttorial;

public class BreakDanContinue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//break
		var counter = 1;
		while(true) { //true = perulangan tidak berhenti
			System.out.println("Perulangan ke- "+ counter); 
			counter++;
			
			if(counter>10) { // pengecekan = kalo perulangan counter > 10 di break (di hentikan)
				break;
			}
		}
		
		System.out.println("===================");
		
		//continue
		for(var i = 1; i <= 100; i++) {
			if(i % 2 == 0) {
				continue;
			}
			
			System.out.println("Perulangan Ganjil " + i);
		}
	
		
		
	}

}
