package com.shumz.think.ex006;

public class ExSix11 {
	public static void main(String[] args) {
		Detergent d = new Detergent();
		d.dilute();
		d.apply();
		d.scrub();
		d.foam();

		System.out.println(d);
		System.out.println("Testing Cleanser base class:");
		Cleanser.main(args);
		
		System.out.println("Testing Detergent delegated class:");
		Detergent.main(args);
	}
}

class Detergent {
	// Change a method:

	private Cleanser cl1 = new Cleanser();

	public void append(String s) {
		cl1.append(s);
	}

	public void dilute() {
		cl1.dilute();
	}

	public void apply() {
		cl1.apply();
	}

	public void scrub() {
		cl1.append(" Detergent.scrub()");

	}

	public void foam() {
		cl1.append(" foam()");
	}
	
	public String toString() {
		return cl1.toString();
	}

	// Test the new class:
	public static void main(String[] args) {
		Detergent x = new Detergent();
		x.dilute();
		x.apply();
		x.scrub();
		x.foam();
		System.out.println(x);
		System.out.println("Testing base class:");
//		Cleanser.main(args);
	}
}

class Cleanser {
	private String s = "Cleanser";

	public void append(String a) {
		s += a;
	}

	public void dilute() {
		append(" dilute()");
	}

	public void apply() {
		append(" apply()");
	}

	public void scrub() {
		append(" scrub()");
	}

	public String toString() {
		return s;
	}

	public static void main(String[] args) {
		Cleanser x = new Cleanser();
		x.dilute();
		x.apply();
		x.scrub();
		System.out.println(x);
	}
}