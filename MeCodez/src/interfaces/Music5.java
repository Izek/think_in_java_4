//: interfaces/music5/Music5.java
// Interfaces.
package interfaces;

import polymorphism.music.Note;
import static net.mindview.util.Print.*;

interface Instrument5 {
	// Compile-time constant:
	int VALUE = 5; // static & final
	// Cannot have method definitions:

	void play(Note n); // Automatically public

	void adjust();
}

class Wind5 implements Instrument5 {
	public void play(Note n) {
		print(this + ".play() " + n);
	}

	public String toString() {
		return "Wind";
	}

	public void adjust() {
		print(this + ".adjust()");
	}
}

class Percussion5 implements Instrument5 {
	public void play(Note n) {
		print(this + ".play() " + n);
	}

	public String toString() {
		return "Percussion";
	}

	public void adjust() {
		print(this + ".adjust()");
	}
}

class Stringed5 implements Instrument5 {
	public void play(Note n) {
		print(this + ".play() " + n);
	}

	public String toString() {
		return "Stringed";
	}

	public void adjust() {
		print(this + ".adjust()");
	}
}

class Brass5 extends Wind5 {
	public String toString() {
		return "Brass";
	}
}

class Woodwind5 extends Wind5 {
	public String toString() {
		return "Woodwind";
	}
}

public class Music5 {
	// Doesn’t care about type, so new types
	// added to the system still work right:
	static void tune(Instrument5 i) {
		// ...
		i.play(Note.MIDDLE_C);
	}

	static void tuneAll(Instrument5[] e) {
		for (Instrument5 i : e)
			tune(i);
	}

	public static void main(String[] args) {
		// Upcasting during addition to the array:
		Instrument5[] orchestra = { new Wind5(), new Percussion5(),
				new Stringed5(),

				new Brass5(), new Woodwind5() };
		tuneAll(orchestra);
	}
} /*
 * Output: Wind.play() MIDDLE_C Percussion.play() MIDDLE_C Stringed.play()
 * MIDDLE_C Brass.play() MIDDLE_C Woodwind.play() MIDDLE_C
 */// :~
