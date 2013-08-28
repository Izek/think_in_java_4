package com.shumz.think.ex007.ExSeven004;

//: polymorphism/Shapes.java 
// Polymorphism in Java. 

public class Shapes {
	private static RandomShapeGenerator gen = new RandomShapeGenerator();

	public static void main(String[] args) {
		// Shape[] s = new Shape[9];
		// Fill up the array with shapes:
		// for (int i = 0; i < s.length; i++)
		// s[i] = gen.next();
		// Make polymorphic method calls:

		Shape[] shapes = { new Circle(), new Square(), new Triangle(),
				new Hexagon() };

		for (Shape shp : shapes) {
			shp.draw();
			shp.colorize();
			shp.erase();
			System.out.println();
		}
	}
} /*
 * Output: Triangle.draw() Triangle.draw() Square.draw() Triangle.draw()
 * Square.draw() Triangle.draw() Square.draw() Triangle.draw() Circle.draw()
 */// :~ 