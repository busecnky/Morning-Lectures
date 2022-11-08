package com.busecnky.kasim4.OOPOrnek;

public class Main {

	public static void main(String[] args) {
		Dikdortgen dikdortgen1 = new Dikdortgen();
		dikdortgen1.kisaKenar = 10;
		dikdortgen1.UzunKenar = 20;
		System.out.println(dikdortgen1.alanHesapla());
		
		Kare kare1 = new Kare();
		kare1.kenar = 5;
		System.out.println(kare1.alanHesapla());
		
		Kare kare2 = new Kare();
		kare2.kenar = 7;
		System.out.println(kare2.alanHesapla());
		
		kare1.kenar = 15;
		System.out.println(kare1.alanHesapla());
		
		
	}
	

}
