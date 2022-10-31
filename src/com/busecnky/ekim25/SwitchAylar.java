package com.busecnky.ekim25;

import java.util.Scanner;

public class SwitchAylar {

	public static void main(String[] args) {
		// Ay numarasına göre mevsim yazdırma
		
		//Bu java14+ sonrası geçerli:

		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen mevsim giriniz: ");
		int ay = scanner.nextInt();
		switch (ay) {
		case 12,1,2:
			System.out.println("Kış");
			break;
		case 3,4,5:
			System.out.println("İlkbahar");
			break;
		case 6,7,8:
			System.out.println("Yaz");
			break;
		case 9,10,11:
			System.out.println("Sonbahar");
			break;
		default:
			System.out.println("Yanlış seçim lütfen 1-12 arasında bir değer giriniz.");
			break;
		}
		
		
	}

}
