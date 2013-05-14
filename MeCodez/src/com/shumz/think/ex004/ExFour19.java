package com.shumz.think.ex004;

public class ExFour19 {

	public void stringImporter(String... args) {
		for (int i = 0; i < args.length; i++) {
			System.out.println(i + "). " + args[i]);
		}
	}

	public static void main(String[] args) {

		ExFour19 object = new ExFour19();
		object.stringImporter("qwerty", "asdfgh", "zxcvbn");

		System.out.println();
		System.out.println();

		String[] str_array = new String[] { "qwe", "asd", "zxc" };
		object.stringImporter(str_array);

	}

}
