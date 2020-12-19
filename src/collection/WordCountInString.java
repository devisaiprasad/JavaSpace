package collection;

import java.util.HashMap;
import java.util.Map;

public class WordCountInString {
	
	static void characterCount(String sentence) {
		// Creating a HashMap containing char
		HashMap<String, Integer> hm = new HashMap<String, Integer>();

		// Converting given string to char array
		String[] strArray = sentence.split(" "); 

		// checking each char of strArray
		for (String s : strArray) {
			//System.out.println("### :"+charMap.get(c));
			if (hm.containsKey(s)) {
				hm.put(s, hm.get(s) + 1);
			} else {
				hm.put(s, 1);
			}
		}

		// Printing the charCountMap
		for (Map.Entry<String, Integer> entry : hm.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
	}

	public static void main(String[] args) {
		String str = "devi prasad is devi sai prasad";
		characterCount(str);

	}

}
