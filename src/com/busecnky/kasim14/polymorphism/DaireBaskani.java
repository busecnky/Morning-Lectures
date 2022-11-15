package com.busecnky.kasim14.polymorphism;

public class DaireBaskani extends Personel{


	private String makamAdi;
	private long telSeriNo;
	private Mudur[] bagliMudurler;
	
	
	public DaireBaskani(String ad, String soyad, String tcKimlik , int yas, int maas, int kidemBilgisi, long cepTelNo, String makamAdi, long telSeriNo) {
		super(ad, soyad, tcKimlik, yas, maas, kidemBilgisi, cepTelNo);
		this.setMakamAdi(makamAdi);
		this.setTelSeriNo(telSeriNo);
		
	}
	
	public int getZamKatSayisi() {
		return 8;
	}
	
	
	
	public String getMakamAdi() {
		return makamAdi;
	}
	public void setMakamAdi(String makamAdi) {
		this.makamAdi = makamAdi;
	}
	public long getTelSeriNo() {
		return telSeriNo;
	}
	public void setTelSeriNo(long telSeriNo) {
		this.telSeriNo = telSeriNo;
	}
	public Mudur[] getBagliMudurler() {
		return bagliMudurler;
	}
	public void setBagliMudurler(Mudur[] bagliMudurler) {
		this.bagliMudurler = bagliMudurler;
	}
	
	
	
	
}
