package com.shumz.think.ex006;

class SomeInnerClass {
	final void someMethod() {
		System.out.println("someMethod() was called...");
	}
}

public class ExSix21 extends SomeInnerClass {

	final void someMethod_() {
		System.out.println("Overriden someMethod() was called...");
	}
	
	public static void main(String[] args) {
		ExSix21 ex21 = new ExSix21();
		ex21.someMethod();
//		ex21.someMethodO();
		
	}

}
