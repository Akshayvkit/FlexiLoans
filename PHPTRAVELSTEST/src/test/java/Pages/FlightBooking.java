package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FlightBooking {

	WebDriver driver;
	
	@FindBy(xpath = "(//a[@class='select2-choice'])[2]")
	private WebElement From;
	
	@FindBy(xpath = "(//a[@class='select2-choice'])[3]")
	private WebElement To;
	
	public FlightBooking(WebDriver ldriver)
	{
		this.driver = ldriver;
	}
	
	public void From(String str1)
	{
		From.sendKeys("sddfd");
	}
	
	public void To(String str2)
	{
		To.sendKeys(str2);
	}

}
