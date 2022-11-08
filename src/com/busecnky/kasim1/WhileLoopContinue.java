package com.busecnky.kasim1;

public class WhileLoopContinue {

	public static void main(String[] args) {


//		int i = 0;
//		while (i < 10) {
//			if (i==5) {
//				continue;
//			}
//			System.out.println(i);
//			i++;
//	
//		}  //Bunu bu şekilde yazarsak 0 1 2 3 4 yazıp sonsuz döngüde devam ediyor. i==5 e gelince continue diyip
		   //tekrar while loop una geliyor. i 5 olduğu için tekrar i==5 oluyor ve sonsuz döngüye giriyor
		 
		int i = 0;
		while (i < 10) {
			if (i==5) {
				i++;
				continue;
			}
			System.out.println(i);
			i++;
	
		}
		 
		
		//Bu şekilde yazarsan 0 1 2 3 4 5 6 7 8 9 çıktısı veriyor
	}

}
