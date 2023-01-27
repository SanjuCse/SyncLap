package co.newtonschool;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashTvsHashM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable<Integer, String> ht = new Hashtable<Integer, String>();
		ht.put(1, "A");
		ht.put(2, "B");
		ht.put(3, "C");
		ht.put(4, "D");
		ht.put(5, "E");
		System.out.println("-------------Hash table------------");
		for (Entry<Integer, String> entry : ht.entrySet()) {
			Integer key = entry.getKey();
			String val = entry.getValue();
			System.out.println(key + ":" + val);

		}

		HashMap<Integer, String> hm = new HashMap<>();
		hm.put(0, "P");
		hm.put(7, "U");
		hm.put(6, "Y");
		hm.put(9, "O");
		hm.put(8, "I");

		System.out.println("-------------Hash Map------------");
		for (Map.Entry<Integer, String> entry : hm.entrySet()) {
			Integer key = entry.getKey();
			String val = entry.getValue();
			System.out.println(key + ":" + val);
		}
		Set<Integer> keySet = hm.keySet();
		System.out.println("-------------KeySet--------------");
		System.out.println(keySet);
		Iterator<Integer> i = keySet.iterator();
		System.out.println("-------------iterator------------");
		while (i.hasNext()) {
//			Integer integer = (Integer) i.next();
			
			System.out.println(hm.get(i.next()));
		}
	}

}
