package com.busecnky.kasim16.ornek2;

import java.util.ArrayList;

public class Okul {

	private String okulAdi;
	private String okulAdresi;
	private ArrayList<Sinif> siniflarArrayList;
	
	
	
	
	
	public Okul(String okulAdi, String okulAdresi) {
		super();
		this.okulAdi = okulAdi;
		this.okulAdresi = okulAdresi;
		this.siniflarArrayList = new ArrayList<Sinif>();
	}
	
	
	
	//bu uzun yol
	public void okuldakiOgrencileriYazdir() {
		System.out.println("\n--------   " + this.okulAdi + "Okulundaki Öğrenciler  --------");
		for (int i = 0; i < this.siniflarArrayList.size() ; i++) {
			for (int j = 0; j < this.siniflarArrayList.get(i).getOgrencilerArrayList().size(); j++) {
				System.out.println("Adı: " + this.siniflarArrayList.get(i).getOgrencilerArrayList().get(j).getAd() + 
									"  Soyadı: " + this.siniflarArrayList.get(i).getOgrencilerArrayList().get(j).getSoyad() + 
									"  Okul No: " + this.siniflarArrayList.get(i).getOgrencilerArrayList().get(j).getOkulNo());
				
			}
		}
	}
	
	//kesinlikle daha güzel olan yol
	public void okuldakiOgrencileriYazdir2() {
		System.out.println("\n--------   " + this.okulAdi + "Okulundaki Öğrenciler  --------");
		for (int i = 0; i < this.siniflarArrayList.size() ; i++) {
				siniflarArrayList.get(i).siniftakiOgrencilerinListesiniYazdir();
				
			}
	}
	
	//toString li yol
	public void okuldakiOgrencileriYazdir3() {
		System.out.println("\n--------   " + this.okulAdi + "Okulundaki Öğrenciler  --------");
		for (int i = 0; i < this.siniflarArrayList.size() ; i++) {
			for (int j = 0; j < this.siniflarArrayList.get(i).getOgrencilerArrayList().size(); j++) {
				System.out.println(this.siniflarArrayList.get(i).getOgrencilerArrayList().get(j).toString());
			}
		}
	}
	
	
	
	
	public void siniflariYazdir() {
		System.out.println("\n-   " + this.okulAdi + "Okulundaki Sınıflar  ****");
		for (Sinif sinif : siniflarArrayList) {
			System.out.println("Sınıf adı: " + sinif.getSinifAdi() + "   Sınıf Lokasyonu" + sinif.getLokasyon());
		}
	}
	
	public void sinifEkle(Sinif sinif) {
		this.siniflarArrayList.add(sinif);
	}
	
	
	
	
	
	public String getOkulAdi() {
		return okulAdi;
	}
	public void setOkulAdi(String okulAdi) {
		this.okulAdi = okulAdi;
	}
	public String getOkulAdresi() {
		return okulAdresi;
	}
	public void setOkulAdresi(String okulAdresi) {
		this.okulAdresi = okulAdresi;
	}
	public ArrayList<Sinif> getSiniflarArrayList() {
		return siniflarArrayList;
	}
	public void setSiniflarArrayList(ArrayList<Sinif> siniflarArrayList) {
		this.siniflarArrayList = siniflarArrayList;
	}
	
	
	
	
	
	
}
