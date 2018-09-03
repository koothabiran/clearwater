package com.test;


import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ReviewsInResidualAndControls extends WrapperClass{

	private WebDriver driver;
	  String browser=null;
	 
	    
	  @BeforeClass  
	 public void ReviewsInResidualAndControlsLogin() throws IOException, InterruptedException {
			
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
	
		    //Click on Risk Response Module
	 	    assertTextXpath("//*[@id='sidebar-left']/ul/li[5]/a/span[2]");
	        clickByXpath("//*[@id='sidebar-left']/ul/li[5]/a/span[2]");
	        Reporter.log("Click on Risk Response Module | ");
	        Thread.sleep(5000);
	        Thread.sleep(5000);
		  } 
	  @Test(priority=1, enabled = true)
	   public void ResidualRatingReview () throws IOException, InterruptedException {
		   
		    Thread.sleep(5000);
	        Thread.sleep(5000);
		    Thread.sleep(5000);
	        Thread.sleep(5000);
		   
		    //Click on Risk Response List Sub-module
	        assertTextLink("Residual Rating Review");
	        clickBylinktext("Residual Rating Review");
	        Reporter.log("Click on Residual Rating Review Sub-module | ");
	        Thread.sleep(5000);
	        Thread.sleep(5000);
		   
	        // Click on Risk Treatment Type drop-down
	        assertTextXpath("//tr[5]/td[10]/cw-risk-treatment-choices/div/button");
	        clickByXpath("//tr[5]/td[10]/cw-risk-treatment-choices/div/button");
	        Reporter.log("Click on Risk Treatment Type drop-down | ");
	        Thread.sleep(5000);
	        Thread.sleep(5000);
	        
	        //Select Transfer option from Risk Treatment Type
	        assertTextXpath("//*[@id='content']/tr[5]/td[10]/cw-risk-treatment-choices/div/ul/li[4]/a");
	        clickByXpath("//*[@id='content']/tr[5]/td[10]/cw-risk-treatment-choices/div/ul/li[4]/a");
	        Reporter.log("Select Transfer option from Risk Treatment Type | ");
	        Thread.sleep(5000);
	        
	        //Click on Risk Likelihood drop-down
	        assertTextXpath("//tr[5]/td[11]/cw-risk-choices-selector/div/button");
	        clickByXpath("//tr[5]/td[11]/cw-risk-choices-selector/div/button");
	        Reporter.log("Click on Risk Likelihood drop-down | ");
	        Thread.sleep(5000);
	        
	        //Select Moderate Option from Risk Likelihood drop-down
	        assertTextXpath("//*[@id='content']/tr[5]/td[11]/cw-risk-choices-selector/div/ul/li[4]/a");
	        clickByXpath("//*[@id='content']/tr[5]/td[11]/cw-risk-choices-selector/div/ul/li[4]/a");
	        Reporter.log("Select Moderate Option from Risk Likelihood drop-down | ");
	        Thread.sleep(5000);
	        
	        //Click on Risk Impact drop-down
	        assertTextXpath("//tr[5]/td[12]/cw-risk-choices-selector/div/button");
	        clickByXpath("//tr[5]/td[12]/cw-risk-choices-selector/div/button");
	        Reporter.log("Click on Risk Impact drop-down | ");
	        Thread.sleep(5000);
	        
	        //Select Major Option from Risk Likelihood drop-down
	        assertTextXpath("//*[@id='content']/tr[5]/td[12]/cw-risk-choices-selector/div/ul/li[5]/a");
	        clickByXpath("//*[@id='content']/tr[5]/td[12]/cw-risk-choices-selector/div/ul/li[5]/a");
	        Reporter.log("Select Major Option from Risk Likelihood drop-down | ");
	        Thread.sleep(5000);
		    
	        // Click on Evaluated check-box
	        assertTextXpath("//tr[5]/td[14]/div/label");
	        clickByXpath("//tr[5]/td[14]/div/label");
	        Reporter.log("Click on Evaluated check-box | ");
	        Thread.sleep(5000);
	        Thread.sleep(5000);
	        
	        //Click on Approve Check-box
	        assertTextXpath("//tr[5]/td[15]/div/label");
	        clickByXpath("//tr[5]/td[15]/div/label");
	        Reporter.log("Click on Approve Check-box | ");
	        Thread.sleep(5000);
	        Thread.sleep(5000);
	        
	        //2nd media
	        // Click on Risk Treatment Type drop-down
	        assertTextXpath("//tr[6]/td[10]/cw-risk-treatment-choices/div/button");
	        clickByXpath("//tr[6]/td[10]/cw-risk-treatment-choices/div/button");
	        Reporter.log("Click on Risk Treatment Type drop-down | ");
	        Thread.sleep(5000);
	        Thread.sleep(5000);
	        
	        //Select Transfer option from Risk Treatment Type
	        assertTextXpath("//*[@id='content']/tr[6]/td[10]/cw-risk-treatment-choices/div/ul/li[4]/a");
	        clickByXpath("//*[@id='content']/tr[6]/td[10]/cw-risk-treatment-choices/div/ul/li[4]/a");
	        Reporter.log("Select Transfer option from Risk Treatment Type | ");
	        Thread.sleep(5000);
	        	        
	        //Click on Risk Likelihood drop-down
	        assertTextXpath("//tr[6]/td[11]/cw-risk-choices-selector/div/button");
	        clickByXpath("//tr[6]/td[11]/cw-risk-choices-selector/div/button");
	        Reporter.log("Click on Risk Likelihood drop-down | ");
	        Thread.sleep(5000);
	        
	        //Select Moderate Option from Risk Likelihood drop-down
	        assertTextXpath("//*[@id='content']/tr[6]/td[11]/cw-risk-choices-selector/div/ul/li[4]/a");
	        clickByXpath("//*[@id='content']/tr[6]/td[11]/cw-risk-choices-selector/div/ul/li[4]/a");
	        Reporter.log("Select Moderate Option from Risk Likelihood drop-down | ");
	        Thread.sleep(5000);
	        
	        //Click on Risk Impact drop-down
	        assertTextXpath("//tr[6]/td[12]/cw-risk-choices-selector/div/button");
	        clickByXpath("//tr[6]/td[12]/cw-risk-choices-selector/div/button");
	        Reporter.log("Click on Risk Impact drop-down | ");
	        Thread.sleep(5000);
	        
	        //Select Major Option from Risk Likelihood drop-down
	        assertTextXpath(".//*[@id='content']/tr[6]/td[12]/cw-risk-choices-selector/div/ul/li[5]/a");
	        clickByXpath(".//*[@id='content']/tr[6]/td[12]/cw-risk-choices-selector/div/ul/li[5]/a");
	        Reporter.log("Select Major Option from Risk Likelihood drop-down | ");
	        Thread.sleep(5000);
		    
	        // Click on Evaluated check-box
	        assertTextXpath("//tr[6]/td[14]/div/label");
	        clickByXpath("//tr[6]/td[14]/div/label");
	        Reporter.log("Click on Evaluated check-box | ");
	        Thread.sleep(5000);
	        Thread.sleep(5000);
	        
	        //Click on Approve Check-box
	        assertTextXpath("//tr[6]/td[15]/div/label");
	        clickByXpath("//tr[6]/td[15]/div/label");
	        Reporter.log("Click on Approve Check-box | ");
	        Thread.sleep(5000);
	        Thread.sleep(5000);
	        
	        //3nd media
	        // Click on Risk Treatment Type drop-down
	        assertTextXpath("//tr[7]/td[10]/cw-risk-treatment-choices/div/button");
	        clickByXpath("//tr[7]/td[10]/cw-risk-treatment-choices/div/button");
	        Reporter.log("Click on Risk Treatment Type drop-down | ");
	        Thread.sleep(5000);
	        Thread.sleep(5000);
	        
	        //Select Transfer option from Risk Treatment Type
	        assertTextXpath("//*[@id='content']/tr[7]/td[10]/cw-risk-treatment-choices/div/ul/li[4]/a");
	        clickByXpath("//*[@id='content']/tr[7]/td[10]/cw-risk-treatment-choices/div/ul/li[4]/a");
	        Reporter.log("Select Transfer option from Risk Treatment Type | ");
	        Thread.sleep(5000);
	        	        
	        //Click on Risk Likelihood drop-down
	        assertTextXpath("//tr[7]/td[11]/cw-risk-choices-selector/div/button");
	        clickByXpath("//tr[7]/td[11]/cw-risk-choices-selector/div/button");
	        Reporter.log("Click on Risk Likelihood drop-down | ");
	        Thread.sleep(5000);
	        
	        //Select Moderate Option from Risk Likelihood drop-down
	        assertTextXpath("//*[@id='content']/tr[7]/td[11]/cw-risk-choices-selector/div/ul/li[4]/a");
	        clickByXpath("//*[@id='content']/tr[7]/td[11]/cw-risk-choices-selector/div/ul/li[4]/a");
	        Reporter.log("Select Moderate Option from Risk Likelihood drop-down | ");
	        Thread.sleep(5000);
	        
	        //Click on Risk Impact drop-down
	        assertTextXpath("//tr[7]/td[12]/cw-risk-choices-selector/div/button");
	        clickByXpath("//tr[7]/td[12]/cw-risk-choices-selector/div/button");
	        Reporter.log("Click on Risk Impact drop-down | ");
	        Thread.sleep(5000);
	        
	        //Select Major Option from Risk Likelihood drop-down
	        assertTextXpath("//*[@id='content']/tr[7]/td[12]/cw-risk-choices-selector/div/ul/li[5]/a");
	        clickByXpath("//*[@id='content']/tr[7]/td[12]/cw-risk-choices-selector/div/ul/li[5]/a");
	        Reporter.log("Select Major Option from Risk Likelihood drop-down | ");
	        Thread.sleep(5000);
		    
	        // Click on Evaluated check-box
	        assertTextXpath("//tr[7]/td[14]/div/label");
	        clickByXpath("//tr[7]/td[14]/div/label");
	        Reporter.log("Click on Evaluated check-box | ");
	        Thread.sleep(5000);
	        Thread.sleep(5000);
	        
	        //Click on Approve Check-box
	        assertTextXpath("//tr[7]/td[15]/div/label");
	        clickByXpath("//tr[7]/td[15]/div/label");
	        Reporter.log("Click on Approve Check-box | ");
	        Thread.sleep(5000);
	        Thread.sleep(5000);
 }
	
	  @AfterClass
	   public void ReviewsInResidualAndControlsLogout() throws IOException, InterruptedException {
	 	  
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