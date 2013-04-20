package com.shumz.think.ex003;

public class ExThree01 {

	public static void main(String[] args) {

		System.out.println("Printing 100 numbers...");

		for (int i = 1; i < 101; i++) {

			if (((i - 1) % 10) == 0) {
				System.out.println();
			}

			if (i < 10) {
				System.out.print("   ");
			} else if (i < 100) {
				System.out.print("  ");
			} else if (i < 1000) {
				System.out.print(" ");
			}

			System.out.print(i);
		}
	}
}
