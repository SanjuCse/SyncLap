package Collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class StartCode {
	public static void main(String[] args) {
		System.out.println("Collections Framework");

		ArrayList<String> names = new ArrayList<String>();
		names.add("sanju");
		names.add("pappu");
		names.add("dipu");
		names.add("kanhu");
		names.add("sanju");

		System.out.println("before removal " + names);
		System.out.println("lenght of names arraylist: " + names.size());
		names.remove(names.size()-1);
		
		System.out.println("after removal " + names);
		System.out.println("is list contains name: \"sanju\" "+names.contains("sanju"));
		names.add(1, "susanta");
		System.out.println("after strting index value to 1 " +names);
		System.out.println(names.hashCode());
//		LinkedList list = new LinkedList();
//		list.add("sanju");
//		list.add(13);
//		list.add(true);
//		System.out.println(list);
//		
	}
}
