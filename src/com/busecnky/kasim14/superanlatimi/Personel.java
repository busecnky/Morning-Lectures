package com.busecnky.kasim14.superanlatimi;

//Ata sınıf veya üst sınıf Parent class
public class Personel {

	private String ad;
	private String soyad;
	private int yas;
	private int maas;
	private String tcKimlikNo;
	private int kidemBilgisi;
	private long cepTelNo;
	
	
	public Personel() {
		System.out.println("Personel sınıfının 1.constructor'ı çağırıldı");
	}
	
	public Personel(String str) {
		System.out.println("Personel sınıfının 2.constructor'ı çağırıldı");
	}
	
	public Personel(String s , int y) {
		System.out.println("Personel sınıfının 3.constructor'ı çağırıldı");
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
