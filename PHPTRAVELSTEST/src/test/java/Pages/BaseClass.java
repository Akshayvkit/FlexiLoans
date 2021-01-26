package Pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import Utility.ExcelDataProvider;
import Utility.TakeScreenshot;

public class BaseClass {

	public WebDriver driver;
	public ExcelDataProvider excel;
	
	@BeforeSuite
	public void Starts() throws IOException
	{
		excel = new ExcelDataProvider();
	}
		
	@BeforeTest
	public void initialize()
	{
			System.setProperty("webdriver.chrome.driver", "C:\\Software\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			
			driver.get("https://www.phptravels.net/home");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		    driver.manage().window().maximize();
		    driver.findElement(By.xpath("//a[@data-name='flights']")).click();
	}
	
	@AfterMethod()
	public void tearDown() throws IOException
	{
		System.out.println("Capture Screenshot");
		TakeScreenshot.captureScreenshot(driver);
	}
	
	@AfterSuite
	public void quitAll()
	{
		driver.quit();
	}
}
