package Utility;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListernersClass implements ITestListener   {

	public void onTestFailure(ITestResult result)
	{
		System.out.println("OnTestFailure capture Screenshot");
	}
}
