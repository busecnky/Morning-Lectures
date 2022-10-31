package com.busecnky.ekim26;

import java.util.Scanner;

public class DongulerWhile {

	public static void main(String[] args) {

		//while döngüsü:
		//for'dan farklı olarak koşulun devam edip etmemesi durumunu
		//while döngüsü içerisinde değiştirebilirsiniz.
		// for döngüsü belirli sayıda döngü dönecekse kullanılır.
		/*
		 * if(...) {
		 * 
		 * }
		 * 
		 * While da if'e benziyor.
		 * 
		 * while(koşul) {  // while burası true ise kontrol ediyor yani == true yazmaya gerek yok
		 *     //kodlarımız...
		 * }
		 *
		 */
		
		
		for (int i = 0 ; i<5 ; i++ ) {
			System.out.println(i);
		}
		
		System.out.println("*********************");
		
		int sayi=0;
		while (sayi<5) {
			System.out.println(sayi); //bunun altına sayi++ yazmazsak sonsuz döngü olur.
			sayi++;
		}
		
		System.out.println("*********************");
		
		/*
		 while(hareketyoksa) {
		
			//kameranın hareket algılama ile ilgili dosyasını kontrol et
			//dosyada 1 yazıyorsa bir değişkenle while'ın döngüsünün koşulu değiştir
			//hiç bir şey yapma
		}
		AlarmÇal
		*/
		
		//Örn1:
		//Kullanıcı 0'a basana kadar kullanıcının girdiği sayının karesini alıp yazdıran program
		
		/*
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen karesi alınacak sayıyı giriniz - çıkmak için 0'a basınız.");
		int rakam = 1;
		
		while (rakam != 0) {
			rakam = scanner.nextInt();
			System.out.println(rakam + "'ın karesi= " + rakam*rakam);
		}
		*/
		
		//Örn2:
		Scanner scanner = new Scanner(System.in);
		int rakam = 0;
		while ((rakam = scanner.nextInt()) != 0) {
			System.out.println(rakam + "'ın karesi= " + rakam*rakam);
		}
		
		
		
		
		scanner.close();
		
		
		
		
		
	}

}
