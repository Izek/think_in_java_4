package com.shumz.think.ex006;

public class ExSix07 {

	public static void main(String[] args) {
		new Cmod();
	}

}

class Amod {
	Amod(String s) {
		System.out.println("Amod()");
	}
}

class Bmod {
	Bmod(String s) {
		System.out.println("Bmod()");
	}

}

class Cmod extends Amod {
	Cmod() {
		super("Hello!..");
		Bmod c1 = new Bmod(null);
	}
}