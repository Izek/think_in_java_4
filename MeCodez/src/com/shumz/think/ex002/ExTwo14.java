package com.shumz.think.ex002;

public class ExTwo14 {

	public static void main(String[] args) {

		String s1 = "ABCDE";
		String s2 = "12345";

		strComparator(s1, s2);
		System.out.println();

		strComparator(s1, s1);
		System.out.println();

		strComparator(s1, "ABCDE");
		
	}

	static void strComparator(String str1, String str2) {
		System.out.println(str1 + " == " + str2 + " is: " + (str1 == str2));
		System.out.println(str1 + " != " + str2 + " is: " + (str1 != str2));
		System.out.println("str1.equals(str2) is: " + (str1.equals(str2)));
	}
}

// Exercise 14: (3) Write a method that takes two String arguments and uses all
// the
// boolean comparisons to compare the two Strings and print the results. For the
// == and !=,
// also perform the equals( ) test. In main( ), call your method with some
// different String
// objects. 