//: polymorphism/shape/Circle.java 
package com.shumz.think.ex007.ExSeven003;

public class Circle extends Shape {

	@Override
	public void draw() {
		System.out.println("Circle.draw()");
	}

	@Override
	public void erase() {
		System.out.println("Circle.erase()");
	}

	@Override public void colorize() {
		System.out.println("Circle.colorize()");
	}
} // /:~ 