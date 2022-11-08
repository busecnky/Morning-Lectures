package com.alikaya.kasim8;

public class MainAli {

	public static void main(String[] args) {
		ParalelKenar paralelKenar = new ParalelKenar();
		paralelKenar.kisaKenar = 20;
		paralelKenar.uzunKenar = 30;
		
		//paralelKenar.isim == "jj"; => Hata verir, isim private olduğu için farklı sınıflardan erişilemez!
		
		
		Ucgen ucgen1 = new Ucgen();
		ucgen1.kenar1 = 3;
		ucgen1.kenar2 = 4;
		ucgen1.kenar3 = 5;
		System.out.println("Kenar1: " + ucgen1.kenar1 + " Kenar2: " + ucgen1.kenar2 + " enar3: " + ucgen1.kenar3);
		
		System.out.println("Üçgen kenarları uzuyooor...");
		
		ucgen1.kenarlariUzat(5);
		
		System.out.println("Kenar1: " + ucgen1.kenar1 + " Kenar2: " + ucgen1.kenar2 + " Kenar3: " + ucgen1.kenar3);
		
		Ucgen ucgen2 = new Ucgen();
		ucgen2.kenar1 = 3;
		ucgen2.kenar2 = 4;
		ucgen2.kenar3 = 5;
		System.out.println("Kenar1: " + ucgen2.kenar1 + " Kenar2: " + ucgen2.kenar2 + " Kenar3: " + ucgen2.kenar3);
		
		
		Daire daire = new Daire();
		daire.yaricap = 10;
		//daire.cap = 20; //Hata veriyor
		daire.xx = 30;  // Önünde bir şey yazmıyor ama protected oluyor o yüzden kullanabildik.
	}
}
