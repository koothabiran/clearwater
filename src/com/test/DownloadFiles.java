package com.test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.test.WrapperClass;

public class DownloadFiles extends WrapperClass {
	
	@BeforeClass  
	 public void DownloadFilesLogin() throws IOException, InterruptedException {
		  
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
		
		//Close Dashboard Module link 
		assertTextXpath("//*[@id='sidebar-left']/ul/li[1]/a/span[2]");
		clickByXpath("//*[@id='sidebar-left']/ul/li[1]/a/span[2]");
		Reporter.log("Close Dashboard Module link  | ");
		Thread.sleep(5000);
		Thread.sleep(5000);
}
	
 @Test(priority=1, enabled = true)
 public void DownloadFilesinAsset() throws InterruptedException, IOException
	   {
    	  
   	       Thread.sleep(5000);
   	       Thread.sleep(5000);	   
   	       Thread.sleep(5000);
		  //Select the Asset module at sidebar-left
   	      assertTextXpath("//*[@id='sidebar-left']/ul/li[3]/a/span[2]");  
		  clickByXpath("//*[@id='sidebar-left']/ul/li[3]/a/span[2]");  	
		  Reporter.log("Selected the Asset module at sidebar-left | ");
		  
		  // click on Asset Inventory Import sub-modules	 
		  assertTextXpath("//*[@id='sidebar-left']/ul/li[3]/ul/li[2]/a");
		  clickByXpath("//*[@id='sidebar-left']/ul/li[3]/ul/li[2]/a");
		  Reporter.log("Clicked on Asset Inventory Import sub-modules | ");
		  Thread.sleep(5000);
		  
		  //Click on Download Asset Inventory Import Templates
		  assertTextXpath("//*[@id='cw-panelbar']/div/div[4]/ng-transclude/a");
		  clickByXpath("//*[@id='cw-panelbar']/div/div[4]/ng-transclude/a");
		  Reporter.log("Click on Download Asset Inventory Import Templates | ");
		  Thread.sleep(5000);
		  Thread.sleep(5000);
		  Thread.sleep(5000);
	   }
	  
 @Test(priority=2, enabled = true)
 public void DownloadFilesinUserList() throws InterruptedException, IOException
	   {
    	  
   	       Thread.sleep(5000);
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
		  
   	        
   	       //Click on Full screen
   	       clickByXpath("//*[@id='fullscreen']/i");
   	       Thread.sleep(5000);
   	       Thread.sleep(5000);
		   
		   //Click on User Import under User management Sub-Module
		   assertTextLink("User Import");
		   clickBylinktext("User Import");
		   Reporter.log("Click on User Import under User management Sub-Module | ");
		   Thread.sleep(5000);   	         
   	       
		  //Click on Download User Import Templates
		  assertTextXpath("//*[@id='cw-panelbar']/div/div[4]/ng-transclude/a");
		  clickByXpath("//*[@id='cw-panelbar']/div/div[4]/ng-transclude/a");
		  Reporter.log("Click on Download User Import Templates | ");
		  Thread.sleep(5000);
		  Thread.sleep(5000);
		  Thread.sleep(5000);
	   
	   }
 
	  @Test(priority=3, enabled = true)
	  public void DownloadFilesinRiskDetermination() throws InterruptedException {
		  
		  Thread.sleep(5000);
		  Thread.sleep(5000);
		  Thread.sleep(5000);
		 //Select Risk Determination sidebar-left Module
		  assertTextXpath("//*[@id='sidebar-left']/ul/li[4]/a/span[2]");
	 	  clickByXpath("//*[@id='sidebar-left']/ul/li[4]/a/span[2]");
	 	  Reporter.log("Select Risk Determination sidebar-left Module | ");
	      Thread.sleep(5000);
	       	       
		 //Select Controls - Global/Media sub-module under Risk determination Module 
	      assertTextXpath("//*[@id='sidebar-left']/ul/li[4]/ul/li[1]/a");
		  clickByXpath("//*[@id='sidebar-left']/ul/li[4]/ul/li[1]/a");
		  Reporter.log("Select Controls - Global/Media sub-module under Risk determination Module | ");
		  Thread.sleep(5000);
		  
		  //Click on Export Button
		  assertTextXpath("//*[@id='cw-panelbar']/div/div[4]/ul/li[2]/div/button");
		  clickByXpath("//*[@id='cw-panelbar']/div/div[4]/ul/li[2]/div/button");
		  Reporter.log("Click on Export Button | ");
		  Thread.sleep(5000);
		  Thread.sleep(5000);
		  
		  //Click on Pdf 
		  assertTextXpath("//*[@id='cw-panelbar']/div/div[4]/ul/li[2]/div/ul/li[2]/a");
		  clickByXpath("//*[@id='cw-panelbar']/div/div[4]/ul/li[2]/div/ul/li[2]/a");
		  Reporter.log("Click on Pdf | ");
		  Thread.sleep(5000);
		  Thread.sleep(5000);
		  
		  //Click on Export Button
		  assertTextXpath("//*[@id='cw-panelbar']/div/div[4]/ul/li[2]/div/button");
		  clickByXpath("//*[@id='cw-panelbar']/div/div[4]/ul/li[2]/div/button");
		  Reporter.log("Click on Export Button | ");
		  Thread.sleep(5000);
		  Thread.sleep(5000);
		  
		  //Click on CSV File
		  assertTextXpath("//*[@id='cw-panelbar']/div/div[4]/ul/li[2]/div/ul/li[1]/a");
		  clickByXpath("//*[@id='cw-panelbar']/div/div[4]/ul/li[2]/div/ul/li[1]/a");
		  Reporter.log("Click on CSV File | ");
		  Thread.sleep(5000);
		  Thread.sleep(5000);
	  }

      @AfterClass
      public void DownloadLogout() throws IOException, InterruptedException {
    	  
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