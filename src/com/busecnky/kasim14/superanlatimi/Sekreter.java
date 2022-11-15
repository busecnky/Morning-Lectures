package com.busecnky.kasim14.superanlatimi;

////extend etmek miras almak anlamına gelir.

public class Sekreter extends Personel{ //buraya implement SagikliBirey,Insan yazabiliriz.

	private long tel1SeriNo;
	private long tel2SeriNo;
	
	
	public Sekreter() {
		//super();    --> yazmasakta java bunu otomatik olarak oluşturur
	}
	
	public Sekreter(long tel1SeriNo) {
		System.out.println("Herhangi bir metin.");
		this.tel1SeriNo = tel1SeriNo;
	}
	
	
	
	
	public long getTel1SeriNo() {
		return tel1SeriNo;
	}
	public void setTel1SeriNo(long tel1SeriNo) {
		this.tel1SeriNo = tel1SeriNo;
	}
	public long getTel2SeriNo() {
		return tel2SeriNo;
	}
	public void setTel2SeriNo(long tel2SeriNo) {
		this.tel2SeriNo = tel2SeriNo;
	}
	
	
	
	
	
	
	
	
}
