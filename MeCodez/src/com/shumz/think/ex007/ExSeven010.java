package com.shumz.think.ex007;

class BaseClass {

	public void methodOne() {
		System.out.println("methodOne() of BaseClass was called...");

		methodTwo();
	}

	public void methodTwo() {
		System.out.println("methodOne() of BaseClass was called...");
	}
}

class DerivedClass extends BaseClass {

//	public void methodOne() {
//		System.out.println("methodOne() of DerivedClass was called...");
//	}

	public void methodTwo() {
		System.out.println("methodOne() of DerivedClass was called...");
	}
}

public class ExSeven010 {

	public static void main(String[] args) {

		BaseClass d_class = new DerivedClass();

		d_class.methodOne();

		System.out.println();
		System.out.println();

		d_class.methodTwo();
	}

}
