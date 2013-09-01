package com.shumz.think.ex008;

abstract class Rodent {

	abstract void drink();

	// {
	// System.out.println("Me is rodent and I'm drinking...");
	// }

	abstract void eat();

	// {
	// System.out.println("Me is rodent and I'm eating...");
	// }

	abstract String getName();
	// {
	// return "Me is Rodent :-)";
	// }
}

class Mouse extends Rodent {
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

class Gerbil extends Rodent {
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

class Hamster extends Rodent {
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

public class ExEight001 {

	public static void main(String[] args) {

		// Rodent r = new Rodent();
		// Mouse m = new Rodent();
		// Gerbil g = (Gerbil) new Rodent();
		// Hamster h = new Rodent();

		Rodent[] rodents = { new Mouse(), new Hamster(), new Gerbil() };

		rodents[0].eat();
		rodents[1].drink();
		System.out.println(rodents[2].getName());

	}
}
