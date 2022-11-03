package com.busecnky.kasim3;

public class ForEach007 {

	
	public static int w;
	
	
	
	public static void main(String[] args) {

		//adı for each ama kullanırken for each yazmıyoruz (başka dillerde adı for each)
		
		//Örnek1
		//
		int[] dizi = {1, 24, 35, 44, 59, 79, 111, 122};
		
		//köşeli parantez kullanmadan dizi içinde iteration yapmamızı sağlar
		
		for (int sayi : dizi) {
			System.out.println(sayi);
		}
		
		
		
		//Örnek 2:
		//
		String[] isimlerDizi = {"Ali", "Veli", "Osman", "Ayşe"};
		for (String isim : isimlerDizi) {
			System.out.println(isim);
		}
		
		
		
		//Scope konusu:
		//Yukarıdaki örnekte isim değişkeni sadece for döngüsü içinde tanımlanır. Dışarıda tanımsızdır.
		//System.out.println(isim); => hata verir!
		
		//Örnek scope:
		int x = 5;
		if (x>3) {
			String ifade = "sayı üçten büyük";
			System.out.println(ifade);
		}
		//System.out.println(ifade);  => Scope dışıdır.
		
		//Başka bir konu dikkat:
		int z;
		//int y = z*2;   // hata verir: initialize etmeniz gerekir. : İlk değer atamalısınız.
		
		//static üye değişkenlerini Java kendisi program çalıştığında initialize eder. Yani ilk değeri kendi atar
		//bu yüzden alttakinin cevabı = 0
		z = w*5; //hata vermedi yukarıda int z = 0; şeklinde initialize etmememize rağmen
		System.out.println(z); // çıktı: 0
	}

}
