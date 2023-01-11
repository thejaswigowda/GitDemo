package Test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TwentyOne {
	
	@AfterTest
	public void twentyOne()
	{
		System.out.println("method 21");
	}
	
	@Test
	public void twentyTwo()
	{
		System.out.println("method 22");
	}
	
	@BeforeTest
	public void twentyThree()
	{
		System.out.println("method 23");
	}

}
