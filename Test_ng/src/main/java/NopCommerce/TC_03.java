package NopCommerce;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TC_03 extends Common {
	@Test
	public void test() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='search-box-text ui-autocomplete-input']")).sendKeys("laptop");
		
		driver.findElement(By.xpath("//input[@class='button-1 search-box-button']")).click();
		List<WebElement> allElements = driver.findElements(By.xpath("//h2[@class='product-title']//child::*"));    
	    int elementsCount = allElements.size(); 
	    System.out.println("Total Number of All Element on webpage = "  + elementsCount);
	for(WebElement string :allElements)
	{
		String name=string.getText();
		System.out.println(name);
	}
	List<WebElement> allprices = driver.findElements(By.xpath("//span[@class='price actual-price']")); 
	int priceCount =allprices.size();
	
	System.out.println(priceCount);
	
	
	}

}
