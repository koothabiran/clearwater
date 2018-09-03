package com.test;

import java.io.IOException;
import org.testng.Reporter;
import org.testng.annotations.*;
import org.openqa.selenium.*;
import com.test.WrapperClass;

public class EntityManagement extends WrapperClass{
	
	  private WebDriver driver;
	  String browser=null;
	 
	    
	  @BeforeClass  
	 public void EntityLogin() throws IOException, InterruptedException {
			
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
			
			//Expand the Entity Management Sub-Module
			assertTextXpath("//*[@id='sidebar-left']/ul/li[8]/ul/li[2]/a/span[2]");
			clickByXpath("//*[@id='sidebar-left']/ul/li[8]/ul/li[2]/a/span[2]");
			Reporter.log("Expand the Entity Management Sub-Module | ");
			Thread.sleep(5000);
			Thread.sleep(5000);
			
		  }
	  
	  @Test(priority=1, enabled = true)
	  public void EntityList() throws IOException, InterruptedException {
	       
		     Thread.sleep(5000);
		     Thread.sleep(5000);
		     
		     //Click on Entity List
		     assertTextXpath("//*[@id='sidebar-left']/ul/li[8]/ul/li[2]/ul/li[1]/a");
		     clickByXpath("//*[@id='sidebar-left']/ul/li[8]/ul/li[2]/ul/li[1]/a");
		     Reporter.log("Click on Entity List | ");
		     Thread.sleep(5000);
		     Thread.sleep(5000);
		     
		     //Click on New Button
		     assertTextXpath("//div/a/span");
		     clickByXpath("//div/a/span");
		     Reporter.log("Click on New Button | ");
		     Thread.sleep(5000);
		     Thread.sleep(5000);
		     
		     //Enter Entity name
		     sendvaluebyeid("entity-name", "Automation Test Entity");
		     Reporter.log("Enter Entity name | ");
		     Thread.sleep(5000);
		     Thread.sleep(5000);
		     
		     //Select Industry Type from drop-down
		     selectByid_Visibletext("industry-type", "Healthcare");
		     Reporter.log("Select Industry Type from drop-down | ");
		     Thread.sleep(5000);
		     Thread.sleep(5000);
		     
		     //Select Sub-Industry Type from drop-down
		     selectByid_Visibletext("clearwater-entity-type", "Clinical Research");
		     Reporter.log("Select Sub-Industry Type from drop-down | ");
		     Thread.sleep(5000);
		     Thread.sleep(5000);
		     
		     //Select State from drop-down
		     selectByid_Visibletext("state", "AZ - Arizona");
		     Reporter.log("Select Sub-Industry Type from drop-down | ");
		     Thread.sleep(5000);
		     Thread.sleep(5000);
		     
		     //Enter the Number of Employees 
		     sendvaluebyxpath("//*[@id='number_of_employees']", "1000");
		     Reporter.log("Select Sub-Industry Type from drop-down | ");
		     Thread.sleep(5000);
		     Thread.sleep(5000);
		     
		     //Select the Products IRM|Analysis™ 
		     assertTextXpath("//div[2]/div/div/div/label");
		     clickByXpath("//div[2]/div/div/div/label");
		     Reporter.log("Select the Products IRM|Analysis™  | ");
		     Thread.sleep(5000);
		     Thread.sleep(5000);
		     
		     /*//Select Yes for this entity be a parent and cascade data to other entities
		     assertTextXpath("//*[@id='locations-form']/div[3]/div[2]/div[2]/div/div[1]/label");
		     clickByXpath("//*[@id='locations-form']/div[3]/div[2]/div[2]/div/div[1]/label");
		     Reporter.log("Select Yes for this entity be a parent and cascade data to other entities | ");
		     Thread.sleep(5000);
		     Thread.sleep(5000);*/
		     
		     // Click on Save button
		     assertTextXpath("//*[@id='submit-button']");
		     clickByXpath("//*[@id='submit-button']");
		     Reporter.log("Click on Save button | ");
		     Thread.sleep(5000);
		     Thread.sleep(5000);
	}
	  
	  @Test(priority=2, enabled = true)
	  public void EntityTags() throws IOException, InterruptedException {
		  
		    
		     Thread.sleep(5000);
		     Thread.sleep(5000);
		     
		     //Click on Entity Tags
		     assertTextXpath("//*[@id='sidebar-left']/ul/li[8]/ul/li[2]/ul/li[2]/a");
		     clickByXpath("//*[@id='sidebar-left']/ul/li[8]/ul/li[2]/ul/li[2]/a");
		     Reporter.log("Click on Entity Tags | ");
		     Thread.sleep(5000);
		     Thread.sleep(5000);
		     
		     //Click on New Button
		     assertTextXpath("//div/a/span");
		     clickByXpath("//div/a/span");
		     Reporter.log("Click on New Button | ");
		     Thread.sleep(5000);
		     Thread.sleep(5000);
		     
		     //Enter the Entity Tag Name
		     sendvaluebyxpath("//div/input", "Automation Entity Tag");
		     Reporter.log("Enter the Entity Tag Name | ");
		     Thread.sleep(5000);
		     Thread.sleep(5000);
		     
		     //Click on Entity Tag Category drop-down
		     assertTextXpath("//*[@id='category_chosen']/a/span");
		     clickByXpath("//*[@id='category_chosen']/a/span");
		     Reporter.log("Click on Entity Tag Category drop-down | ");
		     Thread.sleep(5000);
		     
		     //Select Any of Option from Entity Tag Category drop-down
		     assertTextXpath("//*[@id='category_chosen']/div/ul/li[1]");
		     clickByXpath("//*[@id='category_chosen']/div/ul/li[1]");
		     Reporter.log("Select option from Entity Tag Category drop-down | ");
		     Thread.sleep(5000);
		     Thread.sleep(5000);
		    
		     //Click on Save button
		     assertTextXpath("//*[@id='submit-button']");
		     clickByXpath("//*[@id='submit-button']");
		     Reporter.log("Click on Save button | ");
		     Thread.sleep(5000);
		     Thread.sleep(5000);	        
	  
	  }
	  
	  @Test(priority=2, enabled = true)
	  public void SelectEntityFromHeader() throws IOException, InterruptedException {
		  
		     //Click on the Created new Entity drop-down from Header 
		     assertTextXpath("//*[@id='header']/div[2]/div/ul[2]/li[6]/a/span/span[1]");
		     clickByXpath("//*[@id='header']/div[2]/div/ul[2]/li[6]/a/span/span[1]");
		     Reporter.log("Click on the Created new Entity drop-down from Header | ");
		     Thread.sleep(5000);
		     Thread.sleep(5000);
		     
		     //Enter Created Entity Name in Search box
		     assertTextXpath("//*[@id='header']/div[2]/div/ul[2]/li[6]/ul/li[1]/input");
		     sendvaluebyxpath("//*[@id='header']/div[2]/div/ul[2]/li[6]/ul/li[1]/input", "Automation Test Entity");
		     Reporter.log("Enter Created Entity Name in Search box | ");
		     Thread.sleep(5000);
		     
		     //Select the Searched Entity
		     clickByXpath("//*[@id='header']/div[2]/div/ul[2]/li[6]/ul/li[2]/a");
		     Reporter.log("Select the Searched Entity | ");
		     Thread.sleep(5000);
		     Thread.sleep(5000);
		     Thread.sleep(5000);
}
	  
	  @AfterClass
	  public void EntityLogout() throws IOException, InterruptedException {
	 	  
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
