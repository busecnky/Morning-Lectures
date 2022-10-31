package com.busecnky.ekim31;

import java.util.Scanner;

public class DiziOrnek2 {

	public static void main(String[] args) {


		System.out.println("*******************************");
		System.out.println("*                             *");
		System.out.println("*     Öğrenci Otomasyonu      *");
		System.out.println("*                             *");
		System.out.println("*******************************");
		
		
		//Sınıf mevcudu tane öğrenci olsun sınıflarda
		//
		int sinifMevcudu;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen sınıf mevcudunu giriniz: ");
		sinifMevcudu = scanner.nextInt();
		
		scanner.nextLine();    //int girdikten sonra String girerken hata olmaması için
		
		String[] sinifListesi = new String[sinifMevcudu];
		for (int i=0; i<sinifListesi.length; i++) {
			System.out.println("Lütfen " + i + ".nci öğrencinin adını giriniz: ");
			sinifListesi[i] = scanner.nextLine();
		}
		
		//3. aşama
		//Öğrenci listesini yazdır:
		for (int i=0; i<sinifListesi.length; i++) {
			System.out.println(i + "nci öğrencinin adı: " + sinifListesi[i]);
		}
		
		
		
		

	}

}
