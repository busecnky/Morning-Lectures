package com.busecnky.kasim17.hashmap;

public class OgrenciOsymSonuc {

	private String ad;
	private String soyad;
	private int sayisalPuan;
	private int sozelPuan;
	private int eaPuan;
	
	
	
	
	
	public OgrenciOsymSonuc(String ad, String soyad, int sayisalPuan, int sozelPuan, int eaPuan) {
		this.ad = ad;
		this.soyad = soyad;
		this.sayisalPuan = sayisalPuan;
		this.sozelPuan = sozelPuan;
		this.eaPuan = eaPuan;
	}
	
	
	
	
	
	
	
	@Override
	public String toString() {
		System.out.println("***** OgrenciOSymSonuc");
		return "OgrenciOsymSonuc [ad=" + ad + ", soyad=" + soyad + ", sayisalPuan=" + sayisalPuan + ", sozelPuan="
				+ sozelPuan + ", eaPuan=" + eaPuan + "]";
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
	public int getSayisalPuan() {
		return sayisalPuan;
	}
	public void setSayisalPuan(int sayisalPuan) {
		this.sayisalPuan = sayisalPuan;
	}
	public int getSozelPuan() {
		return sozelPuan;
	}
	public void setSozelPuan(int sozelPuan) {
		this.sozelPuan = sozelPuan;
	}
	public int getEaPuan() {
		return eaPuan;
	}
	public void setEaPuan(int eaPuan) {
		this.eaPuan = eaPuan;
	}

	
	
	
	
	
}
