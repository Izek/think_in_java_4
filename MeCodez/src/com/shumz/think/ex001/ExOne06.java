package com.shumz.think.ex001;

public class ExOne06 {

	public static void main(String[] args) {
		int x = storage("abcde");
		
		System.out.println("abcde");
		System.out.print(x);
		
	}

	static int storage(String s) {
		return (s.length() * 2);
	}
}
