package com.shumz.think.ex004;

public class ExFour17 {

	public ExFour17(String s) {
		System.out.println("String constructor; s = " + s);
	}

	public static void main(String[] args) {

		ExFour17[] obj_arr = new ExFour17[5];
		
		for (int i = 0; i < 5; i++) {
			obj_arr[i] = new ExFour17(String.valueOf(i));
		}
	}
}
