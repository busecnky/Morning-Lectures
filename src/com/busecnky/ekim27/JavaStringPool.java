package com.busecnky.ekim27;

import java.util.Scanner;

public class JavaStringPool {

	public static void main(String[] args) {
		
		//Java String Pool
		
		//Örnek
		//DB'de ub şekilde tutuluyor:
		
		String uname = "gsungur@test.com";
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen kullanıcı adınızı giriniz. ");
		String userName = scanner.nextLine();
		
		//Emailler hep küçük harf olur o yüzden lowercase kullan. Sonrada boşlukları trim et
		userName = userName.toLowerCase().trim();
		
		/*YANLIŞ : !!! == kullanmayın
		if (uname == userName)
			System.out.println("Kullanıcı adı eşleştir");
		else
			System.out.println("Kullanıcı adı eşleşmedi !!!");
		*/
		
		
	//Bu tarz durumlarda ekrana print edilip bakılır
		System.out.println("DB kullanıcı adı: " + uname);
		System.out.println("Klavyeden girilen kullanıcı adı: " + userName);
		
		if (uname.equals(userName))
			System.out.println("Kullanıcı adı eşleşti");
		else
			System.out.println("Kullanıcı adı eşleşmedi");
			
		
		
		//Aynı girmemize rağmen farklı memory lokasyonları kullanıyor boşluk var ise.
		//trim yaparak boşlukları kesiyosun iyi hoş ama öncesinde boşluklu haliyle yeni bir memoryde yer açıyor.
		//sen trimleyince görünümü aynı olsa bile aslında farklı veriler olmuş oluyor.
		
	
		/*
		//Dikkat: Java String Pool görselinin burdan örneği
		String x = "Ali";
		String y = "Veli";
		if (x==y)
			System.out.println("Eşit");
		else
			System.out.println("Eşit değil");
		
		String w = "Ali ".trim();
		System.out.println(w);
		if (x==w)
			System.out.println("Eşit");
		else
			System.out.println("Eşit değil");
			*/
		
		
		
		
		
		
		
		
		
	}

}
