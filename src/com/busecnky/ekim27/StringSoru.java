package com.busecnky.ekim27;

public class StringSoru {

	public static void main(String[] args) {

		// Soru:
		// Aşağıdaki çıktıyı ekrana yazdıran bir program yazınız. (döngü+String
		// kullanarak)

		/*
		 * *
		 * * * 
		 * * * * 
		 * * * * * 
		 * * * * * *
		 */
	
		//hocanın çözümü
		/*String s = "*";
		for (int i = 1; i < 7; i++) {
				System.out.println(s);
				s = s + " *";

		}
		*/
		
		//oğuz furkan substring çözümü
		String yildiz = "* ";
		int i = 1;
		String o = "* * * * * * ";
		for(; i<= (o.length()-1) ; ) {
			System.out.println(o.substring(0,i+1));
			i=i+2;
		}
		
		
		
	}

}
