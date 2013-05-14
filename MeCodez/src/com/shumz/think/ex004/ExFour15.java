package com.shumz.think.ex004;

public class ExFour15 {

	String s;

	{
		s = "non-static string...";
	}

	public ExFour15() {
		System.out.println("empty constructor is created with " + s);
	}

	public ExFour15(int i) {
		System.out.println("i " + i + "th constructor is created with " + s);
	}

	public static void main(String[] args) {
		new ExFour15();
		new ExFour15(1);
	}

}
