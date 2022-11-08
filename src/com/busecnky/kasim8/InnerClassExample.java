package com.busecnky.kasim8;

public class InnerClassExample {   //bu top level bi sınıf

	
	//Bir sınıfı private olarak tanımlayabiliriz. Ancak bu private sınıf mutlaka bir inner sınıf veya nested sınıf olmak zorundadır.
	//Bir private sınıfı ayrı bir top level sınıf tanımlayamayız. (yandaki gördüklerimiz ordaki classlar top level)
	//Çünkü bu şekilde anlamsız olur. 
	
	private class TestSinifi{ //public de olur
		public void test() {
			System.out.println("Test");
		}
		
	}
	//bu sınıfı sadece ve sadece burda kullanırız.
	
	
	
	public static void main(String[] args) {
		
		InnerClassExample innerClassExample = new InnerClassExample();
		InnerClassExample.TestSinifi testSinifi = innerClassExample.new TestSinifi();
		testSinifi.test();

		
	}

}
