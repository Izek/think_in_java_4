//: polymorphism/music3/Music3.java 
// An extensible program. 
package com.shumz.think.ex008.ExEight010;

import polymorphism.music.Note;

interface Playable {

	void play(Note n);
}

interface Instrument {

	void adjust();
}

class Wind implements Instrument, Playable {

	public String toString() {
		return "Wind";
	}

	public void play(Note n) {
		System.out.println(this + ".play() " + n);

	}

	public void adjust() {
		System.out.println("Adjusting " + this);
	}

}

class Percussion implements Instrument, Playable {

	public String toString() {
		return "Percussion";
	}

	public void play(Note n) {
		System.out.println(this + ".play() " + n);
	}

	public void adjust() {
		System.out.println("Adjusting " + this);
	}
}

class Stringed implements Instrument, Playable {

	public String toString() {
		return "Stringed";
	}

	public void play(Note n) {
		System.out.println(this + ".play() " + n);
	}

	public void adjust() {
		System.out.println("Adjusting " + this);
	}
}

class Brass extends Wind {

	public String toString() {
		return "Brass";
	}
}

class Woodwind extends Wind {

	public String toString() {
		return "Woodwind";
	}
}

public class Music {

	public static void tune(Playable i) {
		i.play(Note.MIDDLE_C);
	}

	public static void tuneAll(Playable[] e) {
		for (Playable i : e)
			tune(i);
	}

	public static void main(String[] args) {

		Playable[] orchestra = { new Wind(), new Percussion(), new Stringed(),
				new Brass(), new Woodwind() };
		tuneAll(orchestra);
	}
}