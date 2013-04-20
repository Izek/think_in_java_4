package com.shumz.think.ex003;

public class ExThree04 {

	public static void main(String[] args) {

		int counter = 0;
		int limit_number;
		boolean isPrime = false;

		if (args.length == 0) {
			limit_number = 1001;
		} else {
			limit_number = Integer.valueOf(args[0]);
		}

		for (int i = 1; i < limit_number; i++) {

			isPrime = true;

			for (int j = 2; j < i; j++) {

				if (i % j == 0) {
					isPrime = false;
					break;
				}

			}

			if (isPrime) {

				if (i < 10) {
					System.out.print("   ");
				} else if (i < 100) {
					System.out.print("  ");
				} else if (i < 1000) {
					System.out.print(" ");
				}

				System.out.print(i + ", ");
				counter = counter + 1;

				if (counter % 10 == 0) {
					System.out.println();
				}

			}

		}
		
		System.out.println(" ...");
	}

}