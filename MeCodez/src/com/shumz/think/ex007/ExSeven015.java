//: polymorphism/PolyConstructors.java 
// Constructors and polymorphism 
// don’t produce what you might expect. 
package com.shumz.think.ex007;

class Glyph {
	void draw() {
		System.out.println("Glyph.draw()");
	}

	Glyph() {
		System.out.println("Glyph() before draw()");
		draw();
		System.out.println("Glyph() after draw()");
	}
}

class RoundGlyph extends Glyph {
	private int radius = 1;

	RoundGlyph(int r) {
		radius = r;
		System.out.println("RoundGlyph.RoundGlyph(), radius = " + radius);
	}

	void draw() {
		System.out.println("RoundGlyph.draw(), radius = " + radius);
	}
}

class RectangularGlyph extends Glyph {
	private int side = 10;

	public RectangularGlyph(int s) {
		side = s;
		System.out.println("RectangularGlyph.RectangularGlyph(), side = "
				+ side);
	}

	void draw() {
		System.out.println("RectangularGlyph.draw(), side = " + side);

	}
}

public class ExSeven015 {
	public static void main(String[] args) {

		new RoundGlyph(5);
		
		System.out.println();
		System.out.println();
		
		new RectangularGlyph(20);
		
		System.out.println();
		System.out.println();
		
		new RoundGlyph(40);
	}
} /*
 * Output: Glyph() before draw() RoundGlyph.draw(), radius = 0 Glyph() after
 * draw() RoundGlyph.RoundGlyph(), radius = 5
 */// :~ 