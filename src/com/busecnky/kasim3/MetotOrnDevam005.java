package com.busecnky.kasim3;

import java.util.Random;
import java.util.Scanner;

public class MetotOrnDevam005 {

	//Nasıl 7 tane değer döncez? --> Array ile []
	public static int[] randomDiziURet(int ustLimit) {
		int[] dizi = new int [10];
		
		Random random = new Random();
		for (int i = 0; i < dizi.length; i++) {
			//dizi[i] = random.nextInt((ustLimit)/7)*7; //Girdiğimiz üst limit neyse onun altında değer gelsin diye böyle yaptık
			dizi[i] = random.nextInt(ustLimit)*7;
		}
		return dizi;
	}
	
	
	
	public static void main(String[] args) {
		
		//Rastgele 7'nin katı olan 10 tane tamsayı üreten bi metot yazınız.
		//Random sınıfının nextInt(limit) metodu içindeki üst limiti parametre olarak kullanıcıdan alın.
		//(İpucu: random.nextInt(ustLimit) * 7 kullanın)
		//Metot bir int dizisi return etsin
		//Main içinde bu dizinin elemanlarını ekrana yazdırın
		
		
		Scanner scanner = new Scanner(System.in);
		int limit = scanner.nextInt();
		int[] dizi = randomDiziURet(limit);
		
		for(int sayi : dizi) {
			System.out.println(sayi);
		}
		
		
	}
}
