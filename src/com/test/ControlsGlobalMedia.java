package com.test;

import java.io.IOException;
import org.testng.Reporter;
import org.testng.annotations.*;
import org.openqa.selenium.*;
import com.test.WrapperClass;

public class ControlsGlobalMedia extends WrapperClass{
	
	  public WebDriver driver;
	  String browser=null;
	   
	  @BeforeClass	  
	  public void ControlsLogin() throws Exception {
			
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

			//Close the dashboard Module
		    assertTextXpath("//*[@id='sidebar-left']/ul/li[1]/a/span[2]");
		    clickByXpath("//*[@id='sidebar-left']/ul/li[1]/a/span[2]");
		    Reporter.log("Close the dashboard Module | ");
		    Thread.sleep(5000);
		    Thread.sleep(5000);
		    
	 	    //Select Risk Determination sidebar-left Module
		    try {
		    	assertTextXpath("//*[@id='sidebar-left']/ul/li[4]/a/span[2]");
	 	        clickByXpath("//*[@id='sidebar-left']/ul/li[4]/a/span[2]");
	 	        Reporter.log("Select Risk Determination sidebar-left Module | ");
	        }catch(Exception e)
			{
		        e.printStackTrace();
			    Reporter.log("Select Risk Determination sidebar-left Module doesn't reached | ");
			}
	        Thread.sleep(5000);
	  }  

