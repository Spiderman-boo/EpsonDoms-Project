package com.DomsEpson.WebDriverLibrary;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverUtility {

	public static WebDriver driver;
	public static Select selectobj;
	public static Actions actionsobj;
	public static Robot robotobj;
	
	
	public static void launchBrowser(String browser)
	{
		//Step1:Launch the browser-chrome,firefox,edge
		switch (browser) {
		case "Chrome":
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			break;
			
		case "Firefox":
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
			break;
			
		case "Edge":
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
			break;
		default:
			System.out.println("You Have Entered incorrect Browser Nmae");
			break;
		}
	}
	public static void maximizeTheBrowser() 
	{
		driver.manage().window().maximize();
	}
	public static void NavigateToApplication(String Url)
	{
		driver.get(Url);
	}
	public static void closeTheBrowser()
	{
		driver.close();
	}
	public static void closeAllBrowsers()
	{
		driver.quit();
	}
	public static void waitImplicitly(long duration)
	{
		driver.manage().timeouts().implicitlyWait(duration, TimeUnit.SECONDS);
	}
	
	public static void waitExplicitly(long duration,WebElement element)
	{
		WebDriverWait wait = new WebDriverWait(driver,duration);
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	public void selectOptionInDropdown(WebElement element,int index)
	{
		selectobj.selectByIndex(index);;
	}
	public void selectOptionInDropdown(WebElement element,String visibletext)
	{
		selectobj.selectByVisibleText(visibletext);
	}
	public void selectOptionInDropdown(String value,WebElement element)
	{
		selectobj.selectByValue(value);
	}
	
	public void mouseHovering_movetoelement(WebElement element)
	{
		actionsobj.moveToElement(element).perform();
	}
	public void mouseHovering_click(WebElement element)
	{
		actionsobj.click(element).perform();
	}
	public void mouseHovering_contextclick(WebElement element)
	{
		actionsobj.contextClick(element).perform();
	}
	public void mouseHovering_doubleclick(WebElement element)
	{
		actionsobj.doubleClick(element).perform();
	}
	public void mouseHovering_Draganddrop(WebElement element1, WebElement element2)
	{
		actionsobj.dragAndDrop(element1, element2).perform();
	}
	
	
	public void pressTheKey_pageDown()
	{
		robotobj.keyPress(KeyEvent.VK_PAGE_DOWN);
	}
	public void ReleaseTheKey_pageDown()
	{
		robotobj.keyRelease(KeyEvent.VK_PAGE_DOWN);
	}
	public void AlertPopupAccept()
	{
		driver.switchTo().alert().accept();
	}
	public void AlertPopupDismiss()
	{
		driver.switchTo().alert().dismiss();
	}
	public void switchControlToFrame(int Index)
	{
		driver.switchTo().frame(0);
	}
	public void switchControlToFrame(WebElement element)
	{
		driver.switchTo().frame(element);
	}
	public void switchBackControlToMain()
	{
		driver.switchTo().defaultContent();
	}
	public void switchControlToWindow(String windowaddress)
	{
		driver.switchTo().window(windowaddress);
	}
	
}
