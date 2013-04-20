package com.shumz.think.ex002;

public class ExTwo10 {

	public static void main(String[] args) {

		final int digit1 = 0xA45FA527;
		final int digit2 = 0x8DC3B00F;

		System.out.println("              +--------------------------------+");
		System.out.println("Digit one is: |" + Integer.toBinaryString(digit1) + "|");
		System.out.println("              +--------------------------------+");
		System.out.println("Digit two is: |" + Integer.toBinaryString(digit2) + "|");
		System.out.println("              +--------------------------------+");
		
		System.out.println("     AND (&)  |" + Integer.toBinaryString(digit1 & digit2) + "|");
		System.out.println("              +--------------------------------+");
		System.out.println("      OR (|)  |" + Integer.toBinaryString(digit1 | digit2) + "|");
		System.out.println("              +--------------------------------+");
		System.out.println("     XOR (^)  |00" + Integer.toBinaryString(digit1 ^ digit2) + "|");
		System.out.println("              +--------------------------------+");
		System.out.println("     NOT (~)  |0" + Integer.toBinaryString(~digit1) + "|");
		System.out.println("              +--------------------------------+");
		
		System.out.println();
	}
}
