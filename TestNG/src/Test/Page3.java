package Test;

import org.testng.annotations.Test;

public class Page3
{
	@Test
	public void cart()
	{
		System.out.println(" cart details");
	}
	@Test(groups = {"sanity"})
	public void cart2()
	{
		System.out.println(" cart2 details");
	}
}
