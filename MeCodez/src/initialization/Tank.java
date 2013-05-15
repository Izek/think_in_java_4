package initialization;

public class Tank {

	static int counter = 0;
	int tankID = 0;

	boolean disposable = false;

	static final int MAX_VOLUME = 1000;
	int volume = 0;

	Tank(int vol) {
		counter++;
		tankID = counter;

		if (vol > MAX_VOLUME) {
			System.out.println("Warning!!! The tank is overfilled!...");
			volume = MAX_VOLUME;
		} else if (vol < 0) {
			System.out
					.println("Warning!!! The tank cannot get negative ammount of oil!..");
			volume = 0;
		} else {
			System.out.println("The tank was created with " + vol
					+ "l of oil...");
			volume = vol;
		}

	}

	Tank() {
		counter++;
		tankID = counter;
		System.out.println("An empty tank was created...");
		volume = 0;
	}

	void fillTank(int vol) {
		if ((vol + volume) <= MAX_VOLUME) {
			volume = +vol;
		} else {
			System.out.println("Warning!!! The tank is overfilled!...");
			volume = MAX_VOLUME;
		}
	}

	void emptyTank() {
		System.out.println("Tank was emptied...");
		volume = 0;
		disposable = true;
	}

	void emptyTank(int vol) {

		if ((volume - vol) >= 0) {
			volume = volume - vol;
			System.out.println("Volume of tank was decreased to: " + volume);
		} else {
			System.out.println("Warning!!! The tank is overfilled!...");
			volume = MAX_VOLUME;
		}
		System.out.println("Tank was emptied...");
		volume = 0;
	}

	int getTankVol() {
		return volume;
	}

	int getTankID() {
		return tankID;
	}

	protected void finalize(boolean dispose) throws Throwable {

		if (dispose) {
			System.out.println("The tank will be disposed");
			super.finalize();
		} else {
			if (volume != 0) {
				System.out.println("Tank with ID: " + this.getTankID()
						+ " has " + this.getTankVol() + "l. of oil...");
				System.out.println("Impossible to dispose non-empty tank!...");

			} else {
				System.out.println("The empty tank with ID: " + this.tankID
						+ "will be disposed...");
				super.finalize();
			}
		}
	}

	public static void main(String[] args) throws Throwable {
		Tank t1 = new Tank();
		Tank t2 = new Tank(0);
		Tank t3 = new Tank(400);
		Tank t4 = new Tank(800);
		Tank t5 = new Tank(2500);
		Tank t6 = new Tank(-5000);
		Tank t7 = new Tank(1000);

		System.out.println("Tank with ID: " + t1.getTankID() + " has "
				+ t1.getTankVol() + "l. of oil...");
		t1.fillTank(500);
		System.out.println("Tank with ID: " + t1.getTankID() + " has "
				+ t1.getTankVol() + "l. of oil...");

		System.out.println("Tank with ID: " + t2.getTankID() + " has "
				+ t2.getTankVol() + "l. of oil...");
		t2.fillTank(1500);
		System.out.println("Tank with ID: " + t2.getTankID() + " has "
				+ t2.getTankVol() + "l. of oil...");

		t3.fillTank(500);
		System.out.println("Tank with ID: " + t3.getTankID() + " has "
				+ t3.getTankVol() + "l. of oil...");

		t4.fillTank(MAX_VOLUME);
		System.out.println("Tank with ID: " + t4.getTankID() + " has "
				+ t4.getTankVol() + "l. of oil...");

		t5.finalize(t5.disposable);
		System.out.println("Tank with ID: " + t5.getTankID() + " has "
				+ t5.getTankVol() + "l. of oil...");

		t6.finalize(true);

		t7.emptyTank();
		t7.finalize(t7.disposable);

		System.gc();

		System.exit(0);
	}

}
