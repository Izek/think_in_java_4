package com.shumz.think.ex001;

public class ExOne09 {

	static boolean bool = false;
	static char c = 'x';
	static byte b = 57;
	static short s = 342;
	static int i = 234;
	static long l = 200000;
	static float f = 3245235.23F;
	static double d = 32523.34D;

	public static void main(String[] args) {

		System.out.println("'bool' is: " + bool);
		System.out.println("'c' is: " + c);
		System.out.println("'b' is: " + b);
		System.out.println("'s' is: " + s);
		System.out.println("'i' is: " + i);
		System.out.println("'l' is: " + l);
		System.out.println("'f' is: " + f);
		System.out.println("'d' is: " + d);

		System.out.println();
		System.out.println();

		Boolean Bool = new Boolean(bool);
		Character Ch = new Character(c);
		Byte By = new Byte(b);
		Short Sh = new Short(s);
		Integer In = new Integer(i);
		Long Lo = new Long(l);
		Float Fl = new Float(f);
		Double Do = new Double(d);

		System.out.println("'Bool' is: " + Bool);
		System.out.println("'Ch' is: " + Ch);
		System.out.println("'By' is: " + By);
		System.out.println("'Sh' is: " + Sh);
		System.out.println("'In' is: " + In);
		System.out.println("'Lo' is: " + Lo);
		System.out.println("'Fl' is: " + Fl);
		System.out.println("'Do' is: " + Do);

	}

}
