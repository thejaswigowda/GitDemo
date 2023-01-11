package Test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class One {
	
	@Test
	public void one()
	{
		System.out.println("method 1");
	}

	@Test(groups= {"SmokeTest"})
	public void two()
	{
		System.out.println("method 2");
		Assert.assertTrue(false);
	}
	
	@Test
	public void three()
	{
		System.out.println("method 3");
	}
	
	@Test
	public void four()
	{
		System.out.println("method 4");
	}
}
