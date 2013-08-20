package com.shumz.think.ex006;

class Insect {
	private int i = 9;
	protected int j;

	Insect() {
		System.out.println();
		System.out.println("i = " + i + ", j = " + j);
		j = 39;
	}

	private static int x1 = printInit("static Insect.x1 initialized");

	static int printInit(String s) {
		System.out.println(s);
		return 47;
	}
}

class Beetle extends Insect {
	private int k = printInit("Beetle.k initialized");

	public Beetle() {
		System.out.println("k = " + k);
		System.out.println("j = " + j);
	}

	private static int x2 = printInit("static Beetle.x2 initialized");
}

class Scarabaeus extends Beetle {
	private int k = printInit("Scarabaeus.k initialized");

	public Scarabaeus() {
		System.out.println("k = " + k);
		System.out.println("j = " + j);
	}
	
	private static int x3 = printInit("static Scarabaeus.x3 initialized");
}

public class ExSix24 {

	public static void main(String[] args) {
		System.out.println("Beetle constructor");
		Beetle b = new Beetle();

		System.out.println("Scarabeus constructor");
		Scarabaeus s = new Scarabaeus();
	}
}
