package com.shumz.think.extwo;

public class ExTwo07 {

	public static void main(String[] args) {

		Coin coin = new Coin();

		System.out.println("Now the coin will be throwed....");
		System.out.println();

		coin.throwACoin();

		if (coin.getCoinSide()) {
			System.out.println("You've got a cross!..");
		} else {
			System.out.println("You've got a tails!..");
		}

	}

}

class Coin {

	double possibility;

	double setCoinSidePossibility() {
		return Math.random();
	}

	void throwACoin() {
		possibility = setCoinSidePossibility();
	}

	boolean getCoinSide() {
		boolean s;

		if (possibility > 0.5) {
			s = false;
		} else {
			s = true;
		}

		return s;
	}
}