package com.busecnky.kasim17.hashset;

import java.util.ArrayList;
import java.util.HashSet;

public class Main {
	
	public static void main(String[] args) {
		
		//HashSet'ler Java'da elemanlara random olarak çok hızlı bir şekilde erişebilmek amacıyla kullanılan veri yapılarıdır.
		//Bunun nedeni setlerdeki elemanlara erişilirken hash kodlarının kullanılmasıdır.
		//Hashcode sayesinde herhangi bir input elemanı unique(benzersiz) olarak tanımlandırabilir.
		//HashSet aynı elemanları barındıramaz.
		
		
		HashSet<String> hashSet = new HashSet<String>();
		hashSet.add("Kus");
		hashSet.add("Kedi");
		hashSet.add("Kopek");
		
		for (String s : hashSet) {
			System.out.println(s);
		}
		
		
		//Aşağıdaki ifadeyi içinde milyonlarca kayır olan bir ArrayList'te yapmaya kalkarsanız
		//HashSet'e göre çok uzun süre alabilir.
		//HashSet ile çok kısa sürede aradığınız değere ulaşabilirsiniz.
		if (hashSet.contains("Kus")) {
			System.out.println("Kus set içinde mevcut");
		}else
			System.out.println("Kus set içinde yok");

		//İçinde milyonlarca kayıt olsaydı aşağıdaki işlem yukarıdakine göre çok daha uzun sürerdi:
		ArrayList<String> list = new ArrayList<String>();
 		list.add("Kuş");
 		if (hashSet.contains("Kuş")) {
			System.out.println("Kuş set içinde mevcut");
		}else
			System.out.println("Kuş set içinde yok");

		
		//HASHSETLERDE FARK BULMA:
 		HashSet<String> hashSet2 = new HashSet<String>();
		hashSet2.add("Kaplan");
		hashSet2.add("Kedi");
		hashSet2.add("Aslan");

		//hashSet2'nin hashSet'ten Farkını Bulma:
		
		//1. adım:
		HashSet<String> fark = new HashSet<String>(hashSet2);
		
		//2. adım: İçinde ne varsa çıkart
		fark.removeAll(hashSet);
		
		//içinde toString var o yüzden direk böyle yazabiliriz.
		System.out.println(fark);
		
		
		
	}
	
	

}
