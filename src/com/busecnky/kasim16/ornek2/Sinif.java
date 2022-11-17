package com.busecnky.kasim16.ornek2;

import java.util.ArrayList;

public class Sinif {

	private String sinifAdi;
	private String lokasyon;
	private ArrayList<Ogrenci> ogrencilerArrayList;
	//Aşağıda ögrenci arraylist set edilemesin diye  setOgrencilerArrayList i private yaptık
	
	
	public Sinif(String sinifAdi, String lokasyon) {
		super();
		this.sinifAdi = sinifAdi;
		this.lokasyon = lokasyon;
		this.ogrencilerArrayList = new ArrayList<Ogrenci>();
	}

	
	
	public void siniftakiOgrencilerinListesiniYazdir() {
		System.out.println("\n******   " + this.sinifAdi + "sınıfındaki Öğrenci Listesi  ****");
		for (Ogrenci ogrenci : this.ogrencilerArrayList) {
			System.out.println("Öğrenci Adı: " + ogrenci.getAd() + "  " +
								"Öğrenci Soyadı: " + ogrenci.getSoyad() + "  " +
								"Öğrenci No: " + ogrenci.getOkulNo() + "   " +
								"Öğrenci Not Ortalaması: " + ogrenci.getNotOrtalamasi());
		}
	}
	
	
	public void sinifaOgrenciEkle(Ogrenci ogrenci) {
		this.ogrencilerArrayList.add(ogrenci);
	}
	
	public void sinifaOgrenciEkle(String ad, String soyad, int okulNo, int notOrt) {
		if(ad.length()<2 || soyad.length()<2) {
			System.err.println("Ad veya soyad 2 karakterden küçük olamaz.Öğrenci sınıfa eklenmedi.");
		}
		else {
		this.ogrencilerArrayList.add(new Ogrenci(ad, soyad, okulNo, notOrt));
		}
	}



	public String getSinifAdi() {
		return sinifAdi;
	}




	public void setSinifAdi(String sinifAdi) {
		this.sinifAdi = sinifAdi;
	}




	public String getLokasyon() {
		return lokasyon;
	}




	public void setLokasyon(String lokasyon) {
		this.lokasyon = lokasyon;
	}




	public ArrayList<Ogrenci> getOgrencilerArrayList() {
		return ogrencilerArrayList;
	}




	private void setOgrencilerArrayList(ArrayList<Ogrenci> ogrencilerArrayList) {
		this.ogrencilerArrayList = ogrencilerArrayList;
	}
	
	
	
	
	
	
	
	
	
}
