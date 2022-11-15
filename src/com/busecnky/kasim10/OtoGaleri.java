package com.busecnky.kasim10;

public class OtoGaleri {
	
	private String galeriAdi;

	//Bir sürü otomobil oluşturmaktansa tek tek el ile liste halinde yapalım.
	//Otomobil dizisi otomobillerden oluşan array
	private Otomobil[] otomobilDizisi;
	private int galeridekiOtomobilSayisi;
	
	

	//OtoGaleri Constructor
	public OtoGaleri(String galeriAdi, int limit) {
		otomobilDizisi = new Otomobil[limit];   //[null, null, null, .....]
		this.galeridekiOtomobilSayisi = 0;
		setGaleriAdi(galeriAdi);      // =>this.galeriAdi = galeriAdi;
		//Array oluşuyo mu oluşuyo ama içi boş null null
		
	}
	
//	otomobilDizisi[galeridekiOtomobilSayisi] = otomobil;   
//	galeridekiOtomobilSayisi++;                    //birer arttıralım ki bir sonraki nesne listede sıradaki yere gelsin
//	
//											//[Corsanesnesi, Astranesnesi, null, .....]
	
	
	
	public int findCount(String marka) {
		int counter = 0;
		for (int i = 0; i < galeridekiOtomobilSayisi; i++) {
			if(this.otomobilDizisi[i].getMarka().equalsIgnoreCase(marka)) {
				counter++;
			}
		}
		return counter;
	}
	
	
	
	
	public Otomobil[] search(String marka) {
		//count = aranan marka otomobil sayısı kadardır..
		int count = this.findCount(marka);
		
		Otomobil[] aramaSonuclari = new Otomobil[count];
		
		int sayac = 0;
		for (int i = 0; i < galeridekiOtomobilSayisi; i++) {
			
			if(this.otomobilDizisi[i].getMarka().equalsIgnoreCase(marka)) {
				aramaSonuclari[sayac] = this.otomobilDizisi[i];
				sayac++;
			}
		}
		return aramaSonuclari;
	}
	

	//sayaç yerine galeridekiOtomobilSayisi yazdık!!
	

	public void galeriyeOtomobilEkle (Otomobil otomobil) {
		
		if(galeridekiOtomobilSayisi < otomobilDizisi.length) {
			otomobilDizisi[galeridekiOtomobilSayisi] = otomobil;   
			galeridekiOtomobilSayisi++;
		}else {
			System.err.println("Galeri kapasitesi full, araç eklenemedi!");
		}
	}
		

	public void galeridekiOtomobilleriListele() {
		System.out.println("\n\n" + this.galeriAdi + " galerisindeki otomobiller listesi: (kapasite: " + otomobilDizisi.length + ")" + 
							"\n(Galerideki anlık otomobil sayısı: " + this.galeridekiOtomobilSayisi + ")");
		
		for (int i = 0; i <galeridekiOtomobilSayisi ; i++) {
			System.out.println(otomobilDizisi[i].getMarka() + " " + otomobilDizisi[i].getModel()); //--> null.getMarka()=> Hata verir.
		}
			

	}
	
	
//sadece get istiyoruz çünkü set i biz ayarlıyoruz onun değişmesini istemiyoruz
	public int getGaleridekiOtomobilSayisi() {
		return galeridekiOtomobilSayisi;
	}

	public Otomobil[] getOtomobilDizisi() {
		return otomobilDizisi;
	}

	public String getGaleriAdi() {
		return galeriAdi;
	}

	public void setGaleriAdi(String galeriAdi) {
		this.galeriAdi = galeriAdi;
	}
	
	
	
	
}