	 @Test(priority=1, enabled =true)
	  public void  GlobalMedia() throws InterruptedException, IOException {
		  
		  Thread.sleep(5000);
         Thread.sleep(5000);
         Thread.sleep(5000);
         Thread.sleep(5000);
		  
		  //Select Controls - Global/Media sub-module under Risk determination Module 
		  assertTextXpath("//*[@id='sidebar-left']/ul/li[4]/ul/li[1]/a");
		  clickByXpath("//*[@id='sidebar-left']/ul/li[4]/ul/li[1]/a");
		  Reporter.log("Select Controls - Global/Media sub-module under Risk determination Module | ");
		  Thread.sleep(5000);
		  
		  //Select 'Yes' option in Response choice of First listed Controls
		  assertTextXpath("//*[@id='container-body']/tr[1]/td[3]/cw-s-response-choices/div/div/label[1]");
		  clickByXpath("//*[@id='container-body']/tr[1]/td[3]/cw-s-response-choices/div/div/label[1]");
		  Reporter.log("Select 'Yes' option in Response choice of First listed Controls | ");
		  Thread.sleep(5000);
		  
		  //Click on proceed button to make global
		  assertTextXpath("html/body/div[4]/div/div/div[3]/button[1]");
		  clickByXpath("html/body/div[4]/div/div/div[3]/button[1]");
		  Reporter.log("Click on Proceed button | ");
		  Thread.sleep(5000);
		  Thread.sleep(5000);
		  
		  
		  /* //Click on + Icon to open Control 
		  assertTextXpath("//*[@id='container-body']/tr[1]/td[2]/span[1]");
		  clickByXpath("//*[@id='container-body']/tr[1]/td[2]/span[1]");
		  Reporter.log("Click on + Icon to open Control | ");
		  Thread.sleep(5000);
		  Thread.sleep(5000);
		  Thread.sleep(5000);
		  
		  // Click on '-' Icon to close Controls
		  assertTextXpath("//*[@id='container-body']/tr[1]/td[2]/span[1]");
		  clickByXpath("//*[@id='container-body']/tr[1]/td[2]/span[1]");
		  Reporter.log("Click on '-' Icon to close Controls | ");
		  Thread.sleep(5000);*/
		  
		  // Click on Notes button 
		  assertTextXpath("//*[@id='container-body']/tr[1]/td[5]/div/a");
		  clickByXpath("//*[@id='container-body']/tr[1]/td[5]/div/a");
		  Reporter.log("Click on Notes button | ");
		  Thread.sleep(5000);
		  
		  // Click on New Button in Notes pop-up window
		  assertTextXpath("//*[@id='note-details-table_wrapper']/div[1]/div[1]/div/a[1]/span");
		  clickByXpath("//*[@id='note-details-table_wrapper']/div[1]/div[1]/div/a[1]/span");
		  Reporter.log("Click on New Button in Notes pop-up window | ");
		  Thread.sleep(5000);
		  
		  // Enter some text in notes Editor 
		  assertTextXpath("//*[@id='DTE_Field_text']");
		  sendvaluebyxpath("//*[@id='DTE_Field_text']", "Sample notes");
		  Reporter.log("Enter some text in notes Editor | ");
		  Thread.sleep(5000);
		  
		  // Click on Create Button in Create Note pop-up window
		  assertTextXpath("html/body/div[6]/div/div/div/div[4]/div[3]/button[1]");
		  clickByXpath("html/body/div[6]/div/div/div/div[4]/div[3]/button[1]");
		  Reporter.log("Click on Create Button in Create Note pop-up window | ");
		  Thread.sleep(5000);
		  
		  // Click on Close Button in note pop-up window
		  assertTextXpath("html/body/div[4]/div/div/div[3]/button");
		  clickByXpath("html/body/div[4]/div/div/div[3]/button");
		  Reporter.log("Click on Close Button in note pop-up window | ");
		  Thread.sleep(5000);
		  
		  // Click on Clear button to clear the response 
		  assertTextXpath("//*[@id='container-body']/tr[1]/td[4]/cw-s-response-clear/div/span/I");
		  clickByXpath("//*[@id='container-body']/tr[1]/td[4]/cw-s-response-clear/div/span/I");
		  Reporter.log("Click on Clear button to clear the response | ");
		  Thread.sleep(5000);
		  
		  // Click on cancel button in  Clear warnings pop-up 	
		  assertTextXpath("html/body/div[4]/div/div/div[3]/button[2]");
		  clickByXpath("html/body/div[4]/div/div/div[3]/button[2]");
		  Reporter.log("Click on cancel button in  Clear warnings pop-up | ");
		  Thread.sleep(5000);
		  
		  //Select 'Yes' option in Response choice of Second listed Controls
		  assertTextXpath("//*[@id='container-body']/tr[3]/td[3]/cw-s-response-choices/div/div/label[1]");
		  clickByXpath("//*[@id='container-body']/tr[3]/td[3]/cw-s-response-choices/div/div/label[1]");
		  Reporter.log("Select 'Yes' option in Response choice of Second listed Controls | ");
		  Thread.sleep(5000);
		  
		  //Select 'Yes' option in Response choice of Third listed Controls
		  assertTextXpath("//*[@id='container-body']/tr[5]/td[3]/cw-s-response-choices/div/div/label[2]");
		  clickByXpath("//*[@id='container-body']/tr[5]/td[3]/cw-s-response-choices/div/div/label[2]");
		  Reporter.log("Select 'Yes' option in Response choice of Third listed Controls | ");
		  Thread.sleep(5000);
		  
		  //Select 'Yes' option in Response choice of Four listed Controls
		  assertTextXpath("//*[@id='container-body']/tr[7]/td[3]/cw-s-response-choices/div/div/label[3]");
		  clickByXpath("//*[@id='container-body']/tr[7]/td[3]/cw-s-response-choices/div/div/label[3]");
		  Reporter.log("Select 'Yes' option in Response choice of Four listed Controls | ");
		  Thread.sleep(5000);
		  
         //Select 'Yes' option in Response choice of Fifth listed Controls
		  assertTextXpath("//*[@id='container-body']/tr[9]/td[3]/cw-s-response-choices/div/div/label[4]");
		  clickByXpath("//*[@id='container-body']/tr[9]/td[3]/cw-s-response-choices/div/div/label[4]");
		  Reporter.log("Select 'Yes' option in Response choice of Fifth listed Controls | ");
		  Thread.sleep(5000);
 
		  //Select 'Yes' option in Response choice of 6th listed Controls
		  assertTextXpath("//*[@id='container-body']/tr[11]/td[3]/cw-s-response-choices/div/div/label[2]");
		  clickByXpath("//*[@id='container-body']/tr[11]/td[3]/cw-s-response-choices/div/div/label[2]");
		  Reporter.log("Select 'Yes' option in Response choice of 6th listed Controls | ");
		  Thread.sleep(5000);
 
		  //Select 'Yes' option in Response choice of 7th listed Controls
		  assertTextXpath("//*[@id='container-body']/tr[13]/td[3]/cw-s-response-choices/div/div/label[3]");
		  clickByXpath("//*[@id='container-body']/tr[13]/td[3]/cw-s-response-choices/div/div/label[3]");
		  Reporter.log("Select 'Yes' option in Response choice of 7th listed Controls | ");
		  Thread.sleep(5000);

         //Select 'Yes' option in Response choice of 8th listed Controls
		  assertTextXpath("//*[@id='container-body']/tr[15]/td[3]/cw-s-response-choices/div/div/label[4]");
		  clickByXpath("//*[@id='container-body']/tr[15]/td[3]/cw-s-response-choices/div/div/label[4]");
		  Reporter.log("Select 'Yes' option in Response choice of 8th listed Controls | ");
		  Thread.sleep(5000);
 
		  //Select 'Yes' option in Response choice of 9th listed Controls
		  assertTextXpath("//*[@id='container-body']/tr[17]/td[3]/cw-s-response-choices/div/div/label[2]");
		  clickByXpath("//*[@id='container-body']/tr[17]/td[3]/cw-s-response-choices/div/div/label[2]");
		  Reporter.log("Select 'Yes' option in Response choice of 9th listed Controls | ");
		  Thread.sleep(5000);
 
		  //Select 'Yes' option in Response choice of 10th listed Controls
		  assertTextXpath("//*[@id='container-body']/tr[19]/td[3]/cw-s-response-choices/div/div/label[3]");
		  clickByXpath("//*[@id='container-body']/tr[19]/td[3]/cw-s-response-choices/div/div/label[3]");
		  Reporter.log("Select 'Yes' option in Response choice of 10th listed Controls | ");
		  Thread.sleep(5000);

          //Select 'Yes' option in Response choice of 11th listed Controls
		  assertTextXpath("//*[@id='container-body']/tr[21]/td[3]/cw-s-response-choices/div/div/label[1]");
		  clickByXpath("//*[@id='container-body']/tr[21]/td[3]/cw-s-response-choices/div/div/label[1]");
		  Reporter.log("Select 'Yes' option in Response choice of 11th listed Controls | ");
		  Thread.sleep(5000);
		  
		  //Click on proceed button to make global
		  assertTextXpath("html/body/div[4]/div/div/div[3]/button[1]");
		  clickByXpath("html/body/div[4]/div/div/div[3]/button[1]");
		  Reporter.log("Click on Proceed button | ");
		  Thread.sleep(5000);
		  Thread.sleep(5000);
 
		  //Select 'Yes' option in Response choice of 12th listed Controls
		  assertTextXpath("//*[@id='container-body']/tr[23]/td[3]/cw-s-response-choices/div/div/label[4]");
		  clickByXpath("//*[@id='container-body']/tr[23]/td[3]/cw-s-response-choices/div/div/label[4]");
		  Reporter.log("Select 'Yes' option in Response choice of 12th listed Controls | ");
		  Thread.sleep(5000);
 
		  //Select 'Yes' option in Response choice of 13th listed Controls
		  assertTextXpath("//*[@id='container-body']/tr[25]/td[3]/cw-s-response-choices/div/div/label[1]");
		  clickByXpath("//*[@id='container-body']/tr[25]/td[3]/cw-s-response-choices/div/div/label[1]");
		  Reporter.log("Select 'Yes' option in Response choice of 13th listed Controls | ");
		  Thread.sleep(5000);

          //Select 'Yes' option in Response choice of 14th listed Controls
		  assertTextXpath("//*[@id='container-body']/tr[27]/td[3]/cw-s-response-choices/div/div/label[2]");
		  clickByXpath("//*[@id='container-body']/tr[27]/td[3]/cw-s-response-choices/div/div/label[2]");
		  Reporter.log("Select 'Yes' option in Response choice of 14th listed Controls | ");
		  Thread.sleep(5000);
		  
		  //Click on proceed button to make global
		  assertTextXpath("html/body/div[4]/div/div/div[3]/button[1]");
		  clickByXpath("html/body/div[4]/div/div/div[3]/button[1]");
		  Reporter.log("Click on Proceed button | ");
		  Thread.sleep(5000);
		  Thread.sleep(5000);
 
		  //Select 'Yes' option in Response choice of 15th listed Controls
		  assertTextXpath("//*[@id='container-body']/tr[29]/td[3]/cw-s-response-choices/div/div/label[3]");
		  clickByXpath("//*[@id='container-body']/tr[29]/td[3]/cw-s-response-choices/div/div/label[3]");
		  Reporter.log("Select 'Yes' option in Response choice of 15th listed Controls | ");
		  Thread.sleep(5000);
 
         //Select 'Yes' option in Response choice of 16th listed Controls
		  assertTextXpath("//*[@id='container-body']/tr[31]/td[3]/cw-s-response-choices/div/div/label[3]");
		  clickByXpath("//*[@id='container-body']/tr[31]/td[3]/cw-s-response-choices/div/div/label[3]");
		  Reporter.log("Select 'Yes' option in Response choice of 16th listed Controls | ");
		  Thread.sleep(5000);

         //Select 'Yes' option in Response choice of 17th listed Controls
		  assertTextXpath("//*[@id='container-body']/tr[33]/td[3]/cw-s-response-choices/div/div/label[4]");
		  clickByXpath("//*[@id='container-body']/tr[33]/td[3]/cw-s-response-choices/div/div/label[4]");
		  Reporter.log("Select 'Yes' option in Response choice of 17th listed Controls | ");
		  Thread.sleep(5000);
 
		  //Select 'Yes' option in Response choice of 18th listed Controls
		  assertTextXpath("//*[@id='container-body']/tr[35]/td[3]/cw-s-response-choices/div/div/label[2]");
		  clickByXpath("//*[@id='container-body']/tr[35]/td[3]/cw-s-response-choices/div/div/label[2]");
		  Reporter.log("Select 'Yes' option in Response choice of 18th listed Controls | ");
		  Thread.sleep(5000);
 
		  //Select 'Yes' option in Response choice of 19th listed Controls
		  assertTextXpath("//*[@id='container-body']/tr[37]/td[3]/cw-s-response-choices/div/div/label[3]");
		  clickByXpath("//*[@id='container-body']/tr[37]/td[3]/cw-s-response-choices/div/div/label[3]");
		  Reporter.log("Select 'Yes' option in Response choice of 19th listed Controls | ");
		  Thread.sleep(5000);

         //Select 'Yes' option in Response choice of 20th listed Controls
		  assertTextXpath("//*[@id='container-body']/tr[39]/td[3]/cw-s-response-choices/div/div/label[1]");
		  clickByXpath("//*[@id='container-body']/tr[39]/td[3]/cw-s-response-choices/div/div/label[1]");
		  Reporter.log("Select 'Yes' option in Response choice of 20th listed Controls | ");
		  Thread.sleep(5000);
 
		  /*//Select 'Yes' option in Response choice of 21th listed Controls
		  assertTextXpath("//*[@id='container-body']/tr[41]/td[3]/cw-s-response-choices/div/div/label[2]");
		  clickByXpath("//*[@id='container-body']/tr[41]/td[3]/cw-s-response-choices/div/div/label[2]");
		  Reporter.log("Select 'Yes' option in Response choice of 21th listed Controls | ");
		  Thread.sleep(5000);
 
		  //Select 'Yes' option in Response choice of 22th listed Controls
		  assertTextXpath("//*[@id='container-body']/tr[43]/td[3]/cw-s-response-choices/div/div/label[3]");
		  clickByXpath("//*[@id='container-body']/tr[43]/td[3]/cw-s-response-choices/div/div/label[3]");
		  Reporter.log("Select 'Yes' option in Response choice of 22th listed Controls | ");
		  Thread.sleep(5000);

         //Select 'Yes' option in Response choice of 23th listed Controls
		  assertTextXpath("//*[@id='container-body']/tr[45]/td[3]/cw-s-response-choices/div/div/label[1]");
		  clickByXpath("//*[@id='container-body']/tr[45]/td[3]/cw-s-response-choices/div/div/label[1]");
		  Reporter.log("Select 'Yes' option in Response choice of 23th listed Controls | ");
		  Thread.sleep(5000);
 
		  //Select 'Yes' option in Response choice of 24th listed Controls
		  assertTextXpath("//*[@id='container-body']/tr[47]/td[3]/cw-s-response-choices/div/div/label[2]");
		  clickByXpath("//*[@id='container-body']/tr[47]/td[3]/cw-s-response-choices/div/div/label[2]");
		  Reporter.log("Select 'Yes' option in Response choice of 24th listed Controls | ");
		  Thread.sleep(5000);
 
		  //Select 'Yes' option in Response choice of 25th listed Controls
		  assertTextXpath("//*[@id='container-body']/tr[49]/td[3]/cw-s-response-choices/div/div/label[3]");
		  clickByXpath("//*[@id='container-body']/tr[49]/td[3]/cw-s-response-choices/div/div/label[3]");
		  Reporter.log("Select 'Yes' option in Response choice of 25th listed Controls | ");
		  Thread.sleep(5000);

         //Select 'Yes' option in Response choice of 26th listed Controls
		  assertTextXpath("//*[@id='container-body']/tr[51]/td[3]/cw-s-response-choices/div/div/label[1]");
		  clickByXpath("//*[@id='container-body']/tr[51]/td[3]/cw-s-response-choices/div/div/label[1]");
		  Reporter.log("Select 'Yes' option in Response choice of 26th listed Controls | ");
		  Thread.sleep(5000);
 
		  //Select 'Yes' option in Response choice of 27th listed Controls
		  assertTextXpath("//*[@id='container-body']/tr[53]/td[3]/cw-s-response-choices/div/div/label[2]");
		  clickByXpath("//*[@id='container-body']/tr[53]/td[3]/cw-s-response-choices/div/div/label[2]");
		  Reporter.log("Select 'Yes' option in Response choice of 27th listed Controls | ");
		  Thread.sleep(5000);
 
		  //Select 'Yes' option in Response choice of 28th listed Controls
		  assertTextXpath("//*[@id='container-body']/tr[55]/td[3]/cw-s-response-choices/div/div/label[3]");
		  clickByXpath("//*[@id='container-body']/tr[55]/td[3]/cw-s-response-choices/div/div/label[3]");
		  Reporter.log("Select 'Yes' option in Response choice of 28th listed Controls | ");
		  Thread.sleep(5000);*/
		  
	  }
	  
