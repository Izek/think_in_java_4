package com.shumz.think.ex004;

//: initialization/EnumOrder.java 

public class EnumOrder {
	public enum Spiciness {
		NOT, MILD, MEDIUM, HOT, FLAMING
	}

	public static void main(String[] args) {
		for (Spiciness s : Spiciness.values())
			System.out.println(s + ", ordinal " + s.ordinal());
	}
} /*
 * Output: NOT, ordinal 0 MILD, ordinal 1 MEDIUM, ordinal 2 HOT, ordinal 3
 * FLAMING, ordinal 4
 */// :~ 