package com.busecnky.kasim17.hashmap;

import java.nio.file.spi.FileSystemProvider;
import java.util.HashMap;

public class Soru1 {
	
	//Static bir metot yazalım. 
	//Bir string içindeki karakterlerin sayısını bulan ve ekrana yazdıran metot yazınız.
	//String metin = "Herkese merhaba iyi çalışmalar"
	
	public static void harfSayisiBul(String metin) {
		HashMap<Character , Integer> hashMap = new HashMap<Character , Integer>();
		
		for (int i = 0; i < metin.length(); i++) {
			char character = metin.charAt(i);
			if(hashMap.containsKey(character)) { 		// karakter hashMapte mevcutsa bu kod bloğuna girer
				hashMap.replace(character, hashMap.get(character)+1);  //hashMap.put(character, hashMap.get(character)+1);  böyle put ile de oluyor.
			}else {				// karakter hashMapte mevcut değilse bu kod bloğuna girer
				hashMap.put(character, 1);
			}
		}
		System.out.println(hashMap);
	}
	
	
	
	public static void enCokTekrarEdenHarfiBul(String metin) {
		HashMap<Character , Integer> hashMap = new HashMap<Character , Integer>();
		
		for (int i = 0; i < metin.length(); i++) {
			char character = metin.charAt(i);
			if(hashMap.containsKey(character)) { 		
				hashMap.put(character, hashMap.get(character)+1);
				int max = 0;
				String k = "!";
				if(hashMap.get(character)+1 > max) {
					max = hashMap.get(character)+1;
					
				}
			}else {			
				hashMap.put(character, 1);
			}
		}
		System.out.println(hashMap);
	}
	
	
	public static void main(String[] args) {
		
		String metin = "Herkese merhaba iyi çalışmalar";
		harfSayisiBul(metin);
		
		enCokTekrarEdenHarfiBul(metin);
		
		
	}

}
