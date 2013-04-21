package com.shumz.think.ex003;

public class ExThree10 {

	public static void main(String[] args) {

		int counter = 0;
		int result = 0;

		for (int i = 0; i < 100; i++) {

			for (int j = i; j < 100; j++) {
				if ((j % 10 == 0) && (i % 10 == 0))
					continue;

				result = i * j;

				if (result > 999) {
					if (detectVampireNumber(result, i, j)) {
						counter++;

						System.out.print(counter + ".)  ");
						System.out.println("i = " + i + " * " + "j = " + j
								+ " = " + result);
					}
				}
			}
		}
	}

	private static boolean detectVampireNumber(int res, int operand_1,
			int operand_2) {
		boolean isAVampirenumber = false;

		int[] resArray = new int[4];
		int[] opArray = new int[4];

		byte count = 0;
		opArray[0] = operand_1 / 10;
		opArray[1] = operand_1 % 10;
		opArray[2] = operand_2 / 10;
		opArray[3] = operand_2 % 10;

		resArray[0] = res / 1000;
		resArray[1] = (res % 1000) / 100;
		resArray[2] = res % 1000 % 100 / 10;
		resArray[3] = res % 1000 % 100 % 10;

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				if (opArray[i] == resArray[j]) {
					count++;

					opArray[i] = -1;
					resArray[j] = -2;
				}
			}
		}

		if (count == 4)
			isAVampirenumber = true;
		
		return isAVampirenumber;
	}

}
