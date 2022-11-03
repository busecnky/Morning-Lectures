package com.busecnky.kasim3;

public class Scope001 {

	public static void main(String[] args) {

		//Scope: bir değişkenin yaşam alanıdır.
		//Aşağıdaki örnekte i ve z değişkenlerinin scope'u for döngüsü içindedir. For dışında bu değişkenler kullanılamaz.
		
		for(int i = 0; i<5; i++)
		{
			int z = 7;
			System.out.println(i);
			System.out.println(z);  //i ile z bu döngüden çıkınca ölüyor. i ile znin scope u bu döngüdür.
		}
		
		//i ve z'yi scope'un dışında kullanamazsınız.
		//System.out.println(z);
		//System.out.println(i);
		//Bunları bu şekilde yazınca hata veriyor. z ve i yi algılayamıyor.
		
		
		
		//Scope not2:
		//Local değişknler ancak ve ancak tanımlandıktan sonra kullanılabilir.:
		int z = 9;
		System.out.println(z); //üstteki satırda tanımladığım için burda kullabiliyorum.
		
		
		//System.out.println(y);   bu hata verir çünkü daha y tanımlanmadı. Altta tanımlayınca üstten bunu anlayamıyor.
		//int y = 10;				//SIRA ÖNEMLİ!
		
		
		if (z <10) {
			int g = 20*20;
			System.out.println(g); 				//dışına yazarsan syso yu hata veriyor.
		}
		
	
		System.out.println(Scope001.DUNYA_AY_ARASI_MESAFE);
		
	} // main body	burda bitiyor.
	
	//Mainin dışına sınıf değişkenleri yazarsak eğer onu sıralama olmadan kullabiliriz.
	
	public static final int DUNYA_AY_ARASI_MESAFE = 5465748;
	
	
}
