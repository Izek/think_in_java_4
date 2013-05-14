package com.shumz.think.ex004;

public class ExFour14 {

	public ExFour14() {
		printStaticStr();
	}

	static String s1 = "this is static string 1...";
	static String s2;

	static {
		s2 = "this is static string 2...";
	}

	void printStaticStr() {
		System.out.println(s1);
		System.out.println(s2);
	}

	public static void main(String[] args) {
//		new ExFour14().printStaticStr();
		
		System.out.println("s1 = " + s1); 
		System.out.println("s2 = " + s2);
	}

}
