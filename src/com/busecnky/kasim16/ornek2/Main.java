package com.busecnky.kasim16.ornek2;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		

		Sinif sinif4 = new Sinif("1D", "Zemin kat 104 nolu oda");
		sinif4.sinifaOgrenciEkle("Kaan" , "Gök", 800 ,0 );
		sinif4.sinifaOgrenciEkle("Tahsin" , "Yanar", 801 ,0 );
		sinif4.sinifaOgrenciEkle("" , "u", 802 ,0 );
		sinif4.siniftakiOgrencilerinListesiniYazdir();
		
		
		
		Sinif sinif1 = new Sinif("1A", "Zemin kat 101 nolu oda");
		sinif1.sinifaOgrenciEkle("Ali" , "Kaya", 400 ,0 );
		sinif1.sinifaOgrenciEkle("Turan" , "Yankı", 401 ,0 );
		sinif1.sinifaOgrenciEkle("Ahmet" , "Alaca", 402 ,0 );
		sinif1.siniftakiOgrencilerinListesiniYazdir();
		
		
		
		Okul okul1 = new Okul("Atatürk İlkokulu" , "Çiçek Sok No.15 Çankaya/Ankara");
		okul1.sinifEkle(sinif1);
		okul1.sinifEkle(sinif4);
		okul1.siniflariYazdir();
		
		okul1.okuldakiOgrencileriYazdir();
		okul1.okuldakiOgrencileriYazdir2();

		System.out.println("*****************");
		//toString konusu:
		Ogrenci ogr = new Ogrenci("John", "Nash", 300, 0);
		System.out.println(ogr.toString());
		
		okul1.okuldakiOgrencileriYazdir3();
		
		
		
		
	}
	
	
}
