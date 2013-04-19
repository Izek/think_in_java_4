package com.shumz.think.extwo;

public class ExTwo04 {

	public static void main(String[] args) {

		float distance;
		float time;
		float velocity;

		if (args.length != 0) {

			if ((args.length < 2) || (args.length > 2)) {
				distance = 250.0F;
				time = 3.5F;
			} else {
				distance = Float.valueOf(args[0]);
				time = Float.valueOf(args[1]);
			}
		} else {
			distance = 100F;
			time = 10F;
		}

		System.out.println();
		System.out.println("Distance is: " + distance);
		System.out.println("Time is: " + time);

		System.out.println();

		if (time < 0.0F) {
			System.out.println("Are you faster than light, huh!..");
		} else if (time == 0.0F) {
			System.out.println("Move your ass, bastard!..");
		} else {
			velocity = distance / time;
			System.out.println("Your velocity is :" + velocity + " km/h...");
		}

		System.out.println();
	}
}
