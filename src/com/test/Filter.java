package com.test;

import java.util.regex.Pattern;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.Reporter;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import com.test.WrapperClass;

public class Filter extends WrapperClass{

	  private WebDriver driver;
	  String browser=null;
	  private boolean acceptNextAlert = true;
	  private StringBuffer verificationErrors = new StringBuffer();
	  
	  @BeforeClass
	  
	  public void FilterLogin() throws Exception {
			
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
	  }

	  
	  @Test(priority=1, enabled = true)
	  public void dashboardFilter() throws Exception {
		  
		    Thread.sleep(5000);
		    Thread.sleep(5000);
		    Thread.sleep(5000);
		    Thread.sleep(5000);
		    
		    // Click on ChartButton
		    try {
		    	assertTextXpath("//*[@id='highcharts-8']/svg/g[6]/path");
		        clickByXpath("//*[@id='highcharts-8']/svg/g[6]/path");
		        Reporter.log("Click on chart Button on Rating Distribution By Asset Module page | ");
            }catch(Exception e)
	        {
	             e.printStackTrace();
	             Reporter.log("Click on chart Button doesn't clicked | ");
	        }
            Thread.sleep(5000);
		  
		    // Click on Filter Button on Rating Distribution By Asset Module page
		    try {
		    	assertTextXpath("//*[@id='cw-panelbar']/div/div[4]/ul/li[1]/cw-filter/div/span[1]");
		        clickByXpath("//*[@id='cw-panelbar']/div/div[4]/ul/li[1]/cw-filter/div/span[1]");
		        Reporter.log("Click on Filter Button on Rating Distribution By Asset Module page | ");
            }catch(Exception e)
	        {
	             e.printStackTrace();
	             Reporter.log("Click on Filter Button doesn't clicked | ");
	        }
            Thread.sleep(5000);
      
            // Click on Asset drop-down
            try {
            	assertTextXpath("//div/ul/li/input");
		        clickByXpath("//div/ul/li/input");
		        Reporter.log("Click on Asset drop-down | ");
		        Thread.sleep(5000);
		        clickByXpath("//div[2]/div/div/div/div/div/ul/li");
		        Reporter.log("Select First-value on Asset drop-down | ");
		        Thread.sleep(5000);
            }catch(Exception e)
	        {
	            e.printStackTrace();
	            Reporter.log("Click on Asset drop-down and select First-value doesn't select | ");
	        }
            Thread.sleep(5000);
      
            //Click on Asset drop-down and select multi-values
            try {
            	assertTextXpath("//div/ul/li/input");
    	        clickByXpath("//div/ul/li/input");
		        Reporter.log("Click on Asset drop-down | ");
		        Thread.sleep(5000);
		        clickByXpath("//div[2]/div/div/div/div/div/ul/li[1]");
		        Reporter.log("Click on Asset drop-down and select Second-values | ");
            }catch(Exception e)
	        {
	            e.printStackTrace();
	            Reporter.log("Click on Asset drop-down and select Second-value doesn't select | ");
	        }
            Thread.sleep(5000);
      
            // Click on No-of-Rows Drop-down and select 'All' option 
            try {
            	assertTextXpath("//div/b");
    	        clickByXpath("//div/b");
    	        Reporter.log("Click on No-of-Rows Drop-down  | ");
    	        Thread.sleep(5000);
		        clickByXpath("//div[2]/div/div/div/ul/li");
		        Reporter.log("Select 'All' option  | ");
            }catch(Exception e)
	        {
	            e.printStackTrace();
	            Reporter.log("Click on No-of-Rows Drop-down and select 'All' option doesn't select | ");
	        }
            Thread.sleep(5000);
      
            // Click on Submit button in Filter pop-up
            try {
            	assertTextXpath("//div[3]/button[2]");
		        clickByXpath("//div[3]/button[2]");
		        Reporter.log("Click on Submit button in Filter pop-up | ");
             }catch(Exception e)
	         {
	             e.printStackTrace();
	             Reporter.log("Click on Submit button in Filter pop-up doesn't work | ");
	         }
             Thread.sleep(5000);
      
             // Click on 'Clear Filter' Button 
             try {
            	 assertTextXpath("//i[2]");
		         clickByXpath("//i[2]");
		         Reporter.log("Click on 'Clear Filter' Button  | ");
             }catch(Exception e)
	         {
	             e.printStackTrace();
	             Reporter.log("Click on 'Clear Filter' Button doesn't work | ");
	         }
             Thread.sleep(5000);
	         }
	  
