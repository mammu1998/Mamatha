package NopCommerce;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TC_01 extends Common {
	//h2[@class='product-title']//child::*	
	@Test
	public void test() throws InterruptedException
	{
	driver.findElement(By.xpath("(//div[@class='sublist-toggle']/preceding-sibling::a)[1]")).click();
	//driver.findElement(By.xpath("(//li[@class='inactive']/preceding-sibling::li)[2]")).click();
	driver.findElement(By.xpath("//a[text()=' Desktops ']")).click();
	driver.findElement(By.xpath("(//ul[@class='group price-range-group']//a)[1]")).click();
	
	List<WebElement> allElements = driver.findElements(By.xpath("//h2[@class='product-title']"));    
    int elementsCount = allElements.size();     
    
    System.out.println("Total Number of All Element on webpage = "  + elementsCount); 

	
			
	}

}
