package com.busecnky.kasim9.encapsulation;

public class MainEncapsulation {

	public static void main(String[] args) {

		Motor motor = new Motor();
		motor.setMotorHacmi(-500);
		motor.motorBilgileriniYazdir();
		
		
		System.out.println("Motor hacmi: " + motor.getMotorHacmi());
		int motorhacminin2kati = 2 * motor.getMotorHacmi();
		System.out.println(motorhacminin2kati);
		
		System.out.println("**********************");
		
		//-----
		Otomobil otomobil1 = new Otomobil();
		otomobil1.setAracinKm(0);
		otomobil1.setMarka("Opel");
		otomobil1.setModel("Insignia");
		otomobil1.setYil(2022);

		
		Motor motor1 = new Motor();
		motor1.setMotorHacmi(1500);
		motor1.setSaseNo("12345678");
		motor1.setYakitTuketimi(7);
		
		
		
		otomobil1.setAracinMotoru(motor1);  //Bu 8 kasım.NesneArrayPArametre de yaptığımız otomobil1.aracinMotoru = motor1; satırı ile aynı 
		
		//syso yapıp tek tek çağırmamıza gerek yok çünkü motor classında motorBilgileriniYazdir var onu çağırmamız yeterli olur.
		otomobil1.getAracinMotoru().motorBilgileriniYazdir();

	
		//
		Otomobil otomobil2 = new Otomobil();
		otomobil2.setAracinKm(0);
		otomobil2.setMarka("Opel");
		otomobil2.setModel("Astra");
		otomobil2.setYil(2020);
		
		otomobil2.setAracinMotoru(new Motor());  //new ile isim vermeden oluşturduk. set ile bunları bağlıyoruz. new Motor() yazsaydık sadece 
												//o kaybolur giderdi. Biz sete bağlayarak onu kullanmak üzere tutuyoruz.
		
		//Motor motorTemp = otomobil2.getAracinMotoru();
		//motorTemp.setMotorHacmi(1400);
		otomobil2.getAracinMotoru().setMotorHacmi(1400);   //bu satır üstündeki iki satırın tek satırda yazılmış hali
		
		//motorTempe bağladığını unutursan ve motorTemp i kullanmazsan o silinir gider. O yüzden diğer bağladığımız tek satırlık yöntemi tercih ediyoruz.
		Motor motorTemp = otomobil2.getAracinMotoru();
		motorTemp.setSaseNo("22222222");    //bi bu şekilde yapalım dedik
		
		
		otomobil2.getAracinMotoru().setYakitTuketimi(8); //bir de tek satır halinde
		
		
	}

}
