package com.shumz.think.ex004;

public class ExFour09 {

	private ExFour09() {
		this("Fuck yeah!..");
		System.out.print("Hi!...   ");
	}

	private ExFour09(String s) {

		System.out.println("Your message is: " + s);
	}

	public static void main(String[] args) {
		new ExFour09("s");
		
		new ExFour09();
	}

}
