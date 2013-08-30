package com.shumz.think.ex007;

class SharedEx14 {
	private int ref_count = 0;
	private static long counter = 0;
	private final long id = counter++;

	public SharedEx14() {
		System.out.println("Creating " + this);
	}

	public SharedEx14(String s) {
		System.out.println("Creating " + this);
	}

	public void addRef() {
		ref_count++;
	}

	protected void dispose() {
		if (--ref_count == 0)
			System.out.println("Disposing " + this);
	}

	public String toString() {
		return "SaredEx14 " + id;
	}

}

class Feeding14 {

	private String s;

	Feeding14(String s) {
		this.s = s;
		System.out.println(s + " is now starting to eat...");
	}

	protected void dispose() {
		System.out.println(s + " has finished to eat...");
	}
}

class Growing14 {

	private String s;

	public Growing14(String s) {
		this.s = s;
		System.out.println(s + " is getting bigger...");
	}

	protected void dispose() {
		System.out.println(s + " is adult now...");
	}
}

class Replicating14 {

	private String s;

	Replicating14(String s) {
		this.s = s;
		System.out.println(s + " is making new " + s + "(e)s...");
	}

	public void dispose() {
		System.out.println(s + " is empty and very tired...");
	}

}

class Rodent14 {

	protected String s = "Rodent12";

	private Feeding food = new Feeding(s);
	private Growing grove = new Growing(s);
	private Replicating replication = new Replicating(s);

	Rodent14() {
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

class Mouse14 extends Rodent12 {

	protected String s = "Mouse12";

	private Feeding food = new Feeding(s);
	private Growing grove = new Growing(s);
	private Replicating replication = new Replicating(s);

	public Mouse14() {
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

class Gerbil14 extends Rodent12 {
	protected String s = "Gerbil12";

	private Feeding food = new Feeding(s);
	private Growing grove = new Growing(s);
	private Replicating replication = new Replicating(s);

	Gerbil14() {
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

class Hamster14 extends Rodent12 {

	protected String s = "Hamster12";

	private Feeding food = new Feeding(s);
	private Growing grove = new Growing(s);
	private Replicating replication = new Replicating(s);

	Hamster14() {
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

public class ExSeven014 {

	public static void main(String[] args) {

		Rodent14 r14 = new Rodent14();
		System.out.println(r14.getName());
		r14.dispose();

		System.out.println();
		System.out.println();

		Mouse14 m14 = new Mouse14();
		System.out.println(m14);
		m14.dispose();

		System.out.println();
		System.out.println();

		Gerbil14 g14 = new Gerbil14();
		System.out.println(g14.getName());
		g14.dispose();

		System.out.println();
		System.out.println();

		Hamster14 h14 = new Hamster14();
		System.out.println(h14.getName());
		h14.dispose();
	}
}
