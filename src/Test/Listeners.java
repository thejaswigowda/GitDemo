package Test;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener{
	
	@Override
	public void onTestSuccess(ITestResult result)
	{
		System.out.println("Ran after listening to all Passed test cases");
	}
	
	@Override
	public void onTestFailure(ITestResult result)
	{
		System.out.println("Ran after listening to all Failed test cases");
	}

}
