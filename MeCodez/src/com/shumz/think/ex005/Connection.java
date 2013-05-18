package com.shumz.think.ex005;

import java.util.Random;

class Connection {

	Random linker = new Random();
	static int obj_counter = 0;

	private Connection() {
		obj_counter++;

		System.out.println(obj_counter + ".) "
				+ "connection were established. Connection's speed: "
				+ linker.nextInt(100) + "kb/s");
	}

	public static Connection createConnection() {
		if (obj_counter < 11) {
			return new Connection();
		} else {
			return null;
		}
	}
}
