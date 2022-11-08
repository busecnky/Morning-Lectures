package com.busecnky.kasim8.NesneArrayParametre;

public class Main {

	public static void main(String[] args) {


		Otomobil otomobil1 = new Otomobil();
		otomobil1.marka = "Togg";
		otomobil1.model = "V1";
		otomobil1.yil = 2022;
		otomobil1.aracinKm = 0;
		
		
		Motor motor1 = new Motor();
		motor1.motorHacmi = 1500;
		motor1.saseNo = "WER345645";
		motor1.yakitTuketimi = 10;
		
		otomobil1.aracinMotoru = motor1;
		
		
		
		
		
		
	}

}
