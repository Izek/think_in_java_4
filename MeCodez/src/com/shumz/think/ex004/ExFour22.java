package com.shumz.think.ex004;

public class ExFour22 {

	public ExFour22(Paper_Currency banknote) {
		this.money = banknote;
	}

	private void description() {
		
		System.out.print(money + " - ");
		switch (money) {
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

	public static enum Paper_Currency {
		ONE_BUCKS, FIVE_BUCKS, TEN_BUCKS, TWENTY_BUCKS, FIFTY_BUCKS, HUNDRED_BUCKS
	};

	Paper_Currency money;

	public static void main(String[] args) {

		ExFour22 banknote_1 = new ExFour22(Paper_Currency.ONE_BUCKS);
		ExFour22 banknote_2 = new ExFour22(Paper_Currency.TWENTY_BUCKS);
		ExFour22 banknote_3 = new ExFour22(Paper_Currency.FIVE_BUCKS);
		ExFour22 banknote_4 = new ExFour22(Paper_Currency.HUNDRED_BUCKS);
		ExFour22 banknote_5 = new ExFour22(Paper_Currency.TEN_BUCKS);
		ExFour22 banknote_6 = new ExFour22(Paper_Currency.FIFTY_BUCKS);

		banknote_1.description();
		banknote_2.description();
		banknote_3.description();
		banknote_4.description();
		banknote_5.description();
		banknote_6.description();

	}

}
