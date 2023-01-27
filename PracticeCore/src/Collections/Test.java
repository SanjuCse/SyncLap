package Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class Test {
	public static void main(String args[]) {
		ArrayList<String> l1 = new ArrayList<String>();
		l1.add("SANJU");
		l1.add("SANJAYA");
		l1.add("SAHU");

		Iterator<String> iterator = l1.iterator();
		while (iterator.hasNext())
			System.out.println(iterator.next());

		iterator.remove();
		while (iterator.hasNext())
			System.out.println(iterator.next());

	}
}
