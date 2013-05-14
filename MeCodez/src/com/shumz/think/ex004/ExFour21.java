package com.shumz.think.ex004;

public class ExFour21 {

	public static enum Paper_Currency {
		ONE_BUCKS, FIVE_BUCKS, TEN_BUCKS, TWENTY_BUCKS, FIFTY_BUCKS, HUNDRED_BUCKS
	};

	Paper_Currency money;

	public static void main(String[] args) {
		int i = 0;
		for (Paper_Currency p_c : Paper_Currency.values()) {
			i++;
			System.out.println(i + ".) " + p_c + " has following position: "
					+ p_c.ordinal());
		}
	}

}
