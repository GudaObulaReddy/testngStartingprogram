package Test;

import org.testng.annotations.Test;

public class Page2 
{
	@Test
	public void netbanking()
	{
		System.out.println("netbanking deatils");
	}
	@Test(groups = {"Regression"})
	public void netbanking2()
	{
		System.out.println("netbanking2 deatils");
	}
}
