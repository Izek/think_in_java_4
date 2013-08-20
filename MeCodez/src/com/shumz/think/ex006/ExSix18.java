package com.shumz.think.ex006;

public class ExSix18 {

	public static void main(String[] args) {
		System.out.println();
		System.out.println(new FinalContainerClass());
		System.out.println();
		System.out.println(new FinalContainerClass());
	}
}

class SelfCounterClass {

	private static int i = 0;
	private int id = i++;

	public String toString() {

		return "Instance of SelfCounterClass() were initialized with id "
				+ String.valueOf(id);
	}
}

class FinalContainerClass {

	final SelfCounterClass fscc = new SelfCounterClass();
	static final SelfCounterClass sfscc = new SelfCounterClass();

	public String toString() {
		return fscc + "\n" + sfscc;
	}

}