package com.shumz.think.ex006;

public class ExSix01 {
	InnerClass innerOne;

	public ExSix01() {
		System.out.println("OuterClass() was initialized.");
		innerOne = new InnerClass();
		System.out.println(innerOne.toString());
	}

	public static void main(String[] args) {
		ExSix01 ex1 = new ExSix01();
		ex1.getClass();
	}

}

class InnerClass {

	public InnerClass() {
		System.out.println("InnerClass() was initialized");
	}
}