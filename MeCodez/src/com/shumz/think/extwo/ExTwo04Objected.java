package com.shumz.think.extwo;

public class ExTwo04Objected {

	public static void main(String[] args) {

		float distance;
		float time;
		float velocity;

		Cart cart = new Cart();

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

		cart.setCartDistance(distance);
		cart.setCartTime(time);
		// cart.calculateCartVelocity(cart.getCartDistance(),
		// cart.getCartTime());

		System.out.println();
		System.out.println("Distance is: " + distance);
		System.out.println("Time is: " + time);

		System.out.println();

		if (cart.getCartTime() < 0.0F) {
			System.out.println("Are you faster than light, huh!..");
		} else if (cart.getCartTime() == 0.0F) {
			System.out.println("Move your ass, bastard!..");
		} else {
			cart.calculateCartVelocity(cart.getCartDistance(),
					cart.getCartTime());
			velocity = cart.getCartVelocity();
			System.out.println("Your velocity is :" + velocity + " km/h...");
		}

		System.out.println();
	}
}

class Cart {
	float cartDistance;
	float cartTime;
	float cartVelocity;

	void setCartDistance(float cd) {
		cartDistance = cd;
	}

	float getCartDistance() {
		return cartDistance;
	}

	void setCartTime(float ct) {
		cartTime = ct;
	}

	float getCartTime() {
		return cartTime;
	}

	void setCartVelocity(float cd) {
		cartVelocity = cd;
	}

	float getCartVelocity() {
		return cartVelocity;
	}

	float calculateCartVelocity(float cd, float ct) {
		cartVelocity = cd / ct;
		return cartVelocity;
	}

}