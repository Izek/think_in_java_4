package com.shumz.think.ex006;

public class ExSix08 {

	public static void main(String[] args) {

		new DClass();
		System.out.println();
		new DClass(12);

	}

}

class BClass {
	protected BClass(int i) {
		System.out.println(i + " Base class was constructed...");
	}

}

class DClass extends BClass {
	DClass() {
		super(0);
		System.out.println("Derived default class was constructed...");

//		new BClass(10);
	}

	DClass(int i) {
		super(1);
		System.out.println(i + " Derived non-default class was constructed...");

//		new BClass(11);
	}
}