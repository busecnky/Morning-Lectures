package com.busecnky.ekim31;

public class VeriTipleriStringDevam001 {

	public static void main(String[] args) {


		//10-equalsIgnoreCase metodu
		//
		String ad1 = "Ali Kaya";
		String ad2 = "ali kaya";
		
		System.out.println(ad1.equals(ad2));
		System.out.println(ad1.equalsIgnoreCase(ad2));
		
		//11-startsWith
		//
		ad1 = "Ali Kaya";
		System.out.println(ad1.startsWith("A")); //True
		System.out.println(ad1.startsWith("Al")); //True
		System.out.println(ad1.startsWith("li")); //False

		
		//12-endsWith
		//
		ad1 = "Ali Kaya";
		System.out.println(ad1.endsWith("a")); //True
		System.out.println(ad1.endsWith("Kaya")); //True
		System.out.println(ad1.endsWith("a ")); //False

		
		
		//13-split metodu
		//
		//verilen ifadeye göre metni böler
		String liste = "Ali,Burcu,Ayşe,Zeynep,Kaan";
		String[] isimler = liste.split(",");
		System.out.println(isimler[0]);
		System.out.println(isimler[1]);

		
		//Örnek:
			//Öğrencilerin listesi String olarak tutuluyor ben bunları ayrıştırmak istiyorum:
			
			//Boşluk bırakma boşluğu da ayrı bir değer olarak düşünür.
			
			String ogrencilerStr = "Ali Kaya,123;Veli Öz,222;Zeynep Naz,343";
			String[] ogrenciler = ogrencilerStr.split(";");    //array = dizi
			System.out.println(ogrenciler[0]); //Ali Kaya,123
			System.out.println(ogrenciler[1]); //Veli Öz,222
			System.out.println(ogrenciler[2]); //Zeynep Naz,343
		
			//Peki ilk öğrencinin okul numarasını ekrana yazdırın:
			//
			//System.out.println(ogrenciler[0].split(",")[1]); bu hata veriyor!!
			
			//ogrenciler[0] => "Ali Kaya,123"
			String[] ogrenci = ogrenciler[0].split(","); //İki string oluşturdum. "Ali Kaya" ve "123"
			System.out.println(ogrenci[0]); //Ali Kaya
			System.out.println(ogrenci[1]); // 123

			//Veli'nin okul numarasını yazdıralım:
			String[] ogrenci1 = ogrenciler[1].split(","); //	"Veli Öz" ve "222"
			System.out.println(ogrenci1[1]);
			// int ogrNo = Integer.parseInt(ogrenci1[1]);   // Bu stringi sayıya çevirme sonra göreceğiz.
			
			
			//Veli'nin sadece ismini yazdıralım (soy ismini yazmayalım)
			String[] ogrenciAdSoyad = ogrenci1[0].split(" "); // =>"Veli" ve "Öz"
			System.out.println(ogrenciAdSoyad[0]);
			
			
			//14- stringbuilder kullanımı
			//
			/*
			String ad = "Osman";
			String isim;
			isim = ad1 + "/donanimurunleri" + "/RAM" + "/DDR4";  //Böyle yapmaya kalktığımız zaman hata olmaz javanın çalışması açısından
																//Ama 15k-20k kullanıcı gelmeye başladığı zaman program performansı düşer.
			
			//Birini veri tabanından birini excelden birini başka yerden çekmeye çalıştığın çoklu işlemlerde çok sayıda stringi 
			//birbirine ekleyeceğimiz zaman strignBuilder (sınav sorusu olur genelde)
			//performans düşer yavaşlar yoksa o yüzden kullanıyoruz böyle zamanlarda
			*/
			
			StringBuilder stringBuilder = new StringBuilder();
			stringBuilder.append("Merhaba");
			stringBuilder.append(" Dünya");
			stringBuilder.append(" Java");
			System.out.println(stringBuilder);
			
			
			
			
			
			
			
			
	}
	

}
