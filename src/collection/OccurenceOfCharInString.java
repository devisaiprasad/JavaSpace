package collection;

import java.util.HashMap;
import java.util.Map;

public class OccurenceOfCharInString {

	public static void characterCount(String input) {
		// Creating a HashMap containing char
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		char[] chArray = input.toCharArray();

		for (char c : chArray) {
			//System.out.println("### :"+charMap.get(c));
			if (hm.containsKey(c)) {
				hm.put(c, hm.get(c) + 1);
			} else {
				hm.put(c, 1);
			}
		}

		// Printing the charCountMap
		for (Map.Entry<Character, Integer> entry : hm.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
	}

	public static void main(String[] args){

		String str = "prasad";
		characterCount(str);

	}

}
