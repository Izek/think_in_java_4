package com.shumz.think.ex004;

public class ExFour16 {

	public static void main(String[] args) {

		String arr_str[] = { "el0", "el1", "el2", "el3", "el4", };

		for (int i = 0; i < arr_str.length; i++) {
			System.out.print(arr_str[i] + ", ");
		}

		System.out.println();
		System.out.println();
		
		String arr_str_0[] = new String[8];	

		for (int i = 0; i < 8; i++) {
			arr_str_0[i] = "Element #" + String.valueOf(i);
		}
		
		
		for (int i = 0; i < arr_str_0.length; i++) {
			System.out.print(arr_str_0[i] + ", ");
		}

	}
}
