package com.shumz.think.ex004;

public class ExFour04 {

	public ExFour04() {
		System.out.println("An instance of ExFour04 was created...");
	}

	public ExFour04(String s) {
		System.out.println(s);
	}

	public static void main(String[] args) {
		new ExFour04();
	
		System.out.println();
		System.out.println();
		
		new ExFour04("Hi there from instance of ExFour04 class!..");
	}

}
