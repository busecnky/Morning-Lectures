package com.busecnky.kasim3;

import java.util.Random;
import java.util.Scanner;

public class MetotOrnek002 {

	//Metotları mainin içine yazmıyoruz mainin dışına yazıyoruz.
	//Örnek metot1;
			//Random sayı üreten bir metot yazalım:
			public static int randomNumber() {
				Random random = new Random();
				int result = random.nextInt(100);
				return result;
			}
	
	//Yukarıdaki metotu 1'den bizim istediğimiz(parametre olarak girilen) limit sayıya kadar olan bir random sayı üretsin
			public static int randomNumber (int limit) {
				Random random = new Random();
				int result = random.nextInt(limit);
				return result;
			}
			
	//Soru
	//Alt limit ve üst limiti kullanıcıdan alan bi random generator programı
		
			public static int randomNumberGenerator() {
				int result = 0;
			Scanner scanner = new Scanner(System.in);
			System.out.println("Alt limiti giriniz: "); //1000
			int altLimit = scanner.nextInt();
			System.out.println("Üst limiti giriniz: "); //2000
			int ustLimit = scanner.nextInt();

			
			result = MetotOrnek002.randomNumber(ustLimit - altLimit) + altLimit; //  (0-1000) + 1000 = (1000-2000 arasında)
			
			return result;
			}		
			
			
			
	public static void main(String[] args) {

		System.out.println("Random bir sayı: " + MetotOrnek002.randomNumber() );
		
		System.out.println("Random sayı üst limiti 1000 olan : "+ MetotOrnek002.randomNumber(1000));
		
		//Alkt limiti ve üst limiti kullanıcıdan alan bir random sayı üreten metot kullanımı:
		System.out.println(randomNumberGenerator());
		
	}

}
