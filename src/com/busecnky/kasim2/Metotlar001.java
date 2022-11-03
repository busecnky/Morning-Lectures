package com.busecnky.kasim2;

import com.alikaya.YardimciSinif;
import com.alikaya.YardimciSinif2;

public class Metotlar001 {
	
	public static final void hello() {		//Mainin dışında kullanabileceğimiz ve mainin içinde kalabalık etmesini 
		System.out.println("Hello");		//engelleyeceğimiz bir yöntem.
		
	}
	
	//public => Access modifier (Erişim belirleyici) //public: bütün package'lerin kullanımına açık
													//protected: sadece aynı psckage içi kullanıma açık
													//private: sadece bulunduğu sınıf içi kullanıma açık
	
	
	//static => (zorunlu değil) static metodlarının hepsi program çalışır çalışmaz adreslenir ve değişmez
							//Static olmasa idi memory adresi nesne oluşunca olacaktı.
	
	
	
	// final => (zorunlu değil) metodun başına gelirse override edilemez anlamına gelir(OOP'da göreceğiz)
							//Sınıfın başına gelirs o sınıftan sınıf türetilemez demektir.
	
	
	// void olduğu zaman return yok, içi boş zaten void boşluk demek. Mesela main.hello();
	//aşağıda bu voidli bi metotun içinde. Bunu ben şu şekilde yazsam:
	//int sonuc = main.hello();
	//bu hiç bir şey döndüremez boşluk çünkü return yok dönecek bir şey yok.
	
	
	
	
	
	
	
	
	
	
	
	final static double PI = 3.14;   //değiştirilemez son anlamına gelir.
	
	//Return type: (zorunludur) Hiç bir şey return etmeyecekseniz void yazmalısınız.
	
	//hello: metot ismi yazmak zorundasınız.
	
	//			() parantezler içine isterseniz parametre yazabilirsiniz (opsiyonel). Bu örnekte parametre yok.
	// {} metodumuz bı süslü parantezlerin içine yazılmalıdır.
	
	
	
	
	
	
	public static void main(String[] args) {   //Debug yaparsan ve step into(F5) yaparsan görürsün ki;
		
		//hello();							 //bu satır yukarıdaki metodu çağırır/kullanır.
											//burdaki hellonun üzerine tıkla + F3'e bas. Nerede olduğuna götütür. (Satır 5)
		
		
		
		
		
		
		
		
		//Farklı paketteki static metodları kullanım 1. yol:
		com.alikaya.YardimciSinif.helloYardimci();
		
		//2.yol
		YardimciSinif.helloYardimci();    //hello yazana kadar kısmı yazdıktan sonra aşağıda seçenekler çıkıyo hop kendi import ediyo.
		
		//
		//YardimciSinif.merhaba();  buna is not visible diye hata verir çünkü private
		
		//YardimciSinif2.ekranaJavaYaz(); //Görememe nedenim metodun protected olmasıdır.
		
		
		
		System.out.println(PI);
		
	}

}
