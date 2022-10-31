package com.busecnky.ekim26;

public class VeriTipleriKarakter {

	public static void main(String[] args) {
		
		//char veritipi:
		//1Byte
		
		char charValue = 'A'; //ASCII tablosundaki karşılığı 65
		//https://www.asciitable.com/
		
		System.out.println(charValue);
		char charValue2 = 84;
		System.out.println(charValue2);
		
		System.out.println(charValue + charValue2); //Bunu yapınca 149 veriyon string birleştirme farklı yapılır.
		
		//String veritipi
		System.out.println("Ali Kaya");
		String name = "Ali";
		String surname = "Kaya";
		System.out.println("isim Soyisim: " + name + " " + surname);
		String nameSurname = (name + " " + surname);
		System.out.println(nameSurname);
		
		
		
		
		
		
		
	}

}
