package co.newtonschool;

import java.util.Enumeration;
import java.util.Hashtable;

public class HashTable {
	public static void main(String args[]) {
		Hashtable<Integer, String> ht1 = new Hashtable<Integer, String>();
		ht1.put(4, "santosh");
		ht1.put(3, "susanta");
		ht1.put(1, "sanju");
		ht1.put(2, "sanjukta");

		System.out.println(ht1.get(2));
		System.out.println(ht1);
		ht1.put(3, "pappu");
		System.out.println(ht1);
		System.out.println(ht1.keys());
//		Enumeration<Integer> e = ht1.keys();
//		while (e.hasMoreElements()) {
//			Integer key = (Integer) e.nextElement();
//			System.out.println(key + ":" + ht1.get(key));
//		}
		
		ht1.forEach((key, value)->System.out.println(key+":"+value));
	}
}
