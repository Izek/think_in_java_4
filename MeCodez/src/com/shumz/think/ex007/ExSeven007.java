//: polymorphism/music3/Music3.java 
// An extensible program. 
package com.shumz.think.ex007;

import polymorphism.music.Note;

class Instrument7 {
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

class Wind7 extends Instrument7 {
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

class Percussion7 extends Instrument7 {
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

class Stringed7 extends Instrument7 {

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

class Brass7 extends Wind7 {
	void play(Note n) {
		System.out.println("Brass.play() " + n);
	}

	void adjust() {
		System.out.println("Adjusting Brass");
	}
}

class Woodwind7 extends Wind7 {
	void play(Note n) {
		System.out.println("Woodwind.play() " + n);
	}

	public String toString() {
		return "Woodwind";
	}
}

class Electronic7 extends Instrument7 {
	void play(Note n) {
		System.out.println("Electronic.play() " + n);
	}

	public String toString() {
		return "Electronic";
	}
}

public class ExSeven007 {

	public static void main(String[] args) {

		Instrument7[] orchestra = { new Wind7(), new Percussion7(),
				new Stringed7(), new Brass7(), new Woodwind7(),
				new Electronic7() };

		for (Instrument7 i7 : orchestra) {
			i7.play(Note.MIDDLE_C);
			i7.adjust();
			System.out.println(i7);
		}

	}
} /*
 * Output: Wind.play() MIDDLE_C Percussion.play() MIDDLE_C Stringed.play()
 * MIDDLE_C Brass.play() MIDDLE_C Woodwind.play() MIDDLE_C
 */// :~