	  @Test(priority=2, enabled = true)
	  public void ControlsGlobalMediaFilter() throws InterruptedException {
		  
		      Thread.sleep(5000);
		      Thread.sleep(5000);
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
	       
		      //Select Controls - Global/Media sub-module under Risk determination Module 
		      try {	 	
		    	  assertTextXpath("//*[@id='sidebar-left']/ul/li[4]/ul/li[1]/a");
		    	  clickByXpath("//*[@id='sidebar-left']/ul/li[4]/ul/li[1]/a");
		    	  Reporter.log("Select Controls-Global/Media sub-module under Risk determination Module  | ");
		      }catch(Exception e)
		      {
		    	  e.printStackTrace();
		    	  Reporter.log("Select Controls-Global/Media sub-module doesn't reached | ");
		      }
		      Thread.sleep(5000);
	       
		      // Click on Filter Button on Risk Questionnaire list sub-module under Risk Determination Module
			  try {
				  assertTextXpath("//*[@id='cw-panelbar']/div/div[4]/ul/li[1]/cw-filter/div/span[1]");
				  clickByXpath("//*[@id='cw-panelbar']/div/div[4]/ul/li[1]/cw-filter/div/span[1]");
				  Reporter.log("Click on Filter Button on Risk Questionnaire list page | ");
			  }catch(Exception e)
			  {
				  e.printStackTrace();
				  Reporter.log("Click on Filter Button doesn't clicked | ");
			  }
			  Thread.sleep(5000);
		  
			  /*//Click on Controls drop-down 
			  assertTextXpath("//div/ul/li/input");
			  clickByXpath("//div/ul/li/input");
			  Reporter.log("Click on Controls drop-down ");
			  Thread.sleep(5000);
			  assertTextXpath("//div[2]/div/div/div/div/div/ul/li");
			  clickByXpath("//div[2]/div/div/div/div/div/ul/li");
			  Reporter.log("Select value of Controls drop-down");
			  Thread.sleep(5000);*/
		    
			  //Click on Control type drop-down 
			  assertTextXpath("//div[3]/div/div/div/ul/li/input");
			  clickByXpath("//div[3]/div/div/div/ul/li/input");
			  Reporter.log("Click on Control type drop-down ");
			  Thread.sleep(5000);
			  assertTextXpath("//div[3]/div/div/div/div/ul/li");
			  clickByXpath("//div[3]/div/div/div/div/ul/li");
			  Reporter.log("Select value of Control type drop-down");
			  Thread.sleep(5000);
		    
			  //Click on Response drop-down
			  assertTextXpath("//div[4]/div/div/div/ul/li/input");
			  clickByXpath("//div[4]/div/div/div/ul/li/input");
			  Reporter.log("Click on Respons drop-down ");
			  Thread.sleep(5000);
			  assertTextXpath("//div[4]/div/div/div/div/ul/li[2]");
			  clickByXpath("//div[4]/div/div/div/div/ul/li[2]");
			  Reporter.log("Select value of Response drop-down");
			  Thread.sleep(5000);
		    
			  //Click on Media drop-down
			  assertTextXpath("//div[2]/div/div/ul/li/input");
			  clickByXpath("//div[2]/div/div/ul/li/input");
			  Reporter.log("Click on Media drop-down ");
			  Thread.sleep(5000);
			  assertTextXpath("//div[2]/div/div/div/ul/li");
			  clickByXpath("//div[2]/div/div/div/ul/li");
			  Reporter.log("Select value of Media drop-down");
			  Thread.sleep(5000);
		    
			  /*//Click on Media/Label drop-down
			  assertTextXpath("//div[2]/div[2]/div/div/ul/li/input");
			  clickByXpath("//div[2]/div[2]/div/div/ul/li/input");
			  Reporter.log("Click on Media/label drop-down ");
			  Thread.sleep(5000);
			  assertTextXpath("//div[2]/div[2]/div[2]/div/div/div/ul/li");
			  clickByXpath("//div[2]/div[2]/div[2]/div/div/div/ul/li");
			  Reporter.log("Select value of Media/label drop-down");
			  Thread.sleep(5000);*/
		    
			  //Click on Assets drop-down
			  assertTextXpath("//div[3]/div[2]/div/div/ul/li/input");
			  clickByXpath("//div[3]/div[2]/div/div/ul/li/input");
			  Reporter.log("Click on Assets drop-down ");
			  Thread.sleep(5000);
			  assertTextXpath("//div[3]/div[2]/div/div/div/ul/li");
			  clickByXpath("//div[3]/div[2]/div/div/div/ul/li");
			  Reporter.log("Select value of Assets drop-down");
			  Thread.sleep(5000);
		    
			  //Click on Submit button for filters
			  try {
				  assertTextXpath("//div[3]/button[2]");
		     	  clickByXpath("//div[3]/button[2]");
		 		  Reporter.log("Click on Submit button in Filter Pop-up | ");
		 		  Thread.sleep(5000);
		       }catch(Exception e)
		 	   {
		    	   e.printStackTrace();
		    	   Reporter.log("Click on Submit button in Filter Pop-up  doesn't select | ");
		 	   }
		       Thread.sleep(5000);   
		       Thread.sleep(5000);   
		       Thread.sleep(5000);   
		       
		       //Click on 'Clear Filter' Button 
		       try {
		    	   assertTextXpath("//i[2]");
		 		   clickByXpath("//i[2]");
		 		   Reporter.log("Click on 'Clear Filter' Button  | ");
		       }catch(Exception e)
		 	   {
		    	   e.printStackTrace();
		    	   Reporter.log("Click on 'Clear Filter' Button doesn't work | ");
		 	   }
		       Thread.sleep(5000);
		    
	  }
	  
