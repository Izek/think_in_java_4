package com.shumz.think.ex007.ExSeven001;

public class ExSeven001 {
	public static void ride(Cycle c) {
		System.out.println("Me is riding...");
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
	}

}
