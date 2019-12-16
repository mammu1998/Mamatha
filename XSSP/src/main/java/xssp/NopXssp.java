package xssp;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NopXssp {

	public static void main(String[] args) throws IOException {
		int i,j;
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String url="https://www.nopcommerce.com/register?returnUrl=%2Fdemo";
		driver.get(url);
		driver.manage().window().maximize();

		File f=new File("C:\\Users\\T MAMATHA\\Documents\\testcase1.xlsx");
		FileInputStream fis=new FileInputStream(f);
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		XSSFSheet sheet=workbook.getSheet("Data");
		XSSFRow row=sheet.getRow(1);
		int c=sheet.getRow(0).getLastCellNum();
		System.out.println(c);
		for(i=1;i<=c-1;i++)
		{
		XSSFCell cell=row.getCell(i);
		
		switch (cell.getCellTypeEnum())
		{
		case STRING:
			String testbox=(cell.getStringCellValue());
			System.out.println(testbox);
			driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys(testbox);
			
			break;
		case NUMERIC:
			int value=(Integer.valueOf((int) cell.getNumericCellValue()));
			System.out.println(value);
			break;

		default:
			break;
		
			
	}
		}

}
	}

