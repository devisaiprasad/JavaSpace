package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

// HashMap contains values based on the key
// HashMap may have one null key and multiple null values.
// HashMap is non synchronized.
// HashMap maintains no order.
// No Duplicate Key on HashMap, if you try to insert the duplicate key, it will replace the element of the corresponding key

public class HashMapNullValues {

	public static void main(String[] args) {

		HashMap<Integer, String> hs = new HashMap<Integer, String>();

		hs.put(1, "Jan");
		hs.put(2, "Feb");
		hs.put(3, "Mar");
		hs.put(4, "Apr");
		hs.put(5, "May");
		hs.put(null, "Jun");
		hs.put(null, "Jul");
		hs.put(7, null);
		hs.put(8, null);
		hs.put(null, "test");
		

		System.out.println(hs.get(null));
		System.out.println(hs);
		System.out.println("---------------------------------------");

		HashMap<Integer, String> map = new HashMap<Integer, String>();

		map.put(1, "Mango"); // Put elements in Map
		map.put(2, "Apple");
		map.put(3, "Banana");
		map.put(4, "Grapes");

		System.out.println("Iterating Hashmap...");

		for (Map.Entry<Integer, String> m : map.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}

		System.out.println("--------------- print keys------------------------");

		Iterator<Integer> it = map.keySet().iterator();
		while (it.hasNext()) {
			int k = it.next();
			System.out.println(k);
			// System.out.println(map.get(k));

		}

		System.out.println("--------------- print values------------------------");

		Iterator<String> it1 = map.values().iterator();
		while (it1.hasNext()) {
			String v = it1.next();
			System.out.println(v);
			// System.out.println(map.get(v));

		}

	}

}
