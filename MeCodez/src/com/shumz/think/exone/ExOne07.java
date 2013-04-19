package com.shumz.think.exone;

public class ExOne07 {

	static int i = 47;

	static void increment() {
		ExOne07.i++;
	}

	@SuppressWarnings("static-access")
	public static void main(String[] args) {

		ExOne07 st1 = new ExOne07();
		ExOne07 st2 = new ExOne07();

		ExOne07.increment();

		System.out.println(ExOne07.i);
		System.out.println(st1.i);
		System.out.println(st2.i);

	}
}