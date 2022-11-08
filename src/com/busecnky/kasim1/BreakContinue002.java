package com.busecnky.kasim1;

public class BreakContinue002 {

	public static void main(String[] args) {
//1
		
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}

		// break kullanımı:
		//
		// Döngünün akışını durdurur ve } sonrasındaki koda gider.

		for (int i = 0; i < 10; i++) {
			if (i == 5) {
				break;
			}
			System.out.println(i);
			
			
		//Continue kullanımı:
		//
		//Döngünün bir sonraki indexle devam etmesini sağlar.
			

			for (int k = 0; k < 10; k++) {
				if (k == 5) {
					continue;           //Continue with the next index.
				}
				System.out.println(k);
			}
			
			
		}

		
		//Örnek while loop ve break kullanımı:
		//
		int sayac = 0;
		while (sayac < 10) {
			if (sayac == 5) {
				break;  //breaks the loop
			}
			System.out.println(sayac);
			sayac++;
		}
		
		
		//Soru:
		//
		//Bir dizi içindeki sayılardan herhangi biri 17'nin katı olduğu durum varsa ekrana yazdırın
		
		
		int arananSayi = 1;
		int [] dizi = {12, 40, 70, 34, 50, 11, 100};
		boolean arananSayiVarmi = false;  //isFound = false;
		for (int i = 0; i < dizi.length; i++) {
			if (dizi[i] %17 == 0) {
				arananSayiVarmi = true;
				arananSayi = dizi[i];
			}
		}
		if(arananSayiVarmi == true) {   // if(arananSayiVarmi) bu şekilde de yazarsak aynı şey
			System.out.println("17'nin katı bulundu " + arananSayi );
		}
		else {
			System.out.println("17'nin katı bulunamadı " );
		}
		
		
		
		//Bir örnek
		//
		int z = 1;
		boolean flag = z>5;
		if (flag) {
			System.out.println("5'ten büyük.");
		}
		int y =9;
		flag = z>5 && y<100;
			//tru&&true --> true
		if (flag) {
			System.out.println("Doğru");
		}else {
			System.out.println("Yanlış");
		}
		
		
	}

}
