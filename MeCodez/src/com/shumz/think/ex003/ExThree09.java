package com.shumz.think.ex003;

public class ExThree09 {

	static int nums;

	public static void main(String[] args) {

		if (args.length != 1) {
			nums = 25;
		} else {
			nums = Integer.valueOf(args[0]);
		}

		if (nums > 92) {
			System.out
					.println("Sorry, but max allowed quantity of displayed Fibonacci numbes is 92!..");
			System.out.println();

			nums = 92;
		}

		System.out.println("Now will be displayed the sequence of " + nums
				+ " Fibonacci numbers:");
		System.out.println();

		showFibonacciNumbers(nums);

		System.out.println();
		System.out.println("Done...");

	}

	private static void showFibonacciNumbers(int numersQuantity) {
		long j = 1;
		long k = 0;
		long l = 0;

		for (int i = 0; i < numersQuantity; i++) {

			k = j;
			j = l;
			l = j + k;

			if (i < 9) {
				System.out.print(" ");
			}
			System.out.println((i + 1) + ".) " + l + " ");
		}
	}
}
