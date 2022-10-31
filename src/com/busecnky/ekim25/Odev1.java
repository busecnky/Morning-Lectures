package com.busecnky.ekim25;

public class Odev1 {

	public static void main(String[] args) {
		// 1'den 10'a kadar olan tek sayıları yazdırıp bunların toplamını yazdıran program

	int toplam = 0;
	for (int k=1 ; k<=10 ; k++) {
		if (k%2 != 0) {
		toplam = toplam + k;
		System.out.println("k = " + k + " olduğunda, toplam = " + toplam);
		}
	}
	System.out.println(toplam);
	
	System.out.println("****************");

	int toplam2 = 0;
	for (int k=1 ; k<=10 ; k+=2) {
		toplam2 = toplam2 + k;
		System.out.println("k = " + k + " olduğunda, toplam = " + toplam2);
	
		}
	}
}
