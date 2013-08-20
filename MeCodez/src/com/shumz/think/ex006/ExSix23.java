package com.shumz.think.ex006;

class SomeInitialBaseClass {
	static {
		System.out
				.println("Some static code of SomeInitialBaseClass was called...");
	}
}

class SomeExtendedClass extends SomeInitialBaseClass {
	public SomeExtendedClass() {
		System.out.println("Constructor of SomeExtendedClass was called...");
	}
}

class SomeExtended2ndClass extends SomeExtendedClass {
	static {
		System.out
				.println("Some static code of SomeExtended2ndClass was called...");

	}
}

public class ExSix23 {

	public static void main(String[] args) {
		System.out.println("main(String[] args) {} BEGIN");

		SomeExtended2ndClass se2c01 = new SomeExtended2ndClass();

		System.out.println("main(String[] args) {} POCEEDING");

		SomeExtended2ndClass se2c02 = new SomeExtended2ndClass();

		System.out.println("main(String[] args) {} END");

	}

}
