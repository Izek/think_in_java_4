package com.shumz.think.ex004;

public class ExFour01 {

	public static void main(String[] args) {

		for (int i = 0; i < 8; i++) {
			new UnInitStr();
			System.out.println(i + ".) " + UnInitStr.s);

		}

	}

}

class UnInitStr {
	public static String s;
}