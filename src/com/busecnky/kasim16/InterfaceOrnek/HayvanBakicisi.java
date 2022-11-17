package com.busecnky.kasim16.InterfaceOrnek;

import java.util.ArrayList;

public class HayvanBakicisi {

	
	public void hayvanlariOynat(IKuyruklu kuyrukluHayvan) {
		System.out.println("Hayvan bakıcısı hayvanları oynatıyor...");
		kuyrukluHayvan.kuyrukSalla();
		kuyrukluHayvan.kuyrukSalla();
	}
	
	
	public void hayvaniOynat(ArrayList<IKuyruklu> kuyrukluHayvanList) {
		System.out.println("\n---Hayvan Bakıcısı hayvanları oynatıyor----");
		for(IKuyruklu kuyrukluHayvan : kuyrukluHayvanList ) {
			kuyrukluHayvan.kuyrukSalla();
		}
	}
	
	
	
}
