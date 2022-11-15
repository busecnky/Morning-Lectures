package com.busecnky.kasim14.polymorphism;

public class MainOrnek2 {

	public static void main(String[] args) {
		
		//Polymorphism:
				
		Personel p;
		
		p = new Mudur("Ali", "Veli", "123", 0, 10000, 0, 0, "Yazılım Müdürü", 112233L);
		System.out.println(p.getZamKatSayisi());
		
		p = new Muhendis("Ahmet", "Kaya", "11" , 0, 10000, 0, 0, "Makine Mühendisi");
		System.out.println(p.getZamKatSayisi());
		
		

		
		
		
		
	}
	
}
