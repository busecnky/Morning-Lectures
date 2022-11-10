package com.busecnky.kasim10;

public class Main {

	public static void main(String[] args) {

		OtoGaleri kardeslerOtoGaleri = new OtoGaleri("Kardeşler Oto Galeri" ,5);   //5 tane içinde null olan dizi oluşturuldu heapte duruyo.
		
		Otomobil otomobil1 = new Otomobil("Opel", "Corsa", 2018, 20000, new Motor(1000, "WGMOP132" , 7));
		kardeslerOtoGaleri.galeriyeOtomobilEkle(otomobil1);
		
		Otomobil otomobil2 = new Otomobil("Opel", "Astra", 2019, 15000, new Motor(1500, "FGDOP132" , 8));
		kardeslerOtoGaleri.galeriyeOtomobilEkle(otomobil2);
		
		Otomobil otomobil3 = new Otomobil("Audi", "A3", 2018, 20000, new Motor(1000, "WGMOP452" , 7));
		kardeslerOtoGaleri.galeriyeOtomobilEkle(otomobil1);
		
		Otomobil otomobil4 = new Otomobil("Audi", "A4", 2018, 20000, new Motor(1000, "WGMOP789" , 8));
		kardeslerOtoGaleri.galeriyeOtomobilEkle(otomobil1);
		
		Otomobil otomobil5 = new Otomobil("BMW", "3.20", 2018, 20000, new Motor(1000, "WGMOP132" , 7));
		kardeslerOtoGaleri.galeriyeOtomobilEkle(otomobil1);
		
		Otomobil otomobil6 = new Otomobil("BMW", "5.20", 2018, 20000, new Motor(1000, "WGMOP132" , 7));
		kardeslerOtoGaleri.galeriyeOtomobilEkle(otomobil1);
		
		kardeslerOtoGaleri.galeridekiOtomobilleriListele();
		System.out.println("Galerideki otomobil sayısı: " + kardeslerOtoGaleri.getGaleridekiOtomobilSayisi());
		
		System.out.println("İlk otomobil marka: " + kardeslerOtoGaleri.getOtomobilDizisi()[0].getMarka() +
							"\nmotor bilgileri: " + kardeslerOtoGaleri.getOtomobilDizisi()[0].getAracinMotoru().getAllMotorBilgileri());
		
		
		
		//2.OtoGaleri nesnemiz:
		//
		OtoGaleri galeriMahmut = new OtoGaleri("GaleriMahmut" ,100);
		Otomobil otomobil7 = new Otomobil("Fiat", "Egea", 2018, 20000, new Motor(1000, "WGMOP132" , 7));
		Otomobil otomobil8 = new Otomobil("Fiat", "500", 2018, 20000, new Motor(1000, "WGMOP132" , 7));
		
		galeriMahmut.galeriyeOtomobilEkle(otomobil7);
		galeriMahmut.galeriyeOtomobilEkle(otomobil8);
		galeriMahmut.galeridekiOtomobilleriListele();
		
		Otomobil otomobil9 = new Otomobil("Tofaş", "Şahin" , 1999, 74000 , new Motor(1000, "WREWR123" ,5 ));
		galeriMahmut.galeriyeOtomobilEkle(otomobil9);
		galeriMahmut.galeridekiOtomobilleriListele();
	}

}
