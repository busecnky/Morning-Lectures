package com.busecnky.kasim2;

public class MethodOverloading003 {

	//Örnek metod
	//
	public static int topla(int sayi1, int sayi2) {
		int sonuc = sayi1 + sayi2;
		return sonuc;
	}
	
	//şöyle bir metot yazsam ne olur
	//aynı isimde ve aynı tip ve sayıda parametreleri olan 2 metot bulunamaz!! (aynı sınıfta!!)
	//java hangisine gideceğini bilemez. bilemediği için hata veriyor f3e basınca hangisine gitmek istiyosun diye soruyo
	
	public static int topla(int s1, int s2, int s3) {
		int snc = s1+s2+s3;
		return snc;
	}
	
	//aynı isimde farklı parametrelerle metot yazmaya metot overloading denir
	public static double topla(double sayi1, double sayi2) {
		double sonuc = sayi1+sayi2;
		return sonuc;
	}
	
	
	
	//Gerçek hayatta kullanım:
	//
	//Aşağıdaki kullanımlar hata vermez ama yanlıştır. (Acemiler yapar)
	public static void musteriKaydet() {}
	public static void Save() {}
	public static void satisKaydet() {}
	//...
	
	//Bunun yerine doğru kullanım
	//Profesyonel olanlar yapar:
	//
	/*
	public static void save(Musteri musteri) {}
	public static void save(Stok stok) {}
	public static void Save(Satis satis) {}
	*/
	//bu şekilde metot overloading yaparak kullanmalıyız.
	
	
	
	
	public static void main(String[] args) {
		
		System.out.println(topla(2,3));
		System.out.println(topla(2.34, 5.42));
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
