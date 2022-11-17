package com.busecnky.kasim16.InterfaceOrnek;


//Abstract Sınıflar: soyut sınıflardır.
//
//Abstract bir sınıftan new ile bir nesne oluşturamazsınız.

public abstract class Hayvan extends Canli {

	
	public String ad;
	public int kilosu;
	public int uzunlugu;
	
	//Abstract metotlar implementation içermez. Sadece metot tanımı yeterlidir.
	//
	//Abstract yapılan metotlar mutlaka alt sınıflarda implement edilmelidir / override edilmelidir(yani kodlanmalıdır).
	public abstract void sesCikar();
	
	public abstract void yemekYe();
	
	
	
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
