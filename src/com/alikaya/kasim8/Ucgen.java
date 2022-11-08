package com.alikaya.kasim8;

public class Ucgen {
	
	
	public int kenar1;
	public int kenar2;
	public int kenar3;
	
	
	public int ucgenCevrresi() {
		return (kenar1+kenar2+kenar3);
	}
	
	//Ali'nin kendi paketleri içinden erişilebilen bir üye metot.
	//Üçgenin tüm kenarlarını uzatmaMiktari kadar uzatıyor:
	protected void kenarlariUzat(int uzatmaMiktari) {
		kenar1 += uzatmaMiktari;
		kenar2 += uzatmaMiktari;
		kenar3 += uzatmaMiktari;
		
		
		int x;  //bu x in yaşam döngüsü burdan çıkınca x in ömrü biter. Local değişken.
		x=20;
		
		//Yukarıda public int x; yaparsak ve local olmayan değişken üretiriz.
		//Sınıfa üye değişkeni olşutururuz yani
	}
	
	
	
	
	
	
	
	
	
	
}
