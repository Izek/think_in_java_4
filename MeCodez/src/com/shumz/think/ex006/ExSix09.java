package com.shumz.think.ex006;

public class ExSix09 {

	public static void main(String[] args) {

//		new Root();
		System.out.println();
		System.out.println();
		new Stem();
	}

}

class Root {

	ComponentOne c1b;
	ComponentTwo c2b;
	ComponentThree c3b;

	Root() {
		System.out.println("Instance of a base class 'Root' was created...");

		System.out.println();

		c1b = new ComponentOne();
		c2b = new ComponentTwo();
		c3b = new ComponentThree();

		System.out.println();

	}

}

class Stem extends Root {

	ComponentOne c1d;
	ComponentTwo c2d;
	ComponentThree c3d;

	Stem() {
		System.out.println("Instance of a derived class 'Stem' was created...");

		System.out.println();

		c1d = new ComponentOne();
		c2d = new ComponentTwo();
		c3d = new ComponentThree();

		System.out.println();
	}
}

class ComponentOne {
	public ComponentOne() {
		System.out.println("Instance of a ComponentOne was created...");
	}
}

class ComponentTwo {
	public ComponentTwo() {
		System.out.println("Instance of a ComponentTwo was created...");
	}

}

class ComponentThree {
	public ComponentThree() {
		System.out.println("Instance of a ComponentThree was created...");
	}

}