package com.busecnky.ekim27;

import java.util.Scanner;

public class ScannerKullanimEkBilgi {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		//int sayi = scanner.nextInt();
		//System.out.println(sayi);
		
		/*
		double sayi = scanner.nextDouble(); //***nextDouble ı unutma!!!!
		System.out.println(sayi);
		
		
		float sayi2 = scanner.nextFloat(); //***nextFloat ı unutma!!!!
		System.out.println(sayi2);
		*/
		
		//short gir byte gir siz deneyin dedi hoca
		
		/*
		String s;
		System.out.println("Ad girin: ");
		s = scanner.nextLine();
		System.out.println("Adınız" + s);
		
		System.out.println("Yaş girin: ");
		int sayi = scanner.nextInt();
		System.out.println("Yaşınız" + sayi);
		
		*/ //Bu sıkıntısız çalışır. Önce string sonra int sorunda sıkıntı olmaz.
		
		//Ama önce yaş sonra string girdisi istediğimiz zaman çalışmıyor sistem hata vermez ama çalışmayı durduruyo
		
		//Sebebi yaşı yaz enter a bas nextInt alıyor. sonra nextLine gelince sonraki satırı enter yapıp bir şey girmeni engelliyo.
		//nextLine new line karakteridir o yüzden
		
		System.out.println("Yaş girin: ");
		int sayi = scanner.nextInt();
		System.out.println("Yaşınız" + sayi);
		
		scanner.nextLine(); // skip the newline charakter
		
		String s;
		System.out.println("Ad girin: ");
		s = scanner.nextLine();
		System.out.println("Adınız" + s);
		
		
		//çözümü 46.satırda
		
	}

}
