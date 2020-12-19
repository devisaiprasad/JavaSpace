package collection;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		int[] arr= {1, 5, 3, 5, 6};

		ArrayList<Integer> arrList = new ArrayList<Integer>();


		for(int a : arr){
			
			if(a==5){
				arrList.add(0);
				arrList.add(a);
				arrList.add(0);	
			}else{
				arrList.add(a);
			}
		}
		
		System.out.println(arrList);
		
		
		String str = "a BB CCc DDdd";
		
		String org = str.replace(" ","").toLowerCase();
		//String finalStr = org.toLowerCase();
		
		
		System.out.println(org);

	}

}
