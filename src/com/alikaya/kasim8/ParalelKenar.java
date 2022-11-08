package com.alikaya.kasim8;

public class ParalelKenar {

	//member variables
	 int kisaKenar;
	 int uzunKenar;
	
	//Ali package ında main olsaydı public yazmayınca ordan ulaşabiliyoruz.
	//Ama başlarına public yazınca ben aynı projede örneğin com.busecnky larda görebiliyorum.
	//Public yazmazsak protected gibi oluyor:
	 
	 
	//protected: sadece aynı paketteli sınıflardan erişim olabilir, farklı paketlerden erişilemez.
	//private: sadece bulunduğu sınıf/program içinden erişilebilir.
	//default (boş bırakırsanız) : Hiç bir 
	
	//private metotlara aynı paket içindeki sınıflar dahi erişemez.
	 private String isim;
	
	 public static void main(String[] args) {
		 ParalelKenar p = new ParalelKenar();
		 //ParalelKenar p;
		 p.kisaKenar = 2;
		 p.uzunKenar = 3;
		 p.isim = "paralelkenar I";
	}
	
	
}
