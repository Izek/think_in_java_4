package com.shumz.think.ex006;

public class ExSix17 {

	public static void main(String[] args) {
		FrogM f1 = new FrogM("Froggy");
		AmphibianM.breatheInWater(f1);
		AmphibianM.breatheInAtmosphere(f1);

		System.out.println(f1.toString());
		System.out.println();

		AmphibianM f2 = new FrogM("Sandy");
		FrogM.breatheInAtmosphere(f2);
		FrogM.breatheInWater(f2);

		System.out.println(f2.toString());
		System.out.println();

		FrogM f3 = new FrogM("Danny");
		FrogM.breatheInWater(f3);
		FrogM.breatheInAtmosphere(f3);

		System.out.println(f1.toString());
		System.out.println();
	}

}

class AmphibianM {

	AmphibianM() {
		System.out.println("A'm an amphibian...");
	}

	static void breatheInWater(AmphibianM a) {
		System.out.println("A'm breathing in water...");

		a.inhale();
		a.exhale();
	}

	static void breatheInAtmosphere(AmphibianM a) {
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

class FrogM extends AmphibianM {
	private String name;

	FrogM(String name) {
		this.name = name;
		System.out.println(name + " and I'm a frog...");
	}

	void makeASound() {
		System.out.println("Fuck yeah!..");
	}

	public String toString() {
		return name + ": " + super.toString();
	}

	static void breatheInAtmosphere(FrogM f) {
		System.out.println(f.name + " is breathing on air...");
	}

	static void breatheInWater(FrogM f) {
		System.out.println(f.name + " is breathing in water...");
	}
}