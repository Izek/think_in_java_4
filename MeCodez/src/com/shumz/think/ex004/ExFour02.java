package com.shumz.think.ex004;

public class ExFour02 {

	String s1 = "Initialized at definition...";
	String s2;
	
	public ExFour02(String inStr) {
		s2 = inStr;
	}

	
	public static void main(String[] args) {

		ExFour02 is = new ExFour02("Initialized at constuction");
		
		
		System.out.println();
		System.out.println("s1 " + is.s1);
		System.out.println("s2 " + is.s2);
		
	}
}