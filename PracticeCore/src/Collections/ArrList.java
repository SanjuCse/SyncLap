package Collections;

import java.util.ArrayList;

public class ArrList {

	public static void main(String Args[]) {
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("MANGO");
		arrayList.add("BANANA");
		arrayList.add("GRAPES");
		arrayList.add("ORANGE");
		arrayList.add("APPLE");

		ArrList AL = new ArrList();
		AL.displayList(arrayList);
		System.out.println("*********************");
		arrayList.remove(0);
		arrayList.remove("BANANA");
		System.out.println(arrayList);
		System.out.println("*********************");
		AL.displayList(arrayList);
	}

//	void removeNameByPosition(int position) {
//		arrayList.remove(position);
//	}
//
//	void removeNameByString(String name) {
//
//	}

	void displayList(ArrayList<String> names) {
		for (String name : names) {
			System.out.println(name);
		}
	}

}
