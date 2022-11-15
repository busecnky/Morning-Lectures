package com.busecnky.ekim26;

import java.util.Locale;

public class VeriTipleriString {

	public static void main(String[] args) {

		// {'B', 'u', 'g', 'ü', 'n', 'j', 'a', ....., 'z'}
		// String karmaşık veri tipidir. İlkel değil.
		// Srtingler charlar halinde tutulur.
		// Bilgisayarda dizilerin ilk elemanı her zaman sıfırdan(0) başlar.
		// index dizilimini: 0, 1, 2, 3, 4, .....

		String metin = "Bugün java ile string konusunu işleyeceğiz.";
		System.out.println(metin);
		String tekharf = "a"; // char[] dizi => ['a'] Java bunu 1 elemanlı bir karakter dizisi olarak
								// iç yapısında tutar.

		// String sık kullanılan metodları

		// 1-length metodu
		// degisken.length() => metnin uzunluğunu int cinsinden verir.

		int uzunluk = metin.length();
		System.out.println(uzunluk);

		// 2-charAt metodu

		
		System.out.println(metin);

		// javada 0'dan başlayarak saydığımızı unutmuyoruz.

		System.out.println("3. karakter: " + metin.charAt(2));
		System.out.println("7. karakter: " + metin.charAt(6));

		// Son karakteri elde etmek için;
		// System.out.println("Son karakrer: " + metin.charAt((metin.length()))); -1
		// yazmazsan hata verir.
		// 42 karakter = 42 der hatada, charAtte 0dan başladığı için saymaya sonuncuyu
		// 41 olarak görüyor.
		// Bu sebepten dolayı lengthten 1 çıkarıyoruz ki eşitlensin.

		System.out.println("Son karakrer: " + metin.charAt((metin.length() - 1)));

		// 3-indexOf metodu
		// finds the index

		// ilk s harfi nerede(hangi index'te) geçiyor onu bulur ve döndürür

		System.out.println("g harfi ilk nerede geçiyor?: " + metin.indexOf('g')); // indexof a tıklayıp F3'e basınca ''
																					// olduğu için char algılıyor.
		System.out.println("B harfi ilk nerede geçiyor?: " + metin.indexOf("B")); // indexof a tıklayıp F3'e basınca ""
																					// olduğu için String algılıyor.
		System.out.println("W harfi ilk nerede geçiyor?: " + metin.indexOf("W")); // bulamazsa -1 yazar

		// Birden fazla harf arama

		// Java kelimesi ilk nerede geçiyor?

		System.out.println("Java kelimesi ilk nerede geçiyor?: " + metin.indexOf("Java"));

		// i harfi ilk nerede geçiyor?
		System.out.println("i harfi ilk nerede geçiyor?: " + metin.indexOf("i"));

		// 14. karakterden sonra i karakteri:
		System.out.println("i harfi 14.karakterden sonra ilk nerede geçiyor?: " + metin.indexOf("i", 14));

		// soru:
		// i harfi cümlenin yarısından itibaren ilk geçtiği yerin indexi:
		System.out.println("i harfi cümlenin yarısından itibaren ilk nerede geçiyor?: " + metin.indexOf("i", metin.length() / 2));

		// 4-substring
		// get the substring of a string
		//
		// substring(başlangıç index, bitiş indexi) => başlangıç dahil - bitiş dahil
		// değil.

		System.out.println("Metnin ilk 5 karakteri: " + metin.substring(0, 5));
		System.out.println("Metnin ilk 4. karakterden 5 karaktere kadar olan karakter(ler): " + metin.substring(4, 5));

		// Soru:
		String test = "Test 1234";
		System.out.println(test.substring(2, 7)); // st 12 yazar
		System.out.println(test.substring(7, 8)); // 3 yazar
		System.out.println(test.substring(7, 9)); // 34 yazar
		// System.out.println(test.substring(7,10)); // hata verir

		// substring 2. kullanım şekli
		System.out.println(test.substring(5)); // 5.karakterden sonrakini yazar

		// 5-trim metodu
		// trim traşlamak gibi bir kelime
		// Bir ifadenin başındaki veya sonundaki boşlukları siler

		String cumle = " Hello Java   ";
		System.out.println(cumle);
		cumle = cumle.trim();
		System.out.println(cumle);

		// Kullanıcı adı ve şifre isteyen uygulamalarda trim kullanmazsanız sıkıntı
		// yaşarsınız.

		// 6-toUpperCase ve toLowerCase metotları
		//
		// Metin içindeki harflerin case'lerini değiştirir.

		System.out.println(metin.toLowerCase());
		System.out.println(metin.toUpperCase());

		// toUpperCase(locale.ENGLISH) //İngilizce'de i => I
		// toUpperCase(new locale("tr", "TR") //Türkçede i => İ

		String kullAdi = "admin";
		String kullAdi2 = "çşıöğ";
		System.out.println(kullAdi.toUpperCase(Locale.ENGLISH));
		System.out.println(kullAdi.toUpperCase(new Locale("tr", "TR")));
		

		// 7-valueOf
		//
		// converts different types of values to String type

		int sayi = 2233;
		String ss = String.valueOf(sayi);
		System.out.println(ss);

		boolean flag = true;
		String sss = String.valueOf(flag);
		System.out.println(sss);

		System.out.println("\n\n-----------------------------------\n\n");

		// 8-replace metodu
		//
		String s2 = "Şahin yırtıcı bir kuştur.";
		String s3 = s2.replace("ş", "s"); // Küçük büyük harfleri ayrı ayrı değiştirin.
		System.out.println(s3);

		// Nerelerde kullnılır:
		// 1. Örnek: Kira sözleşmesinde
		String sozlesme = "Ali Kaya Güneş sokak Çankaya mah. adresindeki evini Ayşe Naz'a kiraladı. ";
		String yenisozlesme = sozlesme.replace("Ayşe Naz", "Veli Han");
		System.out.println(yenisozlesme);

		// 2. kullanım: web url'lerde Türkçe karakterler sorun çıkarabilir.
		// Mesela https://www.isbasvuru.com/ali iş başvuru.pdf => Sıkıntı çıkar!
		// Webde sorun çıkmaması için boşluk karakterini -ile değiştirin..
		String dosyaAdi = "https://www.isbasvuru.com/ali iş başvuru.pdf";
		dosyaAdi = dosyaAdi.replace(" ", "-");
		dosyaAdi = dosyaAdi.replace("ş", "s");
		System.out.println(dosyaAdi);

		// 9-contains metodu:
		//
		String yeniMetin = "Hava bugün çok yağmurlu";
		System.out.println("ağ harfleri var mı? :  " + yeniMetin.contains("ağ"));
		System.out.println("ağ harfleri var mı? :  " + yeniMetin.contains("tağ"));

	}

}
