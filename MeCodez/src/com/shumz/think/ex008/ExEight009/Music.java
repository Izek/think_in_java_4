//: polymorphism/music3/Music3.java 
// An extensible program. 
package com.shumz.think.ex008.ExEight009;

import polymorphism.music.Note;
import static net.mindview.util.Print.*;

abstract class Instrument {
	void play(Note n) {
		print(this + ".play() " + n);
	}

	void adjust() {
		print("Adjusting" + this);
	}

	public abstract String toString();
}

class Wind extends Instrument {

	public String toString() {
		return "Wind";
	}
}

class Percussion extends Instrument {

	public String toString() {
		return "Percussion";
	}
}

class Stringed extends Instrument {

	public String toString() {
		return "Stringed";
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

	public static void tune(Instrument i) {
		i.play(Note.MIDDLE_C);
	}

	public static void tuneAll(Instrument[] e) {
		for (Instrument i : e)
			tune(i);
	}

	public static void main(String[] args) {

		Instrument[] orchestra = { new Wind(), new Percussion(),
				new Stringed(), new Brass(), new Woodwind() };
		tuneAll(orchestra);
	}
}