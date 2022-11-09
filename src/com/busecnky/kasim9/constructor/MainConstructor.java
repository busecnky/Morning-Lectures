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
		
	}

}
