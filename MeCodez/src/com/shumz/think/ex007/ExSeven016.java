package com.shumz.think.ex007;

class AlertStatus {

	public void indicateStatus() {
		System.out.println("Alert Status indicator testing...");
	}
}

class AlertStatusON extends AlertStatus {

	public void indicateStatus() {
		System.out.println("Alert is: ON!..");
	}
}

class AlertStatusOFF extends AlertStatus {

	public void indicateStatus() {
		System.out.println("Alert is: OFF!..");
	}
}

class AlertStatusUNKNOWN extends AlertStatus {

	public void indicateStatus() {
		System.out.println("Alert is: Unknown...");
	}
}

class Starship {
	public Starship() {
		System.out.println("Starship initialization...");
		System.out.println();
	}

	private AlertStatus alert_state = new AlertStatus();

	public void reportStatus() {
		alert_state.indicateStatus();
	}

	public void turnAlertON() {
		alert_state = new AlertStatusON();
	}

	public void turnAlertOFF() {
		alert_state = new AlertStatusOFF();
	}

	public void turnAlertUnknown() {
		alert_state = new AlertStatusUNKNOWN();
	}
}

public class ExSeven016 {

	public static void main(String[] args) {

		Starship galaxy = new Starship();
		galaxy.reportStatus();

		galaxy.turnAlertON();
		galaxy.reportStatus();

		galaxy.turnAlertOFF();
		galaxy.reportStatus();

		galaxy.turnAlertUnknown();
		galaxy.reportStatus();

		System.gc();
	}
}
