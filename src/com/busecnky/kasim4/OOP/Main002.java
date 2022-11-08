package com.busecnky.kasim4.OOP;

public class Main002 {

	public static void main(String[] args) {
		Anahtar001 anahtar1 = new Anahtar001();   //artık yeni anahtarlar oluşturabiliriz.
		anahtar1.renk = "Kırmızı";
		anahtar1.ad = "Babamın anahtarı";  //Yukarıda ad için field oluşturmamız lazım!!
		anahtar1.no = 100;
		
		
		Anahtar001 anahtar2 = new Anahtar001(); 
		anahtar2.renk = "Mavi";
		anahtar2.ad = "Benim anahtarım";
		anahtar2.no = 200;
		
		
		Anahtar001 anahtar3 = new Anahtar001(); 
		anahtar3.renk = "Bordo";
		anahtar3.ad = "Kardeşimin anahtarı";
		anahtar3.no = 3;
		
	
//		System.out.println(anahtar1.ad + " " + anahtar1.renk + " " + anahtar1.no);
//		System.out.println(anahtar2.ad + " " + anahtar2.renk + " " + anahtar2.no);
//		System.out.println(anahtar3.ad + " " + anahtar3.renk + " " + anahtar3.no);
//		System.out.println(Anahtar001.uzunluk);

//		anahtar1.bilgileriEkranaYaz();
//		anahtar2.bilgileriEkranaYaz();
//		anahtar3.bilgileriEkranaYaz();
		
		Anahtar001[] anahtarDizisi = {anahtar1, anahtar2, anahtar3};
		for (int i = 0; i < anahtarDizisi.length; i++) {
			anahtarDizisi[i].bilgileriEkranaYaz();
		}
		System.out.println();
		
		Anahtar001.uzunluguEkranaYaz();
		//Anahtar001.bilgi... çıkmıyor burda bilgileri ekrana yazdır.
		//çünkü onlar static değil yaniii nesneye dayalı bir program!!!
		//Çıkmıyor o yüzden burda. 
	}


}
