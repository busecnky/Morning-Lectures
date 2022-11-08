package com.busecnky.kasim1;

public class DiziSorusu001 {

	public static void main(String[] args) {

		//Dizinin içindeki en büyük sayıyı be bu sayının indexini bulma:
		
		int[] dizi = { -4, 7, 100, 12, 78, 72, -122, 18, 0, 90, 30 };

		int enBuyukSayi = dizi[0];
		int enBuyukSayiIndexi = 0;
		for (int i=0; i<dizi.length ; i++) {
			if (enBuyukSayi < dizi[i]) {
				enBuyukSayi = dizi[i];
				enBuyukSayiIndexi = i; 
			}
		}
		System.out.println("En büyük sayı: " + enBuyukSayi + " En büyük sayı indexi: " + enBuyukSayiIndexi);
		
	//	Aynı dizi içindeki en küçük sayı ve indexini bulun.
		
		int enKucukSayi = dizi[0];
		int enKucukSayiIndexi = 0;
		for (int i=0; i<dizi.length ; i++) {
			if (enKucukSayi > dizi[i]) {
				enKucukSayi = dizi[i];
				enKucukSayiIndexi = i; 
			}
		}
		System.out.println("En küçük sayı: " + enKucukSayi + " En küçük sayı indexi: " + enKucukSayiIndexi);
		
		
		
		
	}

}
