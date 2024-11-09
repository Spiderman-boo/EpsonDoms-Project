package com.DomsEpson.WelcomeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.DomsEpson.GenericLibrary.BaseTest;
import com.DomsEpson.PageRepositoryLibrary.WelcomePage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VerifyWelcomePageTest extends BaseTest{
	
	public static void main(String[] args) {
		
		
		//Execute the Precondition---->1.Launch the Browser,2.Navigate to URL
		System.out.println("<----Execution Starts succesfully--->");
		BaseTest.browserSetup("Chrome");
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//Verify the Welcome Page Using title
		String exptitle="Learning Selenium";
		String acttitle=driver.getTitle();
		if(exptitle.equals(acttitle))
		{
			System.out.println("Title Verified:"+ acttitle);
		}
		else
		{
			System.out.println("Title Not Verified");
		}
		
		//Create object of the Welcome Page
		WelcomePage welcomepageobj = new WelcomePage(driver);
		
	//---------------------------------------------------------------------------------------------------------------------------------//	
		//Verify the Name TextField
		boolean result = welcomepageobj.getNametextfield().isDisplayed();
		if(result)
		{
			System.out.println("Name TextField is Displayed");
		}
		else
		{
			System.out.println("Name TextField is not Displayed");
		}
		
		//Step3:Perform Action--Clear
		welcomepageobj.getNametextfield().clear();
		System.out.println("Step3:Clear Action done succesfully-NameTextField");
		
		//Step4:Perform Action--SendKeys
		welcomepageobj.getNametextfield().sendKeys("Prashanth");
		System.out.println("Step4:SendKeys Action done succesfully-NameTextField");
		
	//--------------------------------------------------------------------------------------------------------------------------//	
		//Verify the EmailTextField
		boolean result1 = welcomepageobj.getEmailtextfield().isDisplayed();
		if(result1)
		{
			System.out.println("Email TextField is Displayed");
		}
		else
		{
			System.out.println("Email TextField is not Displayed");
		}		
		//Step5:Perform Action--SendKeys
		welcomepageobj.getEmailtextfield().sendKeys("prashanthchinthalapati@gmail.com");
		System.out.println("Step5:SendKeys Action done succesfully-EmailTextField");
	//---------------------------------------------------------------------------------------------------------------------------//	
		//Verify the PasswordTextField
		boolean result2 = welcomepageobj.getPasswordtextfield().isDisplayed();
		if(result2)
		{
			System.out.println("Password TextField is Displayed");
		}
		else
		{
			System.out.println("Password TextField is not Displayed");
		}
		//Step6:Perform Action--SendKeys
		welcomepageobj.getPasswordtextfield().sendKeys("Prashanth@25");
		System.out.println("Step6:SendKeys Action done succesfully-PasswordTextField");
	//---------------------------------------------------------------------------------------------------------------------------//	
		//Verify the PasswordTextField
		boolean result3 = welcomepageobj.getMobileNotextfield().isDisplayed();
		if(result3)
		{
			System.out.println("Mobilenum TextField is Displayed");
		}
		else
		{
			System.out.println("Mobilenum TextField is not Displayed");
		}		
		//Step7:Perform Action--SendKeys
		welcomepageobj.getMobileNotextfield().sendKeys("8464944599");
		System.out.println("Step7:SendKeys Action done succesfully-MobileTextField");
	//--------------------------------------------------------------------------------------------------------------------------//	
		//Verify the GenderField
		boolean result4 = welcomepageobj.getGendermalefield().isDisplayed();
		if(result4)
		{
			System.out.println("GenderField is Displayed");
		}
		else
		{
			System.out.println("GenderField is not Displayed");
		}		
				
		//Step8:Perform Action--Click
		welcomepageobj.getGendermalefield().click();
		System.out.println("Step8:Click Action done succesfully-GenderField");
	
		
	//-------------------------------------------------------------------------------------------------------------------------------//	
		//Verify the PlacesField
		boolean result5 = welcomepageobj.getPlacesbglrfield().isDisplayed();
		if(result5)
		{
			System.out.println("PlaceField is Displayed");
		}
		else
		{
			System.out.println("PlaceField is not Displayed");
		}
		
		//Step9:Perform Action--Undo click
		welcomepageobj.getPlacesgoafield().click();
		System.out.println("Step9:Undo Click Action done succesfully-GoaPlaceField");
		//Step10:Perform Action--Click
		welcomepageobj.getPlacesbglrfield().click();
		System.out.println("Step10:Click Action done succesfully-BanglorePlaceField");
	//-------------------------------------------------------------------------------------------------------------------------------//	
		//Verify the CountryField
		boolean result6 = welcomepageobj.getCountry().isDisplayed();
		if(result6)
		{
			
			System.out.println("Country is Displayed");
		}
		else
		{
			System.out.println("Country is not Displayed");
		}		
				
		//Step11:Create Select object reference for country
		Select s1 = new Select(welcomepageobj.getCountry());
		if(!s1.isMultiple())
		{
		s1.selectByVisibleText("INDIA");
		System.out.println("Step11:INDIA option is selected successfully");
		}
	//---------------------------------------------------------------------------------------------------------------------------//
		//Verify the CountryField2
		boolean result7 = welcomepageobj.getCountry2().isDisplayed();
		if(result7)
		{
			
			System.out.println("Country2 is Displayed");
		}
		else
		{
			System.out.println("Country2 is not Displayed");
		}
		
		//Step12:Create Select object reference for country2
		s1=new Select(welcomepageobj.getCountry2());
		if(s1.isMultiple())
		{
		s1.selectByVisibleText("INDIA");
		s1.selectByVisibleText("AUSTRALIA");
		s1.selectByVisibleText("USA");
		System.out.println("Step12:Options is selected successfully");
		}
	//---------------------------------------------------------------------------------------------------------------------------//	
		//Verify the FeedbackTextField
		boolean result8 = welcomepageobj.getFeedback().isDisplayed();
		if(result8)
		{
			System.out.println("Feedback Field is Displayed");
		}
		else
		{
			System.out.println("Feedback Field is not Displayed");
		}
		
		//Step13:Perform Action--SendKeys
		welcomepageobj.getFeedback().sendKeys("Prashanth is a good boy");
		System.out.println("Step13:Perform Action done succesfully-FeedbackField");
		
	//---------------------------------------------------------------------------------------------------------------------------//	
		//Verify the FileuploadField
		boolean result9 = welcomepageobj.getFileupload().isDisplayed();
		if(result9)
		{
			System.out.println("Fileupload is Displayed");
		}
		else
		{
			System.out.println("Fileupload is not Displayed");
		}
				
		//Step14:Perform Action--SendKeys
		welcomepageobj.getFileupload().sendKeys("C:/Users/DELL/Downloads/Chinthalapati_Prashanth_Resume.pdf");
		System.out.println("Step14:Perform Action done succesfully-Fileupload");
	//-----------------------------------------------------------------------------------------------//	
		//see the Execution
		try
		{
			Thread.sleep(2000);
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
	//--------------------------------------------------------------------------------------------------------------------------//	
		//Verify the DOBField
		boolean result10 = welcomepageobj.getDateofbirth().isDisplayed();
		if(result10)
		{
			System.out.println("DOB is Displayed");
		}
		else
		{
			System.out.println("DOB is not Displayed");
		}
		
		//Step15:Perform Action--SendKeys
		welcomepageobj.getDateofbirth().sendKeys("25-07-2000 / 22:10");
		System.out.println("Step15:Perform Action done succesfully-DOB");
		

	//--------------------------------------------------------------------------------------------------------------------------//
		//Verify the RegisterField
		boolean result11 = welcomepageobj.getRegister().isDisplayed();
		if(result11)
		{
			System.out.println("Register is Displayed");
		}
		else
		{
			System.out.println("Register is not Displayed");
		}
		
		//Step16:Perform Action--Click
		welcomepageobj.getRegister().click();
		System.out.println("Step16:Click Action done succesfully-Register");		
	//--------------------------------------------------------------------------------------------------------------------------//			
		//see the Execution
		try
		{
			Thread.sleep(3000);
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}					
		
		
		
		//Execute Post condition-->Terminate the browser
		BaseTest.terminatebrowser();
		
		//Execution Log or Status
		System.out.println("<----Execution completed succesfully---Testcase pass-->");
	}

}
