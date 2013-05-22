package com.shumz.think.ex006;

public class ExSix05 {

	public static void main(String[] args) {
		new C();
	}

}

class A {
	A() {
		System.out.println("A()");
	}
}

class B {
	B() {
		System.out.println("B()");
	}

}

class C extends A {
	C() {
		B c1 = new B();
	}
}