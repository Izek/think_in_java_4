package com.shumz.think.ex008.ExEight005.p2;

import com.shumz.think.ex008.ExEight005.p1.ExEight005PartOne;

public class ExEight005PartTwo implements ExEight005PartOne {

	
	public void f1() {
		System.out.println("Function f1() was called...");
	}

	
	public void f2() {
		System.out.println("Function f2() was called...");
	}

	
	public void f3() {
		System.out.println("Function f3() was called...");
	}

	public static void main(String[] args) {
		ExEight005PartTwo ex_p2 = new ExEight005PartTwo();

		ex_p2.f1();
		ex_p2.f2();
		ex_p2.f3();
	}

}
