package com.busecnky.ekim25;

public class VeriTipleriOrnek {

	public static void main(String[] args) {
		
		int x = 10;
		int y = 3;
		
		int result = x/y;
		int kalan = x%y;
		System.out.println("Result: " + result + " " + "Kalan: " + kalan);
		
		double res = x/y; //sağ taraf int olduğu için cevap 3.0, resulta double yazsakta
		System.out.println("Result: " + res + " " + "Kalan: " + kalan);
		
		//Çözüm
		double xx = 10;
		double yy = 3;
		res = xx / yy;
		System.out.println("Result: " + res);
		
		res = xx / y;
		System.out.println("Result: " + res);
		
		res = (double) x / y;
		System.out.println("Result: " + res);
				
	  
		res = 1D * x / y;
		System.out.println("Result: " + res);

		
		/* res = (double) (x / y); //bu durumda tekrar int gibi davranmaya başlıyor.
		System.out.println("Result: " + res);
		*/
		
		
		
		
		
		
	}

}
