package TestClass;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Pages.BaseClass;
import Pages.FlightBooking;

@Listeners(Utility.ListernersClass.class)

public class TestClassObjects extends BaseClass {

	FlightBooking FB;
	
	@Test
	public void init()
	{
		FB = PageFactory.initElements(driver, FlightBooking.class);
		FB.From(excel.getStringData("sheet1", 1, 1));
		FB.To(excel.getStringData("sheet1", 2, 2));
	}

}
