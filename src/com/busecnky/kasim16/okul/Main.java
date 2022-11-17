package com.busecnky.kasim16.okul;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		Ogrenci ogrenci1 = new Ogrenci("Erdem", "Çankaya", 450, 0);
		Ogrenci ogrenci2 = new Ogrenci("Ayşe", "Çan", 451, 0);
		Ogrenci ogrenci3 = new Ogrenci("Burcu", "Taş", 452, 0);
		Ogrenci ogrenci4 = new Ogrenci("Ahmet", "Kaya", 453, 0);
		
														//Şu an yeni bir ArrayList nesnesi oluşturduk.İçinde bir şey yok.Öğrencileri atmadık.
		Sinif sinif1 = new Sinif("1A", "Zemin kat 100nolu oda", new ArrayList<Ogrenci>());
		
		//kullanıcıdan arraylist oluşturmasını istememeliyiz sinif4teki gibi yapmalıyız
		sinif1.getOgrencilerArrayList().add(ogrenci1);
		sinif1.getOgrencilerArrayList().add(ogrenci2);
		sinif1.getOgrencilerArrayList().add(ogrenci3);
		sinif1.getOgrencilerArrayList().add(ogrenci4);
		sinif1.siniftakiOgrencilerinListesiniYazdir();
		
		
		//2.sınıfımızı oluşturalım ve içine öğrencileri kaydedelim.
		
		Ogrenci ogrenci5 = new Ogrenci("Fatoş", "Yalman", 550, 0);
		Ogrenci ogrenci6 = new Ogrenci("Semih", "Bilgen", 551, 0);
		Ogrenci ogrenci7 = new Ogrenci("Alper", "Taş", 552, 0);

		ArrayList<Ogrenci> ogrencilerList = new ArrayList<Ogrenci>();
		
		ogrencilerList.add(ogrenci5);
		ogrencilerList.add(ogrenci6);
		ogrencilerList.add(ogrenci7);

		Sinif sinif2 = new Sinif("1B", "Zemin kat 101 nolu oda", ogrencilerList);
		sinif2.siniftakiOgrencilerinListesiniYazdir();
		
		
		//3. sınıfımız
		Ogrenci ogrenci8 = new Ogrenci("Alp", "Nurdan", 450, 0);
		Ogrenci ogrenci9 = new Ogrenci("Gizem", "Sözel", 451, 0);
		Ogrenci ogrenci10 = new Ogrenci("Melis", "Kazaz", 452, 0);
		
		//bu constructor ı kullandığımızda constructorın altına arraylistimizi yazdık öğrenci ekledikçe listeye eklencek
		Sinif sinif3 = new Sinif("1C",  "Zemin kat 102 nolu oda");
		sinif3.sinifaOgrenciEkle(ogrenci8);
		sinif3.sinifaOgrenciEkle(ogrenci9);
		sinif3.sinifaOgrenciEkle(ogrenci10);
		sinif3.siniftakiOgrencilerinListesiniYazdir();
		
		
		//4. sınıfımızı oluşturalım ve içine öğrenci kaydedelim
		Sinif sinif4 = new Sinif("1D", "Zemin kat 104 nolu oda");
		sinif4.sinifaOgrenciEkle("Kaan" , "Gök", 800 ,0 );
		sinif4.sinifaOgrenciEkle("Tahsin" , "Yanar", 801 ,0 );
		sinif4.sinifaOgrenciEkle("" , "u", 802 ,0 );
		sinif4.siniftakiOgrencilerinListesiniYazdir();
	}
	
	
}
