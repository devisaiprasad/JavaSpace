package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ArrayListToArray {

	public static int[] convertList(ArrayList<Integer> listVal) {
		int[] arr = new int[listVal.size()];
		for (int i = 0; i < listVal.size(); i++) {
			arr[i] = listVal.get(i);
		}
		return arr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(60);
		list.add(20);
		list.add(70);
		list.add(10);
		list.add(90);

		for (int i : convertList(list)) {
			System.out.println(i);
		}

		System.out.println("-------------------------");

		List<String> slist = new LinkedList<String>();
		slist.add("Geeks");
		slist.add("for");
		slist.add("Geeks");
		slist.add("Practice");

		String[] arr = new String[slist.size()];

		// ArrayList to Array Conversion
		for (int i = 0; i < slist.size(); i++)
			arr[i] = slist.get(i);

		for (String x : arr)
			System.out.println(x + " ");

	
	
	System.out.println("-------------------------");

	List<Integer> ilist = new LinkedList<Integer>();
	ilist.add(1);
	ilist.add(2);
	ilist.add(3);
	ilist.add(4);

	int[] iarr = new int[ilist.size()];

	// ArrayList to Array Conversion
	for (int i = 0; i < ilist.size(); i++)
		iarr[i] = ilist.get(i);

	for (int x : iarr)
		System.out.println(x);
	
	
	System.out.println("-------------------------");
	List<String> l = new LinkedList<String>(); 
    l.add("Geeks"); 
    l.add("for"); 
    l.add("Geeks"); 
    l.add("Practice"); 

    String[] arr1 = l.stream().toArray(String[] ::new); 
    for (String x : arr1) 
        System.out.print(x + " "); 
	
}

}
