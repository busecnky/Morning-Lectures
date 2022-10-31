package com.busecnky.ekim24;

//Sınıf isimleri tanımlanırken: PascalCasing
public class VeriTipleriTamSayi {

	public static void main(String[] args) {
		//tek satır comment için
		/*bir sürü satır yazabiliriz
		 bu sayede çok fazla satırda comment için bu kullanılıyor
		 */
			//ln: line demek. println ile alt satıra geçer,yazmazsak aynı satırda kalır.
			System.out.println("Hello World1");
			System.out.print("Hello World2");
			System.out.print("Hello World3");
			
			// Satır kopyalama
			// ctrl + alt + aşağı ok tuşu
			 
			System.out.println("Satır" + "kopyalicam");
			
			//Değişken tanımlama
			byte byteValue; //Değişken tanımlamalarında en çok camelCasing kullanılır.
			/* CamelCasing ilk harfi küçük diğer kelimelerin ilk harfi büyük.
			 * Örn: liseÖğrencileriListesi
			 * Tek kelime örn: öğrenciler
			 * Kendinden büyük harfli şeylerde büyük yazılı örn: maxURLSayisi
			 * 
			 * 
			 * 
			 * byte : 1 Byte : 8 bits
			 * -128 ile 127 arasında değer alır.
			 * -2^7 ile 2^7-1 arasında değer alır.
			 * 11110000 en soldaki byte i sign a atamışlar. 
			 * O yüzden 128 değil.  0111 1111:127 ok
			 * 1000 0000 : -128 demek.
			 * Ama bu 1000 0001 : -127
			 * 1111 1111 : -1
			 * */
			
			byte maxURLSayisi = 100;
			byte öğrenciSayisi;
			//Yanlış değişken tanımlamalar
			//byte öğrenci Sayisi;
			//byte *ogrenciSayisi;
			//byte 1ogrenci sayisi; yanlış sonrasına rakam gelebilir 
			//			byte ogrenciSayisi1 => doğru
			//byte öğrenciSayısı; doğru ama ingilizce karakter kullanmaya özen göster.
			
			byteValue = 127;
			// 129 yazamıyoruz, aralık içinde değer yazabilriz hata verir yoksa.
			
			//short veri tipi: 2 Byte
			//-32768 ile 32767 arasında
			//-2^15 ile 2^15-1
			short shortValue = 22;
			short ogrenciNotu1 = 75, ogrenciNotu2 = 100, ogrencinotu3 = 80; 
			short ogrenciNotu4, ogrenciNotu5, ogrencinotu6;
			ogrenciNotu4 = 58;
			
			//Bunlar ilkel veri tipleri.
			//Büyük ilkel veritipi = kucuk ilkel veritipi => ok
			//kucuk ilkel veritipi != Büyük ilkel veritipi => bu olmaz! (Cast etmek gerekir.)
			
			shortValue = byteValue; //Ok
			System.out.println(shortValue);
			
			/*byteValue = shortValue;
			System.out.println(shortValue);
			bu hata verir o yüzden casting yapmak lazım.
			*/
			
			byteValue = (byte) shortValue; //bu işleme casting veya cast etmek denir.
			System.out.println("byteValue:" + byteValue );
			
			//Soru:
			//shortValue 127'den büyük olsaydı ne olurdu?
			shortValue = 200; 
			byteValue = (byte) shortValue; //böyle aldık hatada vermedi ama aralıkta değil.
			byteValue = (byte) shortValue;
			System.out.println("byteValue:" + byteValue ); //-56 verdi hata vermedi ama yanlış
			//dikkat etmek gerekiyor!! hata vermez ama sen hata yaparsın farkında olmazsın.
			
			//SINAVLARDA SORULABİLİR!
			
			//INT
			//int : 4 Byte : 32 bits
			//  -2^31 ile 2^31-1 arasında
			System.out.println("Int değer aralığı:" + Integer.MIN_VALUE + " ile " + Integer.MAX_VALUE);
			int intValue = 8;
			intValue = shortValue;
			shortValue = (short) intValue;
			
			//Byte Toplama
			byte b2;
			byteValue = 10;
			//b2 = byteValue + byteValue; //iki tane ilkel veri toplamını int olarak düşünür.
			//Javadan kaynaklı bu durum. Sağ taraf int sol taraf byte old için hata alıyoruz.
			
			b2 = (byte) (byteValue + byteValue);
			System.out.println(b2);
			
			
			
			short sh1 = 3;
			short sh2 = 5; 
			short sh3;
			sh3 = (short) (sh1 + sh2);  //hata vermesin, int algılamasın diye casting yapcaz.			
			System.out.println(sh3);
			
			
			
			//int toplama
			int x1 = 33;
			int x2 = 44;
			int x3 = x1 + x2;
			System.out.println(x3);
			
			
			//long veritipi: 8 byte
			//-2^63 ile 2^63-1 arasında değer alabilir.
			System.out.println("Long değer aralığı:" + Long.MIN_VALUE + " ile " + Long.MAX_VALUE);

			long longValue = 7;
			System.out.println(longValue);
			longValue = 9223372036854775807L; //sonuna eğer L veya l eklemezsek hata verir.
			//system genel olarak int yazdığımızı varsayıyor o yüzden L yazmalıyız.
			System.out.println(longValue);
			
			//Dikkat:
			//long myTimer = 372036854775807 * 2; //bundan hata alırsın. Sonuna L koymalısın.
			long myTimer = 372036854775807L * 2;
			
			//Dikkat2:
			int carpan = 100000;
			long carpim = carpan * carpan;
			System.out.println("carpim:" + carpim + "     hatalı!"); //hata göstermese de hatalı!
			
			//Sağ int, ama int*int çarpınca sol long hatası veriyor.
			//Bunu çözmek için çarpılan sayının ilkine long tipi ekliyoruz.
			
			carpim = 1L * carpan * carpan;
			System.out.println("carpim:" + carpim + "     doğru!");
			
			
			
	}
	

}
