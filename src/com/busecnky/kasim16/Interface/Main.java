package com.busecnky.kasim16.Interface;

public class Main {

	//Interface ler gereksiz detayları gereksiz kişilerden soyutlamaya (abstraction) yarar. 
	
	
	public static void nemGoster(INemOlcer nemOlcer) {
		System.out.println(nemOlcer.nemOlc());
	}
	
	public static void tarihSaatGoster(ITarihSaatGoster tarihSaatGosterenCihaz) {
		System.out.println(tarihSaatGosterenCihaz.tarihGoster() + "    " + tarihSaatGosterenCihaz.saatGoster());
	}
	
	public static ITermometre termometreOlustur() {
//		ITermometre termometre = new Arzum();
		ITermometre termometre = new Sinbo();
		return termometre;
	}
	
	
public static void main(String[] args) {
		
	Arzum arzum = new Arzum();
//	System.out.println(arzumSicaklikOlcer.sicakligiOlc());

	
//	ITermometre termometre = new Arzum();
//	termometre = new Sinbo();
	
	Sinbo sinbo = new Sinbo();
	
	
	Main.nemGoster(arzum);	
	Main.nemGoster(sinbo);	
	
	//----
	System.out.println("*****");
	Main.tarihSaatGoster(arzum);
//	Main.tarihSaatGoster(sinbo);  => ben burda sinboyu kullanamam çünkü sinbo ITarihSaatGoster interface'ini implement etmiyor!
	
	Casio casio = new Casio();
	Main.tarihSaatGoster(casio);
	

	//----
	System.out.println("*****");
	ITermometre term = Main.termometreOlustur();
	System.out.println(term.sicakligiOlc());  //Bunun içine yorumladığımı arzumu yazınca 24 veriyor sinbo 27 veriyor
											//Yani biz hangisini vermek istiyorsak biz belirliyoruz. 

	
	
	
	
	
	
	
	
	
	
	}
	
	
	
	
	
	
}
