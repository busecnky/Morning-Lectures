package com.busecnky.kasim16.InterfaceOrnek;

public class Kedi extends Hayvan implements IKuyruklu{

	
	public Kedi(String ad, int kilosu, int uzunlugu) {
		super(ad, kilosu, uzunlugu);	
	}
	
	@Override
	public void sesCikar() {
		System.out.println("Miyavvvv...");
	}

	@Override
	public void yemekYe() {
	System.out.println("Kedi " + this.getAd() + " süt içiyor.");	
	}

	
	@Override
	public void kuyrukSalla() {
	System.out.println(this.getAd() + " kedisi kuyruğunu sallıyor");
		
	}
	
	
}
