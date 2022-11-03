package com.busecnky.kasim3;

public class VarArgs004 {

	//Dizi yerine VarArgs metodu kullanabiliriz
	
	//https://www.baeldung.com/java-varargs
	
	public static void toplaVarArgs(int... sayilar) { //dizi ismi gibi ama tam da dizi ismi değil
		int toplam = 0;
		//sayilar dizi gibi davranır:
		for (int i = 0; i < sayilar.length; i++) {
			toplam += sayilar[i];
		}
		System.out.println(toplam);
	}
	
	

	
	public static void main(String[] args) {
		toplaVarArgs(1, 2, 3, 4);


		
		
	}

}
