package com.shumz.think.extwo;

public class ExTwo05 {

	public static void main(String[] args) {

		Dog dog1 = new Dog();
		Dog dog2 = new Dog();

		dog1.name = "spot";
		dog1.says = "Ruff!";

		dog2.name = "scruffy";
		dog2.says = "Wurf!";

		System.out.println(dog1.name + " says: " + dog1.says);
		System.out.println(dog2.name + " says: " + dog2.says);

	}

}

class Dog {
	String name;
	String says;
}