package com.busecnky.ekim26;

import java.util.Scanner;

public class DongulerDoWhile {

	public static void main(String[] args) {

		//do-while döngüsü:
		//do {
		//        //kodlarımız...
		// } while (condition);
		//
		//do-while mekanizması içindeki kısım en az 1 kere mutlaka çalışır.
		//Daha sonra ise koşula göre çalışır.
		
		int sayac = 0;
		do {
			System.out.println(sayac);
			sayac++;
		} while(sayac<5);
		
		
		//Ornek - DİKKAT
		/*
		 int sayac = 7;
		do {
			System.out.println(sayac);
			sayac++;
		} while(x<5);
		
		//Bunun sonucu 7 çıkar.
		*/
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen küpü alınacak sayıyı giriniz - çıkmak için 0'a basınız.");
		int a;
		do {
			a = scanner.nextInt();
			if (a==0) {
				System.out.println("Programdan çıkılıyor...");
			} else {
				System.out.println(a + "'ın küpü= " + a*a*a);
			}
			} while (a!=0);
		
		
		
		
		
		
		
		
		
		

	}

}
