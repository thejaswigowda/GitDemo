tepackage Test;

import org.testng.annotations.Test;

public class Eleven {

	@Test(groups= {"SmokeTest"})
	public void eleven()
	{
		System.out.println("method 11");
	}
	
	@Test
	public void twelve()
	{
		System.out.println("method 12");
	}
	
	@Test(groups= {"SmokeTest"})
	public void thirteen()
	{
		System.out.println("method 13");
	}
	
	
	 
	
}
