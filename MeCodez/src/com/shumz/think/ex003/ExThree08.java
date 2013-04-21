package com.shumz.think.ex003;

public class ExThree08 {

	public static void main(String[] args) {

		System.out.println("Trying 'switch' with breaks...");
		for (int i = 1; i < 6; i++) {

			switch (i) {
			case 1:
				System.out.println("Now is: " + (i * i));
				break;
			case 2:
				System.out.println("Now is: " + (i * i));
				break;
			case 3:
				System.out.println("Now is: " + (i * i));
				break;
			case 4:
				System.out.println("Now is: " + (i * i));
				break;
			default:
				System.out.println("Sorry, out of scope...");
			}

		}

		System.out.println();
		System.out.println("Trying 'switch' without breaks...");
		for (int i = 1; i < 6; i++) {

			switch (i) {
			case 1:
				System.out.println("Now is: " + (i * i));

			case 2:
				System.out.println("Now is: " + (i * i));

			case 3:
				System.out.println("Now is: " + (i * i));

			case 4:
				System.out.println("Now is: " + (i * i));

			default:
				System.out.println("Sorry, out of scope...");
			}

		}

	}

}
