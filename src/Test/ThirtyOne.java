package Test;

import org.testng.annotations.Test;

public class ThirtyOne {

	@Test(groups= {"SmokeTest"})
	public void thirtyOne()
	{
		System.out.println("method 31");
	}
	
	@Test(groups= {"SmokeTest"})
	public void thirtyTwo()
	{
		System.out.println("method 32");
	}
	
	@Test
	public void thirtyThree()
	{
		System.out.println("method 33");
	}


}
