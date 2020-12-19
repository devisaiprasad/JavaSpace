package collection;

import java.util.ArrayList;
import java.util.List;

public class ListRetrieveSteam {

	public static void main(String[] args) {
		List<String> allProduct = new ArrayList<>();
		allProduct.add("Lima");
		allProduct.add("Coma");
		allProduct.add("Fama");
		allProduct.add("Mama");

		allProduct.forEach(name -> System.out.println(name));
		
		System.out.println("------------------");
		
		for (String temp : allProduct) {
			System.out.println(temp);
		}

	}

}
