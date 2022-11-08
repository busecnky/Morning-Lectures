package com.busecnky.kasim4.OOPOrnek;

public class Otomobil {

	
	//Otomobil sınıfından türetilecek her bir nesnenin sahip olabileceği özellikler:
	public String marka;
	public String model;
	public int yil;
	public int motorHacmi;
	public int aracinKm;
	
	
	public void bilgileriEkranaYaz() {
		System.out.println("Marka " + marka);
		System.out.println("Model " + model);
		System.out.println("Yıl " + yil);
		System.out.println("Motor Hacmi " + motorHacmi);
		System.out.println("Araç km: " + aracinKm);

		
	}
	
	public void araciSur(int km) {
		aracinKm = aracinKm + km;
	}

	
	public static void main(String[] args) {
		
		//Otomobil sınıfından türetilmiş 1.nesnem:
		Otomobil otomobil1 = new Otomobil();
		otomobil1.marka = "Audi";
		otomobil1.model = "A3";
		otomobil1.yil=2011;
		otomobil1.motorHacmi = 1400;
		otomobil1.aracinKm = 0;
		
		otomobil1.bilgileriEkranaYaz();
		System.out.println();

		//Otomobil sınıfından türetilmiş 2.nesnem:
		Otomobil otomobil2 = new Otomobil();
		otomobil2.marka = "Opel";
		otomobil2.model = "Astra";
		otomobil2.yil=2017;
		otomobil2.motorHacmi = 1400;
		otomobil2.aracinKm = 5000;
		
		otomobil2.bilgileriEkranaYaz();
		
		//Gelin otomobilleri kullanalım /sürelim:
		//Mesela galeriden aldın eve getirdin o sırada 20 km yol aldı. Opelde 25 km bir yerden bi yere gitti.
		
		otomobil1.aracinKm = 20;
		otomobil2.aracinKm += 25;
		
		otomobil1.bilgileriEkranaYaz();
		System.out.println();
		otomobil2.bilgileriEkranaYaz();
		System.out.println();
		
		//Bunu metota çevirelim
		//Daha güzel bir çözüm:
		otomobil1.araciSur(10);
		otomobil2.araciSur(35);
		
		otomobil1.bilgileriEkranaYaz();
		System.out.println();
		otomobil2.bilgileriEkranaYaz();
		
		
	}

}
