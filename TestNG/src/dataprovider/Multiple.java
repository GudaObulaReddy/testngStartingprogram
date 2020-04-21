package dataprovider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

@Test(dataProvider = "loginData")
public class Multiple 
{
public void Login(String id,String pass)
{
	System.out.println(id);
	System.out.println(pass);
	System.out.println("login sucess");
}
@DataProvider
public Object[][] loginData()
{
	Object[][] data=new Object[3][2];
	data[0][0]="firstid";
	data[0][1]="first password";
	data[1][0]="second id";
	data[1][1]="second password";
	data[2][0]="third id";
	data[2][1]="third password";
	return data;
}
}
