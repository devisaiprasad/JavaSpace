package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StringArrayHighestElement {

	public static String getHighestElement(String[] arr, int total) {
		
		  /*Array to ArrayList conversion*/
		List<String> list= new ArrayList<String>(Arrays.asList(arr));
		  
		  List<String> list1= Arrays.asList(arr);
		  
		  Collections.sort(list);	
		
		int len = list.size();

		String element=list.get(len-total);
		return element;
	}

	public static void main(String[] args) {
		/* Array Declaration and initialization*/
		  String citynames[]={"Agra", "Mysore", "Chandigarh", "Bhopal"};
		  
		  
		System.out.println(getHighestElement(citynames,2));

	}

}
