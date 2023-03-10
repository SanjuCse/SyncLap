package com.core.hk.proj;

import java.util.Arrays;
import java.util.Scanner;

public class Voter {
	private int age;
	private String name;

	void setAge(int age) throws IllegalArgumentException {

		if (age < 18) {
			throw new IllegalArgumentException("You are child, not Eligible");
		} else if (age > 120) {
			throw new IllegalArgumentException("You are old, not Eligible");
		} else {
			this.age = age;

		}
	}

	void setName(String name) {
		if (name == "") {
			throw new IllegalArgumentException("name can not be empty");
		}
		if (isNameContainsNumber(name)) {
			throw new IllegalArgumentException("Name can not contains any number, re-type again");
		} else {
			this.name = name;
		}
	}

	boolean isNameContainsNumber(String name) {
		char[] chars = name.toCharArray();
		if (name.length() == 0) {
			return false;
		}
		while (chars.length > 0) {
			for (int index = 0; index < chars.length; index++) {
				int c = chars[index];
				if ((c >= 48) && (c <= 57)) {
					return true;
				}
			}
			return false;
		}
		return false;
	}

	void getStatus() throws IllegalArgumentException {
		boolean noData = (age == 0) && (name == null);

		if (noData) {
			throw new IllegalArgumentException("both name & age is not provided");
		}
		if (name == null) {
			throw new IllegalArgumentException("You are not Provided name, set it using setName Method");
		}
		if (age == 0) {
			throw new IllegalArgumentException("You are not Provided age, set it using setAge Method");
		}

		else {
			if (age >= 18 && age < 120) {
				System.out.println(name + " Your voter application is proceded, will be delivered soon");
			} else {
				System.out.println("Your voter application is not procedded");
			}
		}
//		System.out.println(name + " Your voter application is proceded, will be delivered soon");
	}
}