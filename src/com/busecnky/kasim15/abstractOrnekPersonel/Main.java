package com.busecnky.kasim15.abstractOrnekPersonel;

public class Main {

	public static void main(String[] args) {
		
		//Personel p = new Personel("Ali", "ÖZ", "111", 22, 8000, 1, 5551112233L); =>Personel sınıfı ABSTRACT sınıf olduğu için
																				//new ile nesne oluşturalamaz.
		
		Mudur m = new Mudur("Ali", "ÖZ", "111", 40, 10000, 1, 5552223344L, "İdari Müdür", 2233L);
		
		//NOT:
		//
		//Bir abstract sınıftan miras alındığı (inherit edildiği) zaman, mutlaka o abstract sınıfın içindeki
		//abstract metotları alt sınıfınızda override(implement) etmek zorundasınız.
		//***SINAV SORUSU***
		

		System.out.println(m.getZamKatSayisi());
		System.out.println(m.personelKimlikBilgileriniGetir());
		
		Sekreter sek = new Sekreter("zeynep", "Kaya", "1234", 30, 1000, 2, 444L, 4567L, 4455L);
		System.out.println(sek.personelKimlikBilgileriniGetir());
		
		
		
		//Final sınıflara örnek:
		//
		//Mesela Kava'nın içinde gelen Math sınıfı final bi sınıfıtr. Nu sınıftan yeni sınıf türetilemez.
		//Mat sınıfının içine Java koyulması gerekli tüm genel fonksiyonları ve üyeleri eklemiş, bu sınıftan yeni bir
		//sınıf türetilip yeni özellikler eklenmemesi için sınıfı final yapmış.
		
		System.out.println(Math.PI);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
}
