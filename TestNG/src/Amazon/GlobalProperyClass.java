package Amazon;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class GlobalProperyClass 
{
	
public WebDriver driver=null;
public  Properties pro=new Properties();
public FileInputStream file1;
 @Test
  public void Nav() throws IOException
  {
	file1=new FileInputStream("config.properties");
	pro.load(file1);
	if(pro.getProperty("browser").contains("Chrome"))
			{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ramakrishna\\Desktop\\chromedriver\\chromedriver.exe");
		driver=new ChromeDriver();
			}
	else if(pro.getProperty("browser").contains("FireFox"))
	{
		driver=new FirefoxDriver();
	}
  }
 
  
}
