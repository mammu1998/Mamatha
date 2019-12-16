package NopCommerce;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TC_02 extends Common{
	@Test
	public void test() throws InterruptedException
	{
	
	driver.findElement(By.xpath("//a[text()=' Digital downloads ']")).click();
	List<WebElement> allElements = driver.findElements(By.xpath("//h2[@class='product-title']//child::*"));    
    int elementsCount = allElements.size(); 
    System.out.println("Total Number of All Element on webpage = "  + elementsCount);
for(WebElement string :allElements)
{
	String name=string.getText();
	System.out.println(name);
}
	
}
}
