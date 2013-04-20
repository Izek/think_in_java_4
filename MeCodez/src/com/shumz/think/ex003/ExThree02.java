package com.shumz.think.ex003;

import java.util.Random;

public class ExThree02 {


	public static void main(String[] args) {

		Random rand = new Random();
		int integer_1;
		int integer_2;
		
		
		
		
		for (int i = 1; i < 26; i++) {
			integer_1 = rand.nextInt(25) + 1;
			integer_2 = rand.nextInt(25) + 1;
			
			if (i < 10) {
				System.out.print(" ");
			}
			System.out.print(i + ".) ");
			
			if (integer_1 < 10) {
				System.out.print(" ");
			}
			System.out.print(integer_1);
			
//			System.out.print("  :  ");
			System.out.print(" is ");
	
				if (integer_1 < integer_2) {
					System.out.print("smaller than ");
				} else if (integer_1 > integer_2) {
					System.out.print("greater than ");
				} else {
					System.out.print("equal to ");
				}
			
			
//			if (integer_2 < 10) {
//				System.out.print(" ");
//			}
			System.out.print(integer_2);
			
			System.out.println();
		}
	}

}
