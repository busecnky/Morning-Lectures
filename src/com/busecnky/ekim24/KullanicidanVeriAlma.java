package com.busecnky.ekim24;

import java.util.Scanner;

public class KullanicidanVeriAlma {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int yeniSayi1;
		System.out.println("Lütfen 1.sayıyı giriniz: ");
		yeniSayi1 = scanner.nextInt();
		int yeniSayi2;
		System.out.println("Lütfen 2.sayıyı giriniz: ");
		yeniSayi2 = scanner.nextInt();
		int toplam;
		toplam = yeniSayi1 + yeniSayi2;
		System.out.println("Toplam: " + toplam);
	}

}
