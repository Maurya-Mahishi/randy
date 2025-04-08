package MultipleDataScripts;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class StoreAllLinksInExcel
{
	WebDriver driver;
	@Test
	public void writemultiple() throws Exception
	{
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS)	;
		driver.get("https://www.flipkart.com");
		XSSFWorkbook book = new XSSFWorkbook();
		XSSFSheet sheet = book.createSheet("FlipkartUrls");
		List<WebElement> links = driver.findElements(By.xpath("//a"));
		int linkscount = links.size();
		for(int i = 0;i<linkscount;i++)
		{
			WebElement link = links.get(i);
			String url = link.getAttribute("href");
			XSSFRow row = sheet.createRow(i);
			XSSFCell cel = row.createCell(0);
			cel.setCellValue(url);
			}
		FileOutputStream fos = new FileOutputStream("./ExcelData/Flipkart.xlsx");
		book.write(fos);
		fos.close();
		book.close();
		}
	}


