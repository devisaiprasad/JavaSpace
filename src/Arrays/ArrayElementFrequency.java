package Arrays;

import java.util.HashMap;
import java.util.Iterator;

public class ArrayElementFrequency {

	public static void getFrequency(int[] arr) {
		
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();

		for (int a : arr) {

			if (hm.containsKey(a)) {
				hm.put(a, hm.get(a) + 1);
			} else {
				hm.put(a, 1);
			}

		}

		System.out.println(hm);

		Iterator<Integer> it = hm.keySet().iterator();
		while (it.hasNext()) {
			int k = it.next();
			if (hm.get(k) > 1) {
				System.out.println(k + " -> " + hm.get(k));
			}

		}

	}

	public static void main(String[] args) {
		int[] array = { 1, 1, 5, 5, 10, 7 };

		getFrequency(array);

	}

}
