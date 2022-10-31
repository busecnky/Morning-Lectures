package com.busecnky.ekim31;

public class DiziOrnek3 {

	public static void main(String[] args) {


		//Soru:
		int[] dizi = {-4, 7, 12, 78, 72, -122, 18, 0, 90 };
		
		//bu dizinin ortalamsını tam sayı cinsinden bulunuz.
		
		//ortalama = (Dizi içindeki sayıların toplamı) / (dizideki sayı adedi) 
		
		int toplam = 0;
		for (int i = 0; i<dizi.length ; i++) {
			toplam = toplam + dizi[i];    //toplam += dizi[i] aynı anlama gelir
		}
		
		System.out.println("Toplam: " + toplam);
		int ortalama = toplam/dizi.length;
		System.out.println("Ortalama: " + ortalama);
		
		
		
		//int eşitlerken yuvarlama yapması:
		
		int x = 20;
		int g = x/3;
		System.out.println(g); // 6 
		
		int y = 3;
		double v = x/y ;
		System.out.println(v); // 6.0
		
		v = x / (y * 1.0);
		System.out.println(v); // 6.666666666666667
		
		//kusuratlarla ilgili Java Math kütüphanesinin kullanımı:
		System.out.println(Math.round(v));
		System.out.println(Math.round(1.4));
		System.out.println(Math.round(1.5));
		
		
		
		//Dizinin içindeki en büyük sayıyı bulma : (Sınav sorusu)
		
		for (int i = 0 ; i<dizi.length ; i++) {
			int enBuyuk = dizi[0];
			 
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
