package com.DomsEpson.JavaScriptLibrary;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.DomsEpson.WebDriverLibrary.WebDriverUtility;

public class JavScriptUtility {

	public static JavascriptExecutor javascriptobj;
	public static void enterData_DisabledElement(WebElement element,String data)
	{
		javascriptobj=(JavascriptExecutor)WebDriverUtility.driver;
		javascriptobj.executeScript("arguments[0].value='"+data+"'", element);
	}
	public static void click_DisabledElement(WebElement element)
	{
		javascriptobj=(JavascriptExecutor)WebDriverUtility.driver;
		javascriptobj.executeScript("arguments[0].click()", element);

	}
	public static void defaultVerticalscrollBy()
	{
		javascriptobj=(JavascriptExecutor)WebDriverUtility.driver;
		javascriptobj.executeScript("window.scrollBy(1000, 1000)");
	}
	public static void defaultVerticalscrollTo()
	{
		javascriptobj=(JavascriptExecutor)WebDriverUtility.driver;
		javascriptobj.executeScript("window.scrollTo(1000, 1000)");
	}
	public static void defaultscrollUsingView(WebElement element,boolean value)
	{
		javascriptobj=(JavascriptExecutor)WebDriverUtility.driver;
		javascriptobj.executeScript("arguments[0].scrollIntoView("+value+");", element);
	}

}
