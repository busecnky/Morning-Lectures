package com.busecnky.kasim3;

public class MetotOrnDevam003 {

	
	
	
	
	private static int diziTopla(int[] array) {
		int toplam = 0;
		
		for (int i = 0; i < array.length; i++) {
		toplam += array[i];	
		}
		return toplam;
		
	}

	private static void test(int x) {
		x = 200;
	}
	

	private static int test2(int x) {
		x = 200;
		return x;
	}

	//arraylerde durum farklı!!
	private static void arrayIcerigiDegistir(int[] dizi) {
		dizi[0] = 100;
		
	}
	
	
	
	
	public static void main(String[] args) {
		//Örnek1
		int [] array = { 5, 10, 15, 20};
		System.out.println(diziTopla(array));
		
		
		//Örnek2
		int sayi = 1;
		test(sayi);
		System.out.println(sayi); //1 bastı bu
		
		
		//Örnek3
		int sayi2 = 1;
		sayi2 = test2(sayi2);
		System.out.println(sayi2);
		
		//Örnek4
		arrayIcerigiDegistir(array);
		System.out.println(array[0]);
		
		
		
		}

}
