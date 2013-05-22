package com.shumz.think.ex006;

import reusing.ExSix15SomeBaseClass;

public class ExSix15 {

	public static void main(String[] args) {

		ExSix15SomeBaseClass ex_base = new ExSix15SomeBaseClass();

		ex_base.sayHelloPublic();
		// ex_base.sayHelloPrivate()
		// ex_base.sayHelloProtected();

		ExSix15SomeDerivedClass ex_deriv = new ExSix15SomeDerivedClass();

		ex_deriv.sayHelloPublic();
		// ex_deriv.sayHelloProtected();
		ex_deriv.sayHelloTesting();
	}
}

class ExSix15SomeDerivedClass extends ExSix15SomeBaseClass {

	public ExSix15SomeDerivedClass() {
		System.out.println();
	}

	void sayHelloTesting() {
		sayHelloProtected();

	}

}