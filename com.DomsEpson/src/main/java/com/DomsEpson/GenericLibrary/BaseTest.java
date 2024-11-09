package com.DomsEpson.GenericLibrary;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.DomsEpson.WebDriverLibrary.WebDriverUtility;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {

	
	public static WebDriver driver=null;
	public static void browserSetup(String browser) {

		// step1:Launch the browser
		
		WebDriverUtility.launchBrowser(browser);
		/*
		switch (browser) {
		case "Chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;

		case "Firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;

		case "Edge":
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;
		default:
			System.out.println("You Have Entered incorrect Browser Nmae");
			break;
		}*/
		System.out.println("Step1:Browser launched succesfully");

		// Maximize the Browser
		WebDriverUtility.maximizeTheBrowser();

		// Step2:Navigating to application via URL
		WebDriverUtility.NavigateToApplication(
				"file:///C:/Users/DELL/Desktop/QSP_Automation_testing/com.DomsEpson/src/main/resources/Softwares/webpage.html");
		System.out.println("Step2:Navigating to application via URL succesfully");

	}

	public static void terminatebrowser()
	{
			//Step17:Close the browser
			WebDriverUtility.closeAllBrowsers();
			System.out.println("Step17:Browser closed succesfully");
	}

}
