package com.busecnky.ekim25;

public class DongulerFor {

	public static void main(String[] args) {

		/* Böyle uzun uzun yazmaktansa döngü kullanmalıyız.
		System.out.println("Merhaba");
		System.out.println("Merhaba");
		System.out.println("Merhaba");
		System.out.println("Merhaba");
		System.out.println("Merhaba");
		 */
		
		for (int sayac = 1; sayac <= 5; sayac++) 
			System.out.println("Merhaba");		//süslü parantez yoksa sadece bir altındaki satırı yazar	
		
		//süslü parantez varsa ama kaç tane ne yazdırdıysan hepsini loop'a sokar.
		
		for (int sayac = 1; sayac <= 3; sayac++) {
			System.out.println("Merhaba");
			System.out.println("Hello");
		}
		
		
		int i = 1;
		for(;i<=5;i=i+1) //Bu şekilde de yazabilirsin
		System.out.println("Java");
		
		System.out.println(i);
		
		
		for (int j = 1; j < 6; j++) {
			System.out.println("Merhaba " + j);
			
		}
		
		/*Sonsuz döngü için
		 
		for(;;) {
			System.out.println("Sonsuz");
			System.out.println("Döngü");
		}
		
		*/
		
		//1'den 10'a kadar olan sayıların toplamını yazalım.
		int toplam = 0;
		for (int k=1 ; k<=10 ; k++) {
			toplam = toplam + k;
			System.out.println("k = " + k + " olduğunda, toplam = " + toplam);
			
		}
		System.out.println(toplam);
		
		
		//yaşam konteksi (scope'u diyebiliriz. for loop'unun içindeyse eğer k mesela işler.
	}

}