	  @Test(priority=3, enabled = true)
	  public void RiskdeterminationFilter() throws InterruptedException {
	       
		  		Thread.sleep(5000);
		  		Thread.sleep(5000);
		  		Thread.sleep(5000);
		  		Thread.sleep(5000);
		  		// Select Risk Questionnaire list sub-module under Risk Determination Module
		  		try {
		  			assertTextLink("Risk Questionnaire List");
		  			clickBylinktext("Risk Questionnaire List");
		  			Reporter.log("Select Risk Determination sidebar-left Module | ");
		  		}catch(Exception e)
		  		{
		  			e.printStackTrace();
		  			Reporter.log("Select Risk Determination sidebar-left Module doesn't reached | ");
		  		}
		  		Thread.sleep(5000);
	       
		  		// Click on Filter Button on Risk Questionnaire list sub-module under Risk Determination Module
		  		try {
		  			assertTextXpath("//*[@id='cw-panelbar']/div/div[4]/ul/li[1]/cw-filter/div/span[1]");
		  			clickByXpath("//*[@id='cw-panelbar']/div/div[4]/ul/li[1]/cw-filter/div/span[1]");
		  			Reporter.log("Click on Filter Button on Risk Questionnaire list page | ");
		  		}catch(Exception e)
		  		{
		  			e.printStackTrace();
		  			Reporter.log("Click on Filter Button doesn't clicked | ");
		  		}
		  		Thread.sleep(5000);
	       
		  		/*// Click on Media drop-down
		  		try {
		  			assertTextXpath("//div/ul/li/input");
		  			clickByXpath("//div/ul/li/input");
		  			Reporter.log("Click on Media drop-down | ");
		  			Thread.sleep(5000);
		  			clickByXpath("//div[2]/div/div/div/div/div/ul/li");
		  			Reporter.log("Select First-value on Media drop-down | ");
		  			Thread.sleep(5000);
		  		}catch(Exception e)
		  		{
		  			e.printStackTrace();
		  			Reporter.log("Click on Media drop-down and select First-value doesn't select | ");
		  		}
		  		Thread.sleep(5000);
	       
		  		//Click on Media drop-down and select multi-values
		  		try {
		  			assertTextXpath("//li[2]/input");
		  			clickByXpath("//li[2]/input");
		  			Reporter.log("Click on Media drop-down | ");
		  			Thread.sleep(5000);
		  			clickByXpath("//div/div/div/div/ul/li[3]");
		  			Reporter.log("Click on Media drop-down and select other-values | ");
		  		}catch(Exception e)
		  		{
		  			e.printStackTrace();
		  			Reporter.log("Click on Media drop-down and select Second-value doesn't select | ");
		  		}
		  		Thread.sleep(5000);
	       
		  		// Click on Media-Label drop-down
		  		try {
		  			assertTextXpath("//div[2]/div/div/div/ul/li/input");
		  			clickByXpath("//div[2]/div/div/div/ul/li/input");
		  			Reporter.log("Click on Media-Label drop-down | ");
		  			Thread.sleep(5000);
		  			assertTextXpath("//div[2]/div[2]/div/div/div/div/ul/li[2]");
		  			clickByXpath("//div[2]/div[2]/div/div/div/div/ul/li[2]");
		  			Reporter.log("Select First-value on Media-Label drop-down | ");
		  			Thread.sleep(5000);
		  		}catch(Exception e)
		  		{
		  			e.printStackTrace();
		  			Reporter.log("Click on Media-Label drop-down and select First-value doesn't select | ");
		  		}
		  		Thread.sleep(5000);
	       
		  		//Click on Media-label drop-down and select multi-values
		  		try {
		  			assertTextXpath("//li[2]/input");
		  			clickByXpath("//li[2]/input");
		  			Reporter.log("Click on Media-Label drop-down | ");
		  			Thread.sleep(5000);
		  			assertTextXpath("//div[2]/div/div/div/div/ul/li[6]");
		  			clickByXpath("//div[2]/div/div/div/div/ul/li[6]");
		  			Reporter.log("Click on Media-Label drop-down and select other-values | ");
		  		}catch(Exception e)
		  		{
		  			e.printStackTrace();
		  			Reporter.log("Click on Media-label drop-down and select Second-value doesn't select | ");
		  		}
		  		Thread.sleep(5000);*/
	       
		  		// Click on Asset drop-down
		  		try {
		  			assertTextXpath("//div[3]/div/div/div/ul/li/input");
		  			clickByXpath("//div[3]/div/div/div/ul/li/input");
		  			Reporter.log("Click on Asset drop-down | ");
		  			Thread.sleep(5000);
		  			assertTextXpath("//div[3]/div/div/div/div/ul/li");
		  			clickByXpath("//div[3]/div/div/div/div/ul/li");
		  			Reporter.log("Select First-value on Asset drop-down | ");
		  			Thread.sleep(5000);
		  		}catch(Exception e)
		  		{
		  			e.printStackTrace();
		  			Reporter.log("Click on Asset drop-down and select First-value doesn't select | ");
		  		}
		  		Thread.sleep(5000);
	       
		  		//Click on Asset drop-down and select multi-values
		  		try {
		  			assertTextXpath("//li[2]/input");
		  			clickByXpath("//li[2]/input");
		  			Reporter.log("Click on Asset drop-down | ");
		  			Thread.sleep(5000);
		  			assertTextXpath("//div[3]/div/div/div/div/ul/li[2]");
		  			clickByXpath("//div[3]/div/div/div/div/ul/li[2]");
		  			Reporter.log("Click on Asset drop-down and select other-values | ");
		  		}catch(Exception e)
		  		{
		  			e.printStackTrace();
		  			Reporter.log("Click on Asset drop-down and select Second-value doesn't select | ");
		  		}
		  		Thread.sleep(5000);
	       
		  		// Enter the Total Sensitive Records 
		  		try {
		  			sendvaluebyxpath("//div/div/input", "1");
		  			sendvaluebyxpath("//div[2]/input", "100");
		  			Reporter.log("Enter the Total Sensitive Records  | ");
		  		}catch(Exception e)
		  		{
		  			e.printStackTrace();
		  			Reporter.log("Enter the Total Sensitive Records doesn't work | ");
		  		}
		  		Thread.sleep(5000);
		       
		  		// Click on Risk Analyst drop-down
		  		try {
		  			assertTextXpath("//div[2]/div/div/ul/li/input");
		  			clickByXpath("//div[2]/div/div/ul/li/input");
		  			Reporter.log("Click on Risk Analyst drop-down | ");
		  			Thread.sleep(5000);
		  			assertTextXpath("//div[2]/div[2]/div[2]/div/div/div/ul/li");
		  			clickByXpath("//div[2]/div[2]/div[2]/div/div/div/ul/li");
		  			Reporter.log("Select First-value on Risk Analyst drop-down | ");
		  			Thread.sleep(5000);
		  		}catch(Exception e)
		  		{
		  			e.printStackTrace();
		  			Reporter.log("Click on Risk Analyst drop-down and select First-value doesn't select | ");
		  		}
		  		Thread.sleep(5000);
		       
		  		//Click on Submit button in Filter Pop-up
		  		try {
		  			assertTextXpath("//div[3]/button[2]");
		  			clickByXpath("//div[3]/button[2]");
		  			Reporter.log("Click on Submit button in Filter Pop-up | ");
		  			Thread.sleep(5000);
		  		}catch(Exception e)
		  		{
		  			e.printStackTrace();
		  			Reporter.log("Click on Submit button in Filter Pop-up  doesn't select | ");
		  		}
		  		Thread.sleep(5000);   
		       
		       
		  		//Click on 'Clear Filter' Button 
		  		try {
		  			assertTextXpath("//i[2]");
		  			clickByXpath("//i[2]");
		  			Reporter.log("Click on 'Clear Filter' Button  | ");
		  		}catch(Exception e)
		  		{
		  			e.printStackTrace();
		  			Reporter.log("Click on 'Clear Filter' Button doesn't work | ");
		 	   }
		       Thread.sleep(5000);
	       
	  }
	  
