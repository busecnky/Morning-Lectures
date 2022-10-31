package com.busecnky.ekim31;

import java.util.Scanner;

public class DiziOrnek1 {

	public static void main(String[] args) {

		//Örnek:
		//1. Kullanıcıdan bir sayı alın(scanner). Aldığınız sayı boyutunda bir tamsayı(int) dizisi oluşturun.
		//2. Kullanıcının girdiği sayı kadar kullanıcıdan int tamsayı değeri girmesini isteyin ve diziyi doldurun
		//3. for loop ile dizinin içeriğini ekrana yazdırın.
		
		//1. aşama
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen dizinin boyutunu girin: ");
		int diziBoyutu = scanner.nextInt();
		int[] arrayInt = new int[diziBoyutu];
		
		//2. aşama
		for (int i=0; i<arrayInt.length; i++) {
			System.out.print("Lütfen " + i + ".nci değeri giriniz: ");
			arrayInt[i] = scanner.nextInt();
		}
		
		//3. aşama
		System.out.println("Array içindeki değerler: ");
		for (int i=0; i<arrayInt.length; i++) {
			System.out.println(arrayInt[i]);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