	  @Test(priority=2, enabled =true)
	  public void  ControlReview() throws InterruptedException, IOException {
		  
		   Thread.sleep(5000); 
		   Thread.sleep(5000); 
		   Thread.sleep(5000);
	       Thread.sleep(5000);
	      
		    //Click on Controls Review Page
	        assertTextLink("Controls Review");
		    clickBylinktext("Controls Review");
		    Reporter.log("Click on Controls Review Page | ");
		    Thread.sleep(5000);
		    	
		    //1st
		    //Click on Notes button to add text
		    assertTextXpath("//*[@id='content']/tr[1]/td[12]/div/a");
		    clickByXpath("//*[@id='content']/tr[1]/td[12]/div/a");
		    Reporter.log("Click on Notes button to add text | ");
		    Thread.sleep(5000);
		    Thread.sleep(5000);
		    
		    //Click on New button in Notes pop-up window
		    assertTextXpath("//div[2]/div/div/div/div/div/a/span");
		    clickByXpath("//div[2]/div/div/div/div/div/a/span");
		    Reporter.log("Click on New button in Notes pop-up window | ");
		    Thread.sleep(5000);
		    
		    // Enter Text for Note textarea
		    assertTextXpath("//textarea");
		    sendvaluebyxpath("//textarea", "created notes");
		    Reporter.log("Enter Text for Note textarea | ");
		    Thread.sleep(5000);
		    
		    // Click on Create Button
		    assertTextXpath("//div[4]/div[3]/button");
		    clickByXpath("//div[4]/div[3]/button");
		    Reporter.log("Click on Create Button | ");
		    Thread.sleep(5000);
		    
		    //Click on Close button in popup
		    assertTextXpath("//div[4]/div/div/div[3]/button");
		    clickByXpath("//div[4]/div/div/div[3]/button");
		    Reporter.log("Click on Close button in popup | ");
		    Thread.sleep(5000);
		    Thread.sleep(5000);
		    Thread.sleep(5000);
		   
		    //2nd
		   //Click on Notes button to add text
		    assertTextXpath("//*[@id='content']/tr[2]/td[12]/div/a");
		    clickByXpath("//*[@id='content']/tr[2]/td[12]/div/a");
		    Reporter.log("Click on Notes button to add text | ");
		    Thread.sleep(5000);
		    Thread.sleep(5000);
		    
		    //Click on New button in Notes pop-up window
		    assertTextXpath("//div[2]/div/div/div/div/div/a/span");
		    clickByXpath("//div[2]/div/div/div/div/div/a/span");
		    Reporter.log("Click on New button in Notes pop-up window | ");
		    Thread.sleep(5000);
		    
		    // Enter Text for Note textarea
		    assertTextXpath("//textarea");
		    sendvaluebyxpath("//textarea", "created notes");
		    Reporter.log("Enter Text for Note textarea | ");
		    Thread.sleep(5000);
		    
		    // Click on Create Button
		    assertTextXpath("//div[4]/div[3]/button");
		    clickByXpath("//div[4]/div[3]/button");
		    Reporter.log("Click on Create Button | ");
		    Thread.sleep(5000);
		    
		    //Click on Close button in popup
		    assertTextXpath("//div[4]/div/div/div[3]/button");
		    clickByXpath("//div[4]/div/div/div[3]/button");
		    Reporter.log("Click on Close button in popup | ");
		    Thread.sleep(5000);
		    Thread.sleep(5000);
		    Thread.sleep(5000);
		    
		    //3rd
		    //Click on Notes button to add text
		    assertTextXpath("//*[@id='content']/tr[3]/td[12]/div/a");
		    clickByXpath("//*[@id='content']/tr[3]/td[12]/div/a");
		    Reporter.log("Click on Notes button to add text | ");
		    Thread.sleep(5000);
		    Thread.sleep(5000);
		    
		    //Click on New button in Notes pop-up window
		    assertTextXpath("//div[2]/div/div/div/div/div/a/span");
		    clickByXpath("//div[2]/div/div/div/div/div/a/span");
		    Reporter.log("Click on New button in Notes pop-up window | ");
		    Thread.sleep(5000);
		    
		    // Enter Text for Note textarea
		    assertTextXpath("//textarea");
		    sendvaluebyxpath("//textarea", "created notes");
		    Reporter.log("Enter Text for Note textarea | ");
		    Thread.sleep(5000);
		    
		    // Click on Create Button
		    assertTextXpath("//div[4]/div[3]/button");
		    clickByXpath("//div[4]/div[3]/button");
		    Reporter.log("Click on Create Button | ");
		    Thread.sleep(5000);
		    
		    //Click on Close button in popup
		    assertTextXpath("//div[4]/div/div/div[3]/button");
		    clickByXpath("//div[4]/div/div/div[3]/button");
		    Reporter.log("Click on Close button in popup | ");
		    Thread.sleep(5000);
		    Thread.sleep(5000);
		    Thread.sleep(5000);
		    
		    //4th
		    //Click on Notes button to add text
		    assertTextXpath("//*[@id='content']/tr[4]/td[12]/div/a");
		    clickByXpath("//*[@id='content']/tr[4]/td[12]/div/a");
		    Reporter.log("Click on Notes button to add text | ");
		    Thread.sleep(5000);
		    Thread.sleep(5000);
		    
		    //Click on New button in Notes pop-up window
		    assertTextXpath("//div[2]/div/div/div/div/div/a/span");
		    clickByXpath("//div[2]/div/div/div/div/div/a/span");
		    Reporter.log("Click on New button in Notes pop-up window | ");
		    Thread.sleep(5000);
		    
		    // Enter Text for Note textarea
		    assertTextXpath("//textarea");
		    sendvaluebyxpath("//textarea", "created notes");
		    Reporter.log("Enter Text for Note textarea | ");
		    Thread.sleep(5000);
		    
		    // Click on Create Button
		    assertTextXpath("//div[4]/div[3]/button");
		    clickByXpath("//div[4]/div[3]/button");
		    Reporter.log("Click on Create Button | ");
		    Thread.sleep(5000);
		    
		    //Click on Close button in popup
		    assertTextXpath("//div[4]/div/div/div[3]/button");
		    clickByXpath("//div[4]/div/div/div[3]/button");
		    Reporter.log("Click on Close button in popup | ");
		    Thread.sleep(5000);
		    Thread.sleep(5000);
		    Thread.sleep(5000);
		    
		    //5th
		    //Click on Notes button to add text
		    assertTextXpath("//*[@id='content']/tr[5]/td[12]/div/a");
		    clickByXpath("//*[@id='content']/tr[5]/td[12]/div/a");
		    Reporter.log("Click on Notes button to add text | ");
		    Thread.sleep(5000);
		    Thread.sleep(5000);
		    
		    //Click on New button in Notes pop-up window
		    assertTextXpath("//div[2]/div/div/div/div/div/a/span");
		    clickByXpath("//div[2]/div/div/div/div/div/a/span");
		    Reporter.log("Click on New button in Notes pop-up window | ");
		    Thread.sleep(5000);
		    
		    // Enter Text for Note textarea
		    assertTextXpath("//textarea");
		    sendvaluebyxpath("//textarea", "created notes");
		    Reporter.log("Enter Text for Note textarea | ");
		    Thread.sleep(5000);
		    
		    // Click on Create Button
		    assertTextXpath("//div[4]/div[3]/button");
		    clickByXpath("//div[4]/div[3]/button");
		    Reporter.log("Click on Create Button | ");
		    Thread.sleep(5000);
		    
		    //Click on Close button in popup
		    assertTextXpath("//div[4]/div/div/div[3]/button");
		    clickByXpath("//div[4]/div/div/div[3]/button");
		    Reporter.log("Click on Close button in popup | ");
		    Thread.sleep(5000);
		    Thread.sleep(5000);
		    Thread.sleep(5000);
		    
		    //6th
		    //Click on Notes button to add text
		    assertTextXpath("//*[@id='content']/tr[6]/td[12]/div/a");
		    clickByXpath("//*[@id='content']/tr[6]/td[12]/div/a");
		    Reporter.log("Click on Notes button to add text | ");
		    Thread.sleep(5000);
		    Thread.sleep(5000);
		    
		    //Click on New button in Notes pop-up window
		    assertTextXpath("//div[2]/div/div/div/div/div/a/span");
		    clickByXpath("//div[2]/div/div/div/div/div/a/span");
		    Reporter.log("Click on New button in Notes pop-up window | ");
		    Thread.sleep(5000);
		    
		    // Enter Text for Note textarea
		    assertTextXpath("//textarea");
		    sendvaluebyxpath("//textarea", "created notes");
		    Reporter.log("Enter Text for Note textarea | ");
		    Thread.sleep(5000);
		    
		    // Click on Create Button
		    assertTextXpath("//div[4]/div[3]/button");
		    clickByXpath("//div[4]/div[3]/button");
		    Reporter.log("Click on Create Button | ");
		    Thread.sleep(5000);
		    
		    //Click on Close button in popup
		    assertTextXpath("//div[4]/div/div/div[3]/button");
		    clickByXpath("//div[4]/div/div/div[3]/button");
		    Reporter.log("Click on Close button in popup | ");
		    Thread.sleep(5000);
		    Thread.sleep(5000);
		    Thread.sleep(5000);
	  }
	  
