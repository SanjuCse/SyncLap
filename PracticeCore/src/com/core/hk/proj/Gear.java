package com.core.hk.proj;

public class Gear {
	private static int gear;

	public void getGearStatus() {
		if (gear == 0) {
			System.out.println("Bike is on neutral");
		} else {
			System.out.println("Bike is on gear number: " + gear);
		}
	}

	public void setGear(int gear) {
		if (gear == 0) {
			throw new IllegalArgumentException("gear can't set to zero, set gear above 0");
		} else if ((gear > 0) && (gear < 5)) {
			boolean isGearChangePossible = ((this.gear + 1) == gear) || ((this.gear - 1) == gear);
			if (isGearChangePossible) {
				System.out.println("Gear changed from " + this.gear + " to " + gear);
				this.gear = gear;
			} else if (this.gear == gear) {
				System.out.println("Your bike is running " + gear + " Gear only");
			} else {
				throw new IllegalArgumentException("Gear can not directly changed from " + this.gear + " to " + gear);
			}
		} else if (gear < 0) {
			System.out.println("gear can not be negetive");
		} else {
			System.out.println("Gear can not be exceeds more than 4");
		}
		System.out.println("==========================================");
	}
}
