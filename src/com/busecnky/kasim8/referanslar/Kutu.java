package com.busecnky.kasim8.referanslar;

public class Kutu {

	public int hacim;
	
	
	//Parametreli metot içinde ilkel veri tipi ile çağırıldığı zaman ilkel(primitive) tipin kopyası oluşturulur.
	//onun üzerinde çalışır
	public void degistir (int sayi) {
		sayi = sayi*sayi;
	}
	
	//Parametreli metot içinde nesne ile çağırıldığı zaman nesnenin kopyası OLUŞTURULMAZ !
	//nesnenin kendisi üzerinde değişiklikler yapılır.
	public static void degistir (Kutu kutu) {
		kutu.hacim = kutu.hacim * kutu.hacim;
	}
	
	
	
	
	public static void main(String[] args) {


		Kutu kutu1 = new Kutu();
		kutu1.hacim = 10;
		
		Kutu kutu2 = null; //null yazmazsan eğer rastgele memory den bir yeri gösterir
							//C++ ta bu bilgisayarın işletim sisteminden herhangi bir yeri pointer ile gösterebilir.
							//Java da bu olmaz ama saçma sapan yerleri gösterdiğinden kodumuz işlemez. Eclipse hata verir ve düzeltirsin.
		
		if (kutu1 == kutu2){
			System.out.println("kutu1 ve kutu2 aynı nesneyi gösteriyor..");
		}else {
			System.out.println("kutu1 ve kutu2 aynı nesneyi göstermiyor!..");
		}
			System.out.println(kutu1);
			System.out.println(kutu2);
			System.out.println("\n---------------------------------\n");
			
			kutu2 = kutu1;
			
			System.out.println(kutu1);
			System.out.println(kutu2); //Adresleri aynı oldu.
			System.out.println("\n---------------------------------\n");
			
			kutu2 = new Kutu(); //Dikkat: hacimleri aynı olsa bile artık farklı nesnelerdir.
			kutu2.hacim = 10;
			
			System.out.println(kutu1);
			System.out.println(kutu2);
			System.out.println("\n---------------------------------\n");
			
			Kutu kutu3;
			kutu3 = kutu2;
			if (kutu2==kutu3) {
				System.out.println("kutu2 ve kutu3 aynı nesneyi gösteriyor..");
			}else {
				System.out.println("kutu2 ve kutu3 aynı nesneyi göstermiyor!..");
				}
				System.out.println(kutu2);
				System.out.println(kutu3);
				System.out.println("\n---------------------------------\n");	
			
			
			//Sınav sorusu
			kutu3.hacim = 500;
			System.out.println(kutu2.hacim);
			
			//Hatırlatma ***||******
			int x = 30;
			int y;
			y = x;
			y++; // y=31
			System.out.println(x);
			
		
			System.out.println("\n---------------------------------\n");	
			
			Kutu k = new Kutu();
			int s = 5;
			k.degistir(s);
			System.out.println(s);
			
			k.hacim = 100 ;
			Kutu.degistir(k);
			System.out.println(k.hacim);
			
			
	}
}
