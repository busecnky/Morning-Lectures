package com.busecnky.ekim24;

public class KosulluDurumlar {

	public static void main(String[] args) {
		int x = 20;
		
		if (x%10 == 0 && x%7 ==0)  {  //code block
			System.out.println("Sayı 10'a ve 7'ye kalansız bölünür.");
		}
		
		else if (x%10 == 0)  {  //code block
			System.out.println("Sayı 10'a kalansız bölünür.");
		}
		else if (x%7 == 0) {
			System.out.println("Sayı 7'ye kalansız bölünür.");
		}
		
		else {//süslü parantez olmaksızın bir satır hakkı var ondan sonrasını else içine almaz.
			System.out.println("Sayı 10'a ve 7'ye kalansız bölünemez.");
	    
		}
		
		
		System.out.println("Hoşçakalın");

	}

}
