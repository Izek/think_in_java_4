package com.shumz.think.ex006;

public class ExSix10 {

	public static void main(String[] args) {

		// new Root();
		System.out.println();
		System.out.println();
		new StemND("abc");
	}

}

class RootND {

	ComponentOneND c1b;
	ComponentTwoND c2b;
	ComponentThreeND c3b;

	RootND(String s) {
		System.out.println("Instance of a base class 'RootND' was created..." + s);

		System.out.println();

		c1b = new ComponentOneND(1);
		c2b = new ComponentTwoND(2);
		c3b = new ComponentThreeND(3);

		System.out.println();

	}

}

class StemND extends RootND {

	ComponentOneND c1d;
	ComponentTwoND c2d;
	ComponentThreeND c3d;

	StemND(String s) {
		
		super("str ");
		System.out.println("Instance of a derived class 'StemND' was created..." + s);

		System.out.println();

		c1d = new ComponentOneND(4);
		c2d = new ComponentTwoND(5);
		c3d = new ComponentThreeND(6);

		System.out.println();
	}
}

class ComponentOneND {
	public ComponentOneND(int i) {
		System.out.println("Instance of a ComponentOneND was created...");
	}
}

class ComponentTwoND {
	public ComponentTwoND(int i) {
		System.out.println("Instance of a ComponentTwoND was created...");
	}

}

class ComponentThreeND {
	public ComponentThreeND(int i) {
		System.out.println("Instance of a ComponentThreeND was created...");
	}

}