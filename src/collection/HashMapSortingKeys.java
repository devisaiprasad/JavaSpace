package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

// HashMap Sorting by Keys
public class HashMapSortingKeys {
	
	public static void main(String[] args) {
		
		HashMap<Integer, String> hmap = new HashMap<Integer, String>();
        hmap.put(5, "A");
        hmap.put(11, "C");
        hmap.put(4, "Z");
        hmap.put(77, "Y");
        hmap.put(9, "P");
        hmap.put(66, "Q");
        hmap.put(0, "R");

        System.out.println("Before Sorting:");
        
        //Set set = hmap.entrySet();
        Iterator<Integer> it =  hmap.keySet().iterator();
        while(it.hasNext()) {
              int v = it.next();
              System.out.print(v + ": ");
              System.out.println(hmap.get(v));
        }
        
        
		
		  Map<Integer, String> map = new TreeMap<Integer, String>(hmap);
		  System.out.println("After Sorting:"); 
		  
		  for (Entry<Integer, String> entry : map.entrySet()) {
				System.out.println(entry.getKey() + ": " + entry.getValue());
			}
		 
		 

		 
		 
	}

}
