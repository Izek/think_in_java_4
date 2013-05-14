package com.shumz.think.ex004;

public class ExFour10 {

	static int coumter = 0;
	int defNumber = 0;

	public ExFour10() {
		coumter++;
		defNumber = coumter;
	}

	void creationMessage() {
		System.out.println("Object " + defNumber + " was created...");
	}

	protected void finalize(int dn) {
		if (dn == defNumber) {
			System.out.println("finalize() methos was called for object "
					+ defNumber + "...");
		}
	}

	public static void main(String[] args) {
		ExFour10 ex10 = new ExFour10();

		ex10.creationMessage();

		for (int i = 0; i < 9; i++) {
			new ExFour10().creationMessage();

		}
		for (int j = 0; j < 10; j++) {
			ex10.finalize(j);
		}

		System.gc();
		System.out.println("GC was calles explicitly..");
	}

}
