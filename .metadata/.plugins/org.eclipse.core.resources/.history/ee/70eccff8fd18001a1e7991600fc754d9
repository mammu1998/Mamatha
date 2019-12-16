package NopCommerce;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class GenericMethods {
	
	public static WebDriver driver;
	
	
	public boolean  launchBrowser(String browser,String url)
	{
		boolean status=true;
		System.out.println("Launching browser :"+browser.toLowerCase());
		try
		{
			switch (browser.toLowerCase()) {
			case "chrome":
				System.setProperty("webdriver.chrome.driver","chromedriver.exe" );
				driver=new ChromeDriver();
				break;
				
			case "ff":
				//System.setProperty("webdriver.chrome.driver","chromedriver.exe" );
				driver=new FirefoxDriver();
				break;

			default:
				break;
			}
			
			//driver.get(url);
			
			driver.navigate().to(url);
			driver.manage().window().maximize();
			System.out.println("Browser "+browser+" is launched sucessfully");
			
		}catch(Exception e)
		{
			status=false;
			e.getStackTrace();
			System.out.println("Browser is not launched sucessfully "+e.getMessage());
		}
		return status;
		
		
		
		
	}
	
	public boolean checkElementExist(String elementName,String pageName,WebElement element)
	{
		boolean status=true;
		try
		{
			if(element.isDisplayed())
			{
				System.out.println("The Element "+elementName+" is displayed on "+pageName);
			}
			
			
		}catch(Exception e)
		{
			status=false;
			System.out.println("The Element "+elementName+" is not displayed on "+pageName);
		}
		return status;
		
		
	}
	
	
	public boolean clickAndSendData(String textBoxName,String pageName,WebElement textBox,String data)
	{
		boolean status=true;
		try
		{
			textBox.click();
			
			textBox.clear();
			
			textBox.sendKeys(data);
			
			System.out.println("The Text Box : "+textBoxName+" is typed  with data  "+data+" on the page "+pageName);
			
		}catch(Exception e)
		{
			status=false;
			System.out.println("The Text Box : "+textBoxName+" is not typed  with data  "+data+" on the page "+pageName);
		}
		return status;
		
		
	}
	
	public boolean hoverAndClick(String buttonName,String pageName,WebElement button)
	{
		boolean status=true;
		try
		{
			Actions acc=new Actions(driver);
			acc.moveToElement(button).click(button).build().perform();
			System.out.println("The Element : "+buttonName+" is  clicked sucessfully on the page "+pageName);
		}catch(Exception e)
		{
			status=false;
			System.out.println("The Element : "+buttonName+" is not clicked on the page "+pageName);
		}
		return status;
		
		
	}
	
	public boolean selectDropDownByVisibleText(String dropDownName,String pageName,WebElement dropDown,String option)
	{
		boolean status=true;
		try
		{
			Select select=new Select(dropDown);
			select.selectByVisibleText(option);
			System.out.println("The Element : "+dropDownName+" is  Selected sucessfully with the option : "+option+"on the page "+pageName);
		}catch(Exception e)
		{
			status=false;
			System.out.println("The Element : "+dropDownName+" is  not Selected sucessfully with the option : "+option+"on the page "+pageName);
		}
		return status;
		
		
	}
	
	
	
	public boolean selectDropDownByValue(String dropDownName,String pageName,WebElement dropDown,String option)
	{
		boolean status=true;
		try
		{
			Select select=new Select(dropDown);
			select.selectByValue(option);
			System.out.println("The Element : "+dropDownName+" is  Selected sucessfully with the option : "+option+"on the page "+pageName);
		}catch(Exception e)
		{
			status=false;
			System.out.println("The Element : "+dropDownName+" is  not Selected sucessfully with the option : "+option+"on the page "+pageName);
		}
		return status;
		
		
	}
	
	
	public boolean selectDropDownByIndex(String dropDownName,String pageName,WebElement dropDown,int option)
	{
		boolean status=true;
		try
		{
			Select select=new Select(dropDown);
			select.selectByIndex(option);
			System.out.println("The Element : "+dropDownName+" is  Selected sucessfully with the option : "+option+"on the page "+pageName);
		}catch(Exception e)
		{
			status=false;
			System.out.println("The Element : "+dropDownName+" is  not Selected sucessfully with the option : "+option+"on the page "+pageName);
		}
		return status;
		
		
	}
	
	public void forceClick(WebElement element){
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", element);
		
	}
	
	public String getResultsPath()
	{

Date d=new Date();
		
SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");

System.out.println(sdf.format(d));

String currentDate=sdf.format(d);

/*sdf=new SimpleDateFormat("HH:mm:SS");
sdf=new SimpleDateFormat("dd-MM-yyyy HH:mm:SS");
System.out.println(sdf.format(d));
*/		
	
String path=System.getProperty("user.dir")+"\\Results\\"+currentDate;


File f=new File(path);

if(!f.exists())f.mkdirs();

return path;
	}
	
	public void closeBrowser()
	{ driver.close();
	
	}
	
	
	
	

}