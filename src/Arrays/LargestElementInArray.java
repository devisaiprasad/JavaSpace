package Arrays;

import java.util.Arrays;

public class LargestElementInArray {
	// java.util.Arrays class -> sort() method
	public static int getHighestValue(int[] arr, int index) {

		int len = arr.length;
		Arrays.sort(arr);
		
		return arr[len - index];
	}

	public static void main(String[] args) {

		int[] arr = { 13, 7, 6, 45, 21, 9, 101, 102 };
		int val = getHighestValue(arr, 2);
		System.out.println(val);
	}

}
