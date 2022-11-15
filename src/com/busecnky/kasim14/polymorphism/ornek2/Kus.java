package com.busecnky.kasim14.polymorphism.ornek2;

public class Kus extends Hayvan {

	public Kus(String ad, int kilosu, int uzunlugu) {
		super(ad, kilosu, uzunlugu);
	}
	
	public void sesCikar()
	{
		System.out.println("Cik cik cik...");
	}

}
