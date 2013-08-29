package com.shumz.think.ex007;

class Feeding {

	private String s;

	Feeding(String s) {
		this.s = s;
		System.out.println(s + " is now starting to eat...");
	}

	protected void dispose() {
		System.out.println(s + " has finished to eat...");
	}
}

class Growing {

	private String s;

	public Growing(String s) {
		this.s = s;
		System.out.println(s + " is getting bigger...");
	}

	protected void dispose() {
		System.out.println(s + " is adult now...");
	}
}

class Replicating {

	private String s;

	Replicating(String s) {
		this.s = s;
		System.out.println(s + " is making new " + s + "(e)s...");
	}

	public void dispose() {
		System.out.println(s + " is empty and very tired...");
	}

}

class Rodent12 {

	protected String s = "Rodent12";

	private Feeding food = new Feeding(s);
	private Growing grove = new Growing(s);
	private Replicating replication = new Replicating(s);

	Rodent12() {
		System.out.println("Hi, the rodent12's name is: " + s);
	}

	public void dispose() {
		System.out.println(s + " is DEAD now");

		replication.dispose();
		grove.dispose();
		food.dispose();
	}

	public void drink() {
		System.out.println("Me is rodent and I'm drinking...");
	}

	public void eat() {
		System.out.println("Me is rodent and I'm eating...");
	}

	public String getName() {
		return "Me is Rodent :-)";
	}
}

class Mouse12 extends Rodent12 {

	protected String s = "Mouse12";

	private Feeding food = new Feeding(s);
	private Growing grove = new Growing(s);
	private Replicating replication = new Replicating(s);

	public Mouse12() {
		System.out.println("Hi, the mouse12's name is: " + s);
	}

	public void dispose() {
		System.out.println(s + " is DEAD now");

		replication.dispose();
		grove.dispose();
		food.dispose();

		super.dispose();
	}

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

class Gerbil12 extends Rodent12 {
	protected String s = "Gerbil12";

	private Feeding food = new Feeding(s);
	private Growing grove = new Growing(s);
	private Replicating replication = new Replicating(s);

	Gerbil12() {
		System.out.println("Hi, the gerbil12's name is: " + s);
	}

	public void dispose() {
		System.out.println(s + " is DEAD now");

		replication.dispose();
		grove.dispose();
		food.dispose();

		super.dispose();
	}

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

class Hamster12 extends Rodent12 {

	protected String s = "Hamster12";

	private Feeding food = new Feeding(s);
	private Growing grove = new Growing(s);
	private Replicating replication = new Replicating(s);

	Hamster12() {
		System.out.println("Hi, the hamster12's name is: " + s);
	}

	public void dispose() {
		System.out.println(s + " is DEAD now");

		replication.dispose();
		grove.dispose();
		food.dispose();

		super.dispose();
	}

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

public class ExSeven012 {

	public static void main(String[] args) {

		Rodent12 r12 = new Rodent12();
		System.out.println(r12.getName());
		r12.dispose();

		System.out.println();
		System.out.println();

		Mouse12 m12 = new Mouse12();
		System.out.println(m12);
		m12.dispose();

		System.out.println();
		System.out.println();

		Gerbil12 g12 = new Gerbil12();
		System.out.println(g12.getName());
		g12.dispose();

		System.out.println();
		System.out.println();

		Hamster12 h12 = new Hamster12();
		System.out.println(h12.getName());
		h12.dispose();
	}
}
