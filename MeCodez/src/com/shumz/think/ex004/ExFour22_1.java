package com.shumz.think.ex004;

public class ExFour22_1 {

	public static enum Paper_Currency {
		ONE_BUCKS, FIVE_BUCKS, TEN_BUCKS, TWENTY_BUCKS, FIFTY_BUCKS, HUNDRED_BUCKS
	};

	Paper_Currency money;

	public static void main(String[] args) {

		for (Paper_Currency p_c : Paper_Currency.values()) {
			
			System.out.print(p_c + " - ");
			
			switch (p_c) {
			case ONE_BUCKS:
				System.out.println("This is 1 dollar");
				break;

			case FIVE_BUCKS:
				System.out.println("This is 5 dollars");
				break;

			case TEN_BUCKS:
				System.out.println("This is 10 dollars");
				break;

			case TWENTY_BUCKS:
				System.out.println("This is 20 dollars");
				break;

			case FIFTY_BUCKS:
				System.out.println("This is 50 dollars");
				break;

			case HUNDRED_BUCKS:
				System.out.println("This is 100 dollars");
				break;

			default:
				break;
			}
		}
	}

}
