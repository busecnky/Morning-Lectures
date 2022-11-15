package com.busecnky.kasim14.polymorphism;

//Ata sınıf veya üst sınıf Parent class
public class Personel {

	private String ad;
	private String soyad;	
	private String tcKimlikNo;
	private int yas;
	private int maas;
	private int kidemBilgisi;
	private long cepTelNo;
	private int zamKatSayisi;
	

	public Personel(String ad, String soyad, String tcKimlikNo, int yas, int maas, int kidemBilgisi, long cepTelNo) {
		this.ad = ad;
		this.soyad = soyad;
		this.tcKimlikNo = tcKimlikNo;
		this.yas = yas;
		this.maas = maas;
		this.kidemBilgisi = kidemBilgisi;
		this.cepTelNo = cepTelNo;
	}
	
	
	public int getZamKatSayisi() {
		return 1;
	}
	
	
	public long getCepTelNo() {
		return cepTelNo;
	}
	public void setCepTelNo(long cepTelNo) {
		this.cepTelNo = cepTelNo;
	}
	public String getAd() {
		return ad;
	}
	public void setAd(String ad) {
		this.ad = ad;
	}
	public String getSoyad() {
		return soyad;
	}
	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}
	public int getYas() {
		return yas;
	}
	public void setYas(int yas) {
		this.yas = yas;
	}
	public int getMaas() {
		return maas;
	}
	public void setMaas(int maas) {
		this.maas = maas;
	}
	public String getTcKimlikNo() {
		return tcKimlikNo;
	}
	public void setTcKimlikNo(String tcKimlikNo) {
		this.tcKimlikNo = tcKimlikNo;
	}
	public int getKidemBilgisi() {
		return kidemBilgisi;
	}
	public void setKidemBilgisi(int kidemBilgisi) {
		this.kidemBilgisi = kidemBilgisi;
	}


	
	
}
