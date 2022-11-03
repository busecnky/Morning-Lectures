package com.busecnky.kasim1;

public class WhileLoopContinue {

	public static void main(String[] args) {

		int i = 0;
		while (i < 10) {
			if (i==5) {
				i++;
				continue;
			}
			System.out.println(i);
			i++;
	
		}
		 
		
		//Bu şekilde yapmazsan sonsuz hata veriyor
	}

}
