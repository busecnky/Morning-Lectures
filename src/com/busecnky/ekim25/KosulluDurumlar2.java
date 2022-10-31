package com.busecnky.ekim25;

import java.util.Scanner;

public class KosulluDurumlar2 {

	public static void main(String[] args) {
		
		
		// Otomobil yaşına göre vergi dilimi tespiti..
		//
		/*Kullanıcının girdiği otomobil yaşına göre vergi dilimi bilgisini ekrana yazdırın
		 * 0-yas-5 : En yüksek vergi dilimi
		 * 5-yasş-10 : Orta vergi dilimi
		 * 10-yas : En küçük vergi dilimi
		 */

		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen otomobil yaşını giriniz: ");
		int otomobilYasi = scanner.nextInt();
		
		if (otomobilYasi >= 0 && otomobilYasi <= 5) {
			System.out.println("En yüksek vergi dilimindesiniz.");
		}
		
		if (otomobilYasi > 5 && otomobilYasi <= 10) {
			System.out.println("Orta vergi dilimindesiniz.");
		}
		
		if (otomobilYasi > 10) {
			System.out.println("En küçük vergi dilimindesiniz.");
		}
		
	}

}
