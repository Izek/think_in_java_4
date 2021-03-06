package com.shumz.think.ex007;

//: polymorphism/Sandwich.java 
//Order of constructor calls. 

import static net.mindview.util.Print.*;

class Meal {
	Meal() {
		print("Meal()");
	}
}

class Bread {
	Bread() {
		print("Bread()");
	}
}

class Cheese {
	Cheese() {
		print("Cheese()");
	}
}

class Lettuce {
	Lettuce() {
		print("Lettuce()");
	}
}

class Lunch extends Meal {
	Lunch() {
		print("Lunch()");
	}
}

class PortableLunch extends Lunch {
	PortableLunch() {
		print("PortableLunch()");
	}
}

class Pickle {
	public Pickle() {
		System.out.println("Pickle()");
	}
}

class Sandwich extends PortableLunch {
	private Bread b = new Bread();
	private Cheese c = new Cheese();
	private Lettuce l = new Lettuce();
	private Pickle p = new Pickle();

	public Sandwich() {
		print("Sandwich()");
	}

} /*
 * Output: Meal() Lunch() PortableLunch() Bread() Cheese() Lettuce() Sandwich()
 */// :~

public class ExSeven011 {

	public static void main(String[] args) {
		new Sandwich();
	}

}
