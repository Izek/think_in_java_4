package com.shumz.think.ex008;

interface Rodent88 {

	public void drink();

	public void eat();

	public String getName();
}

class Mouse88 implements Rodent88 {
	public void drink() {
		System.out.println("Me is mouse and I'm drinking...");
	}

	public void eat() {
		System.out.println("Me is mouse and I'm eating...");
	}

	public String getName() {
		return "Me is Mouse :-)";
	}

}

class Gerbil88 implements Rodent88 {
	public void drink() {
		System.out.println("Me is gerbil and I'm drinking...");
	}

	public void eat() {
		System.out.println("Me is gerbil and I'm eating...");
	}

	public String getName() {
		return "Me is Gerbil :-)";
	}
}

class Hamster88 implements Rodent88 {
	public void drink() {
		System.out.println("Me is hamster and I'm drinking...");
	}

	public void eat() {
		System.out.println("Me is hamster and I'm eating...");
	}

	public String getName() {
		return "Me is Hamster :-)";
	}
}

public class ExEight007 {

	public static void main(String[] args) {

		Rodent88[] rodents88 = { new Mouse88(), new Hamster88(), new Gerbil88() };

		rodents88[0].eat();
		rodents88[1].drink();
		System.out.println(rodents88[2].getName());
	}

}
