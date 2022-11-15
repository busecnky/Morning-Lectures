package com.busecnky.kasim10;

public class Otomobil {

	
	private String marka;
	private String model;	
	private int yil;	
	private int aracinKm;
	private Motor aracinMotoru;
	private int depodakiYakit;
	private final int depoHacmi;  //Static yapamayız çünkü static olsaydı tüm arabaların depo hacmi aynı olurdu ama değil
									//o yüzden aşağıda girdiklerimiz içinde hepsini düzeltmemiz gerekiyo.
	
	
	protected Otomobil(int depoHacmi) {
		this.depoHacmi = depoHacmi;
	}
	
	
	
	//Parametre: Bir metodun parantez içindeki aldığı değişkenlere denir.
	public  Otomobil(String marka, String model, int yil, int aracinKm, Motor aracinMotoru , int depoHacmi) {
		this.marka = marka;
		this.model = model;
		this.yil = yil;
		this.aracinKm = aracinKm;
		this.aracinMotoru = aracinMotoru;
		this.depodakiYakit = 0;
		this.depoHacmi = depoHacmi;
		
	}
	
	
	public  Otomobil(String marka, String model, int yil, int aracinKm, Motor aracinMotoru, int depoHacmi, int depodakiYakit ) {
		this.marka = marka;
		this.model = model;
		this.yil = yil;
		this.aracinKm = aracinKm;
		this.aracinMotoru = aracinMotoru;
		this.depodakiYakit = depodakiYakit;
		this.depoHacmi = depoHacmi;
	}
	
	

	public Otomobil(String marka, String model, int yil, int depoHacmi) {		
		this.marka = marka;
		this.model = model;
		this.yil = yil;
		this.depoHacmi = depoHacmi;
	}
	
	
	
	public String getAllOtomobilBilgileri() {
	String tumOtomobilBilgileri;
	 tumOtomobilBilgileri = "Marka: " + this.marka + " Model: " + this.model + " Yıl: " + this.yil + " Aracın km: " + this.aracinKm 
									+ this.getAracinMotoru().getAllMotorBilgileri() + " Depodaki yakıt: " + this.depodakiYakit;
	return tumOtomobilBilgileri;
	}
	

	
	public void araciSur(int km) {
		int tuketilenYakit = aracinMotoru.getYakitTuketimi()* km / 100;
		System.out.println("----->" + km + " km yol gittiniz ve " + tuketilenYakit + " lt. kadar yakıt tükettiniz.");
		
		if (tuketilenYakit <= depodakiYakit) {
			this.depodakiYakit = depodakiYakit - tuketilenYakit; // => this.depodakiYakit = this.depodakiYakit - tuketilenYakit;
			this.aracinKm = aracinKm + km;
		}
		else {
			System.err.println("Deponuzdaki yakıt ile " + km + " km mesafe gidemezsiniz.");
		}
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



	public int getDepodakiYakit() {
		return depodakiYakit;
	}
	
//Depo hacmiyle sınırlayalım doldurulabilecek yakıtı.
	public void setDepodakiYakit(int depodakiYakit) {
		if(depodakiYakit > this.depoHacmi) {
			this.depodakiYakit = this.depoHacmi;
		}
		else {
			this.depodakiYakit = depodakiYakit;
		}  
	}
	
	
	
	
	
	
	
	
	
}
