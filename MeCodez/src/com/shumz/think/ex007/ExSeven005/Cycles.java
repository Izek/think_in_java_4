package com.shumz.think.ex007.ExSeven005;

public class Cycles {
	public static void ride(Cycle c) {
		System.out.println("Me is riding, and I have " + c.wheels()
				+ " wheels...");
	}

	public static void main(String[] args) {
		Cycle c = new Cycle();
		Unicycle u = new Unicycle();
		Bicycle b = new Bicycle();
		Tricycle t = new Tricycle();

		ride(c);
		ride(u);
		ride(b);
		ride(t);

		// c.ride();
		// u.ride();
		// b.ride();
		// t.ride();

	}

}