	  @Test(priority=3, enabled = true)
	  public void  RatingReview() throws InterruptedException, IOException {
		  
		    Thread.sleep(5000);
		    Thread.sleep(5000);
		    Thread.sleep(5000);
		    Thread.sleep(5000);
		    
		    //Click on rating review sub-module
		    assertTextLink("Rating Review");
		    clickBylinktext("Rating Review");
		    Reporter.log("Click on rating review sub-module | ");
		    Thread.sleep(5000);
		    Thread.sleep(5000);
		    Thread.sleep(5000);

		    //Click on Vulnerability link
		    assertTextXpath("//*[@id='content']/tr[1]/td[5]/div/a");
		    clickByXpath("//*[@id='content']/tr[1]/td[5]/div/a");
		    Reporter.log("Click on 1st Vulnerability link | ");
		    Thread.sleep(5000);
		    Thread.sleep(5000);
		    Thread.sleep(5000);
		    
		    //Click on rating review sub-module
		    assertTextLink("Rating Review");
		    clickBylinktext("Rating Review");
		    Reporter.log("Click on rating review sub-module | ");
		    Thread.sleep(5000);
		    Thread.sleep(5000);
		    Thread.sleep(5000);
		    
		    
		    //Click on Vulnerability link
		    assertTextXpath("//*[@id='content']/tr[2]/td[5]/div/a");
		    clickByXpath("//*[@id='content']/tr[2]/td[5]/div/a");
		    Reporter.log("Click on 2nd Vulnerability link | ");
		    Thread.sleep(5000);
		    Thread.sleep(5000);
		    Thread.sleep(5000);
              
		    //Click on rating review sub-module
		    assertTextLink("Rating Review");
		    clickBylinktext("Rating Review");
		    Reporter.log("Click on rating review sub-module | ");
		    Thread.sleep(5000);
		    Thread.sleep(5000);
		    Thread.sleep(5000);		    
		    
		    //Click on Vulnerability link
		    assertTextXpath("//*[@id='content']/tr[3]/td[5]/div/a");
		    clickByXpath("//*[@id='content']/tr[3]/td[5]/div/a");
		    Reporter.log("Click on 3rd Vulnerability link | ");
		    Thread.sleep(5000);
		    Thread.sleep(5000);
		    Thread.sleep(5000);
		    
		    //Click on rating review sub-module
		    assertTextLink("Rating Review");
		    clickBylinktext("Rating Review");
		    Reporter.log("Click on rating review sub-module | ");
		    Thread.sleep(5000);
		    Thread.sleep(5000);
		    Thread.sleep(5000);
		    		    
		    //Click on Vulnerability link
		    assertTextXpath("//*[@id='content']/tr[4]/td[5]/div/a");
		    clickByXpath("//*[@id='content']/tr[4]/td[5]/div/a");
		    Reporter.log("Click on 4th Vulnerability link | ");
		    Thread.sleep(5000);
		    Thread.sleep(5000);
		    Thread.sleep(5000);
		    
		    //Click on rating review sub-module
		    assertTextLink("Rating Review");
		    clickBylinktext("Rating Review");
		    Reporter.log("Click on rating review sub-module | ");
		    Thread.sleep(5000);
		    Thread.sleep(5000);
		    Thread.sleep(5000);		    
		    
		    //Click on Vulnerability link
		    assertTextXpath("//*[@id='content']/tr[5]/td[5]/div/a");
		    clickByXpath("//*[@id='content']/tr[5]/td[5]/div/a");
		    Reporter.log("Click on 5th Vulnerability link | ");
		    Thread.sleep(5000);
		    Thread.sleep(5000);
		    Thread.sleep(5000);
		    
		    //Click on rating review sub-module
		    assertTextLink("Rating Review");
		    clickBylinktext("Rating Review");
		    Reporter.log("Click on rating review sub-module | ");
		    Thread.sleep(5000);
		    Thread.sleep(5000);
		    Thread.sleep(5000);	
		    
		    //1st
		    //Click on Notes button to add text
		    assertTextXpath("//*[@id='content']/tr[1]/td[10]/div/a");
		    clickByXpath("//*[@id='content']/tr[1]/td[10]/div/a");
		    Reporter.log("Click on Notes button to add text | ");
		    Thread.sleep(5000);
		    Thread.sleep(5000);
		    
		    //Click on New button in Notes pop-up window
		    assertTextXpath("//div[2]/div/div/div/div/div/a/span");
		    clickByXpath("//div[2]/div/div/div/div/div/a/span");
		    Reporter.log("Click on New button in Notes pop-up window | ");
		    Thread.sleep(5000);
		    
		    // Enter Text for Note textarea
		    assertTextXpath("//textarea");
		    sendvaluebyxpath("//textarea", "created notes");
		    Reporter.log("Enter Text for Note textarea | ");
		    Thread.sleep(5000);
		    
		    // Click on Create Button
		    assertTextXpath("//div[4]/div[3]/button");
		    clickByXpath("//div[4]/div[3]/button");
		    Reporter.log("Click on Create Button | ");
		    Thread.sleep(5000);
		    
		    //Click on Close button in popup
		    assertTextXpath("//div[4]/div/div/div[3]/button");
		    clickByXpath("//div[4]/div/div/div[3]/button");
		    Reporter.log("Click on Close button in popup | ");
		    Thread.sleep(5000);
		    Thread.sleep(5000);
		    Thread.sleep(5000);
		   
		    //2nd
		   //Click on Notes button to add text
		    assertTextXpath("//*[@id='content']/tr[2]/td[10]/div/a");
		    clickByXpath("//*[@id='content']/tr[2]/td[10]/div/a");
		    Reporter.log("Click on Notes button to add text | ");
		    Thread.sleep(5000);
		    Thread.sleep(5000);
		    
		    //Click on New button in Notes pop-up window
		    assertTextXpath("//div[2]/div/div/div/div/div/a/span");
		    clickByXpath("//div[2]/div/div/div/div/div/a/span");
		    Reporter.log("Click on New button in Notes pop-up window | ");
		    Thread.sleep(5000);
		    
		    // Enter Text for Note textarea
		    assertTextXpath("//textarea");
		    sendvaluebyxpath("//textarea", "created notes");
		    Reporter.log("Enter Text for Note textarea | ");
		    Thread.sleep(5000);
		    
		    // Click on Create Button
		    assertTextXpath("//div[4]/div[3]/button");
		    clickByXpath("//div[4]/div[3]/button");
		    Reporter.log("Click on Create Button | ");
		    Thread.sleep(5000);
		    
		    //Click on Close button in popup
		    assertTextXpath("//div[4]/div/div/div[3]/button");
		    clickByXpath("//div[4]/div/div/div[3]/button");
		    Reporter.log("Click on Close button in popup | ");
		    Thread.sleep(5000);
		    Thread.sleep(5000);
		    Thread.sleep(5000);
		    
		    //3rd
		    //Click on Notes button to add text
		    assertTextXpath("//*[@id='content']/tr[3]/td[10]/div/a");
		    clickByXpath("//*[@id='content']/tr[3]/td[10]/div/a");
		    Reporter.log("Click on Notes button to add text | ");
		    Thread.sleep(5000);
		    Thread.sleep(5000);
		    
		    //Click on New button in Notes pop-up window
		    assertTextXpath("//div[2]/div/div/div/div/div/a/span");
		    clickByXpath("//div[2]/div/div/div/div/div/a/span");
		    Reporter.log("Click on New button in Notes pop-up window | ");
		    Thread.sleep(5000);
		    
		    // Enter Text for Note textarea
		    assertTextXpath("//textarea");
		    sendvaluebyxpath("//textarea", "created notes");
		    Reporter.log("Enter Text for Note textarea | ");
		    Thread.sleep(5000);
		    
		    // Click on Create Button
		    assertTextXpath("//div[4]/div[3]/button");
		    clickByXpath("//div[4]/div[3]/button");
		    Reporter.log("Click on Create Button | ");
		    Thread.sleep(5000);
		    
		    //Click on Close button in popup
		    assertTextXpath("//div[4]/div/div/div[3]/button");
		    clickByXpath("//div[4]/div/div/div[3]/button");
		    Reporter.log("Click on Close button in popup | ");
		    Thread.sleep(5000);
		    Thread.sleep(5000);
		    Thread.sleep(5000);
		    
		    //4th
		    //Click on Notes button to add text
		    assertTextXpath("//*[@id='content']/tr[4]/td[10]/div/a");
		    clickByXpath("//*[@id='content']/tr[4]/td[10]/div/a");
		    Reporter.log("Click on Notes button to add text | ");
		    Thread.sleep(5000);
		    Thread.sleep(5000);
		    
		    //Click on New button in Notes pop-up window
		    assertTextXpath("//div[2]/div/div/div/div/div/a/span");
		    clickByXpath("//div[2]/div/div/div/div/div/a/span");
		    Reporter.log("Click on New button in Notes pop-up window | ");
		    Thread.sleep(5000);
		    
		    // Enter Text for Note textarea
		    assertTextXpath("//textarea");
		    sendvaluebyxpath("//textarea", "created notes");
		    Reporter.log("Enter Text for Note textarea | ");
		    Thread.sleep(5000);
		    
		    // Click on Create Button
		    assertTextXpath("//div[4]/div[3]/button");
		    clickByXpath("//div[4]/div[3]/button");
		    Reporter.log("Click on Create Button | ");
		    Thread.sleep(5000);
		    
		    //Click on Close button in popup
		    assertTextXpath("//div[4]/div/div/div[3]/button");
		    clickByXpath("//div[4]/div/div/div[3]/button");
		    Reporter.log("Click on Close button in popup | ");
		    Thread.sleep(5000);
		    Thread.sleep(5000);
		    Thread.sleep(5000);
		    
		    //5th
		    //Click on Notes button to add text
		    assertTextXpath("//*[@id='content']/tr[5]/td[10]/div/a");
		    clickByXpath("//*[@id='content']/tr[5]/td[10]/div/a");
		    Reporter.log("Click on Notes button to add text | ");
		    Thread.sleep(5000);
		    Thread.sleep(5000);
		    
		    //Click on New button in Notes pop-up window
		    assertTextXpath("//div[2]/div/div/div/div/div/a/span");
		    clickByXpath("//div[2]/div/div/div/div/div/a/span");
		    Reporter.log("Click on New button in Notes pop-up window | ");
		    Thread.sleep(5000);
		    
		    // Enter Text for Note textarea
		    assertTextXpath("//textarea");
		    sendvaluebyxpath("//textarea", "created notes");
		    Reporter.log("Enter Text for Note textarea | ");
		    Thread.sleep(5000);
		    
		    // Click on Create Button
		    assertTextXpath("//div[4]/div[3]/button");
		    clickByXpath("//div[4]/div[3]/button");
		    Reporter.log("Click on Create Button | ");
		    Thread.sleep(5000);
		    
		    //Click on Close button in popup
		    assertTextXpath("//div[4]/div/div/div[3]/button");
		    clickByXpath("//div[4]/div/div/div[3]/button");
		    Reporter.log("Click on Close button in popup | ");
		    Thread.sleep(5000);
		    Thread.sleep(5000);
		    Thread.sleep(5000);
		    
		    //6th
		    //Click on Notes button to add text
		    assertTextXpath("//*[@id='content']/tr[6]/td[10]/div/a");
		    clickByXpath("//*[@id='content']/tr[6]/td[10]/div/a");
		    Reporter.log("Click on Notes button to add text | ");
		    Thread.sleep(5000);
		    Thread.sleep(5000);
		    
		    //Click on New button in Notes pop-up window
		    assertTextXpath("//div[2]/div/div/div/div/div/a/span");
		    clickByXpath("//div[2]/div/div/div/div/div/a/span");
		    Reporter.log("Click on New button in Notes pop-up window | ");
		    Thread.sleep(5000);
		    
		    // Enter Text for Note textarea
		    assertTextXpath("//textarea");
		    sendvaluebyxpath("//textarea", "created notes");
		    Reporter.log("Enter Text for Note textarea | ");
		    Thread.sleep(5000);
		    
		    // Click on Create Button
		    assertTextXpath("//div[4]/div[3]/button");
		    clickByXpath("//div[4]/div[3]/button");
		    Reporter.log("Click on Create Button | ");
		    Thread.sleep(5000);
		    
		    //Click on Close button in popup
		    assertTextXpath("//div[4]/div/div/div[3]/button");
		    clickByXpath("//div[4]/div/div/div[3]/button");
		    Reporter.log("Click on Close button in popup | ");
		    Thread.sleep(5000);
		    Thread.sleep(5000);
		    Thread.sleep(5000);
	  }
	  
	  @AfterClass
	  public void RiskLogout() throws Exception {
		  
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


