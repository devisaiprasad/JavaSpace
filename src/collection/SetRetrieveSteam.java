
package collection;

import java.util.Set;

public class SetRetrieveSteam {

	public static void main(String[] args) {

		Set<String> uniqueProductNames = 
				//driver
				//.findElements(By.xpath("//ul[contains(@class,'active')]//a[@class='product-name']"))
				.stream()
				.map(productWebElement -> productWebElement.getText())
				.collect(Collectors.toSet());

		// Print count of product found
		System.out.println("Total unique product found : " + uniqueProductNames.size());

		// Printing product names
		System.out.println("All product names are : ");
		uniqueProductNames.forEach(name -> System.out.println(name));
		
		
		
		// Locating all product names at home page
				/*
				 * map() is used to replace stream with text. If stream consists of {webelement1, webelement2},
				 * after map operation it will be their inner text {textOfWebelement1, textOfWebElement2}.
				 * distinct() will remove all duplicates
				 * Using collect() method to store resultant stream to a list. 
				 */
				List<String> uniqueProductNames1 = driver.findElements(By.xpath("//ul[contains(@class,'active')]//a[@class='product-name']"))
				.stream()
				.map(productWebElement -> productWebElement.getText())
				.distinct()
				.collect(Collectors.toList());
		
		

	}

}
