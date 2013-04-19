package com.shumz.think.exone;

public class ExOne08 {

	static int counter = 0;

	@SuppressWarnings("static-access")
	public static void main(String[] args) {

		ExOne08 st01 = new ExOne08();
		ExOne08 st02 = new ExOne08();
		ExOne08 st03 = new ExOne08();
		ExOne08 st04 = new ExOne08();


		st01.fieldIncrementer();
		st02.fieldIncrementer();
		st03.fieldIncrementer();
		st04.fieldIncrementer();
		
		System.out.println(st01.counter);
		System.out.println(st02.counter);
		System.out.println(st03.counter);
		System.out.println(st04.counter);
		
		System.out.println();
		System.out.println(ExOne08.counter);
		
		
	}

	int fieldIncrementer() {
		return counter++;
	}

}
