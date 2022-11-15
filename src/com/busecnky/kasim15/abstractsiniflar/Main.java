package com.busecnky.kasim15.abstractsiniflar;



public class Main {

	public static void hayvani3KezKonustur(Hayvan h){
		System.out.println("\n ---- Hayvan 3 kez konusuyor ----");
		h.sesCikar();
		h.sesCikar();
		h.sesCikar();
	}
	
	public static void hayvan2KezBesle(Hayvan h){
		h.yemekYe();
		h.yemekYe();
	
	}
	

	public static void main(String[] args) {
		
		//Bu şekilde 
		//                    Hayvan hayvan = new Hayvan("havyan adı", 4, 52);
		//oluşturduğumuzda hata veriyor.
		//Diyor ki abstract yani soyut bir sınıftan sen bir nesne oluşturamazsın.
		//Ama alt sınıflarından yani inheritance larından sen oluşturmaya devam edebilirsin.
		
	
		Kopek kopek = new Kopek("karabaş", 5, 52);
		System.out.println(kopek.getAd() + "    " + kopek.getKilosu() + "    " + kopek.getUzunlugu());
		kopek.sesCikar();
		
		//Ama polymorphism yapabilirsin
		
		Hayvan hayvan;
		hayvan = new Kedi("Tekir", 3, 33);
		
		hayvan = new Kus("Çıtır", 1, 12);
		
		Main.hayvani3KezKonustur(hayvan);
	
		Main.hayvani3KezKonustur(kopek);
	
		Main.hayvan2KezBesle(kopek);
		
		
		//Tanımlamadan sen kediyi çağıramazsın ama hayvab 
		Kedi kedi = new Kedi("Sylvester", 3, 34);
		Main.hayvan2KezBesle(kedi);

	}
}