	  @Test(priority=4, enabled = true)
	  public void ControlsReviewFilter() throws InterruptedException {
		  
		  		Thread.sleep(5000);
		  		Thread.sleep(5000);
		  		Thread.sleep(5000);
		  		Thread.sleep(5000);		
		  		
		  		// Select Risk Questionnaire list sub-module under Risk Determination Module
		  		try {
		  			assertTextXpath("//*[@id='sidebar-left']/ul/li[4]/ul/li[3]/a");
		  			clickByXpath("//*[@id='sidebar-left']/ul/li[4]/ul/li[3]/a");
		  			Reporter.log("Select Risk Determination sidebar-left Module | ");
		  		}catch(Exception e)
		  		{
		  			e.printStackTrace();
		  			Reporter.log("Select Risk Determination sidebar-left Module doesn't reached | ");
		  		}
		  		Thread.sleep(5000);
	       
		  		// Click on Filter Button on Risk Questionnaire list sub-module under Risk Determination Module
		  		try {
		  			assertTextXpath("//cw-filter/div/span/i");
		  			clickByXpath("//cw-filter/div/span/i");
		  			Reporter.log("Click on Filter Button on Risk Questionnaire list page | ");
		  		}catch(Exception e)
		  		{
		  			e.printStackTrace();
		  			Reporter.log("Click on Filter Button doesn't clicked | ");
		  		}
		  		Thread.sleep(5000);
	       
		  		//Click on Media Drop-down
		  		assertTextXpath("//div/ul/li/input");
		  		clickByXpath("//div/ul/li/input");
		  		Reporter.log("Click on Media Drop-down | ");
		  		Thread.sleep(5000);
		  		assertTextXpath("//div[2]/div/div/div/div/div/ul/li");
		  		clickByXpath("//div[2]/div/div/div/div/div/ul/li");
		  		Reporter.log("Select value from Media Drop-down | ");
		  		Thread.sleep(5000);

		  		//click on Media label drop-down
		  		assertTextXpath("//div[2]/div/div/div/ul/li/input");
		  		clickByXpath("//div[2]/div/div/div/ul/li/input");
		  		Reporter.log("Click on Media label Drop-down | ");
		  		Thread.sleep(5000);
		  		assertTextXpath("//div[2]/div[2]/div/div/div/div/ul/li");
		  		clickByXpath("//div[2]/div[2]/div/div/div/div/ul/li");
		  		Reporter.log("Select value from Media label Drop-down | ");
		  		Thread.sleep(5000);

		  		//Click on Assets drop-down
		  		assertTextXpath("//div[3]/div/div/div/ul/li/input");
		  		clickByXpath("//div[3]/div/div/div/ul/li/input");
		  		Reporter.log("Click on Asset Drop-down | ");
		  		Thread.sleep(5000);
		  		assertTextXpath("//div[3]/div/div/div/div/ul/li");
		  		clickByXpath("//div[3]/div/div/div/div/ul/li");
		  		Reporter.log("Select value from Asset Drop-down | ");
		  		Thread.sleep(5000);

		  		// Click on Thread Source drop-down
		  		assertTextXpath("//div[4]/div/div/div/ul/li/input");
		  		clickByXpath("//div[4]/div/div/div/ul/li/input");
		  		Reporter.log("Click on Thread Source Drop-down | ");
		  		Thread.sleep(5000);
		  		assertTextXpath("//div[4]/div/div/div/div/ul/li");
		  		clickByXpath("//div[4]/div/div/div/div/ul/li");
		  		Reporter.log("Select value from Thread Source Drop-down | ");
		  		Thread.sleep(5000);

		  		/*//Click on Thread Event drop-down
		  		assertTextXpath("//div[5]/div/div/div/ul/li/input");
		  		clickByXpath("//div[5]/div/div/div/ul/li/input");
		  		Reporter.log("Click on Thread Event Drop-down | ");
		  		Thread.sleep(5000);
		  		assertTextXpath("//div[5]/div/div/div/div/ul/li");
		  		clickByXpath("//div[5]/div/div/div/div/ul/li");
		  		Reporter.log("Select value from Thread Event Drop-down | ");
		  		Thread.sleep(5000);
		    
		  		// Click on Vulnerabilities drop-down
		  		assertTextXpath("//div[6]/div/div/div/ul/li/input");
		  		clickByXpath("//div[6]/div/div/div/ul/li/input");
		  		Reporter.log("Click on Vulnerabilities Drop-down | ");
		  		Thread.sleep(5000);
		  		assertTextXpath("//div[6]/div/div/div/div/ul/li");
		  		clickByXpath("//div[6]/div/div/div/div/ul/li");
		  		Reporter.log("Select value from Vulnerabilities Drop-down | ");
		  		Thread.sleep(5000);*/

		  		/*// Click on Controls drop-down
		  		assertTextXpath("//div[2]/div/div/ul/li/input");
		  		clickByXpath("//div[2]/div/div/ul/li/input");
		  		Reporter.log("Click on Controls Drop-down | ");
		  		Thread.sleep(5000);
		  		assertTextXpath("//div[2]/div/div/div/ul/li");
		  		clickByXpath("//div[2]/div/div/div/ul/li");
		  		Reporter.log("Select value from Controls Drop-down | ");
		  		Thread.sleep(5000);

		  		// Click on Control Response drop-down
		  		assertTextXpath("//div[4]/div[2]/div/div/ul/li/input");
		  		clickByXpath("//div[4]/div[2]/div/div/ul/li/input");
		  		Reporter.log("Click on Control Response Drop-down | ");
		  		Thread.sleep(5000);
		  		assertTextXpath("//div[4]/div[2]/div/div/div/ul/li[5]");
		  		clickByXpath("//div[4]/div[2]/div/div/div/ul/li[5]");
		  		Reporter.log("Select value from Control Response Drop-down | ");
		  		Thread.sleep(5000);

		  		// Click on NIST Family drop-down
		  		assertTextXpath("//div[6]/div[2]/div/div/ul/li/input");
		  		clickByXpath("//div[6]/div[2]/div/div/ul/li/input");
		  		Reporter.log("Click on NIST Family Drop-down | ");
		  		Thread.sleep(5000);
		  		assertTextXpath("//div[6]/div[2]/div/div/div/ul/li");
		  		clickByXpath("//div[6]/div[2]/div/div/div/ul/li");
		  		Reporter.log("Select value from NIST Family Drop-down | ");
		  		Thread.sleep(5000);*/
		    
		  		//Click on Submit button in Filter Pop-up
		  		try {
		  			assertTextXpath("//div[3]/button[2]");
		  			clickByXpath("//div[3]/button[2]");
		  			Reporter.log("Click on Submit button in Filter Pop-up | ");
		  			Thread.sleep(5000);
		  		}catch(Exception e)
		  		{
		  			e.printStackTrace();
		  			Reporter.log("Click on Submit button in Filter Pop-up  doesn't select | ");
		  		}
		  		Thread.sleep(5000); 
		  		Thread.sleep(5000);   
		  		Thread.sleep(5000);   
		       
		       
		  		//Click on 'Clear Filter' Button 
		  		try {
		  			assertTextXpath("//i[2]");
		  			clickByXpath("//i[2]");
		  			Reporter.log("Click on 'Clear Filter' Button  | ");
		  		}catch(Exception e)
		  		{
		  			e.printStackTrace();
		  			Reporter.log("Click on 'Clear Filter' Button doesn't work | ");
		  		}
		  		Thread.sleep(5000);
		  
	  }
	  
