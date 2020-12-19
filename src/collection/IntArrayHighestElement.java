package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class IntArrayHighestElement {

	public static int getHighestElement(int[] arr, int total) {
		
		  /*Array to ArrayList conversion*/
		  List<Integer> list= new ArrayList<Integer>();

		  for (int a : arr) {
		      list.add(a);
		  }
		  Collections.sort(list);	
		
		int len = list.size();

		int element=list.get(len-total);
		return element;
	}

	public static void main(String[] args) {
		/* Array Declaration and initialization*/
		  int arrInt[]={4,6,2,7,8,1};
		  
		  
		System.out.println(getHighestElement(arrInt,2));

	}

}
