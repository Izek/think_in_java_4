package com.shumz.think.ex006;

public class ExSix12 {

	public static void main(String[] args) {

		// new Root();

//		RootD rd = new RootD();
//
//		System.out.println();
//		System.out.println();
//
//		rd.dispose();
//
//		System.out.println();
//		System.out.println();

		StemD sd = new StemD();

		System.out.println();
		System.out.println();

		sd.dispose();

	}

}

class RootD {

	ComponentOneD c1b;
	ComponentTwoD c2b;
	ComponentThreeD c3b;

	RootD() {
		System.out.println("Instance of a base class 'Root' was created: "
				+ this.toString());

		System.out.println();

		c1b = new ComponentOneD();
		c2b = new ComponentTwoD();
		c3b = new ComponentThreeD();

		System.out.println();

		System.out.println(c1b.toString());
		System.out.println(c2b.toString());
		System.out.println(c3b.toString());

		System.out.println();

	}

	void dispose() {
		c1b.dispose();
		c2b.dispose();
		c3b.dispose();

		System.out.println("Instance of a 'RootD' was disposed: "
				+ this.toString());

		// this.dispose();
	}

}

class StemD extends RootD {

	ComponentOneD c1d;
	ComponentTwoD c2d;
	ComponentThreeD c3d;

	StemD() {
		System.out.println("Instance of a derived class 'StemD' was created..."
				+ this.toString());

		System.out.println();

		c1d = new ComponentOneD();
		c2d = new ComponentTwoD();
		c3d = new ComponentThreeD();

		System.out.println();

		System.out.println(c1d.toString());
		System.out.println(c2d.toString());
		System.out.println(c3d.toString());

		System.out.println();
	}

	void dispose() {
		c1d.dispose();
		c2d.dispose();
		c3d.dispose();

		System.out.println("Instance of a 'StemD' was disposed: "
				+ this.toString());

		super.dispose();
	}
}

class ComponentOneD {
	public ComponentOneD() {
		System.out.println("Instance of a ComponentOneD was created: "
				+ this.toString());

	}

	void dispose() {
		System.out.println("Instance of a ComponentOneD was disposed: "
				+ this.toString());
	}
}

class ComponentTwoD {
	public ComponentTwoD() {
		System.out.println("Instance of a ComponentTwoD was created: "
				+ this.toString());
	}

	void dispose() {
		System.out.println("Instance of a ComponentTwoD was disposed: "
				+ this.toString());
	}
}

class ComponentThreeD {
	public ComponentThreeD() {
		System.out.println("Instance of a ComponentThreeD was created: "
				+ this.toString());
	}

	void dispose() {
		System.out.println("Instance of a ComponentThreeD was disposed: "
				+ this.toString());
	}

}