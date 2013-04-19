package com.shumz.think.extwo;


class smallFloat {
	Float smallF;
}

public class ExTwo03 {

	static void assignFloatFunction(smallFloat f) {
		f.smallF = 40.0F;
	}

	public static void main(String[] args) {

		smallFloat f1 = new smallFloat();

		f1.smallF = 13.0F;
		System.out.println(f1.smallF);
		System.out.println();

		assignFloatFunction(f1);
		System.out.println(f1.smallF);
	}

}

