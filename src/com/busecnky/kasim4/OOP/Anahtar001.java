package com.busecnky.kasim4.OOP;

public class Anahtar001 {

	
	//Özellik //üye değişken
	public static final int uzunluk = 10; //uzunluk hepsinde aynı
	
	//Ama burda static yok
	public String renk; 					//ama burda rengini değiştirebiliriz
	public String ad;
	public int no;					//Diğerlerini karmaşık veri tipi (string) ekledik ama böyle int primitive de ekleyebiliriz.
	
	
	
	//Metotta ekleyebiliriz
	//(üye) metot
	public void bilgileriEkranaYaz() {											//Bunda static yok neden?
		System.out.println("No: " + no + " Ad: " + ad + " Renk: " + renk);		//yazsaydım bu tasarıma ait olacaktı
																				//Ama bu anahtar classından türeyen nesnelerin 
																				//kullanabileceği bir metot
	}
	//static method
	public static void uzunluguEkranaYaz() {
		System.out.println(uzunluk);
	}
	
	
	
	//Notlar:
	//Burda yazıklarımız main kısmının tamamını kestik main002 ye yapıştırdık. Bu şekilde de oluyor diğer tarafta çalışıyor.
	//Burdan çekiyor.
	
	
	//String de bir class tipi. İlkel olmayan veri tipi.
	//İlkel veri tipi için nesne oluşturulmuyor.
	//int long falan
	
	
	
	
	
}
