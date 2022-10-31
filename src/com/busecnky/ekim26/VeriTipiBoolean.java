package com.busecnky.ekim26;

import java.util.Scanner;

public class VeriTipiBoolean {

	public static void main(String[] args) {
			
		//boolean veritipi: 1 bit
		//açık mı kapalı mı?
		//doğru mu yanlış mı?
		
		
		boolean isHeavy = false;
		boolean isActive = false;
		boolean flag = true;
		
		boolean agirMi = false; 
		int agirlik = 85;
		agirMi = agirlik >= 85;
		System.out.println(agirMi);
		System.out.println("Ağır mı? : " + agirMi);
		
		if (agirMi) {
			System.out.println("Ağır");
		}
		else {
			System.out.println("Ağır değil");
		}
		
		System.out.println("************************");
		
		/*
		// == != > < >= <=
		int yasakPort = 80;
		int haberlesmePort;
		Scanner scanner = new Scanner(System.in);
		haberlesmePort = scanner.nextInt();
		
		boolean isPortValid = (haberlesmePort != yasakPort);
		System.out.println(isPortValid);
		
		
		
		System.out.println("************************");
		
		*/
		
		
		int boy = 190;
		agirlik = 87;
		boolean uzunKilolu = (boy >=180) && (agirlik >=85);
		System.out.println("Şahıs uzun boylu ve kilolu mu? : "+ uzunKilolu);
		
		//Örnek:
		char cinsiyet = 'E';
		boolean uzunKiloluKadin = uzunKilolu && (cinsiyet =='K');
		System.out.println("Şahıs uzun boylu ve kilolu kadın mı? " + uzunKiloluKadin);

		
		
		// if => Ternary Kullanımı
		
		//ÖRN:
		int yas = 19;
		String deger;
		if (yas >= 18) {
			deger = "Yetişkin";
		}
		else {
			deger = "Yetişkin değil";
		}
		System.out.println(deger);
		
		System.out.println("*****************");
		
		//Ternary ile:
		yas = 21;
		deger = yas >= 18 ? "Yetişkin" : "Yetişkin değil";
		System.out.println(deger);
		
	}

}
