package com.test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.test.WrapperClass;

public class UploadFiles extends WrapperClass{
	
	  public WebDriver driver;
	  String browser=null;
	 
	    
	 @BeforeClass  
	 public void UploadFilesLogin() throws IOException, InterruptedException {
			
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
			
			//Close the dashboard Module
		    assertTextXpath("//*[@id='sidebar-left']/ul/li[1]/a/span[2]");
		    clickByXpath("//*[@id='sidebar-left']/ul/li[1]/a/span[2]");
		    Reporter.log("Close the dashboard Module | ");
		    Thread.sleep(5000);
	  }

	   @Test(priority=1 , enabled = true)
	   public void UploadAsset() throws InterruptedException, IOException
	   {
		      
		    Thread.sleep(5000);
		    Thread.sleep(5000);  
		    		  
		    //Select the Asset module at sidebar-left
		    assertTextXpath("//*[@id='sidebar-left']/ul/li[3]/a/span[2]");
		    clickByXpath("//*[@id='sidebar-left']/ul/li[3]/a/span[2]");  	
		    Reporter.log("Selected the Asset module at sidebar-left | ");
		    Thread.sleep(5000);
	 	  
	        // click on Asset Inventory Import sub-modules	 
	 	    assertTextXpath("//*[@id='sidebar-left']/ul/li[3]/ul/li[2]/a");
	        clickByXpath("//*[@id='sidebar-left']/ul/li[3]/ul/li[2]/a");
	        Reporter.log("Clicked on Asset Inventory Import sub-modules | ");
	        Thread.sleep(5000);
	     
	        //click on Browse Button
	        assertTextXpath("//*[@id='body-content']/form/div/div[2]/div[2]/span");
	        clickByXpath("//*[@id='body-content']/form/div/div[2]/div[2]/span");
	        Reporter.log("clicked on Browser Button | ");
	        Thread.sleep(5000);
	     
	        // Using AutoIT
	        Runtime.getRuntime().exec("C:\\Users\\User\\eclipse-workspace\\ClearWater\\AutoIT\\importfiles\\Fileupload.exe"); //Uploading xls file using AutoIT
	        Reporter.log("Given Filepath of Xls file | ");
	        Thread.sleep(5000);
	        	     
	        // Click on Import Button
	        assertTextXpath("//*[@id='body-content']/form/div/div[3]/input");
	        clickByXpath("//*[@id='body-content']/form/div/div[3]/input");
	        Reporter.log("Successfully Uploaded 'Asset' XLS file | ");
	 	    Thread.sleep(5000);
	 	    Thread.sleep(5000);
	        Thread.sleep(5000);
	   }
	   
	   @Test(priority=2, enabled = true)
	   public void UserImport() throws IOException, InterruptedException {
		   
		    Thread.sleep(5000);
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
		   
		   //click on Browse Button
	       assertTextXpath("//*[@id='body-content']/form/div/div[2]/div[2]/span");
	       clickByXpath("//*[@id='body-content']/form/div/div[2]/div[2]/span");
	       Reporter.log("clicked on Browse Button | ");
	       Thread.sleep(1000);
		   
	        // Using AutoIT
	        Runtime.getRuntime().exec("C:\\Users\\User\\eclipse-workspace\\ClearWater\\AutoIT\\importfiles\\Fileupload1.exe"); //Uploading xls file using AutoIT
	        Reporter.log("Given Filepath of Xls file | ");
	        Thread.sleep(5000);
	        
	        // Click on Import Button
	        assertTextXpath("//*[@id='body-content']/form/div/div[3]/input");
	        clickByXpath("//*[@id='body-content']/form/div/div[3]/input");
	        Reporter.log("Successfully Uploaded 'User' XLS file | ");
	 	    Thread.sleep(5000);
	 	    Thread.sleep(5000);
	 	    Thread.sleep(5000);
	 	    Thread.sleep(5000);
	 	    
	   }
	   
