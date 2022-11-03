package com.busecnky.kasim2;

import java.util.Scanner;

public class MetotlarOrnek002 {

	// 1.örnek:
	private static int kareAl(int sayi) { // void yok return type istiyor sonra return yaptık
		int sonuc; // sonuc local bir değişkendir. Sadece metotun içinde görülür.
		sonuc = sayi * sayi;
		return sonuc;
	}

	/*
	 * private static void kareAl2(int sayi) { //void var return yazmamızı istemiyor
	 * hata veriyor. int sonuc; sonuc = sayi *sayi; //return sonuc; }
	 */

	// 2.örnek:
	// Soru:
	// Dikdörtgenin alanını hesaplayan bir metod(fonksiyon) yazınız
	// Metodun parametre olarak int cinsinden diksörtgenin kısa kenarı ve uzun
	// kenarını alsın
	// dikdörtgen alanını hesaplayıp return etsin/dönsün.
	private static int dikdortgenAlanHesapla(int kisaKenar, int uzunKenar) {
		int alan;
		alan = kisaKenar * uzunKenar;
		return alan;
	}

	public static int alanHesapla() {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Dikdörtgenin kısa kenarını giriniz");
		int kisaKenar = scanner.nextInt();
		System.out.println("Dikdörtgenin uzun kenarını giriniz");
		int uzunKenar = scanner.nextInt();
		int alan = kisaKenar * uzunKenar;
		return alan;
	}

	
	
	
	public static void main(String[] args) { // bir metotun içinde diğer metotu kullanabiliyosun (yoksa kullanamazsın
												// havada.)

		// -------
		// Metot kullanımı:
		// 1.kullanım:

		int karesi = 0;
		karesi = MetotlarOrnek002.kareAl(5); // sınıfın ismini kullanırsan nerden geldiğini görürsün sınıfa özgüdür bu.
		System.out.println(karesi);

		// 2.kullanım
		System.out.println(MetotlarOrnek002.kareAl(5));

		// dikdörtgen sorusunu kullanalım burda.
		System.out.println("Dikdörtgenin alanı: " + dikdortgenAlanHesapla(5,10));

		
		//kullanıcıdan kenarları istediğimiz versiyonu kullanma:
		
		int[] alanlarDizisi = new int[3]; // {0, 0 ,0}
		for (int i = 0; i < 3; i++) {
			//System.out.println("Alan: " + MetotlarOrnek002.alanHesapla());
			alanlarDizisi[i]=  MetotlarOrnek002.alanHesapla();
		}
		for (int i = 0; i < 3; i++) {
			System.out.println(i + ".nci dikdörtgenin alanı: " + alanlarDizisi[i]);
		}

	}

}
