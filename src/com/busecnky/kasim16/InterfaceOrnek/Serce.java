package com.busecnky.kasim16.InterfaceOrnek;

public class Serce extends Hayvan implements IUcabilir {

	
	
	public Serce(String ad, int kilosu, int uzunlugu) {
		super(ad, kilosu, uzunlugu);
	}

	

	@Override
	public void kanatCirp() {
		System.out.println(this.getAd() + " serçesi kanat çırpıyor(saniyede 10 kez)");

	}

	@Override
	public void kanatlariTemizke() {
		System.out.println(this.getAd() + " serçesi kanatlarını temizliyor)");

	}

	@Override
	public void gagala(String nesne) {
		System.out.println(this.getAd() + " serçesi " + nesne + " gagalıyor)");	
	}

	
	
	@Override
	public void sesCikar() {
		// TODO Auto-generated method stub

	}

	@Override
	public void yemekYe() {
		// TODO Auto-generated method stub

	}

}
