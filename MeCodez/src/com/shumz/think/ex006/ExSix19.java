package com.shumz.think.ex006;

public class ExSix19 {

	private final int i = 0;
	private final int j;
	private final BlankFinalsContainerClass bfcci;

	public ExSix19() {
		j = 10;
		bfcci = new BlankFinalsContainerClass(15);

	}

	public ExSix19(int i) {
		j = i;
		bfcci = new BlankFinalsContainerClass(i);

	}

	public static void main(String[] args) {
		new ExSix19();
		new ExSix19(50);
	}
}

class BlankFinalsContainerClass {
	private int i;

	public BlankFinalsContainerClass(int ii) {
		i = ii;
	}
}