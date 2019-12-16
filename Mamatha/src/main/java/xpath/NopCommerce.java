package xpath;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NopCommerce {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String url="https://www.nopcommerce.com/register?returnUrl=%2Fdemo";
		driver.get(url);
		driver.manage().window().maximize();

	}

}
