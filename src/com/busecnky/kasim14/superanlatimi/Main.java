package com.busecnky.kasim14.superanlatimi;

public class Main {
	
	//Inheritance: 
	//
	//Inheritance bir sınıfın üst sınıftan miraz almasına denir. Miras aldığı zaman
	//alt sınıf üst sınıfın özelliklerini tıpkı kendisiymişçesine kullanabilir.
	
	//Alt sınıf türetme hiyerarşik bir yapıda olur.
	//Bir alt sınıfın türetildiği sınıf, o alt sınıfın üst-sınıfıdır.
	//Java'da bir alt sınıfın ancak bir tane üst sınıfı olabilir.(Diğer dillerde bu farklılık gösterebilir.)
	//(başka alt sınıflar için Interface ama buna sonra geleceğiz)
	//Üst sınıfa ata(parent) alt sınıda çocuk(child) denir.
	

	public static void main(String[] args) {
		
		/*
		Muhendis muhendis1 = new Muhendis();
		
		muhendis1.setAd("Ali");
		muhendis1.setSoyad("Kaya");
		muhendis1.setTcKimlikNo("12345678911");
		muhendis1.setUzmanlikAlani("Elektrik-Elektronik Müh.");
		
		IdariMemur idariMemur1 = new IdariMemur();
		idariMemur1.setAd("Ayşe");
		idariMemur1.setGorevi("D.başkanı sekreteri");
		idariMemur1.setCepTelNo(5057894562L);
		*/
		
		Muhendis m = new Muhendis(); //Mühendisin içindeki default constructor(görünmeyen) içindeki super çağrısı ile
									//üst sınıftaki constructor metodu çağırılır. Yani personelde yazdığımız çıktıyı alırız.
		
		//Aynı durum sekreter içinde geçerli onda boş bile değil hiiç constructor oluşturmamıştık
		//Yine de "Personel sınıfının constructor'ı çağırıldı" çıktısı verdi.

		Sekreter s = new Sekreter();  			//*****SINAVDA SORULABİLİR****
		
		//Sekreter klasöründe bir constructor oluşturursak eğer
		//Alt sınıflarda birden fazla super çağırılmaz.
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
}
