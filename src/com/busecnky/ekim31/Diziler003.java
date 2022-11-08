package com.busecnky.ekim31;

import java.util.Stack;

public class Diziler003 {

	public static void main(String[] args) {

		// tam sayı => {1, 7, 12, 39, 122, 242}
		// metin dizisi => {ali, veli, ayşe, ahmet}
		
		//dizi tanımlanır;
		//dizi tanımlamak için önce veri tipi/cinsi yazılır sonra [] işareti konulur:
		
		long[] dizi1;
		
		//Kural: dizileri initialize etmeden dizileri kullanamazsınız!
		
		dizi1 = new long[7]; //Bu satırı yazdığımda java arka planda şöyle bir şey oluşturur.
							 // {0, 0, 0, 0, 0, 0, 0}
		
		
		//dizinin ilk iki elemanına bakalım:
		System.out.println(dizi1[0]);
		System.out.println(dizi1[1]);
		
		//Dikkat: Dizinin boyutunu aşarsanız yine hata (exception) alırız:
		System.out.println(dizi1[6]); //10 yazarsan mesela hata veriyor "Index 10 out of bounds for length 7" diyor.
		
		
		//dizilere atama yapmak
		dizi1[0] = 10;
		dizi1[1] = 14;
		dizi1[6] = 28;
		System.out.println(dizi1[0]);
		System.out.println(dizi1[1]);
		
		//dizi tanımlama 2. yöntem:
		//
		int[] arrayInt = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		/*
		 * System.out.println(dizi1[0]);
		 * System.out.println(dizi1[1]);
		 * tek tek böyle bütün listedekileri yazdırmaktansa
		 * for döngüsüyle yazarız.
		 */
		for(int i = 0; i<10; i++) {
			System.out.println(arrayInt[i]);
		}
		
		
		for(int i = 0; i<arrayInt.length; i++) {
			System.out.println(arrayInt[i]);
		}
		
		// Dizi tanımlama String
		//
		String[] arrayString = new String[] {"Ali", "Veli", "Ayşe", "Can"};
		for(int i = 0; i<arrayString.length; i++) {
			System.out.println(arrayString[i]);
		}
		
		
		//Böyle de yapabilirim:
		String[] dizi2 = new String[3];
		dizi2[0] = "Papatya";
		dizi2[1] = "Gül";
		dizi2[2] = "Lale";
		
		//dizi1[3] = "Orkide"; // Dizi boyutlarını aşarsanız Runtime hata alırsınız. Dizi boyutlarını kontrol edin!!
	
		
		//NULL olayı
		String isim;
	//	System.out.println(isim); //=> Atama yapmadan erişmeye çalışırsanız IDE kırmızıya boyar veya Runtime hatası alırsınız.
		
		System.out.println();
		//Örnek:
		String[] dizi3 = new String[3];
		dizi3[0] = "Ali";
		for (int i=0; i<dizi3.length; i++ ) {
			System.out.println(dizi3[i]);  //Dizinin index:1 ve index:2 olan elemanlarının null olarak yazıldığını görürüz.
		}
		
		
		//Örnek:
		//İçinde sadece 2 eleman olan bir double dizisi tanımlayınız.
		//İçine ilk eleman 23.457, ikinci eleman ise 11 olarak atayınız.
		
		double[] dizi5 = new double[2]; //içinde sadece 2 eleman olan bir double dizisi tanımladık
		
		//Atama işlemleri:
		dizi5[0] = 23.457;
		dizi5[1]  = 11;
		
		//dizinin içeriğini ekrana loop ile yazdıralım:
		for (int i=0; i<dizi5.length; i++ ) {
			System.out.println(dizi5[i]);
		}
		
	
	}

}
