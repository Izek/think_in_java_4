package com.shumz.think.ex006;

public class ExSix13 {

	public static void main(String[] args) {
		SomeClassOverloaded sco = new SomeClassOverloaded();

		sco.someMethod();
		sco.someMethod(47);
		sco.someMethod("abc");
		sco.someMethod(1F);
	}

}

class SomeClassOverloading {
	void someMethod() {
		System.out.println("someMethod()");
	}

	void someMethod(int i) {
		System.out.println(i);
	}

	void someMethod(String s) {
		System.out.println(s);
	}

}

class SomeClassOverloaded extends SomeClassOverloading {
	void someMethod(Float f) {
		System.out.println(f);
	}
}