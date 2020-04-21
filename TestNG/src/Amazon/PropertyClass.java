package Amazon;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class PropertyClass 
{
	@Test
	public void navigate() throws IOException
	{
Properties pro=new Properties();
FileInputStream file=new FileInputStream("config.properties");
pro.load(file);
System.out.println(pro.getProperty("URL"));
	}
}
