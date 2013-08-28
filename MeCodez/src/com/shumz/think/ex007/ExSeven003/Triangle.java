//: polymorphism/shape/Triangle.java 
package com.shumz.think.ex007.ExSeven003;

public class Triangle extends Shape {
	@Override
	public void draw() {
		System.out.println("Triangle.draw()");
	}

	@Override
	public void erase() {
		System.out.println("Triangle.erase()");
	}
} // /:~ 