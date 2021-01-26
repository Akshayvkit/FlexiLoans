package Utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class TakeScreenshot {

	public static void captureScreenshot(WebDriver driver) throws IOException
	{
		TakesScreenshot TS = (TakesScreenshot)driver;
		File src = TS.getScreenshotAs(OutputType.FILE);
		File dst = new File("C:\\Users\\hp\\eclipse-workspace\\PHPTRAVELSTEST\\src\\main\\java\\Screenshots\\testCapture.jpg");
		org.openqa.selenium.io.FileHandler.copy(src, dst);
	}

	
}
