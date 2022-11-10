package com.busecnky.kasim9.constructor;

public class MainConstructor {

	public static void main(String[] args) {

		
		//Bu new Motor'u  F3lersen otomatik oluşturttuğumuz Constructor 1 e gider
		Motor motor = new Motor(); //new Motor() hata verdiği için üzerine tıklayıp create constructor dedik kızması durdu.
		motor.setMotorHacmi(1400);
		//motor.setSaseNo("22334455"); //Diğer tarafta şase nosunu yorumladığım için hata veriyor çünkü yeni setlememe izin vermiyor
		motor.setYakitTuketimi(7);
		
		//Bu new Motor'u  F3lersen elimizle oluşturduğumuz Constructor 2 ye gider
		Motor motor2 = new Motor(1000);
		//motor.setSaseNo("22334457"); //Diğer tarafta şase nosunu yorumladığım için hata veriyor çünkü yeni setlememe izin vermiyor
		motor2.setYakitTuketimi(7);
		
		//Bu new Motor'u  F3lersen elimizle oluşturduğumuz Constructor 3 e gider
		Motor motor3 = new Motor(1100, "QQQQQQQQ", 7);
		
		motor.motorBilgileriniYazdir();
		motor2.motorBilgileriniYazdir();
		motor3.motorBilgileriniYazdir();
		
		
		//------
		Motor m = new Motor();
		System.out.println(m.getSaseNo());
		
		
		//------
		Otomobil oto = new Otomobil();
		oto.setYil(2021);
		//System.out.println("Yılı: " + oto.getYil() + "Motor şase: " + oto.getAracinMotoru().getSaseNo()); //run diyince hata alırız.
																										//Çünkü motor nesnesi bağlanmadı.
		
		System.out.println("Yılı: " + oto.getYil() + " Aracın KM: " + oto.getAracinKm() + " Markası: " + oto.getMarka());
		
		System.out.println("********");
		
		//PoC: Proof of Concept Çalışması
		//oto.aracinMotoru = motor3;
		oto.setAracinMotoru(motor3);
		
		//Ornek: full constructor:
		//
		Otomobil oto2 = new Otomobil("Mercedes", "CIK", 2022, 10000, motor3);
		System.out.println("Markası: " + oto2.getMarka() + " Yılı: " + oto2.getYil() + "\n" + oto2.getAracinMotoru().getAllMotorBilgileri());
		
		Otomobil oto3 = new Otomobil("Audi", "Q3", 2021, 45000, new Motor(1400, "ABCD1234" ,8 ));
	
															//Motor bilgilerini bu şekilde değiştirebiliriz
		
	}

}
