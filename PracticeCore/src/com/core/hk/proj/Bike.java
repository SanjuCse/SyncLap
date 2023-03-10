package com.core.hk.proj;

import java.util.Scanner;

public class Bike {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try {
			while (true) {
				Gear gear = new Gear();
				System.out.println("Enter Gear number");
				int bikeGear = scanner.nextInt();
				gear.setGear(bikeGear);
				gear.getGearStatus();
			}

		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
			scanner.nextLine();

		}
	}
}
