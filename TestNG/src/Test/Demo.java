package Test;

import org.testng.annotations.Test;

public class Demo 
{

@Test
public void Basic()
{
	System.out.println(" hello test ng project");
}
@Test(groups = {"Regression"})
public void Basic1()
{
	System.out.println(" hello test1 ng project");
}
@Test(groups = {"sanity"})
public void Basic2()
{
	System.out.println(" hello test2 ng project");
}
}
