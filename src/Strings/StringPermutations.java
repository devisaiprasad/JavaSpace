package Strings;

import java.util.ArrayList;
import java.util.List;

public class StringPermutations {

	public List<String> getPermutations(String input) {

		List<String> strList = new ArrayList<String>();
		permutations("", input, strList);
		return strList;
	}

	public void permutations(String consChars, String input, List<String> list) {

		if (input.isEmpty()) {
			list.add(consChars + input);
			// return;
			//System.out.println(list);
		}

		for (int i = 0; i < input.length(); i++) {
			permutations(consChars + input.charAt(i), input.substring(0, i) + input.substring(i + 1), list);
			System.out.println(i+" - "+list);
		}
	}

	public static void main(String[] args) {
		StringPermutations permutations = new StringPermutations();

		List<String> output = permutations.getPermutations("abc");
		System.out.println("Result size: " + output.size());
		output.stream().forEach(System.out::println);

	}

}
