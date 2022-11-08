package com.busecnky.kasim8;

import com.alikaya.kasim8.ParalelKenar;
import com.alikaya.kasim8.Ucgen;

public class Main {

	public static void main(String[] args) {

		//Paralel kenar kullanımı
		ParalelKenar paralelKenar = new ParalelKenar();
		//paralelKenar.kenarKisa = 4; => Erişilemez, çünkü access modifier default (yani protected) olarak tanımlanmış!
		//paralelKenar.uzunKenar = 5; => Erişilemez, çünkü access modifier default (yani protected) olarak tanımlanmış!

		
		
		Ucgen ikizKenarUcgen = new Ucgen();
		ikizKenarUcgen.kenar1 = 10;
		ikizKenarUcgen.kenar2 = 10;
		ikizKenarUcgen.kenar3 = 20;
		
		System.out.println("Üçgen Çevresi: " + (ikizKenarUcgen.kenar1 + ikizKenarUcgen.kenar2 +ikizKenarUcgen.kenar3));
		
		//Bu yukarıdaki  ifade satır israfı.. Bunun yerine com.alikaya paketinde bir üye metot tanımlasın Ali. Pratik
		
		
		
		//Daire package olarak oluşturduğumuz public olmayan bir sınıf!
		//Daire daire; => Daire sınıfı başka bir pakette ve protected(package specific olduğu için burdan görülmez ve kullanılamaz.
		
		//Ama aynı package da olan com.alikaya da MainAli de hata vermiyor
		
		
	}

}
