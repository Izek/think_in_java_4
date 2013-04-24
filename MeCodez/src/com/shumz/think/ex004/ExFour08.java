package com.shumz.think.ex004;

public class ExFour08 {

	void methOne() {
		methTwo();
		this.methTwo();
	}

	void methTwo() {
		System.out.println("Method methTwo() was called...");
	}

	public static void main(String[] args) {

		new ExFour08().methOne();

	}

}
