package com.busecnky.kasim10;

public class MainOrnek2 {

	public static void main(String[] args) {


		// ----------------- YAKIT TÜKETİMİ ÇALIŞMASI ---------------------
		
		Otomobil oto1 = new Otomobil("Nissan", "Juke", 2005, 200000, new Motor(1500, "12456781" , 10), 50, 50);
	
		//Aracı sürmeden önceki yakıt:
		System.out.println("Aracı sürmeden önceki yakıt: " + oto1.getDepodakiYakit());
		System.out.println(oto1.getAllOtomobilBilgileri());
		System.out.println("========================");
		
		oto1.araciSur(200);
		System.out.println(oto1.getAllOtomobilBilgileri());
		System.out.println("========================");
		
		oto1.araciSur(100);
		System.out.println(oto1.getAllOtomobilBilgileri());
		System.out.println("========================");
	
		oto1.araciSur(300);
		
		//Aracımı fullluyorum
		oto1.setDepodakiYakit(70);
		oto1.araciSur(300);
		
		System.out.println(oto1.getAllOtomobilBilgileri());
		System.out.println("========================");
		
		
		Otomobil oto2 = new Otomobil("Nissan", "Qashkai", 2015, 100000, new Motor(1500, "12456781" , 10), 40);
		oto2.setDepodakiYakit(50); //50 koy dedim ama 40 olduğu için hacim koyamadı.
		System.out.println(oto2.getAllOtomobilBilgileri());
		oto2.araciSur(200);
		System.out.println(oto2.getAllOtomobilBilgileri());
	
	}

}
