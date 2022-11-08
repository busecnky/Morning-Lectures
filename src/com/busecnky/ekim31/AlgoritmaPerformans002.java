package com.busecnky.ekim31;

public class AlgoritmaPerformans002 {

	public static void main(String[] args) {

		
		int islemAdedi = 100000;
		
		//Algoritme-1:
		/*
		long startTime = System.currentTimeMillis();
		//Basit bir algoritma:
		String metin = "Hello";
		for (int i=0; i<islemAdedi; i++) {
			metin = metin + String.valueOf(i);
		}
		long endTime = System.currentTimeMillis();
		System.out.println("Algoritmanın işlem süresi " + (endTime-startTime) + "milisaniye");
		
		*/
		
		//Algoritma-2:
		long startTime = System.currentTimeMillis();
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("Hello");
		for(int i=0; i<islemAdedi; i++) {
			stringBuilder.append(i);
		}
		long endTime = System.currentTimeMillis();
		System.out.println("Algoritmanın işlem süresi " + (endTime-startTime) + "milisaniye");
		
		
		
		
		
		
		
		
	}

}
