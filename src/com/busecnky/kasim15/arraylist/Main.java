package com.busecnky.kasim15.arraylist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
	
	//Peki neden içlerine ArrayList ya da LinkedList yazmıyoruz da List yazıyoruz?
	//
	//Çünkü o zaman sadece arraylist ya da linkedlist yollamamız lazımdı
	//Ama şimdi hangi tür list olursa olsun biz yollayabiliyoruz.
	
	
	//ArrayList<Kisi> böyle uzun uzun yazmalıyız. 
	//public static void printArrayList(ArrayList<Kisi> list) {
	public static void printArrayList(List<Kisi> list) { //Polymorphism gibi buraya List te yazabiliriz.
		System.out.println("----");
		for(Kisi k : list) {
			System.out.println("Ad: " + k.getAd() + " Soyad: " + k.getSoyad());
		}
	}
	
	//Üstteki metot ile overloading olmasın diye int x ekledik.
	
	public static void printArrayList(List<String> list, int x) {
		System.out.println("----");
		for(String s : list) {
			System.out.println(s);
		}
	}
	
	
	//Interface'ler tasarım detaylarını kullanıcıdan soyutlar
	public static List<String> listeOlustur() {
//		List<String> lst = new ArrayList<>();
//		lst.add("Ali");
//		lst.add("Veli");
//		return lst;
		
		List<String> lst = new LinkedList<>();
		lst.add("Ali");
		lst.add("Veli");
		return lst;
		//Bunu arraylist ile de linkedlist ile de yazabiliyoruz ve sıkıntı olmuyor
		//Ama en başta List<String> yazmasaydım eğer sıkıntı olurdu. List interface den çekiyoruz.
	}
	
	
	public static void main(String[] args) {
		
		
		ArrayList<String> cars = new ArrayList<String>();
		
		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Ford");
		cars.add("Mercedes");
		
		//Çıktı alma yöntemleri
		System.out.println(cars);
		
		for (String car : cars) {
			System.out.println(car);
		}
		
		System.out.println("------------------");
		
		//Array list te length yoktur size vardır.
		//cars[i] diyemezsin çünkü array listlerde bir sınıftır. O yüzden cars.get(i) yapıyoruz.
		for (int i = 0; i < cars.size(); i++) {
			System.out.println(cars.get(i));
		}
		
		System.out.println("------------------");
		
		//Arraylist te illa primitive type kullanacaksan bunu wrapper sınıf olarak kullanırsın!
		
		ArrayList<Integer> arrList = new ArrayList<Integer>();
		arrList.add(5);
		arrList.add(8);
		System.out.println(arrList);
		
		System.out.println("------------------");
		
		//ArrayListler içinde kendi nesnelerimizin kullanımı:
		
		
		Kisi k1 = new Kisi("John", "Smith");
		Kisi k2 = new Kisi();
		k2.setAd("Mac");
		k2.setSoyad("Donovan");
		Kisi k3 = new Kisi("Robert", "Bruce");
		
		ArrayList<Kisi> list = new ArrayList<>();
		list.add(k1);
		list.add(k2);
		list.add(k3);
		
		for(Kisi k : list) {
			System.out.println("Ad: " + k.getAd() + " Soyad: " + k.getSoyad());
		}
		
		System.out.println("---------Remove 1.Yöntem---------");
		
		
		//Remove 1. yöntem
		list.remove(k2);
		Main.printArrayList(list);
		//System.out.println(list); // Yukarıda cars dedik stringleri yazdırdır arrList dedik integerları yazdırdı bu şekilde
		//ama bunu son oluşturduğumuz listeye yapınca nesneleri gösterdi olmadı o yüzden yine for çeşitleriyle yazdırmalıyız. 
		
		
		
		System.out.println("---------Remove 2. yöntem---------");

		//Remove2. yöntem
		list.remove(1);
		//liste değişti indexleri de değişti. Artık ona göre remove demen lazım. Eskiden 1 Mac Donovan dı. Şimdi Robert 1.index.
		
		
		Main.printArrayList(list);
		
		System.out.println("------------------");
		
	//Interface leri new leyemezsiniz
	//Interface leri implement eden sınıfları bulursunuz onlardan new lersiniz.
	//List --> Interface
		List<Kisi> list2 = new ArrayList<Kisi>();
		list2.add(new Kisi ("Ahmet", "Emre"));
		Main.printArrayList(list2);
		
		
		//ArrayList araya eleman ekleme:
		//
		List<String> l = Main.listeOlustur();
		Main.printArrayList(l, 0);
		l.add(1,"Ayşe");
		Main.printArrayList(l, 0);
		
		
		//LINKED LIST
		//ArrayList allow fast random read access, so you can grab any element in constant time.
        // But adding or removing from anywhere but the end requires shifting all the latter elements over,
        // either to make an opening or fill the gap.
		//
		//LinkedList'lerde araya eleman ekleme veya aradan eleman sikme, ArrayList'lere göre çok daha hızlı olur.
		//Ancak, LinkedList belirli bir index'teki elemana erişim hızında ArrayList'e göre çok yavaştır.
		//Örn: 5000 tane nesnen var 2894. sildiğin zaman tek tek hepsini tık tık tık öne doğru getirecek.
		
		System.out.println("------------------");
		System.out.println(l.get(1));
		
		
		System.out.println("------------------");
		//LinkedList yazarakta oluşturabiliriz ama yazmadan oluşturcaz. Yarın interfacelerden sonra daha anlamlı olacak.
		LinkedList<String> linkedList = new LinkedList<String>();
		linkedList.add("John");
		linkedList.add("Robert");
		
//		for (String s : linkedList) {
//			System.out.println(s);
//		}
		//Üstteki gibi yazabiliriz ama bizim zaten yukarıda metotumuz var
		
		//0 yazdık int x için ama kullanmıyoruz onu sadece metot overloading olmasın diye oraya eklediğimiz parametre için yazdık.
		//Direk listeleri veriyor.
		Main.printArrayList(linkedList, 0);
		
		linkedList.remove("John");
		Main.printArrayList(linkedList, 0);
		
		System.out.println(linkedList.get(0));
		
		linkedList.add(1, "Smith");
		Main.printArrayList(linkedList, 0);
		
		System.out.println("------------------");
		
		//-------
		List<String> listeClient  = Main.listeOlustur();
		//Adam neyi kullanıyo array mi linked mi sen bilmiyosun sen sadece metotu kullanıyorsun.
		System.out.println(listeClient);
		
		
		
		
		
	}

}
