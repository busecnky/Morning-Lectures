package com.busecnky.kasim14.polymorphism;

public class GenelMudur {

	private String ad;
	private String soyad;
	private String tcKimlik;
	private int yas;
	private int maas;
	private int kidemBilgisi;
	private long cepTelNo;
	private int zamKatSayisi;
	
	
	
	
	public GenelMudur (String ad, String soyad, String tcKimlik, int yas, int maas, int kidemBilgisi, long cepTelNo) 
	{
		this.setAd(ad);
		this.setSoyad(soyad);
		this.setTcKimlik(tcKimlik);
		this.setYas(yas);
		this.setMaas(maas);
		this.setKidemBilgisi(kidemBilgisi);
		this.setCepTelNo(cepTelNo);
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
	public String getTcKimlik() {
		return tcKimlik;
	}
	public void setTcKimlik(String tcKimlik) {
		this.tcKimlik = tcKimlik;
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
	public int getKidemBilgisi() {
		return kidemBilgisi;
	}
	public void setKidemBilgisi(int kidemBilgisi) {
		this.kidemBilgisi = kidemBilgisi;
	}
	public long getCepTelNo() {
		return cepTelNo;
	}
	public void setCepTelNo(long cepTelNo) {
		this.cepTelNo = cepTelNo;
	}
	public int getZamKatSayisi() {
		return zamKatSayisi;
	}
	public void setZamKatSayisi(int zamKatSayisi) {
		this.zamKatSayisi = zamKatSayisi;
	}
	
	
	
}
