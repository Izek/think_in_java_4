package com.shumz.think.ex004;

//: initialization/SimpleEnumUse.java 

public class SimpleEnumUse {
	public enum Spiciness {
		NOT, MILD, MEDIUM, HOT, FLAMING
	}

	public static void main(String[] args) {
		Spiciness howHot = Spiciness.MEDIUM;
		System.out.println(howHot);
	}
} /*
 * Output: MEDIUM
 */// :~ 