	   @Test(priority=3, enabled = true)
	   public void UserAssignment() throws IOException, InterruptedException {
		
		    Thread.sleep(5000);
	 	    Thread.sleep(5000);
	 	    Thread.sleep(5000);
	 	    Thread.sleep(5000);
	 	    
	 	    //Click on Full screen
	 	    assertTextXpath("//*[@id='fullscreen']/i");
			clickByXpath("//*[@id='fullscreen']/i");
			Thread.sleep(5000);
			Thread.sleep(5000);
		   
		   //Click on User Assignment under User management Sub-Module
		   assertTextLink("User Assignment");
		   clickBylinktext("User Assignment");
		   Reporter.log("Click on User Assignment under User management Sub-Module | ");
		   Thread.sleep(5000);
		   
		   //Click on IRM|Analysis™ drop-down
		   assertTextXpath("//*[@id='content']/tr[1]/td[4]/div/button");
		   clickByXpath("//*[@id='content']/tr[1]/td[4]/div/button");
		   Reporter.log("Click on IRM|Analysis™ drop-down | ");
		   Thread.sleep(5000);
		   
		   //Select 'Analysis Entity Account Owner' option from drop-down
		   assertTextXpath("//*[@id='content']/tr[1]/td[4]/div/ul/li[3]/a");
		   clickByXpath("//*[@id='content']/tr[1]/td[4]/div/ul/li[3]/a");
		   Reporter.log("Select 'Analysis Entity Account Owner' option from drop-down | ");
		   Thread.sleep(5000);
		   
		   //Click on IRM|Framework™ drop-down
		   assertTextXpath("//*[@id='content']/tr[1]/td[5]/div/button");
		   clickByXpath("//*[@id='content']/tr[1]/td[5]/div/button");
		   Reporter.log("Click on IRM|Framework™ drop-down | ");
		   Thread.sleep(5000);
		   
		   //Select 'Framework Entity Account Owner' option from drop-down
		   assertTextXpath("//*[@id='content']/tr[1]/td[5]/div/ul/li[3]/a");
		   clickByXpath("//*[@id='content']/tr[1]/td[5]/div/ul/li[3]/a");
		   Reporter.log("Select 'Framework Entity Account Owner' option from drop-down | ");
		   Thread.sleep(5000);
		   
		   //Click on IRM|Privacy™ drop-down
		   assertTextXpath("//*[@id='content']/tr[1]/td[6]/div/button");
		   clickByXpath("//*[@id='content']/tr[1]/td[6]/div/button");
		   Reporter.log("Click on IRM|Privacy™ drop-down | ");
		   Thread.sleep(5000);
		   
		   //Select 'Privacy Entity Account Owner' option from drop-down
		   assertTextXpath("//*[@id='content']/tr[1]/td[6]/div/ul/li[3]/a");
		   clickByXpath("//*[@id='content']/tr[1]/td[6]/div/ul/li[3]/a");
		   Reporter.log("Select 'Privacy Entity Account Owner' option from drop-down | ");
		   Thread.sleep(5000);
		   
		   //Click on IRM|Security™ drop-down
		   assertTextXpath("//*[@id='content']/tr[1]/td[7]/div/button");
		   clickByXpath("//*[@id='content']/tr[1]/td[7]/div/button");
		   Reporter.log("Click on IRM|Security™ drop-down | ");
		   Thread.sleep(5000);
		   
		   //Select 'Security Entity Account Owner' option from drop-down
		   assertTextXpath("//*[@id='content']/tr[1]/td[7]/div/ul/li[3]/a");
		   clickByXpath("//*[@id='content']/tr[1]/td[7]/div/ul/li[3]/a");
		   Reporter.log("Select 'Security Entity Account Owner' option from drop-down | ");
		   Thread.sleep(5000);
		   Thread.sleep(5000);
		   Thread.sleep(5000);		   
		   
		   //Click on User List under User management Sub-Module
		   assertTextLink("User List");
		   clickBylinktext("User List");
		   Reporter.log("Click on User List under User management Sub-Module | ");
		   Thread.sleep(5000);
		    
		   //Select any of the listed User from drop-down
		   assertTextXpath("//*[@id='user-management']/tbody/tr[1]/td[1]");
		   clickByXpath("//*[@id='user-management']/tbody/tr[1]/td[1]");
		   Reporter.log("Select any of the listed User from drop-down | ");
		   Thread.sleep(5000);
		   
		   // Click on Edit Button 
		   assertTextXpath("//*[@id='user-management_wrapper']/div[1]/div[1]/div/a[2]");
		   clickByXpath("//*[@id='user-management_wrapper']/div[1]/div[1]/div/a[2]");
		   Reporter.log("Click on Edit Button | ");
		   Thread.sleep(5000);
		   Thread.sleep(5000);
		   
		   // CLick on Save button
		   assertTextXpath("//*[@id='submit-button']");
		   clickByXpath("//*[@id='submit-button']");
		   Reporter.log("Click on Save Button | ");
		   Thread.sleep(5000);
		   Thread.sleep(5000);
		   Thread.sleep(5000);
		   
	   }
	   @Test(priority=4 , enabled = true)
	   public void UploadDocuments() throws InterruptedException, IOException
	   {
		      
		    Thread.sleep(5000);
		    Thread.sleep(5000);  
		    		  
		    //Select the Document module at sidebar-left
		    assertTextXpath("//*[@id='sidebar-left']/ul/li[6]/a/span[2]");
		    clickByXpath("//*[@id='sidebar-left']/ul/li[6]/a/span[2]");  	
		    Reporter.log("Selected the Document module at sidebar-left | ");
		    Thread.sleep(5000);
	 	  
		    //1st file
	        // Click on Upload Button
	 	    assertTextXpath("//*[@id='cw-panelbar']/div/div[4]/ng-transclude/span/div/span");
	        clickByXpath("//*[@id='cw-panelbar']/div/div[4]/ng-transclude/span/div/span");
	        Reporter.log("Click on Upload Button | ");
	        Thread.sleep(5000);
	     
	        //Click on Select File
	        assertTextXpath("//*[@id='document-upload-modal']/div/div/div[2]/div/div/form/label/div");
	        clickByXpath("//*[@id='document-upload-modal']/div/div/div[2]/div/div/form/label/div");
	        Reporter.log("clicked on Browser Button | ");
	        Thread.sleep(5000);
	     
	        // Using AutoIT
	        Runtime.getRuntime().exec("C:\\Users\\User\\eclipse-workspace\\ClearWater\\AutoIT\\importfiles\\Fileupload2.exe"); //Uploading xls file using AutoIT
	        Reporter.log("Given Filepath of pdf file | ");
	        Thread.sleep(5000);
	        	     
	        // Click on Upload Button
	        assertTextXpath("//*[@id='document-upload-modal']/div/div/div[3]/button[2]");
	        clickByXpath("//*[@id='document-upload-modal']/div/div/div[3]/button[2]");
	        Reporter.log("Successfully Uploaded 'CSVDoc' file | ");
	 	    Thread.sleep(5000);
	 	    Thread.sleep(5000);
	        Thread.sleep(5000);
	        
	        //2nd file
	        // Click on Upload Button
	 	    assertTextXpath("//*[@id='cw-panelbar']/div/div[4]/ng-transclude/span/div/span");
	        clickByXpath("//*[@id='cw-panelbar']/div/div[4]/ng-transclude/span/div/span");
	        Reporter.log("Click on Upload Button | ");
	        Thread.sleep(5000);
	     
	        //Click on Select File
	        assertTextXpath("//*[@id='document-upload-modal']/div/div/div[2]/div/div/form/label/div");
	        clickByXpath("//*[@id='document-upload-modal']/div/div/div[2]/div/div/form/label/div");
	        Reporter.log("clicked on Browser Button | ");
	        Thread.sleep(5000);
	     
	        // Using AutoIT
	        Runtime.getRuntime().exec("C:\\Users\\User\\eclipse-workspace\\ClearWater\\AutoIT\\importfiles\\Fileupload3.exe"); //Uploading xls file using AutoIT
	        Reporter.log("Given Filepath of csv file | ");
	        Thread.sleep(5000);
	        	     
	        // Click on Upload Button
	        assertTextXpath("//*[@id='document-upload-modal']/div/div/div[3]/button[2]");
	        clickByXpath("//*[@id='document-upload-modal']/div/div/div[3]/button[2]");
	        Reporter.log("Successfully Uploaded 'CSVDoc' file | ");
	 	    Thread.sleep(5000);
	 	    Thread.sleep(5000);
	        Thread.sleep(5000);
	        
	        //3rd file
	        // Click on Upload Button
	 	    assertTextXpath("//*[@id='cw-panelbar']/div/div[4]/ng-transclude/span/div/span");
	        clickByXpath("//*[@id='cw-panelbar']/div/div[4]/ng-transclude/span/div/span");
	        Reporter.log("Click on Upload Button | ");
	        Thread.sleep(5000);
	     
	        //Click on Select File
	        assertTextXpath("//*[@id='document-upload-modal']/div/div/div[2]/div/div/form/label/div");
	        clickByXpath("//*[@id='document-upload-modal']/div/div/div[2]/div/div/form/label/div");
	        Reporter.log("clicked on Browser Button | ");
	        Thread.sleep(5000);
	     
	        // Using AutoIT
	        Runtime.getRuntime().exec("C:\\Users\\User\\eclipse-workspace\\ClearWater\\AutoIT\\importfiles\\Fileupload.exe"); //Uploading xls file using AutoIT
	        Reporter.log("Given Filepath of xls file | ");
	        Thread.sleep(5000);
	        	     
	        // Click on Upload Button
	        assertTextXpath("//*[@id='document-upload-modal']/div/div/div[3]/button[2]");
	        clickByXpath("//*[@id='document-upload-modal']/div/div/div[3]/button[2]");
	        Reporter.log("Successfully Uploaded 'xlsDoc' file | ");
	 	    Thread.sleep(5000);
	 	    Thread.sleep(5000);
	        Thread.sleep(5000);
	        
	        //4th file
	        // Click on Upload Button
	 	    assertTextXpath("//*[@id='cw-panelbar']/div/div[4]/ng-transclude/span/div/span");
	        clickByXpath("//*[@id='cw-panelbar']/div/div[4]/ng-transclude/span/div/span");
	        Reporter.log("Click on Upload Button | ");
	        Thread.sleep(5000);
	     
	        //Click on Select File
	        assertTextXpath("//*[@id='document-upload-modal']/div/div/div[2]/div/div/form/label/div");
	        clickByXpath("//*[@id='document-upload-modal']/div/div/div[2]/div/div/form/label/div");
	        Reporter.log("clicked on Browser Button | ");
	        Thread.sleep(5000);
	     
	        // Using AutoIT
	        Runtime.getRuntime().exec("C:\\Users\\User\\eclipse-workspace\\ClearWater\\AutoIT\\importfiles\\Fileupload4.exe"); //Uploading xls file using AutoIT
	        Reporter.log("Given Filepath of image file | ");
	        Thread.sleep(5000);
	        	     
	        // Click on Upload Button
	        assertTextXpath("//*[@id='document-upload-modal']/div/div/div[3]/button[2]");
	        clickByXpath("//*[@id='document-upload-modal']/div/div/div[3]/button[2]");
	        Reporter.log("Successfully Uploaded 'CSVDoc' file | ");
	 	    Thread.sleep(5000);
	 	    Thread.sleep(5000);
	        Thread.sleep(5000);
	        
	        //5th file
	        // Click on Upload Button
	 	    assertTextXpath("//*[@id='cw-panelbar']/div/div[4]/ng-transclude/span/div/span");
	        clickByXpath("//*[@id='cw-panelbar']/div/div[4]/ng-transclude/span/div/span");
	        Reporter.log("Click on Upload Button | ");
	        Thread.sleep(5000);
	     
	        //Click on Select File
	        assertTextXpath("//*[@id='document-upload-modal']/div/div/div[2]/div/div/form/label/div");
	        clickByXpath("//*[@id='document-upload-modal']/div/div/div[2]/div/div/form/label/div");
	        Reporter.log("clicked on Browser Button | ");
	        Thread.sleep(5000);
	     
	        // Using AutoIT
	        Runtime.getRuntime().exec("C:\\Users\\User\\eclipse-workspace\\ClearWater\\AutoIT\\importfiles\\Fileupload5.exe"); //Uploading xls file using AutoIT
	        Reporter.log("Given Filepath of image file | ");
	        Thread.sleep(5000);
	        	     
	        // Click on Upload Button
	        assertTextXpath("//*[@id='document-upload-modal']/div/div/div[3]/button[2]");
	        clickByXpath("//*[@id='document-upload-modal']/div/div/div[3]/button[2]");
	        Reporter.log("Successfully Uploaded 'CSVDoc' file | ");
	 	    Thread.sleep(5000);
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
