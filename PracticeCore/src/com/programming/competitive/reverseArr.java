package com.programming.competitive;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class reverseArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> AL = new ArrayList<Integer>();
		AL.add(1);
		AL.add(2);
		AL.add(3);
		AL.add(4);
		AL.add(5);

		Iterator<Integer> i = AL.iterator();
		while (i.hasNext()) {
			Integer integer = (Integer) i.next();
			System.out.println(integer);
		}
		Collections.reverse(AL);

	}

}
