package com.busecnky.ekim25;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		// işlem se3çiniz
		//1:toplama 2:çıkarma 3:çarpma 4:bölme

		
		Scanner scanner = new Scanner(System.in);
		/*System.out.println("Lütfen işlem giriniz: ");
		int key = scanner.nextInt();
		
		if (key==1) {
			System.out.println("toplama");
		}
		else if (key==2) {
			System.out.println("çıkarma");
		}
		else if (key==3) {
			System.out.println("çarpma");
		}
		else if (key==4) {
			System.out.println("bölme");
		}
		*/
		
		//bu yukarıdaki yerine aşağıdakini kullanabiliriz.
		
		/*
		switch (key) {
		case value1:
			//işlem1
			break;
		case value2:
			//işlem2
			break;
			...
		default:
			break;
		}
		*/
		//scanner yukarıda
		System.out.println("Lütfen işlem giriniz: ");
		int x = scanner.nextInt();
		switch (x) {
		case 1:
			System.out.println("Toplama seçtiniz.");
			break;
		case 2:
			System.out.println("Çıkarma seçtiniz.");
			break;
		case 3:
			System.out.println("Çarpma seçtiniz.");
			break;
		case 4:
			System.out.println("Bölme seçtiniz.");
			break;
		default:
			System.out.println("Yanlış seçim lütfen 1-4 arasında bir değer giriniz.");
			break;
		}
		
		
		
		
		
		
		
	}

}