	  @Test(priority=5, enabled = true)
	  public void RatingReviewFilter() throws InterruptedException {
		  
		  		Thread.sleep(5000);
		  		Thread.sleep(5000);
		  		Thread.sleep(5000);
		  		Thread.sleep(5000);
		  		// Select Risk Questionnaire list sub-module under Risk Determination Module
		  		try {
		  			assertTextLink("Rating Review");
		  			clickBylinktext("Rating Review");
		  			Reporter.log("Select Rating Review sub-Module | ");
		  		}catch(Exception e) 
		  		{
		  			e.printStackTrace();
		  			Reporter.log("Select Rating Review sub-Module doesn't reached | ");
		  		}
		  		Thread.sleep(5000);
	       
		  		// Click on Filter Button on Risk Questionnaire list sub-module under Risk Determination Module
		  		try {
		  			assertTextXpath("//cw-filter/div/span/i");
		  			clickByXpath("//cw-filter/div/span/i");
		  			Reporter.log("Click on Filter Button on Risk Questionnaire list page | ");
		  		}catch(Exception e)
		  		{
		  			e.printStackTrace();
		  			Reporter.log("Click on Filter Button doesn't clicked | ");
		  		}
		  		Thread.sleep(5000);
	       
		  		//Click on Media Drop-down
		  		assertTextXpath("//div/ul/li/input");
		  		clickByXpath("//div/ul/li/input");
		  		Reporter.log("Click on Media Drop-down | ");
		  		Thread.sleep(5000);
		  		assertTextXpath("//div[2]/div/div/div/div/div/ul/li");
		  		clickByXpath("//div[2]/div/div/div/div/div/ul/li");
		  		Reporter.log("Select value from Media Drop-down | ");
		  		Thread.sleep(5000);

		  		//click on Media label drop-down
		  		assertTextXpath("//div[2]/div[2]/div/div/div/ul");
		  		clickByXpath("//div[2]/div[2]/div/div/div/ul");
		  		Reporter.log("Click on Media label Drop-down | ");
		  		Thread.sleep(5000);
		  		assertTextXpath("//div[2]/div[2]/div/div/div/div/ul/li");
		  		clickByXpath("//div[2]/div[2]/div/div/div/div/ul/li");
		  		Reporter.log("Select value from Media label Drop-down | ");
		  		Thread.sleep(5000);

		  		//Click on Assets drop-down
		  		assertTextXpath("//div[3]/div/div/div/ul/li/input");
		  		clickByXpath("//div[3]/div/div/div/ul/li/input");
		  		Reporter.log("Click on Asset Drop-down | ");
		  		Thread.sleep(5000);
		  		assertTextXpath("//div[3]/div/div/div/div/ul/li");
		  		clickByXpath("//div[3]/div/div/div/div/ul/li");
		  		Reporter.log("Select value from Asset Drop-down | ");
		  		Thread.sleep(5000);

		  		// Click on Thread Source drop-down
		  		assertTextXpath("//div[4]/div/div/div/ul/li/input");
		  		clickByXpath("//div[4]/div/div/div/ul/li/input");
		  		Reporter.log("Click on Thread Source Drop-down | ");
		  		Thread.sleep(5000);
		  		assertTextXpath("//div[4]/div/div/div/div/ul/li");
		  		clickByXpath("//div[4]/div/div/div/div/ul/li");
		  		Reporter.log("Select value from Thread Source Drop-down | ");
		  		Thread.sleep(5000);

		  		/*//Click on Thread Event drop-down
		  		assertTextXpath("//div[5]/div/div/div/ul/li/input");
		  		clickByXpath("//div[5]/div/div/div/ul/li/input");
		  		Reporter.log("Click on Thread Event Drop-down | ");
		  		Thread.sleep(5000);
		  		assertTextXpath("//div[5]/div/div/div/div/ul/li");
		  		clickByXpath("//div[5]/div/div/div/div/ul/li");
		  		Reporter.log("Select value from Thread Event Drop-down | ");
		  		Thread.sleep(5000);
		    
		  		// Click on Vulnerabilities drop-down
		  		assertTextXpath("//div[6]/div/div/div/ul/li/input");
		  		clickByXpath("//div[6]/div/div/div/ul/li/input");
		  		Reporter.log("Click on Vulnerabilities Drop-down | ");
		  		Thread.sleep(5000);
		  		assertTextXpath("//div[6]/div/div/div/div/ul/li");
		  		clickByXpath("//div[6]/div/div/div/div/ul/li");
		  		Reporter.log("Select value from Vulnerabilities Drop-down | ");
		  		Thread.sleep(5000);*/

		  		// Click on Risk Likelihood drop-down
		  		assertTextXpath("//div[2]/div/div/ul/li/input");
		  		clickByXpath("//div[2]/div/div/ul/li/input");
		  		Reporter.log("Click on Controls Drop-down | ");
		  		Thread.sleep(5000);
		  		assertTextXpath("//div[2]/div/div/div/ul/li[5]");
		  		clickByXpath("//div[2]/div/div/div/ul/li[5]");
		  		Reporter.log("Select value from Controls Drop-down | ");
		  		Thread.sleep(5000);

		  		// Click on Risk Impact drop-down
		  		assertTextXpath("//div[2]/div[2]/div/div/ul/li/input");
		  		clickByXpath("//div[2]/div[2]/div/div/ul/li/input");
		  		Reporter.log("Click on Control Response Drop-down | ");
		  		Thread.sleep(5000);
		  		assertTextXpath("//div[2]/div[2]/div/div/div/ul/li[6]");
		  		clickByXpath("//div[2]/div[2]/div/div/div/ul/li[6]");
		  		Reporter.log("Select value from Control Response Drop-down | ");
		  		Thread.sleep(5000);

		  		/*// Click on Risk rating drop-down
		  		assertTextXpath("//div[3]/div[2]/div/div/ul/li/input");
		  		clickByXpath("//div[3]/div[2]/div/div/ul/li/input");
		  		Reporter.log("Click on NIST Family Drop-down | ");
		  		Thread.sleep(5000);
		  		assertTextXpath("//div[3]/div[2]/div/div/div/ul/li[7]");
		  		clickByXpath("//div[3]/div[2]/div/div/div/ul/li[7]");
		  		Reporter.log("Select value from NIST Family Drop-down | ");
		  		Thread.sleep(5000);*/
		    
		  		/*// Click on Created From and To Date
		  		clickByXpath("//div/div/input");
		  		clickBylinktext("8");
		  		clickByXpath("//div[2]/input");
		  		clickBylinktext("16");
		  		Thread.sleep(5000);
		    
		  		// Click on Updated From and To Date
		  		clickByXpath("//div[5]/div[2]/div/div/div/input");
		  		clickBylinktext("29");
		  		clickByXpath("//div[5]/div[2]/div/div/div[2]/input");
		  		clickBylinktext("31");
		  		Thread.sleep(5000);*/
		    
		  		//Click on Submit button in Filter Pop-up
		  		try {
		  			assertTextXpath("//div[3]/button[2]");
		  			clickByXpath("//div[3]/button[2]");
		  			Reporter.log("Click on Submit button in Filter Pop-up | ");
		  			Thread.sleep(5000);
		  		}catch(Exception e)
		  		{
		  			e.printStackTrace();
		  			Reporter.log("Click on Submit button in Filter Pop-up  doesn't select | ");
		  		}
		  		Thread.sleep(5000);   
		  		Thread.sleep(5000);   
		  		Thread.sleep(5000);   
		       
		       
		  		//Click on 'Clear Filter' Button 
		  		try {
		  			assertTextXpath("//i[2]");
		  			clickByXpath("//i[2]");
		  			Reporter.log("Click on 'Clear Filter' Button  | ");
		  		}catch(Exception e)
		  		{
		  			e.printStackTrace();
		  			Reporter.log("Click on 'Clear Filter' Button doesn't work | ");
		  		}
		  		Thread.sleep(5000);
		  
	  }
	  
