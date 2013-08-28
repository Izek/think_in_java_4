package com.shumz.think.ex007;

import java.util.Random;

import polymorphism.music.Note;

class Instrument8 {
	void play(Note n) {
		System.out.println("Instrument.play() " + n);
	}

	public String toString() {
		return "Instrument";
	}

	void adjust() {
		System.out.println("Adjusting Instrument");
	}
}

class Wind8 extends Instrument8 {
	void play(Note n) {
		System.out.println("Wind.play() " + n);
	}

	public String toString() {
		return "Wind";
	}

	void adjust() {
		System.out.println("Adjusting Wind");
	}
}

class Percussion8 extends Instrument8 {
	void play(Note n) {
		System.out.println("Percussion.play() " + n);
	}

	public String toString() {
		return "Percussion";
	}

	void adjust() {
		System.out.println("Adjusting Percussion");
	}
}

class Stringed8 extends Instrument8 {

	void play(Note n) {
		System.out.println("Stringed.play() " + n);
	}

	public String toString() {
		return "Stringed";
	}

	void adjust() {
		System.out.println("Adjusting Stringed");
	}
}

class Brass8 extends Wind8 {
	void play(Note n) {
		System.out.println("Brass.play() " + n);
	}

	void adjust() {
		System.out.println("Adjusting Brass");
	}
}

class Woodwind8 extends Wind8 {
	void play(Note n) {
		System.out.println("Woodwind.play() " + n);
	}

	public String toString() {
		return "Woodwind";
	}
}

class RandomOrchestraGenerator {
	private Random orch_randomizer = new Random(47);

	Instrument8 next() {

		switch (orch_randomizer.nextInt(5)) {
		default:
		case 0:
			return new Wind8();
		case 1:
			return new Percussion8();
		case 2:
			return new Stringed8();
		case 3:
			return new Brass8();
		case 4:
			return new Woodwind8();
		}
	}
}

public class ExSeven008 {
	// Doesn’t care about type, so new types
	// added to the system still work right:
	public static void tune(Instrument8 i) {
		// ...
		i.play(Note.MIDDLE_C);
	}

	public static void printAll(Instrument8[] orch) {
		for (Instrument8 i : orch)
			System.out.println(i);
	}

	public static void main(String[] args) {

		RandomOrchestraGenerator gen = new RandomOrchestraGenerator();

		Instrument8[] orchestra = new Instrument8[12];

		for (int i = 0; i < orchestra.length; i++) {
			orchestra[i] = gen.next();

			if (i < 10) {
				System.out.print(i + 1 + ".  ");
			} else {
				System.out.print(i + 1 + ". ");
			}

			System.out.println(orchestra[i].toString());

			orchestra[i].adjust();
			orchestra[i].play(Note.MIDDLE_C);
		}
	}
} /*
 * Output: Wind.play() MIDDLE_C Percussion.play() MIDDLE_C Stringed.play()
 * MIDDLE_C Brass.play() MIDDLE_C Woodwind.play() MIDDLE_C
 */// :~