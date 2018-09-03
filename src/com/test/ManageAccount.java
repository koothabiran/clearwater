package com.test;

import java.io.IOException;
import org.testng.Reporter;
import org.testng.annotations.*;
import org.openqa.selenium.*;
import com.test.WrapperClass;

public class ManageAccount extends WrapperClass{
	
	  private WebDriver driver;
	  String browser=null;
	 
	    
	  @BeforeClass  
	 public void ManageAccountLogin() throws IOException, InterruptedException {
			
		    String[][] data = getlogin();
			String emailId= data[0][0];
			String password= data[0][1];
			browser = data [0][2];
			String Url = data [0][3];
			
			//LaunchBrowser 		
			launchBroswer(browser,Url);
			Reporter.log("Broser Launched successfully | ");
			Thread.sleep(5000);
		    
			//Enter EmailID in Textbox
			assertTextXpath("//form/input");
			sendvaluebyxpath("//form/input", emailId);
			Reporter.log("Enter EmailID successfully | ");
			Thread.sleep(5000);
			
			//Enter Password in Textbox
			assertTextXpath("//input[2]");
			sendvaluebyxpath("//input[2]", password);
			Reporter.log("Enter Password successfully | ");
			Thread.sleep(5000);

			//Click on SignIN button
			try {
			assertTextXpath("//form/a");
			clickByXpath("//form/a");  
			Reporter.log("Click on SignIN button successfully | ");
			}catch(Exception e)
			{
				   e.printStackTrace();
				  Reporter.log("SignIN doesn't work | ");
				}
			Thread.sleep(5000);
			Thread.sleep(5000);
			Thread.sleep(5000);
			Thread.sleep(5000);
			Thread.sleep(5000);
			
			//Close Dashboard Module link 
			assertTextXpath("//*[@id='sidebar-left']/ul/li[1]/a/span[2]");
			clickByXpath("//*[@id='sidebar-left']/ul/li[1]/a/span[2]");
			Reporter.log("Close Dashboard Module link  | ");
			Thread.sleep(5000);
			Thread.sleep(5000);
			
			//Click on Manage Account Module
			assertTextXpath("//*[@id='sidebar-left']/ul/li[8]/a/span[2]");
			clickByXpath("//*[@id='sidebar-left']/ul/li[8]/a/span[2]");
			Reporter.log("Click on Manage Account Module | ");
			Thread.sleep(5000);
			Thread.sleep(5000);
			   
			//Click on User management Sub-Module
			assertTextXpath("//*[@id='sidebar-left']/ul/li[8]/ul/li[3]/a/span[2]");
			clickByXpath("//*[@id='sidebar-left']/ul/li[8]/ul/li[3]/a/span[2]");
			Reporter.log("Click on User management Sub-Module | ");
			Thread.sleep(5000);
			Thread.sleep(5000);			
		  }
	 
