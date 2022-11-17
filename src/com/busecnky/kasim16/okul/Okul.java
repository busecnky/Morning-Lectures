package com.busecnky.kasim16.okul;

import java.util.ArrayList;

public class Okul {

	private String okulAdi;
	private String okulAdresi;
	private ArrayList<Sinif> siniflarArrayList;
	
	
	
	public Okul(String okulAdi, String okulAdresi, ArrayList<Sinif> siniflarArrayList) {
		super();
		this.okulAdi = okulAdi;
		this.okulAdresi = okulAdresi;
		this.siniflarArrayList = siniflarArrayList;
	}
	
	
	
	public Okul(String okulAdi, String okulAdresi) {
		super();
		this.okulAdi = okulAdi;
		this.okulAdresi = okulAdresi;
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
