package collection;
//we are sorting HashMap by values using Comparator.

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapSortingValues {

	public static HashMap<String, Integer> sortByValue(Map<String, Integer> map) {
		// convert HashMap into List
		List<Entry<String, Integer>> list = new LinkedList<Entry<String, Integer>>(map.entrySet());
		
		System.out.println(list);

		// Sort the list
		Collections.sort(list, new Comparator<Entry<String, Integer>>() {
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
				return (o1.getValue()).compareTo(o2.getValue());
			}
		});

		// put data from sorted list to hashmap
		HashMap<String, Integer> temp = new LinkedHashMap<String, Integer>();
		for (
				
				Entry<String, Integer> aa : list) {
			temp.put(aa.getKey(), aa.getValue());
		}

		return temp;

	}

	public static void main(String[] args) {
		HashMap<String, Integer> hm = new HashMap<String, Integer>();

		// enter data into hashmap
		hm.put("Math", 98);
		hm.put("Data Structure", 85);
		hm.put("Database", 91);
		hm.put("Java", 95);
		hm.put("Operating System", 79);
		hm.put("Networking", 80);

		Map<String, Integer> hm1 = sortByValue(hm);

		// print the sorted hashmap
		for (Entry<String, Integer> en : hm1.entrySet()) {
			System.out.println(en.getKey() + "\t" + en.getValue());
		}

	}

}
