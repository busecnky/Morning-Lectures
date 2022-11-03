package com.alikaya;

import com.busecnky.kasim2.SinifStaticDegiskenler004;

public class YardimciSinif {

	public static void helloYardimci() {
	System.out.println("Hello from Yardimci");
	}

	
	private static void merhaba() {
		System.out.println("Merhaba...");
		}

	
	public static void main(String[] args) {
		YardimciSinif.merhaba();
		YardimciSinif2.ekranaJavaYaz();   		//burda protected olsa bile yazabiliyoruz.
		}

	public static int mesafe() {
		
		SinifStaticDegiskenler004.x = SinifStaticDegiskenler004.x * 3;
		
		int mesafe = com.busecnky.kasim2.SinifStaticDegiskenler004.dunyaninYaricapi*2;
		return mesafe;
	}
	
	private static void kullaniciSayisiArtir() {
		SinifStaticDegiskenler004.aktifKullaniciSayisi++;   //burdan da artırabiliriz. Asıl yerinden de.
	}
	
}
