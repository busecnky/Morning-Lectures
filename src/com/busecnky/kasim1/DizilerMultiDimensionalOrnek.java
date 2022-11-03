package com.busecnky.kasim1;

public class DizilerMultiDimensionalOrnek {

	public static void main(String[] args) {

		// Örnek uygulama:
		// Bir sınıf listesi yapalım
		// İçerik şu şekilde olsun
		// SıraNo: ÖğrenciNo Ad Soyad
		// 1 101 Ali Kaya
		// 2 102 Veli Öz
		// 3 103 Zeynep Çalışkan

		String[][] sinifListesi = new String[3][4]; // 3 satır ve 4 sütundan oluşan bir çok boyutlu dizi oluşturduk.

		// İçine kayıtları atalım:
		sinifListesi[0][0] = "1";
		sinifListesi[0][1] = "101";
		sinifListesi[0][2] = "Ali";
		sinifListesi[0][3] = "Kaya";

		sinifListesi[1][0] = "2";
		sinifListesi[1][1] = "102";
		sinifListesi[1][2] = "Veli";
		sinifListesi[1][3] = "Öz";

		sinifListesi[2][0] = "3";
		sinifListesi[2][1] = "103";
		sinifListesi[2][2] = "Zeynep";
		sinifListesi[2][3] = "Çalışkan";

		// Öğrencileri ekrana yazdırmaya çalışalım:
		System.out.println("Öğrenci Listesi");
		System.out.println("---------------");
		System.out.println(
				sinifListesi[0][0] + " " + sinifListesi[0][1] + " " + sinifListesi[0][2] + " " + sinifListesi[0][3]);
		System.out.println(
				sinifListesi[1][0] + " " + sinifListesi[1][1] + " " + sinifListesi[1][2] + " " + sinifListesi[1][3]);
		System.out.println(
				sinifListesi[2][0] + " " + sinifListesi[2][1] + " " + sinifListesi[2][2] + " " + sinifListesi[2][3]);
		System.out.println("\n---------------");

		// 3 satır için sorun yok ancak 3000 satır olsa ne olacaktı?
		// Peki ne yapacağız?

		// Çözüm: İç içe for döngüleri

		System.out.println("Öğrenci Listesi\n---------------");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print(sinifListesi[i][j] + " ");
			}
			System.out.println();
		}

		//Code refining;
		//
		//Yukarıda 3 ve 4 sayılarını kod içine gömmek doğru değil.
		//Bunun yerine length metodunu kullanalım.
		

		System.out.println("Öğrenci Listesi\n---------------");
		for (int i = 0; i < sinifListesi.length; i++) {
			for (int j = 0; j < sinifListesi[i].length; j++) {      //BURAYA DİKKAT ET sinifListesi[i].length !!! unutma
				System.out.print(sinifListesi[i][j] + " ");
			}
			System.out.println();
		}
		
		/*
		 * Bu da çok ergonomik değil
		 * System.out.println("Öğrenci Listesi\n---------------"); for (int i = 0; i <
		 * 3; i++) { System.out.println(sinifListesi[i][0] +" "+ sinifListesi[i][1] +
		 * " " + sinifListesi[i][2] + " " + sinifListesi[i][3]);
		 * 
		 * }
		 * 
		 */
		
		
		//3 boyutlu dizi
		int[][][] dizi3 = new int[3][3][3];
		 dizi3 [0][0][0] = 23;
		 dizi3 [0][0][1] = 40;

		 System.out.println( dizi3 [0][0][0]);
		
		
		
		
		
		
		

	}

}
