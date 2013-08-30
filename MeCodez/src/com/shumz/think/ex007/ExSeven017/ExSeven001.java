package com.shumz.think.ex007.ExSeven017;

public class ExSeven001 {
	public static void ride(Cycle c) {
		System.out.println("Me is riding...");
	}

	public static void main(String[] args) {
		// Cycle c = new Cycle();
		// Unicycle u = new Unicycle();
		// Bicycle b = new Bicycle();
		// Tricycle t = new Tricycle();
		//
		// ride(c);
		// ride(u);
		// ride(b);
		// ride(t);

		Cycle[] cycles = { new Unicycle(), new Bicycle(), new Tricycle() };

		for (int i = 0; i < cycles.length; i++) {
			ride(cycles[i]);
		}

		System.out.println();

		// cycles[0].balance();
		// cycles[1].balance();
		// cycles[2].balance();

		((Unicycle) cycles[0]).balance();
		((Bicycle) cycles[1]).balance();
//		((Unicycle) cycles[2]).balance();

	}
}
