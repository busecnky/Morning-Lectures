package com.busecnky.kasim1;

public class DizilerMultiDimensional003 {

	public static void main(String[] args) {

		int[] tekBoyutluDizi = new int[4];  //{0, 0, 0, 0} => Tek boyutlu dizi
		
		//Çok boyutlu dizi (matris de denir)
		
		//Çok boyutlu dizi oluşturma - 1. yöntem
		
		int[][] cokBoyutluDizi = new int [2][3];  //2 satır 2 sütunlu matris/dizi
												  // {{0, 0, 0} , {0, 0, 0}}
		
		
		// 0 0 0
		// 0 0 0       bu aslında bu
		
		
		cokBoyutluDizi[0][0] = 1;
		// 1 0 0 
		// 0 0 0 
		
		cokBoyutluDizi[0][1] = 2;
		// 1 2 0 
		// 0 0 0 
		
		cokBoyutluDizi[1][2] = 8;
		// 1 2 0 
		// 0 0 8 
		
		
		System.out.println(cokBoyutluDizi[0][0]);  
		System.out.println(cokBoyutluDizi[0][1]);
		System.out.println(cokBoyutluDizi[1][2]);
		
		
		
		//Çok boyutlu dizi oluşturma - 2. yöntem
		
		int[][] cokBoyutluDizi2 = {{5, 10, 15} , {20, 25, 30}};
		// 5 10 15
		// 20 25 30
		
		System.out.println(cokBoyutluDizi2[0][0]);
		System.out.println(cokBoyutluDizi2[1][2]);
		
		
		
		
		
	}

}
