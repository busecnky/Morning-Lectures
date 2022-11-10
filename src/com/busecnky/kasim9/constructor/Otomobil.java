package com.busecnky.kasim9.constructor;

public class Otomobil {

	
	private String marka;
	private String model;	
	private int yil;	
	private int aracinKm;
	private Motor aracinMotoru;
	
	
	protected Otomobil() {
		
	}
	
	
	
	//Parametre: Bir metodun parantez içindeki aldığı değişkenlere denir.
	public  Otomobil(String marka, String model, int yil, int aracinKm, Motor aracinMotoru) {
		this.marka = marka;
		this.model = model;
		this.yil = yil;
		this.aracinKm = aracinKm;
		this.aracinMotoru = aracinMotoru;
		
	}
	
	
	
	
	
	
	
	
	
	public String getMarka() {
		return marka;
	}
	public void setMarka(String marka) {
		this.marka = marka;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getYil() {
		return yil;
	}
	public void setYil(int yil) {
		this.yil = yil;
	}
	public int getAracinKm() {
		return aracinKm;
	}
	public void setAracinKm(int aracinKm) {
		this.aracinKm = aracinKm;
	}
	public Motor getAracinMotoru() {
		return aracinMotoru;
	}
	public void setAracinMotoru(Motor aracinMotoru) {
		this.aracinMotoru = aracinMotoru;
	}  
	
	
	
	
	
	
	
	
	
}
