package com.busecnky.kasim14.polymorphism.ornek2;

public class Main {

	
	public void hayvani3KezKonustur(Hayvan h)
	{
		System.out.println("\n ---- Hayvan 3 kez konusuyor ----");
		h.sesCikar();
		h.sesCikar();
		h.sesCikar();
	}
	
	
	public static void main(String[] args) {
		
		Kedi tekir = new Kedi("Tekir", 3, 30);

		System.out.println(tekir.getAd());
		tekir.sesCikar();
		
		Kopek karabas = new Kopek("Karabas", 7, 70);
		karabas.sesCikar();
		
		Kus tweety = new Kus("Tweety", 1, 10);
		tweety.sesCikar();
		
		
		// Polymorphism
		//
		Hayvan hayvan;
		hayvan = new Kedi("Sylvester", 4, 52);
		
		System.out.print("\nSylvester ses çıkarıyor: ");
		hayvan.sesCikar();
		
		hayvan = new Kopek("Lassie", 5, 71);
		System.out.print("\nLassie ses çıkarıyor: ");
		hayvan.sesCikar();
		
		
		Main main = new Main();
		main.hayvani3KezKonustur(tekir);
		main.hayvani3KezKonustur(karabas);
		main.hayvani3KezKonustur(tweety);
		
	}

	
	

	
}
