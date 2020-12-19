package map;

import java.util.LinkedHashMap;

// LinkedHashMap maintains insertion order

public class LinkedHashMapNullValues {

	public static void main(String[] args) {
		
		LinkedHashMap<Integer,String> hs = new LinkedHashMap<Integer,String>();
		
		hs.put(1, "Jan");
		hs.put(2, "Feb");
		hs.put(3, "Mar");
		hs.put(4, "Apr");
		hs.put(5, "May");
		hs.put(null, "Jun");
		hs.put(null, "Jul"); 
		hs.put(7, null);
		hs.put(8, null);
		hs.put(null, null);
		
		System.out.println(hs);
		
		System.out.println("---------------------------");
		
		LinkedHashMap<Integer,String> hs1 = new LinkedHashMap<Integer,String>();
		hs1.put(1, "Run");
		hs1.put(2, "Fun");
		hs1.put(3, "Bun");
		hs1.put(4, "Gun");
		hs1.put(5, "Sun");
		
		
		
		

	}

}
