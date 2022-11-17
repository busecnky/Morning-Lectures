package com.busecnky.kasim16.InterfaceOrnek;

import java.util.ArrayList;

public class Main {
	
	public static void kisaSureliUc (IUcabilir kus) {
		System.out.println("\n-----------\n");
		kus.kanatCirp();
	}
	
	public static void belirtilenSureKadarUc (IUcabilir kus, int saniye) {
		System.out.println("\n*******\n");
		for (int i = 0; i < saniye; i++) {
			kus.kanatCirp();
			 
			try {
				Thread.sleep(1000); //Bekletmek için metot. milisaniye cinsinden olduğu için 1000 millis = 1 saniye
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	
	public static void sevinmeHareketiYap(IKuyruklu kuyruklu,int adet) {
        for(int i=0;i<adet;i++) {
            kuyruklu.kuyrukSalla();
        }
	}

	
	public static void main(String[] args) {
		
		
		
	IUcabilir beyazPacaliGuvercin = new Guvercin("Beyaz Paçalı", 2, 12);
	
	beyazPacaliGuvercin.gagala("yem");
	
	
	IUcabilir minikSerce = new Serce("Minik Serçe", 1, 8);
	minikSerce.gagala("yem");
	
	
	//Polymorphism ile interface
	Main.kisaSureliUc(beyazPacaliGuvercin);
	Main.kisaSureliUc(minikSerce);
	
	Main.belirtilenSureKadarUc(beyazPacaliGuvercin, 2);
	Main.belirtilenSureKadarUc(minikSerce, 3);

	
	//Canlı sııfındaki meetotu kullanma
	Kedi kedi = new Kedi("abc", 3, 18);
	kedi.nefesAl();
	
	//IKuyruklu interface ile işlemler
	IKuyruklu tekir = new Kedi("Tekir", 3, 30);
	//tekir.kuyrukSalla();  --> bu bir yöntem ama for loop uyla yukarıda yapıp alt satırda onu vermekte ayrı bi yöntem hatta daha güzel
	Main.sevinmeHareketiYap(tekir, 2);
	
	
	
	//Farklı bir sınıftan polymorphism kullanımı
 	System.out.println("\n-------------------\n");
	
	HayvanBakicisi hayvanBakicisi = new HayvanBakicisi();
	hayvanBakicisi.hayvanlariOynat(tekir);
	
	IKuyruklu karabas = new Kopek("Karabaş", 7, 70);
	hayvanBakicisi.hayvanlariOynat(karabas);
	
	ArrayList<IKuyruklu> hayvanListesi= new ArrayList<IKuyruklu>();
	hayvanListesi.add(tekir);
	hayvanListesi.add(karabas);
	hayvanBakicisi.hayvaniOynat(hayvanListesi);
	
	
	
	
	}
	
}
