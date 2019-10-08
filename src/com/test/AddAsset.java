package com.test;

import java.io.IOException;
import org.testng.Reporter;
import org.testng.annotations.*;
import org.openqa.selenium.*;
import com.test.WrapperClass;


public class AddAsset extends WrapperClass{
	
  public WebDriver driver;
  String browser=null;
 
    
  @BeforeClass  
 public void AssetLogin() throws IOException, InterruptedException {
		
	    String[][] data = getlogin();
		String emailId= data[0][0];
		String password= data[0][1];
		browser = data [0][2];
		String Url = data [0][3];
		
		//LaunchBrowser 		
		launchBroswer(browser,Url);
		Reporter.log("Broser Launched successfully | ");
		Thread.sleep(5000);
		Thread.sleep(5000);
	    
		//Enter EmailID in Textbox
		assertTextXpath("html/body/div[1]/div[1]/form/div[2]/div/section[1]/input[1]");
		sendvaluebyxpath("html/body/div[1]/div[1]/form/div[2]/div/section[1]/input[1]","sathyanarayanan.var+57@sybrant.com");
		Reporter.log("Enter EmailID successfully | ");
		Thread.sleep(5000);
		Thread.sleep(5000);
		
		//Enter Password in Textbox
		assertTextXpath("//input[2]");
		sendvaluebyxpath("//input[2]","Micro5478*");
		Reporter.log("Enter Password successfully | ");
		Thread.sleep(5000);
		Thread.sleep(5000);

		//Click on SignIN button
		try {
		assertTextXpath("html/body/div[1]/div[1]/form/div[2]/div/section[1]/div/a[2]");
		clickByXpath("html/body/div[1]/div[1]/form/div[2]/div/section[1]/div/a[2]");  
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
	  
	    //Select the Asset module at sidebar-left
	    assertTextXpath("//*[@id='sidebar-left']/ul/li[3]/a/span[2]");
	    clickByXpath("//*[@id='sidebar-left']/ul/li[3]/a/span[2]");  	
	    Reporter.log("Selected the Asset module at sidebar-left | ");
	    Thread.sleep(5000);
	    
	  }
 
   @Test(priority=1, enabled = true)
   public void FirstAsset() throws IOException, InterruptedException {

	     Thread.sleep(5000);
	     Thread.sleep(5000);
	     
	    //Select Asset Inventory List Sub-module
	    assertTextXpath("//*[@id='sidebar-left']/ul/li[3]/ul/li[1]/a");
	    clickByXpath("//*[@id='sidebar-left']/ul/li[3]/ul/li[1]/a");
	    Reporter.log("Selected Asset Inventory List Sub-module | ");
	    Thread.sleep(5000);
      
        //Asset Wizard information window get open and Click 'Add Form' button
	    assertTextXpath("//*[@id='asset-inventory-selector-main-content']/div[1]/div/div[2]/div/table/tbody/tr[2]/th[3]/span");
        clickByXpath("//*[@id='asset-inventory-selector-main-content']/div[1]/div/div[2]/div/table/tbody/tr[2]/th[3]/span");
        Reporter.log("Asset Wizard information window get open and Clicked 'Add Form' button | ");
        Thread.sleep(5000);
      
        //Create Form Page Is displayed and started filling data for Asset   
        assertTextXpath("//*[@id='name']");
        sendvaluebyxpath("//*[@id='name']", "Creating Asset through Automation");
        Reporter.log("Create Form Page is displayed and started filling datas for Asset | ");      
        Thread.sleep(5000);
      
        //Fill data for Description 
        assertTextXpath("//*[@id='description']");
        sendvaluebyxpath("//*[@id='description']", "Sample Description");
        Reporter.log("Filled data for Description | ");
        Thread.sleep(5000);
        Thread.sleep(5000);
      
        //Fill data for Media Devices
        assertTextXpath("//*[@id='assetInventory']/div[3]/div[1]/div[2]/div[2]/div[1]/div/div[1]/label");
        clickByXpath("//*[@id='assetInventory']/div[3]/div[1]/div[2]/div[2]/div[1]/div/div[1]/label");
        Reporter.log("Backup Media Devices | ");
        Thread.sleep(5000);
      
        //Fill data for Media Devices
        assertTextXpath("//*[@id='assetInventory']/div[3]/div[1]/div[2]/div[2]/div[1]/div/div[2]/label");
        clickByXpath("//*[@id='assetInventory']/div[3]/div[1]/div[2]/div[2]/div[1]/div/div[2]/label");
        Reporter.log("Desktop Devices | ");
        Thread.sleep(5000);
        
        //Fill data for Media Devices
        assertTextXpath("//*[@id='assetInventory']/div[3]/div[1]/div[2]/div[2]/div[1]/div/div[3]/label");
        clickByXpath("//*[@id='assetInventory']/div[3]/div[1]/div[2]/div[2]/div[1]/div/div[3]/label");
        Reporter.log("Desktop or Laptop Devices | ");
        Thread.sleep(5000);
        Thread.sleep(5000);
        
        //Fill data for Media Devices
        assertTextXpath("//*[@id='assetInventory']/div[3]/div[1]/div[2]/div[2]/div[1]/div/div[5]/label");
        clickByXpath("//*[@id='assetInventory']/div[3]/div[1]/div[2]/div[2]/div[1]/div/div[5]/label");
        Reporter.log("Disk Array Devices | ");
        Thread.sleep(5000);
        Thread.sleep(5000);           
        
        //Fill data for Media Devices
        assertTextXpath("//*[@id='assetInventory']/div[3]/div[1]/div[2]/div[2]/div[1]/div/div[7]/label");
        clickByXpath("//*[@id='assetInventory']/div[3]/div[1]/div[2]/div[2]/div[1]/div/div[7]/label");
        Reporter.log("Laptop Devices | ");
        Thread.sleep(5000);
        Thread.sleep(5000);        
        
        //Fill data for Media Devices
        assertTextXpath("//*[@id='assetInventory']/div[3]/div[1]/div[2]/div[2]/div[1]/div/div[9]/label");
        clickByXpath("//*[@id='assetInventory']/div[3]/div[1]/div[2]/div[2]/div[1]/div/div[9]/label");
        Reporter.log("Scanners, Printers or Copiers Devices | ");
        Thread.sleep(5000);
        Thread.sleep(5000);          
        
        //Fill data for Media Devices
        assertTextXpath("//*[@id='assetInventory']/div[3]/div[1]/div[2]/div[2]/div[1]/div/div[11]/label");
        clickByXpath("//*[@id='assetInventory']/div[3]/div[1]/div[2]/div[2]/div[1]/div/div[11]/label");
        Reporter.log("Smartphone Devices | ");
        Thread.sleep(5000);
        Thread.sleep(5000);        
              
        //Fill data for Media Devices
        assertTextXpath("//*[@id='assetInventory']/div[3]/div[1]/div[2]/div[2]/div[1]/div/div[13]/label");
        clickByXpath("//*[@id='assetInventory']/div[3]/div[1]/div[2]/div[2]/div[1]/div/div[13]/label");
        Reporter.log("Tablet Devices | ");
        Thread.sleep(5000);
        Thread.sleep(5000);
        
        //Fill data for Media Devices
        assertTextXpath("//*[@id='assetInventory']/div[3]/div[1]/div[2]/div[2]/div[1]/div/div[4]/label");
        clickByXpath("//*[@id='assetInventory']/div[3]/div[1]/div[2]/div[2]/div[1]/div/div[4]/label");
        Reporter.log("Digital Camera Devices | ");
        Thread.sleep(5000);
        
        //Fill data for Media Devices
        assertTextXpath("//*[@id='assetInventory']/div[3]/div[1]/div[2]/div[2]/div[1]/div/div[10]/label");
        clickByXpath("//*[@id='assetInventory']/div[3]/div[1]/div[2]/div[2]/div[1]/div/div[10]/label");
        Reporter.log("Server Devices | ");
        Thread.sleep(5000);
        
        //Fill data for Media Devices
        assertTextXpath("//*[@id='assetInventory']/div[3]/div[1]/div[2]/div[2]/div[1]/div/div[14]/label");
        clickByXpath("//*[@id='assetInventory']/div[3]/div[1]/div[2]/div[2]/div[1]/div/div[14]/label");
        Reporter.log("USB key or flash drive Devices | ");
        Thread.sleep(5000);
        
        //Fill data for Media Devices
        assertTextXpath("//*[@id='assetInventory']/div[3]/div[1]/div[2]/div[2]/div[1]/div/div[8]/label");
        clickByXpath("//*[@id='assetInventory']/div[3]/div[1]/div[2]/div[2]/div[1]/div/div[8]/label");
        Reporter.log("Pager Devices | ");
        Thread.sleep(5000);
      
        //Fill data for Media Third party 
        assertTextXpath("//*[@id='assetInventory']/div[3]/div[1]/div[2]/div[2]/div[2]/div/div[3]/label");
        clickByXpath("//*[@id='assetInventory']/div[3]/div[1]/div[2]/div[2]/div[2]/div/div[3]/label");
        Reporter.log("Filled data for Media Third party | ");
        Thread.sleep(5000);
        
        //Fill data for Media Devices
        assertTextXpath("//*[@id='assetInventory']/div[3]/div[1]/div[2]/div[2]/div[1]/div/div[12]/label");
        clickByXpath("//*[@id='assetInventory']/div[3]/div[1]/div[2]/div[2]/div[1]/div/div[12]/label");
        Reporter.log("Storage Area Network Devices | ");
        Thread.sleep(5000);
      
        //Fill data for Media Third party 
        assertTextXpath("//*[@id='assetInventory']/div[3]/div[1]/div[2]/div[2]/div[2]/div/div[2]/label");
        clickByXpath("//*[@id='assetInventory']/div[3]/div[1]/div[2]/div[2]/div[2]/div/div[2]/label");
        Reporter.log("Filled data for Media Third party | ");
        Thread.sleep(5000);
        
        //Fill data for Media Devices
        assertTextXpath("//*[@id='assetInventory']/div[3]/div[1]/div[2]/div[2]/div[1]/div/div[6]/label");
        clickByXpath("//*[@id='assetInventory']/div[3]/div[1]/div[2]/div[2]/div[1]/div/div[6]/label");
        Reporter.log("Electronic Medical Device Devices | ");
        Thread.sleep(5000);
     
        //Fill data for Source
        assertTextXpath("//*[@id='source']");
        sendvaluebyxpath("//*[@id='source']", "sample source");
        Reporter.log("Filled data for Source | ");
        Thread.sleep(5000);
      
        //Fill data for Share
        assertTextXpath("//*[@id='shared_with']");
        sendvaluebyxpath("//*[@id='shared_with']", "Sample share");
        Reporter.log("Filled data for Share | ");
        Thread.sleep(5000);
      
        //Fill data for location
        assertTextXpath("//*[@id='physical_location']");
        sendvaluebyxpath("//*[@id='physical_location']", "sample Location");
        Reporter.log("Filled data for location | ");
        Thread.sleep(5000);
      
        //Fill data for Number of user
        assertTextXpath("//*[@id='number_of_users']");
        sendvaluebyxpath("//*[@id='number_of_users']", "1000");
        Reporter.log("Filled data for Number of user | ");
        Thread.sleep(5000);
      
        //Fill data for FirstName
        assertTextXpath("//*[@id='bo_first_name']");
        sendvaluebyxpath("//*[@id='bo_first_name']", "Uma User");
        Reporter.log("Filled data for FirstName | ");
        Thread.sleep(5000);
      
        //Fill data for LastName     
        assertTextXpath("//*[@id='bo_last_name']");
        sendvaluebyxpath("//*[@id='bo_last_name']", "Automation");
        Reporter.log("Filled data for LastName | ");
        Thread.sleep(5000);
      
        //Important of Asset drop-down
        selectByXpath_Visibletext("//*[@id='importance_option_id']", "3 - Important");
        Reporter.log("Important of Asset drop-down | ");
        Thread.sleep(5000);
      
       //click on Done button and save  
        assertTextXpath("//*[@id='submitButton']/div[2]");
        clickByXpath("//*[@id='submitButton']/div[2]");     
        Reporter.log("Successfully Asset created | ");
        Thread.sleep(5000);
        Thread.sleep(5000);
    	Thread.sleep(5000);
    	
   }   
   
      @Test(priority=2, enabled = true)
	  public void NewAddAsset() throws IOException, InterruptedException {
		  
		    Thread.sleep(5000);
		    Thread.sleep(5000);
		    Thread.sleep(5000);
		    Thread.sleep(5000);
		    Thread.sleep(5000);
	      
	        //Click on New button 
	        try {
	        	assertTextXpath("//*[@id='assets_wrapper']/div[1]/div[1]/div[1]/a[1]/span");
	            clickByXpath("//*[@id='assets_wrapper']/div[1]/div[1]/div[1]/a[1]/span");
	            Reporter.log("Click on New button | ");
		    }catch(Exception e)
			{
			    e.printStackTrace();
			    Reporter.log("Click on New button doesn't work | ");
			}
	        Thread.sleep(5000);
	      
	        //Create Form Page Is displayed and started filling data for Asset
	        try {
	        	 assertTextXpath("//*[@id='name']");
	             sendvaluebyxpath("//*[@id='name']", "Creating Asset Using New Button");
	             Reporter.log("Create Form Page is displayed and started filling datas for Asset | ");
	        }catch(Exception e)
			{
			     e.printStackTrace();
			     Reporter.log("Create Form Page doesn't reached | ");
			}
	        Thread.sleep(5000);
	     
	        // Fill data for Media Devices
	        try {
	        	assertTextXpath("//*[@id='assetInventory']/div[3]/div[1]/div[2]/div[2]/div[1]/div/div[14]/label");
	            clickByXpath("//*[@id='assetInventory']/div[3]/div[1]/div[2]/div[2]/div[1]/div/div[14]/label");
	            Reporter.log("Filled data for Media Devices | ");
	        }catch(Exception e)
			{
			    e.printStackTrace();
			    Reporter.log("Fill data for Media Devices doesn't enter | ");
			}
	        Thread.sleep(5000);
	     
	        // Fill data for FirstName
	        try {
	        	assertTextXpath("//*[@id='bo_first_name']");
	            sendvaluebyxpath("//*[@id='bo_first_name']", "New User");
	            Reporter.log("Filled data for FirstName | ");
	        }catch(Exception e)
			{
			    e.printStackTrace();
			    Reporter.log("Fill data for FirstName doesn't enter | ");
			}
	        Thread.sleep(5000);
	      
	       // Fill data for LastName
	       try {
	    	   assertTextXpath("//*[@id='bo_last_name']");
	           sendvaluebyxpath("//*[@id='bo_last_name']", "New name");
	           Reporter.log("Filled data for LastName | ");
	       }catch(Exception e)
		   {
			   e.printStackTrace();
			   Reporter.log("Fill data for LastName doesn't enter | ");
			}
	        Thread.sleep(5000);
	      
	        // click on Done button and save
	        try {
	        	assertTextXpath("//*[@id='submitButton']/div[2]");
	            clickByXpath("//*[@id='submitButton']/div[2]"); 
	            Thread.sleep(5000);      
	            Reporter.log("Successfully Asset created | ");
	        }catch(Exception e)
			{
			    e.printStackTrace();
			    Reporter.log("Newly Asset created doesn't work | ");
			}
	        Thread.sleep(5000); 
	        Thread.sleep(5000); 
	        Thread.sleep(5000); 
	        Thread.sleep(5000); 
	        
	  }
   
   @Test(priority=3, enabled = true)
   public void EditAsset() throws InterruptedException, IOException
   {
	    Thread.sleep(5000);
	    
 	    // Select one of the added Asset in Asset Inventory List
	    assertTextXpath("//*[@id='assets']/tbody/tr/td[2]");
 	    clickByXpath("//*[@id='assets']/tbody/tr/td[2]");
        Reporter.log("Select one of the added Asset in Asset Inventory List | ");
        Thread.sleep(5000); 
 	  
        // Click on Edit button for listed Asset
        assertTextXpath("//*[@id='assets_wrapper']/div[1]/div[1]/div[1]/a[2]");
        clickByXpath("//*[@id='assets_wrapper']/div[1]/div[1]/div[1]/a[2]");
        Reporter.log("Click on Edit button for listed Asset | ");
 	    Thread.sleep(5000);
       
 	    // Fill data for FirstName
 	    assertTextXpath("//*[@id='bo_first_name']");
        sendvaluebyxpath("//*[@id='bo_first_name']", "Edit Uma User");
        Reporter.log("Fill data for FirstName | ");      
        Thread.sleep(5000);
       
        // Fill data for LastName
        assertTextXpath("//*[@id='bo_last_name']");
        sendvaluebyxpath("//*[@id='bo_last_name']", "Edit Automation");
        Reporter.log("Fill data for LastName | ");      
        Thread.sleep(5000);
 	    
        // click on Done button and save
        assertTextXpath("//*[@id='submitButton']/div[2]");
        clickByXpath("//*[@id='submitButton']/div[2]");   
        Thread.sleep(5000);    
        Reporter.log("Edit Asset datas updated Successfully | ");
        Thread.sleep(5000);
        Thread.sleep(5000);
	    Thread.sleep(5000);	 
   }
     
   @Test(priority=4, enabled = true)
   public void MediaAssetGroups() throws InterruptedException, IOException
   {     
 	     Thread.sleep(5000);  
	     Thread.sleep(5000);
	     Thread.sleep(5000);
		 Thread.sleep(5000);	 
	     
 	    // Select the Media/Asset Groups sub-modules listed in Asset Inventory List	  
	    assertTextXpath("//*[@id='sidebar-left']/ul/li[3]/ul/li[3]/a");
        clickByXpath("//*[@id='sidebar-left']/ul/li[3]/ul/li[3]/a");
        Reporter.log("Select the Media/Asset Groups sub-modules listed in Asset Inventory List | ");
 	    Thread.sleep(5000); 
 	   
 	    // Select the Edit button of BackUp Media in Media/Asset Groups page
 	    assertTextXpath("//*[@id='content']/div[2]/div[1]/div/div[2]/div[2]/div[5]/div[1]/a");
        clickByXpath("//*[@id='content']/div[2]/div[1]/div/div[2]/div[2]/div[5]/div[1]/a");
        Reporter.log("Select the Edit button of BackUp Media in Media/Asset Groups page | ");
 	    Thread.sleep(5000);
 	   
 	    // Enter Label in Edit Media/Asset Groups
 	    assertTextXpath("//td[3]/input");
 	    sendvaluebyxpath("//td[3]/input", "sample Backup label");
 	    Reporter.log("Enter label in Edit Media/Asset Groups | ");
 	    Thread.sleep(5000); 
 	   
 	    // Select the Risk Analysis for Edit Media/Asset Groups
 	    selectByXpath_Visibletext("//select[@id='']", "Uma M");
 	    Reporter.log("Select the Risk Analysis for Edit Media/Asset Groups | ");
 	    Thread.sleep(5000); 
 	   
 	    // Select the added calendar for Edit Media/Asset Groups
 	    sendvaluebyxpath("//td[5]/input", "08/28/2017");
 	    Reporter.log("Select the added calendar for Edit Media/Asset Groups | ");
 	    Thread.sleep(5000); 
 	   
 	    /*// Select the drag Asset and drop into INBOX
 	    dragAnddropByXpath("//li/div[2]", "//*[@id='newBox']");
 	    Reporter.log("Select the drag Asset and drop into INBOX | ");
 	    Thread.sleep(5000);
 	   
 	    //Move this Item Window appears and click on Proceed button
 	    assertTextXpath("html/body/div[5]/div/div/div[3]/button[1]");
 	    clickByXpath("html/body/div[5]/div/div/div[3]/button[1]");
 	    Reporter.log("Move this Item Window appears and click on Proceed button | ");*/
 	    Thread.sleep(5000); 
 	    Thread.sleep(5000); 
 	   		 	    
 	    //Click on Save Button
 	    assertTextXpath("//*[@id='save']");
        clickByXpath("//*[@id='save']");
        Reporter.log("Click on Save Button | ");
 	    Thread.sleep(5000); 
 	   
 	    // Delete the Asset in Media/Asset Groups
 	    assertTextXpath("//*[@id='content']/div[2]/div[1]/div/div[2]/div[2]/div[5]/div[2]/a");
 	    clickByXpath("//*[@id='content']/div[2]/div[1]/div/div[2]/div[2]/div[5]/div[2]/a");
 	    Reporter.log("Delete the Asset in Media/Asset Groups | ");
 	    Thread.sleep(5000); 
 	   
 	    //warning pop-up get appears and click on cancel button
 	    assertTextXpath("html/body/div[4]/div/div/div[3]/button[2]");
 	    clickByXpath("html/body/div[4]/div/div/div[3]/button[2]");
 	    Reporter.log("warning pop-up get appears and click on cancel button | ");
 	    Thread.sleep(5000); 
 	    
 	    // Select the Edit button of Desktop in Media/Asset Groups page
 	    assertTextXpath("//*[@id='content']/div[2]/div[2]/div/div[2]/div[2]/div[5]/div[1]/a");
        clickByXpath("//*[@id='content']/div[2]/div[2]/div/div[2]/div[2]/div[5]/div[1]/a");
        Reporter.log("Select the Edit button of Desktop in Media/Asset Groups page | ");
 	    Thread.sleep(5000);
 	    
 	    // Enter Label in Edit Media/Asset Groups
 	    assertTextXpath("//td[3]/input");
 	    sendvaluebyxpath("//td[3]/input", "sample Desktop label");
 	    Reporter.log("Enter label in Edit Media/Asset Groups | ");
 	    Thread.sleep(5000); 
 	   
 	    // Select the Risk Analysis for Edit Media/Asset Groups
 	    selectByXpath_Visibletext("//select[@id='']", "Uma M");
 	    Reporter.log("Select the Risk Analysis for Edit Media/Asset Groups | ");
 	    Thread.sleep(5000); 
 	   
 	    // Select the added calendar for Edit Media/Asset Groups
 	    sendvaluebyxpath("//td[5]/input", "08/28/2017");
 	    Reporter.log("Select the added calendar for Edit Media/Asset Groups | ");
 	    Thread.sleep(5000); 
 	   
 	    // Select the drag Asset and drop into INBOX
 	    //dragAnddropByXpath("//li/div[2]", "//*[@id='newBox']");
 	    //Reporter.log("Select the drag Asset and drop into INBOX | ");
 	    //Thread.sleep(7000); 
 	   
 	    //Move this Item Window appears and click on Proceed button
 	    //assertTextXpath("html/body/div[5]/div/div/div[3]/button[1]");
 	    //clickByXpath("html/body/div[5]/div/div/div[3]/button[1]");
 	    //Reporter.log("Move this Item Window appears and click on Proceed button | ");
 	    // Thread.sleep(5000); 
 	   		
 	    // Click on Save button
 	    assertTextXpath("//*[@id='save']");
        clickByXpath("//*[@id='save']");
        Reporter.log("Click on Save Button | ");
 	    Thread.sleep(5000); 
 	    
 	    // Select the Edit button of Laptop in Media/Asset Groups page
 	    assertTextXpath("//*[@id='content']/div[2]/div[6]/div/div[2]/div[2]/div[5]/div[1]/a");
        clickByXpath("//*[@id='content']/div[2]/div[6]/div/div[2]/div[2]/div[5]/div[1]/a");
        Reporter.log("Select the Edit button of Laptop in Media/Asset Groups page | ");
 	    Thread.sleep(5000);
 	    Thread.sleep(5000);
 	    Thread.sleep(5000);
 	    Thread.sleep(5000);
 	    
 	    // Enter Label in Edit Media/Asset Groups
 	    assertTextXpath("//td[3]/input");
 	    sendvaluebyxpath("//td[3]/input", "sample Laptop label");
 	    Reporter.log("Enter label in Edit Media/Asset Groups | ");
 	    Thread.sleep(5000); 
 	   
 	    // Select the Risk Analysis for Edit Media/Asset Groups
 	    selectByXpath_Visibletext("//select[@id='']", "Uma M");
 	    Reporter.log("Select the Risk Analysis for Edit Media/Asset Groups | ");
 	    Thread.sleep(5000); 
 	   
 	    // Select the added calendar for Edit Media/Asset Groups
 	    sendvaluebyxpath("//td[5]/input", "08/28/2017");
 	    Reporter.log("Select the added calendar for Edit Media/Asset Groups | ");
 	    Thread.sleep(5000); 
 	   
 	    /*// Select the drag Asset and drop into INBOX
 	    dragAnddropByXpath("//li/div[2]", "//*[@id='newBox']");
 	    Reporter.log("Select the drag Asset and drop into INBOX | ");
 	    Thread.sleep(5000); 
 	   
 	    //Move this Item Window appears and click on Proceed button
 	    assertTextXpath("html/body/div[5]/div/div/div[3]/button[1]");
 	    clickByXpath("html/body/div[5]/div/div/div[3]/button[1]");
 	    Reporter.log("Move this Item Window appears and click on Proceed button | ");
 	    Thread.sleep(5000); */
 	   		
 	    // Click on Save Button
 	    assertTextXpath("//*[@id='save']");
        clickByXpath("//*[@id='save']");
        Reporter.log("Click on Save Button | ");
 	    Thread.sleep(5000);  
 	    Thread.sleep(5000); 
	    
 	   // Select the Edit button of Desktop Or Laptop in Media/Asset Groups page
 	    assertTextXpath("//*[@id='content']/div[2]/div[14]/div/div[2]/div[2]/div[5]/div[1]/a");
        clickByXpath("//*[@id='content']/div[2]/div[14]/div/div[2]/div[2]/div[5]/div[1]/a");
        Reporter.log("Select the Edit button of Desktop Or Laptop in Media/Asset Groups page | ");
 	    Thread.sleep(5000);
 	    
 	    // Enter Label in Edit Media/Asset Groups
 	    assertTextXpath("//td[3]/input");
 	    sendvaluebyxpath("//td[3]/input", "sample Desktop Or Laptop label");
 	    Reporter.log("Enter label in Edit Media/Asset Groups | ");
 	    Thread.sleep(5000); 
 	   
 	    // Select the Risk Analysis for Edit Media/Asset Groups
 	    selectByXpath_Visibletext("//select[@id='']", "Uma M");
 	    Reporter.log("Select the Risk Analysis for Edit Media/Asset Groups | ");
 	    Thread.sleep(5000); 
 	   
 	    // Select the added calendar for Edit Media/Asset Groups
 	    sendvaluebyxpath("//td[5]/input", "08/28/2017");
 	    Reporter.log("Select the added calendar for Edit Media/Asset Groups | ");
 	    Thread.sleep(5000); 
 	    Thread.sleep(5000); 
 	   
 	    /*// Select the drag Asset and drop into INBOX
 	    dragAnddropByXpath("//li/div[2]", "//*[@id='newBox']");
 	    Reporter.log("Select the drag Asset and drop into INBOX | ");
 	    Thread.sleep(5000); 
 	   
 	    //Move this Item Window appears and click on Proceed button
 	    assertTextXpath("html/body/div[5]/div/div/div[3]/button[1]");
 	    clickByXpath("html/body/div[5]/div/div/div[3]/button[1]");
 	    Reporter.log("Move this Item Window appears and click on Proceed button | ");
 	    Thread.sleep(5000); */
 	   		
 	    // Click on Save Button
 	    assertTextXpath("//*[@id='save']");
        clickByXpath("//*[@id='save']");
        Reporter.log("Click on Save Button | ");
 	    Thread.sleep(5000); 
 	    
   }
   
   
   @AfterClass
   public void AssetLogout() throws IOException, InterruptedException {
 	  
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

