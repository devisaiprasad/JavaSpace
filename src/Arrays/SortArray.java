package Arrays;

public class SortArray {

	public static void main(String[] args) {
		int[] arr = { 45, 12, 85, 32, 89, 39, 69, 44 };
		
		int temp;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {     
	               if(arr[i] > arr[j]) {    
	                   temp = arr[i];    
	                   arr[i] = arr[j];    
	                   arr[j] = temp;    
	               }     
			}
		}
		
		
		for (int i:arr) {
			System.out.print(i+" ");
		}
		
		System.out.println();
		System.out.println(arr[arr.length-2]);

	}

}
