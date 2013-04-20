package com.shumz.think.ex002;

public class ExTwo02 {

	public static void main(String[] args) {

		FloatDemo fd1 = new FloatDemo();
		FloatDemo fd2 = new FloatDemo();

		fd1.floatValue = 23.43F;
		fd2.floatValue = 34.43F;

		System.out.println(fd1.floatValue);
		System.out.println(fd2.floatValue);

		fd2 = fd1;

		System.out.println(fd1.floatValue);
		System.out.println(fd2.floatValue);

		fd1.floatValue = 34.1111F;

		System.out.println(fd1.floatValue);
		System.out.println(fd2.floatValue);
	}
}

class FloatDemo {
	float floatValue;
}