	  @Test(priority=5, enabled = true)
	  public void ReportFilter() throws InterruptedException {
		  
		  		Thread.sleep(5000);
		  		Thread.sleep(5000);
		  		Thread.sleep(5000);
		  		Thread.sleep(5000);
		  		// Select Risk Questionnaire list sub-module under Risk Determination Module
		  		try {
		  			assertTextLink("Rating Review");
		  			clickBylinktext("Rating Review");
		  			Reporter.log("Select Rating Review sub-Module | ");
		  		}catch(Exception e) 
		  		{
		  			e.printStackTrace();
		  			Reporter.log("Select Rating Review sub-Module doesn't reached | ");
		  		}
		  		Thread.sleep(5000);
	       
		  		// Click on Filter Button on Risk Questionnaire list sub-module under Risk Determination Module
		  		try {
		  			assertTextXpath("//cw-filter/div/span/i");
		  			clickByXpath("//cw-filter/div/span/i");
		  			Reporter.log("Click on Filter Button on Risk Questionnaire list page | ");
		  		}catch(Exception e)
		  		{
		  			e.printStackTrace();
		  			Reporter.log("Click on Filter Button doesn't clicked | ");
		  		}
		  		Thread.sleep(5000);
	       
		  		//Click on Media Drop-down
		  		assertTextXpath("//div/ul/li/input");
		  		clickByXpath("//div/ul/li/input");
		  		Reporter.log("Click on Media Drop-down | ");
		  		Thread.sleep(5000);
		  		assertTextXpath("//div[2]/div/div/div/div/div/ul/li");
		  		clickByXpath("//div[2]/div/div/div/div/div/ul/li");
		  		Reporter.log("Select value from Media Drop-down | ");
		  		Thread.sleep(5000);

		  		//click on Media label drop-down
		  		assertTextXpath("//div[2]/div[2]/div/div/div/ul");
		  		clickByXpath("//div[2]/div[2]/div/div/div/ul");
		  		Reporter.log("Click on Media label Drop-down | ");
		  		Thread.sleep(5000);
		  		assertTextXpath("//div[2]/div[2]/div/div/div/div/ul/li");
		  		clickByXpath("//div[2]/div[2]/div/div/div/div/ul/li");
		  		Reporter.log("Select value from Media label Drop-down | ");
		  		Thread.sleep(5000);

		  		//Click on Assets drop-down
		  		assertTextXpath("//div[3]/div/div/div/ul/li/input");
		  		clickByXpath("//div[3]/div/div/div/ul/li/input");
		  		Reporter.log("Click on Asset Drop-down | ");
		  		Thread.sleep(5000);
		  		assertTextXpath("//div[3]/div/div/div/div/ul/li");
		  		clickByXpath("//div[3]/div/div/div/div/ul/li");
		  		Reporter.log("Select value from Asset Drop-down | ");
		  		Thread.sleep(5000);

		  		// Click on Thread Source drop-down
		  		assertTextXpath("//div[4]/div/div/div/ul/li/input");
		  		clickByXpath("//div[4]/div/div/div/ul/li/input");
		  		Reporter.log("Click on Thread Source Drop-down | ");
		  		Thread.sleep(5000);
		  		assertTextXpath("//div[4]/div/div/div/div/ul/li");
		  		clickByXpath("//div[4]/div/div/div/div/ul/li");
		  		Reporter.log("Select value from Thread Source Drop-down | ");
		  		Thread.sleep(5000);
		  		
	  }
	  
