package com.busecnky.kasim17.hashmap;

import java.util.HashMap;

public class MainOsymOrnekUygulama {

	public static void main(String[] args) {
		
		OgrenciOsymSonuc ogrenci1sonuc = new OgrenciOsymSonuc("Ali", "Özkan", 88, 70, 90);
		OgrenciOsymSonuc ogrenci2sonuc = new OgrenciOsymSonuc("Veli", "Özkan", 58, 40, 60);
		OgrenciOsymSonuc ogrenci3sonuc = new OgrenciOsymSonuc("Ayşe", "Özkan", 48, 30, 880);
		OgrenciOsymSonuc ogrenci4sonuc = new OgrenciOsymSonuc("Fatma", "Özkan", 81, 97, 93);

		//key: Integer(tcKimlikNo)     ->		value: OgrenciOsymSonuc sınıfından oluşturulan nesneler
		HashMap<Integer, OgrenciOsymSonuc> hashMap = new HashMap<Integer, OgrenciOsymSonuc>();
		hashMap.put(1144567, ogrenci1sonuc);
		hashMap.put(7554567, ogrenci2sonuc);
		hashMap.put(9465275, ogrenci3sonuc);
		hashMap.put(8521645, ogrenci4sonuc);
		
		//Sorgy yazıyoruz:
		//
		OgrenciOsymSonuc sonuc = hashMap.get(1144567);
		System.out.println(sonuc);
		
		sonuc = hashMap.get(7554567);
		System.out.println(sonuc);
		
		
	}
}
