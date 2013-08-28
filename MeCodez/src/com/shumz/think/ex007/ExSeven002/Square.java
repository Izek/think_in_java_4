//: polymorphism/shape/Square.java 
package com.shumz.think.ex007.ExSeven002;

public class Square extends Shape {
	@Override
	public void draw() {
		System.out.println("Square.draw()");
	}

	@Override
	public void erase() {
		System.out.println("Square.erase()");
	}
} // /:~ 