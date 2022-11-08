package com.busecnky.kasim4.OOPOrnek;

public class Dikdortgen {

	public int kisaKenar;
	public int UzunKenar;
	
	public int alanHesapla() {
		return (kisaKenar*UzunKenar);
	}
	
	
	
	public static void main(String[] args) {
		
		Dikdortgen dikdortgen1 = new Dikdortgen();
		dikdortgen1.kisaKenar = 10;
		dikdortgen1.UzunKenar = 20;
		System.out.println(dikdortgen1.alanHesapla());
		
		
		Dikdortgen dikdortgen2;
		dikdortgen2= new Dikdortgen();
		dikdortgen2.kisaKenar = 100;
		dikdortgen2.UzunKenar = 120;
		System.out.println(dikdortgen1.alanHesapla());
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
}
