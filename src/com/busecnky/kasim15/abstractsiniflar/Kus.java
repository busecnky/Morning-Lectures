package com.busecnky.kasim15.abstractsiniflar;

public class Kus extends Hayvan {

	public Kus(String ad, int kilosu, int uzunlugu) {
		super(ad, kilosu, uzunlugu);
	}
	
	@Override
	public void sesCikar(){
		System.out.println("Cik cik cik...");
	}

	@Override
	public void yemekYe() {
		System.out.println("Kuş " + this.getAd() + " yem yiyor.");	
	}

}
