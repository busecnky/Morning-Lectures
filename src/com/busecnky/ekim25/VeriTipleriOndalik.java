package com.busecnky.ekim25;


public class VeriTipleriOndalik {

	public static void main(String[] args) {
		
		// float veri tipi: 4 Byte
		//Precision(noktadan sonraki hassasiyet): 7 decimal(ondalık) digits
		//Bilimsel uygulamalarda kesinlikle kullanılamaz.
		//Fizikçiler, kimyacılar hesaplamalarında float kullanmazlar. Az geliyo ondalık olarak.

		
		
		
		float floatValue = 1.7f;
		System.out.println("Float value: " + floatValue);
		System.out.println("Float min: " + Float.MIN_VALUE);
		System.out.println("Float max: " + Float.MAX_VALUE);
		
		//Float.MAX_VALUE: 3.4028235E38
		floatValue = 22;
		floatValue = 22.2F; //F yazmazsak hata verir.
		
		
		
		//double
		//8 byte
		//Precision(noktadan sonraki hassasiyet): 15 decimal(ondalık) digits
		double doubleValue = 1.2;
		doubleValue = 2323232323232323245.23232323235456489;
		System.out.println("Double Min: " + Double.MIN_VALUE);
		System.out.println("Double Max: " + Double.MAX_VALUE);
		
		
		doubleValue = 2345.55778;
		doubleValue = 12.334e8;
		System.out.println(doubleValue);
		
		//örnek
		doubleValue = 23.123456798;
		floatValue = (float) doubleValue; //bu şekilde atama yapınca sonuç 23.123457 çıkıyor kayıp var
		System.out.println(floatValue);
		
		floatValue = 1.1234567F;
		System.out.println(floatValue);
		
		
		String kusurat = String.format("%.3f", floatValue);
		System.out.println(kusurat);
		
		
		//Başkasının ya da benim değiştirmemi engellemek için.
		//Örn: pi sayısı bir sabit daha sonra değişmemesi için final kullanıyoruz.
		
		final double PI = 3.14;
		System.out.println(PI);
		
		
	}

}
