package com.shumz.think.ex004;

public class ExFour18 {

	public ExFour18(String s) {
		System.out.println("String constructor s = " + s);
	}

	public static void main(String[] args) {

		ExFour18[] obj_arr = new ExFour18[5];
		
		for (int i = 0; i < obj_arr.length; i++) {
			obj_arr[i] = new ExFour18(Integer.toString(i));
		}
	}
}
