package com.shumz.think.ex006;

public class ExSix16 {

	public static void main(String[] args) {
		Frog f1 = new Frog("Froggy ");
		Amphibian.breatheInWater(f1);
		Amphibian.breatheInAtmosphere(f1);
		
		System.out.println(f1.toString());
	}

}

class Amphibian {

	Amphibian() {
		System.out.println("A'm an amphibian...");
	}

	static void breatheInWater(Amphibian a) {
		System.out.println("A'm breathing in water...");

		a.inhale();
		a.exhale();
	}

	static void breatheInAtmosphere(Amphibian a) {
		System.out.println("A'm breathing in atmosphere...");

		a.inhale();
		a.exhale();
	}

	public void inhale() {
		System.out.println("inhailing");
	}

	public void exhale() {
		System.out.println("exhailing");
	}
}

class Frog extends Amphibian {
	private String name;

	Frog(String name) {
		this.name = name;
		System.out.println(name + " and I'm an frog...");
	}

	void makeASound() {
		System.out.println("Fuck yeah!..");
	}

	public String toString() {
		return name + ": " + super.toString();
	}
}