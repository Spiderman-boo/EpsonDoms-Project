package Demo;

import java.io.IOException;

import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoTest {
	public static void main(String[] args) throws IOException
	{
	
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver =new ChromeDriver();
		
		
		WorkbookFactory.create(false);
		
	}

 @Test
 public void demoTest()
 {
	 
 }
	
	

}
