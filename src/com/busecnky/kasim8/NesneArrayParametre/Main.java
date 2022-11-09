package com.busecnky.kasim8.NesneArrayParametre;

public class Main {

	public static void main(String[] args) {


		Otomobil otomobil1 = new Otomobil();
		otomobil1.marka = "Togg";
		otomobil1.model = "V1";
		otomobil1.yil = 2022;
		otomobil1.aracinKm = 0;
		
		
		Motor motor1 = new Motor();
		motor1.motorHacmi = 1500;
		motor1.saseNo = "WER345645";
		motor1.yakitTuketimi = 10;
		
		
		otomobil1.aracinMotoru = motor1; //biz otomobil1. yazarak motora ulaşmak istersek eğer bize o noktadan sonra öneriler geliyo
										//bi bakıyoruz ki otomobil1.aracinmotoru önerisinde motorHacmi var. Yani motor bilgilerine bu şekilde de ulaşabiliriz.
		
		
		//Otomobilin bilgilerini yazdıralım
		System.out.println("marka: " + otomobil1.marka + "\nmodel: " + otomobil1.model + "\nyil: " + otomobil1.yil);//Yılı yukarıda yoruma alınca göreceksin ki burda yıl 0 oluyor. Yani 0 olarak initialize ediliyor.
		System.out.println("***************\n");
		
		//Motorun bilgilerini yazdıralım
		System.out.println("motorHacmi: " + motor1.motorHacmi + "\nsaseNo: " + motor1.saseNo + "\nyakitTuketimi: " + motor1.yakitTuketimi);
		System.out.println("***************\n");
		
		//Motor bilgilerini bir de otomobilden giderek yazdıralım. //Bu satır ;  (21)otomobil1.aracinMotoru = motor1; bu satır sayesinde!!
		System.out.println("motorHacmi: " + otomobil1.aracinMotoru.motorHacmi + "\nsaseNo: " + otomobil1.aracinMotoru.saseNo +
						   "\nyakitTuketimi: " + otomobil1.aracinMotoru.yakitTuketimi);
		System.out.println("***************\n");
		
		//(21)otomobil1.aracinMotoru = motor1; bu satırı silersek 34. satır çalışmaz hata verir.

		
		
		
		//2. otomobili üretiyoruz
		Otomobil otomobil2 = new Otomobil();
		otomobil2.marka = "BMW";
		
		motor1 = new Motor();
		
		Motor motor2 = new Motor();
		motor2.motorHacmi = 1900;
		motor2.saseNo = "AYD455645";
		motor2.yakitTuketimi = 15;
		
		otomobil2.aracinMotoru = motor2;
		
		//---
		otomobil1.aracinMotoru.motorBilgileriniYazdir(); //syso yapmama gerek yok çünkü void dönüyor
		otomobil2.aracinMotoru.motorBilgileriniYazdir();
		

		//nesneyle b
		Otomobil otoTemp = otomobil1;
		otomobil1 = null; //yukarıdaki satırda temp e attığımız için garbage collector onu çöpe atmaz
		//ama biz temp e bağlamasaydık herhangi bir bağlı olan şeyi kalmadığı için garbage collector onu atacaktı.
		//Ama zaten sen tempe hiç bağlamasaydın null yaptıktan sonra zaten kullanamazdın.
		otoTemp.aracinMotoru.motorBilgileriniYazdir();
		
		
		
	}

}
