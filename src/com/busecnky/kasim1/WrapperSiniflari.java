package com.busecnky.kasim1;

public class WrapperSiniflari {

	public static void main(String[] args) {

		//Herhangi bir String ifade içindeki sayıyıy primitive data typa a çevirmek için:
		// WRAPPER SINIFLARI kullanılır.
		
		
		String sinavNotu = "75";
		int sayi = Integer.parseInt(sinavNotu);
		System.out.println(sayi);
		
		String sayiStr = "12.345";
		double sayi2 = Double.parseDouble(sayiStr);
		System.out.println(sayi2);
		
		
		
	//	Ödev:
		//	Diğerlerini inceleyip test edin. İnternetten araştırın.
		//byte		Byte 
		//short		Short
		//int		Integer
		//long		Long
		//float		Float
		//double	Double
		//boolean	Boolean
		//char		Character
		//
		
		
		int x = 4;
		String xStr = String.valueOf(x);
		
		System.out.println(2+5+7+"Hello");   //14Hello
		System.out.println("Hello"+2+5+7);   //Hello257

		
	}

}
