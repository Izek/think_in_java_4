package com.shumz.think.ex001;

public class ExOne11 {

	static int anIntegerRepresentingColors;

	static int changeTheHueOfTheColor(int newHue) {
		return newHue = 67;
	}

	public static void main(String[] args) {

		System.out.println(anIntegerRepresentingColors);
		System.out.println();

		anIntegerRepresentingColors = changeTheHueOfTheColor(anIntegerRepresentingColors);
		System.out.print(anIntegerRepresentingColors);

	}

}