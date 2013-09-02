package com.shumz.think.ex008;

interface FastFood {
	void rushOrder();

	void gobble();
}

class Meal {
	Meal() {
		System.out.println("Meal()");
	}
}

class Bread {
	Bread() {
		System.out.println("Bread()");
	}
}

class Cheese {
	Cheese() {
		System.out.println("Cheese()");
	}
}

class Lettuce {
	Lettuce() {
		System.out.println("Lettuce()");
	}
}

class Lunch extends Meal {
	Lunch() {
		System.out.println("Lunch()");
	}
}

class PortableLunch extends Lunch {
	PortableLunch() {
		System.out.println("PortableLunch()");
	}
}

class Sandwich implements FastFood {
	@SuppressWarnings("unused")
	private Bread b = new Bread();
	@SuppressWarnings("unused")
	private Cheese c = new Cheese();
	@SuppressWarnings("unused")
	private Lettuce l = new Lettuce();

	public Sandwich() {
		System.out.println("Sandwich()");
	}

	@Override
	public void rushOrder() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void gobble() {
		// TODO Auto-generated method stub
		
	}
}

class FastSandwich extends Sandwich implements FastFood {
	public void rushOrder() {
		System.out.println("Rushing your sandwich order");
	}

	public void gobble() {
		System.out.println("Chomp! Snort! Gobble!");
	}
}

public class ExEight008 {

	public static void main(String[] args) {
		new Sandwich();
	}
}
