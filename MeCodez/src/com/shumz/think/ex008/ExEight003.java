package com.shumz.think.ex008;

abstract class SomeAClass {
	public SomeAClass() {
		print();
	}

	abstract void print();

}

class SomeDAClass extends SomeAClass {

	private int i = 47;

//	public SomeDAClass(int i) {
//		this.i = i;
//	}

	public void print() {
		System.out.println(i);
	}

}

public class ExEight003 {

	public static void main(String[] args) {

		SomeDAClass sdaclass = new SomeDAClass();

		sdaclass.print();
	}
}
