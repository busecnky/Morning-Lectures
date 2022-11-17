package com.busecnky.kasim16.InterfaceOrnek;

public class Kopek extends Hayvan implements IKuyruklu{

	public Kopek(String ad, int kilosu, int uzunlugu) {
		super(ad, kilosu, uzunlugu);		
	}
	
	@Override
	public void sesCikar() {
		System.out.println("Hav hav hav...");
	}

	@Override
	public void yemekYe() {
		System.out.println("Köpek " + this.getAd() + " yemek yiyor.");	
	}

	
	
	@Override
	public void kuyrukSalla() {
	System.out.println(this.getAd() + " köğeği kuyruğunu sallıyor");
		
	}
	
	
	
}
