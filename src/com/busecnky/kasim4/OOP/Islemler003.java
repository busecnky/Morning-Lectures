package com.busecnky.kasim4.OOP;

public class Islemler003 {

	public int sayi1;
	public int sayi2;
	
	
	
	public static int topla(int x, int y) {
		int z = x+y;
		return z;
	}
	
	public int topla() {   //Static olmayan üye metodu
		return(sayi1+sayi2);
	}
	
//	public int topla(int xx,int yy) {   //Static olmayan üye metodu yazsan da üstteki static ile aynı metot ismiyle yazamazsın
//		return(xx+yy);
//	}
	
	public int toplamaYap(int xx,int yy) {  
		return(xx+yy);
	}
	
	/**
	 * Bu method parantez içindeki sayıları toplar ve return eder.
	 * @param sayilar: int türünde araya virgül koyarak giriniz.
	 */
	
	
	public double topla(double... sayilar) { //VarArgs ile
		double toplam = 0;
		for (double sayi : sayilar) {	
			toplam += sayi;
		}
		return toplam;
	}
	
	
	public static void main(String[] args) {
		System.out.println(Islemler003.topla(3, 2));
		
		//Static olmayan üye metodunu kullanmak için nesne oluşturmamız lazım
		Islemler003 islemler = new Islemler003();
		islemler.sayi1 = 10;
		islemler.sayi2 = 20;
		System.out.println(islemler.topla());   //kendi içindeki static olmayan üye değişkenlerini topluyor.
		
		
		Islemler003 islemler2 = new Islemler003();
		islemler2.sayi1 = 30;
		islemler2.sayi2 = 45;
		System.out.println(islemler2.topla());  
		
		Islemler003 islemler3 = new Islemler003();
		System.out.println(islemler3.toplamaYap(5,7));
		
		System.out.println(islemler3.topla(2.1, 3.7, 4.0));
		
		
	}
}
