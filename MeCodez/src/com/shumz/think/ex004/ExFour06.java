package com.shumz.think.ex004;

public class ExFour06 {

	public static void main(String[] args) {
		Dogz dog = new Dogz();
		dog.bark();
		dog.bark(1, 2.0);
		dog.bark(1.1, 2);


	}

}

class Dogz {
	public void bark() {
		System.out.println("Default bark!");
	}

	public void bark(int i, Double d) {
		System.out.println(d);
		System.out.println("int bark = howl");
		}

	public void bark(double d, int i) {
		System.out.println(1);
		System.out.println("double bark = yip");
		}
	// Etc. ...
}