	  @Test(priority=5, enabled = true)
	  public void RiskResponseListFilter() throws InterruptedException {
		  
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
		        
		        //Click on Risk Response List Sub-module
		        assertTextLink("Residual Rating Review");
		        clickBylinktext("Residual Rating Review");
		        Reporter.log("Click on Residual Rating Review Sub-module | ");
		        Thread.sleep(5000);
		        Thread.sleep(5000);
	       
		  		// Click on Filter Button on Risk Questionnaire list sub-module under Risk Determination Module
		        assertTextXpath("//cw-filter/div/span/i");
		  		clickByXpath("//cw-filter/div/span/i");
		  		Reporter.log("Click on Filter Button on Risk Questionnaire list page | ");
		  		Thread.sleep(5000);
	       
		  		//Click on Media Drop-down
		  		assertTextXpath("//div/ul/li/input");
		  		clickByXpath("//div/ul/li/input");
		  		Reporter.log("Click on Media Drop-down | ");
		  		Thread.sleep(5000);
		  		assertTextXpath("//div[2]/div/div/div/div/div/ul/li");
		  		clickByXpath("//div[2]/div/div/div/div/div/ul/li");
		  		Reporter.log("Select value from Media Drop-down | ");
		  		Thread.sleep(5000);

		  		//click on Media label drop-down
		  		assertTextXpath("//div[2]/div[2]/div/div/div/ul");
		  		clickByXpath("//div[2]/div[2]/div/div/div/ul");
		  		Reporter.log("Click on Media label Drop-down | ");
		  		Thread.sleep(5000);
		  		assertTextXpath("//div[2]/div[2]/div/div/div/div/ul/li");
		  		clickByXpath("//div[2]/div[2]/div/div/div/div/ul/li");
		  		Reporter.log("Select value from Media label Drop-down | ");
		  		Thread.sleep(5000);

		  		//Click on Assets drop-down
		  		assertTextXpath("//div[3]/div/div/div/ul/li/input");
		  		clickByXpath("//div[3]/div/div/div/ul/li/input");
		  		Reporter.log("Click on Asset Drop-down | ");
		  		Thread.sleep(5000);
		  		assertTextXpath("//div[3]/div/div/div/div/ul/li");
		  		clickByXpath("//div[3]/div/div/div/div/ul/li");
		  		Reporter.log("Select value from Asset Drop-down | ");
		  		Thread.sleep(5000);

		  		// Click on Thread Source drop-down
		  		assertTextXpath("//div[4]/div/div/div/ul/li/input");
		  		clickByXpath("//div[4]/div/div/div/ul/li/input");
		  		Reporter.log("Click on Thread Source Drop-down | ");
		  		Thread.sleep(5000);
		  		assertTextXpath("//div[4]/div/div/div/div/ul/li");
		  		clickByXpath("//div[4]/div/div/div/div/ul/li");
		  		Reporter.log("Select value from Thread Source Drop-down | ");
		  		Thread.sleep(5000);
		  		
	  }
	  
