package com.busecnky.ekim26;

public class MicrosoftSorusu {

	public static void main(String[] args) {

		//Microsoft SWAP Numbers Exam Question:
		//sayi1 ve sayi2 sayılarının deperlerini değiştirin. 3. bir değişken kullanmadan yapın.
		
		
	int sayi1 = -5;
	int sayi2 = 3;
	int temp;
	
	/*
	//1.Çözüm (Basit)
	temp = sayi1;
	sayi1 = sayi2;
	sayi2 = temp;
	System.out.println(sayi1 + " " + sayi2);
	*/

	//2.Çözüm (Zor olan)
	sayi1 = sayi1 + sayi2;
	sayi2 = sayi1 - sayi2;
	sayi1 = sayi1 - sayi2;
	
	System.out.println(sayi1 + "  " + sayi2);
		
		
	}

}
