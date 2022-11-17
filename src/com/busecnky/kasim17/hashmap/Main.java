package com.busecnky.kasim17.hashmap;

import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		
		//HashMap'ler key value pair'ler (anahtar - değer) çifti olarak tutulurlar.
		//Key -> Value
		//HashMap içindeki elemanları sıralı şekilde tutmaz! (ArrayList ve LinkedListin aksine)
		//HashMap içindeki elemanları hashleyerek random bir sırada tutar.
		//HashMap'ler List'lere göre random access (rastgele erişimlerde) tıpkı HashSetler gibi hızlıdırlar.
		
		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
		hashMap.put(10, "Opel");
		hashMap.put(20, "Audi");
		hashMap.put(30, "VW");
		hashMap.put(40, "BMW");
		hashMap.put(50, "Renault");
		
		System.out.println(hashMap);
		//Bunun çıktısı
		//{50=Renault, 20=Audi, 40=BMW, 10=Opel, 30=VW}

		//Yaniii:
		//Eğer sıralayacak bir şey istemiyorsan, sıra senin için önemli değilse
		//random çıktı almak sorun değilse hashMap kullanabilirsin.
		//Sıra önemli değil sınavdan kaldın mı geçtin mi atandın mı atanamadın mı gibi şeylerde kullanılabilir.
	

		
		//Aynı key'e başka bir değer eklerseniz üzerine yazarsınız.
		hashMap.put(40, "Fiat");
		System.out.println(hashMap);
		
		System.out.println(hashMap.get(20));
		System.out.println(hashMap.get(40));
		System.out.println(hashMap.get(70)); //---> null
		//null bastırmak istemiyorsak bi içinde var mı diye bakabiliriz.
		if(hashMap.containsKey(70)) {
			System.out.println("Mevcut");
		}else
			System.out.println("Mevcut değil.");
		
		
		//HASHMAP İÇERİĞİNİ YAZDIRMAK
		//
		//1.yol:
		for (Integer key : hashMap.keySet()) {
			System.out.println("Key: " + key + " Value: " + hashMap.get(key));
		}
		
		//2.yol
		//HashMap'i Set'e dönüştürür ve loop ederiz:
		for(Map.Entry<Integer, String> entry : hashMap.entrySet()) {
			System.out.println("Anahtar: " + entry.getKey() + " Değer: " + entry.getValue());
		}
		
		
		//Önemli bir iki metot:
		if(hashMap.containsKey(230)) {
		System.out.println("Mevcut");
		}else
		System.out.println("Mevcut değil.");
		
		
		if(hashMap.containsValue("Renault")) {
			System.out.println("Mevcut");
			}else
			System.out.println("Mevcut değil.");
		
		
		
		
		
		
		
		
		
		
	}
}