	  @Test(priority=5, enabled = true)
	  public void RiskReconciliationFilter() throws InterruptedException {
		  
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
		        
		        //Click on Risk Response List Sub-module
		        assertTextLink("Residual Rating Review");
		        clickBylinktext("Residual Rating Review");
		        Reporter.log("Click on Residual Rating Review Sub-module | ");
		        Thread.sleep(5000);
		        Thread.sleep(5000);
	       
		  		// Click on Filter Button on Risk Questionnaire list sub-module under Risk Determination Module
		        assertTextXpath("//cw-filter/div/span/i");
		  		clickByXpath("//cw-filter/div/span/i");
		  		Reporter.log("Click on Filter Button on Risk Questionnaire list page | ");
		  		Thread.sleep(5000);
	       
		  		//Click on Media Drop-down
		  		assertTextXpath("//div/ul/li/input");
		  		clickByXpath("//div/ul/li/input");
		  		Reporter.log("Click on Media Drop-down | ");
		  		Thread.sleep(5000);
		  		assertTextXpath("//div[2]/div/div/div/div/div/ul/li");
		  		clickByXpath("//div[2]/div/div/div/div/div/ul/li");
		  		Reporter.log("Select value from Media Drop-down | ");
		  		Thread.sleep(5000);

		  		//click on Media label drop-down
		  		assertTextXpath("//div[2]/div[2]/div/div/div/ul");
		  		clickByXpath("//div[2]/div[2]/div/div/div/ul");
		  		Reporter.log("Click on Media label Drop-down | ");
		  		Thread.sleep(5000);
		  		assertTextXpath("//div[2]/div[2]/div/div/div/div/ul/li");
		  		clickByXpath("//div[2]/div[2]/div/div/div/div/ul/li");
		  		Reporter.log("Select value from Media label Drop-down | ");
		  		Thread.sleep(5000);

		  		//Click on Assets drop-down
		  		assertTextXpath("//div[3]/div/div/div/ul/li/input");
		  		clickByXpath("//div[3]/div/div/div/ul/li/input");
		  		Reporter.log("Click on Asset Drop-down | ");
		  		Thread.sleep(5000);
		  		assertTextXpath("//div[3]/div/div/div/div/ul/li");
		  		clickByXpath("//div[3]/div/div/div/div/ul/li");
		  		Reporter.log("Select value from Asset Drop-down | ");
		  		Thread.sleep(5000);

		  		// Click on Thread Source drop-down
		  		assertTextXpath("//div[4]/div/div/div/ul/li/input");
		  		clickByXpath("//div[4]/div/div/div/ul/li/input");
		  		Reporter.log("Click on Thread Source Drop-down | ");
		  		Thread.sleep(5000);
		  		assertTextXpath("//div[4]/div/div/div/div/ul/li");
		  		clickByXpath("//div[4]/div/div/div/div/ul/li");
		  		Reporter.log("Select value from Thread Source Drop-down | ");
		  		Thread.sleep(5000);
		  		
	  }
	  @AfterClass
	  public void FilterLogout() throws Exception {
		  
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


