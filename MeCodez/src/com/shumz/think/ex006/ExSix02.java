package com.shumz.think.ex006;

import reusing.Detergent;

public class ExSix02 extends Detergent {

	public void scrub() {
		System.out.println();
		System.out.println("Overrided scrub() method were called...");

		append(" scrub()");

		System.out.println();
	}

	public void sterilize() {
		append(" sterilize()");
		super.scrub();
	}

	public static void main(String[] args) {

		ExSix02 x = new ExSix02();
		x.dilute();
		x.apply();
		x.scrub();
		x.foam();
		x.sterilize();
		
		
		System.out.println(x);
	}

}