	   @Test(priority=1, enabled = false)
	   public void UserList() throws IOException, InterruptedException {
		 
		   Thread.sleep(5000);
		   Thread.sleep(5000);
	   
		   //Click on User List under User management Sub-Module
		   assertTextLink("User List");
		   clickBylinktext("User List");
		   Reporter.log("Click on User List under User management Sub-Module | ");
		   Thread.sleep(5000);
		   
		    //Click on New Button to add User
		    assertTextXpath("//*[@id='user-management_wrapper']/div[1]/div[1]/div/a[1]");
		    clickByXpath("//*[@id='user-management_wrapper']/div[1]/div[1]/div/a[1]");
		    Reporter.log("Click on New Button to add User | ");
		    Thread.sleep(5000);
		    
		    //Enter the Value for First name
		    assertTextXpath("//div/div/div/input");
		    sendvaluebyxpath("//div/div/div/input", "Clearwaer");
		    Reporter.log("Enter the Value for First name | ");
		    Thread.sleep(5000);
		    
		    //Enter Email address	
		    assertTextXpath("//div[2]/div/div/input");
		    sendvaluebyxpath("//div[2]/div/div/input", "uma.m+13@sybrant.com");
		    Reporter.log("Enter Email address | ");
		    Thread.sleep(5000);
		    
		    //Enter Phone number
		    assertTextXpath("//*[@id='phone']");
		    sendvaluebyxpath("//*[@id='phone']", "9999999999");
		    Reporter.log("Enter Phone number | ");
		    Thread.sleep(5000);
		   
		    //Enter the Last name
		    assertTextXpath("//div[2]/div/input");
		    sendvaluebyxpath("//div[2]/div/input", "project");
		    Reporter.log("Enter the Last name | ");
		    Thread.sleep(5000);
	
		    //Enter the Job Title
		    assertTextXpath("//div[2]/div[2]/div/input");
		    sendvaluebyxpath("//div[2]/div[2]/div/input", "media");
		    Reporter.log("Enter the Job Title | ");
		    Thread.sleep(5000);
		    
		    //Click on Account Owner
		    clickByXpath("//*[@id='account_owner']");
		    Reporter.log("Click on Account Owner | ");
		    Thread.sleep(5000);
		    
		    //Click on Show Password Link
		    assertTextXpath("//div[3]/div/a[2]");
		    clickByXpath("//div[3]/div/a[2]");
		    Reporter.log("Click on Show Password Link | ");
		    Thread.sleep(5000);
		    
		    //Enter the Password
		    assertTextXpath("//cw-password/div/div[2]/div/div/div/input[2]");
		    sendvaluebyxpath("//cw-password/div/div[2]/div/div/div/input[2]", "Uma@12345");
		    Reporter.log("Enter the Password | ");
		    Thread.sleep(5000);
		   
		    //Enter the Confirmation Password
		    assertTextXpath("//cw-password/div/div[2]/div[2]/div/div/input");
		    sendvaluebyxpath("//cw-password/div/div[2]/div[2]/div/div/input", "Uma@12345");
		    Reporter.log("Enter the Confirmation Password | ");
		    Thread.sleep(5000);
		    
		    //Click on Save Button
		    assertTextXpath("//div[3]/div/button");
		    clickByXpath("//div[3]/div/button");
		    Reporter.log("Click on Save button |");
		    Thread.sleep(5000);
		    
		    //Select any of the list User
		    assertTextXpath("//td[2]");
		    clickByXpath("//td[2]");
		    Reporter.log("Select any of the list User | ");
		    Thread.sleep(5000);
		    
		    //Click on Delete Button 
		    assertTextXpath("//a[3]/span");
		    clickByXpath("//a[3]/span");
		    Reporter.log("Click on Delete button | ");
		    Thread.sleep(5000);
		    
		    //Click on confirmation Delete button
		    assertTextXpath("//div[3]/button");
		    clickByXpath("//div[3]/button");
		    Reporter.log("Click on confirmation Delete button | ");
		    Thread.sleep(5000);
		    Thread.sleep(5000);
	   }	   
	   
	   @AfterClass
	   public void ManageAccountLogout() throws IOException, InterruptedException {
	 	  
	 	   Thread.sleep(5000);
	 	   Thread.sleep(5000);	   
	 	   Thread.sleep(5000);
	 	   Thread.sleep(5000);
	 	 
	 	   //Click on Account drop-down
	 	   assertTextXpath("//header[@id='header']/div[2]/div/ul[2]/li[7]/a/span/span");
	 	   clickByXpath("//header[@id='header']/div[2]/div/ul[2]/li[7]/a/span/span");
	 	   Reporter.log("Click on Account drop-down  | ");
	 	   Thread.sleep(5000);
	 		 
	 	   //click on Logout button
	 	   try {
	 	   assertTextXpath("//*[@id='header']/div[2]/div/ul[2]/li[7]/ul/li[3]/a");
	 	   clickByXpath("//*[@id='header']/div[2]/div/ul[2]/li[7]/ul/li[3]/a");
	 	   Reporter.log("Click on Logout button  | ");
	 	   }catch(Exception e)
			{
				   e.printStackTrace();
				  Reporter.log("SignIN doesn't work | ");
				}
	 	   Thread.sleep(5000);
	 	   quitBrowser();
	 	   Reporter.log("Browser Quit | ");
	 	   Thread.sleep(5000);
	   }

}
