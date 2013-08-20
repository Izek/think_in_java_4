package com.shumz.think.ex006;

class InnerClass001 {

	private String name; // = "Inner Class has been initialized...";

	public InnerClass001() {

	}

	public String toString() {
		if (name == null) {
			name = "InnerClass() has been initialized...";
		}
		return name;
	}
}

public class ExSix001 {
	private String name;

	public ExSix001() {

		name = "OuterClass() has been initialized...";
		InnerClass001 in001 = new InnerClass001();
		System.out.println(in001);

	}

	public String toString() {
		return name;
	}

	public static void main(String[] args) {
		System.out.println("1");

		ExSix001 ex001 = new ExSix001();

		System.out.println("2");

		System.out.println(ex001);

		System.out.println("3");

	}
}