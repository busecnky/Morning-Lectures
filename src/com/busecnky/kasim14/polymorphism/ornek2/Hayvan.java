package com.busecnky.kasim14.polymorphism.ornek2;

public class Hayvan {

	public String ad;
	public int kilosu;
	public int uzunlugu;
	
	public void sesCikar() 
	{
		System.out.println("Hayvan sesiii");
	}
	
	
	
	
	public Hayvan(String ad, int kilosu, int uzunlugu) {
		super();
		this.ad = ad;
		this.kilosu = kilosu;
		this.uzunlugu = uzunlugu;
	}


	public String getAd() {
		return ad;
	}
	public void setAd(String ad) {
		this.ad = ad;
	}
	public int getKilosu() {
		return kilosu;
	}
	public void setKilosu(int kilosu) {
		this.kilosu = kilosu;
	}
	public int getUzunlugu() {
		return uzunlugu;
	}
	public void setUzunlugu(int uzunlugu) {
		this.uzunlugu = uzunlugu;
	}
	
	
	
}
