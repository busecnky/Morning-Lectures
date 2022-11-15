package com.busecnky.kasim10;


public class Motor {

	
	private int motorHacmi;
	private String saseNo;
	private int yakitTuketimi;
	
	//Constructor 1
	public Motor(int motorHacmi, String saseNo, int yakitTuketimi) {
		this.motorHacmi = motorHacmi; 
		this.setSaseNo(saseNo);
		this.yakitTuketimi = yakitTuketimi;  // => this.setYakitTuketimi(yakitTuketimi);
	}
	
	
	//Constructor 2
	public Motor(int motorHacmi) {
		this.motorHacmi = motorHacmi; //bu satırı unutursak 0 yazar.
	}
	

	
	//Constructor 3
	public Motor() {
		// TODO Auto-generated constructor stub
	}





	public void motorBilgileriniYazdir() {
		System.out.println("motorHacmi: " + this.motorHacmi + "\nsaseNo: " + this.saseNo +"\nyakitTuketimi: " + this.yakitTuketimi);
	}

	
	
	public String getAllMotorBilgileri() {
		String s = " motorHacmi: " + this.motorHacmi + "\nsaseNo: " + this.saseNo +"\nyakitTuketimi: " + this.yakitTuketimi ;
		return s;
	}
	
	
	
	public void setMotorHacmi(int motorHacmi) {
		if(motorHacmi >= 800 && motorHacmi <= 10000) {
		this.motorHacmi = motorHacmi;
	}else {
		System.out.println("Motor hacmi 800-10000 dışında girdiğiniz için 800 olarak ayarlanmıştır!");
		this.motorHacmi = 800;  
		}
	}
	
	
	public int getMotorHacmi() {
		return this.motorHacmi;
	}

	public String getSaseNo() {
		return saseNo;
	}

	
	//Eğer biz yine 8 karakterden fazla kullanılırsa diye koşulunu bunu yorumlasak bile kullanmak istiyorsak ya bu koşulu yukarıda saseNoya yazardık
	
	//ya da yorumu kaldırıp bu alttaki set i private yapıp yukarıda constructor kısmında bunu this.setSaseNo(saseNo); şeklinde düzenleriz.
	//bu ikinci kısmı yazdık
	
	private void setSaseNo(String saseNo) {
		if(saseNo.length() != 8) {
			System.out.println("Şase no 8 karakter olmalı");
			this.saseNo = "00000000";
		}else
			this.saseNo = saseNo;
	}         
	
	 //Eğer şase numarasını değiştirmesini istemiyorsan set kısmını kaldırırsın. Zaten private olduğu için başka biri değiştiremez.
	//objeyi kullananlar bu apiyi kullanan kazara değiştirmeye kalksa bile değiştiremeyecek.
	//ama diğerleri durduğu için değiştirebilecek.
	//Öyle yukarıda final yapmakla olmaz. Fİnal yaparsak kodlarda sıkıntı çıkıyor. Çünkü başka yerlerde de kullanıyoruz.

	public int getYakitTuketimi() {
		return yakitTuketimi;
	}

	public void setYakitTuketimi(int yakitTuketimi) {
		
		this.yakitTuketimi = yakitTuketimi;
	}
	
	
	
	
	
	
}
