package com.busecnky.kasim2;

import com.alikaya.YardimciSinif;
import com.busecnky.kasim3.Scope001;

public class SinifStaticDegiskenler004 {

	
	//Bunlara sınıfların üye değişkenleri denir:
	//hatta static üye değişkenleri 
	public static final int dunyaninYaricapi = 6371; //km
	private static int CAP = 2222;					
	protected static int yariCap = 1111;      //bunu methodlar001de görebilirim. Çünkü aynı packagedalar.
	
	public static int x=5;          //alikaya x'i kullanabiliyor ve değiştirebiliyo. Değiştirmesini istemiyorsak final yazmalıyız!
	
	public static int aktifKullaniciSayisi = 123546;
	
	public static final double PI = 3.14; //böyle büyük harf yazarak final ı diğerlerinden ayırabilirsin.
	//public static final int DUNYANINYARICAPI = 6371; //km     gibi
	
	
	//Local değişkenler
	//Scope001 deki z 'de local değişkenlerdir.
	
	
	
	
	public static void main(String[] args) {
		
		//Java'da Global değişken yoktur.
		//Ancak her sınıfın üye değişkenleri vardır.
		//Biz bunları public ve static yaparsak herkes bunları global gibi kullanabilir.
		//bunlar sınıftaki üye değişkenleri için geçerli sınıf dışı için değil.
		//x i sınıfımda global gibi kullabilirim.
		//MÜLAKATLARDA SORULABİLİR
		int x = 4;
		
		SinifStaticDegiskenler004.x++;
		SinifStaticDegiskenler004.x = 3; //böyle yazmak daha iyi oluyo
		
		
		x=7;      //hangi x i yazdırcak denemesi
		System.out.println("****" + SinifStaticDegiskenler004.x); //burda 31.satırdaki x'i alıyor
		System.out.println("----" + x);							//burda ama 28de tanımladığımız xi ve 34te değiştirdiğimiz x'i alıyor.
		
		
		System.out.println(dunyaninYaricapi);
		System.out.println(SinifStaticDegiskenler004.dunyaninYaricapi); // Conventional-Teamül: sınıf adı nokta üye değişken adı

		
		//System.out.println(com.alikaya.YardimciSinif.mesafe());  //bunu import edersek ali kaya kısmını yazmamıza gerek kalmaz
		System.out.println(YardimciSinif.mesafe());
		System.out.println(SinifStaticDegiskenler004.CAP);
		
		
		
		
		aktifKullaniciSayisi++; //yardimciSiniftan da ali arttırabilir ben de burdan arttırabilirim.
		
		
	}
	
}
