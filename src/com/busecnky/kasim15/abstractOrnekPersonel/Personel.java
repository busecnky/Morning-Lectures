package com.busecnky.kasim15.abstractOrnekPersonel;

//Bunu abstract yapıyoruz
public abstract class Personel {
	//public final class Personel {
	//Eğer sınıfı final yaparsan final bir sınıftan miras alınamaz!!!

	private String ad;
	private String soyad;	
	private String tcKimlikNo;
	private int yas;
	private int maas;
	private int kidemBilgisi;
	private long cepTelNo;
	private int zamKatSayisi;
	

	
	//Önemli NOT:
	//Abstract metotlar mutlaka ve mutlaka abstract sınıfların içinde tanımlanır.
	//Abstract olmayan bir sınıfta abstract metot yazmaya çalışırsan hata verir.
	public abstract int getZamKatSayisi() ;
	
	
	//Eğer ben bunu final yaparsam override edemem!!
	//Override etmek istiyorsam eğer final ı kaldırırım ya da final olsun istiyorsam override yapmayacaksın.
	public String personelKimlikBilgileriniGetir() {
		String personelKimlikBilgileri = "Ad: " + this.ad + "Soyad: " + this.soyad + "TC Kimlik No: " + this.tcKimlikNo;
		return personelKimlikBilgileri;
	}
	
	

	public Personel(String ad, String soyad, String tcKimlikNo, int yas, int maas, int kidemBilgisi, long cepTelNo) {
		this.ad = ad;
		this.soyad = soyad;
		this.tcKimlikNo = tcKimlikNo;
		this.yas = yas;
		this.maas = maas;
		this.kidemBilgisi = kidemBilgisi;
		this.cepTelNo = cepTelNo;
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
