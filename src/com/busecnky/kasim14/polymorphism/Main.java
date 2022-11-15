package com.busecnky.kasim14.polymorphism;

public class Main {
	
	//POLYMORPHISM (ÇOK BİÇİMLİLİK)
	//
	//Nir nesne referansının(değişkeninin) farklı nesneler gibi davranabilmesidir.
	
	
	public static void yeniMaasiHesapla(Personel personel) {
		System.out.println(personel.getZamKatSayisi()*personel.getMaas());	
		}
	
	//---------
	/*
	public static void yeniMaasiHesapla(Muhendis muhendis) {
	System.out.println(muhendis.getZamKatSayisi()*muhendis.getMaas());	
	}

	public static void yeniMaasiHesapla(Mudur mudur) {
		System.out.println(mudur.getZamKatSayisi()*mudur.getMaas());	
		}
	
	public static void yeniMaasiHesapla(Sekreter sekreter) {
		System.out.println(sekreter.getZamKatSayisi()*sekreter.getMaas());	
		}
	
	public static void yeniMaasiHesapla(DaireBaskani daireBaskani) {
		System.out.println(daireBaskani.getZamKatSayisi()*daireBaskani.getMaas());	
		}
	
	public static void yeniMaasiHesapla(IdariMemur idariMemur) {
		System.out.println(idariMemur.getZamKatSayisi()*idariMemur.getMaas());	
		}
	
	*/ //*******
	
	public static void main(String[] args) {
		
		/*
		Muhendis m = new Muhendis("Ahmet", "Kaya", "11" , 0, 10000, 0, 0, "Makine Mühendisi");
		Main.yeniMaasiHesapla(m);
		
		Sekreter s = new Sekreter("Zeynep", "Kayaca", "11" , 0, 10000, 0, 0, 111L, 222L);
		Main.yeniMaasiHesapla(s);
		*/
		
		//
		//Polymorphism:
		//
		Mudur mudur = new Mudur("Ali", "Veli", "123", 0, 10000, 0, 0, "Yazılım Müdürü", 112233L);
		Main.yeniMaasiHesapla(mudur);
		
		Muhendis muh = new Muhendis("Ahmet", "Kaya", "11" , 0, 10000, 0, 0, "Makine Mühendisi");
		Main.yeniMaasiHesapla(muh);
		

		Sekreter s = new Sekreter("Zeynep", "Kayaca", "11" , 0, 10000, 0, 0, 111L, 222L);
		Main.yeniMaasiHesapla(s);
		
		//Polymorphism için üst sınıftan türemesi lazım kullanılacak olan nesne değişkeninin
		//Aksi takdirde çalışmaz.
		
		
		
		
	}
	
	
}
