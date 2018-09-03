package com.test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class RiskResponse extends WrapperClass{

	private WebDriver driver;
	  String browser=null;
	 
	    
	  @BeforeClass  
	 public void RiskResponseLogin() throws IOException, InterruptedException {
			
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
	        Thread.sleep(5000);
		  }
	 
	   @Test(priority=1, enabled = true)
	   public void PagerRiskResponse() throws IOException, InterruptedException {
		    
		    Thread.sleep(5000);	   
	 	    Thread.sleep(5000);
	 	    Thread.sleep(5000);
	        //Click on Risk Response List Sub-module
	        assertTextLink("Risk Response List");
	        clickBylinktext("Risk Response List");
	        Reporter.log("Click on Risk Response List Sub-module | ");
	        Thread.sleep(5000);
	        Thread.sleep(5000);
	        
	        //Click on TBD Button 
	        assertTextXpath("//tr[13]/td[8]/div/div/cw-section-change-button-caller/div/span");
	        clickByXpath("//tr[13]/td[8]/div/div/cw-section-change-button-caller/div/span");
	        Reporter.log("Click on TBD Button | ");
	        Thread.sleep(5000);
	        Thread.sleep(5000);
	        Thread.sleep(5000);
	        
	        // Click on Risk Treatment Type drop-down
	        assertTextXpath("//cw-risk-treatment-treatment-choices/div/button");
	        clickByXpath("//cw-risk-treatment-treatment-choices/div/button");
	        Reporter.log("Click on Risk Treatment Type drop-down | ");
	        Thread.sleep(5000);
	        Thread.sleep(5000);
	        
	        //Select Transfer option from Risk Treatment Type
	        assertTextLink("Transfer");
	        clickBylinktext("Transfer");
	        Reporter.log("Select Transfer option from Risk Treatment Type | ");
	        Thread.sleep(5000);
	       
	        // Click on Effectiveness drop-down
	        assertTextXpath("//cw-rt-evaluation-alternative-choices/div/button");
	        clickByXpath("//cw-rt-evaluation-alternative-choices/div/button");
	        Reporter.log("Click on Effectiveness drop-down | ");
	        Thread.sleep(5000);
	        
	        // Select Effective option from Effectiveness drop-down
	        assertTextLink("Effective");
	        clickBylinktext("Effective");
	        Reporter.log("Select Effective option from Effectiveness drop-down | ");
	        Thread.sleep(5000);
	        Thread.sleep(5000);
	        
	        //Click on Feasibility drop-down
	        assertTextXpath("//td[8]/span/cw-rt-evaluation-alternative-choices/div/button");
	        clickByXpath("//td[8]/span/cw-rt-evaluation-alternative-choices/div/button");
	        Reporter.log("Click on Feasibility drop-down | ");
	        Thread.sleep(5000);
	        
	        //Select Feasible option from Feasibility drop-down
	        assertTextLink("Feasible");
	        clickBylinktext("Feasible");
	        Reporter.log("Select Feasible option from Feasibility drop-down | ");
	        Thread.sleep(5000);
	        
	        //Click on Action Drop-down
	        assertTextXpath("//td[10]/span/cw-rt-evaluation-alternative-choices/div/button");
	        clickByXpath("//td[10]/span/cw-rt-evaluation-alternative-choices/div/button");
	        Reporter.log("Click on Action Drop-down | ");
	        Thread.sleep(5000);
	        
	        //Select Enhance option from Action drop-down
	        assertTextLink("Enhance");
	        clickBylinktext("Enhance");
	        Reporter.log("Select Enhance option from Action drop-down | ");
	        Thread.sleep(5000);     
	        
	        /*// Click on Effectiveness drop-down
	        assertTextXpath("//*[@id='rist-treatment-alternative-evaluation']/tbody/tr[3]/td[6]/span/cw-rt-evaluation-alternative-choices/div/button");
	        clickByXpath("//*[@id='rist-treatment-alternative-evaluation']/tbody/tr[3]/td[6]/span/cw-rt-evaluation-alternative-choices/div/button");
	        Reporter.log("Click on Effectiveness drop-down | ");
	        Thread.sleep(5000);
	        
	        // Select Effective option from Effectiveness drop-down
	        assertTextLink("Effective");
	        clickBylinktext("Effective");
	        Reporter.log("Select Effective option from Effectiveness drop-down | ");
	        Thread.sleep(5000);
	        Thread.sleep(5000);
	        
	        //Click on Feasibility drop-down
	        assertTextXpath("//*[@id='rist-treatment-alternative-evaluation']/tbody/tr[3]/td[8]/span/cw-rt-evaluation-alternative-choices/div/button");
	        clickByXpath("//*[@id='rist-treatment-alternative-evaluation']/tbody/tr[3]/td[8]/span/cw-rt-evaluation-alternative-choices/div/button");
	        Reporter.log("Click on Feasibility drop-down | ");
	        Thread.sleep(5000);
	        
	        //Select Feasible option from Feasibility drop-down
	        assertTextLink("Feasible");
	        clickBylinktext("Feasible");
	        Reporter.log("Select Feasible option from Feasibility drop-down | ");
	        Thread.sleep(5000);
	        
	        //Click on Action Drop-down
	        assertTextXpath("//*[@id='rist-treatment-alternative-evaluation']/tbody/tr[3]/td[10]/span/cw-rt-evaluation-alternative-choices/div/button");
	        clickByXpath("//*[@id='rist-treatment-alternative-evaluation']/tbody/tr[3]/td[10]/span/cw-rt-evaluation-alternative-choices/div/button");
	        Reporter.log("Click on Action Drop-down | ");
	        Thread.sleep(5000);
	        
	        //Select Enhance option from Action drop-down
	        assertTextLink("Enhance");
	        clickBylinktext("Enhance");
	        Reporter.log("Select Enhance option from Action drop-down | ");
	        Thread.sleep(5000);     
	        
	        // Click on Effectiveness drop-down
	        assertTextXpath("//*[@id='rist-treatment-alternative-evaluation']/tbody/tr[4]/td[6]/span/cw-rt-evaluation-alternative-choices/div/button");
	        clickByXpath("//*[@id='rist-treatment-alternative-evaluation']/tbody/tr[4]/td[6]/span/cw-rt-evaluation-alternative-choices/div/button");
	        Reporter.log("Click on Effectiveness drop-down | ");
	        Thread.sleep(5000);
	        
	        // Select Effective option from Effectiveness drop-down
	        assertTextLink("Effective");
	        clickBylinktext("Effective");
	        Reporter.log("Select Effective option from Effectiveness drop-down | ");
	        Thread.sleep(5000);
	        Thread.sleep(5000);
	        
	        //Click on Feasibility drop-down
	        assertTextXpath("//*[@id='rist-treatment-alternative-evaluation']/tbody/tr[4]/td[8]/span/cw-rt-evaluation-alternative-choices/div/button");
	        clickByXpath("//*[@id='rist-treatment-alternative-evaluation']/tbody/tr[4]/td[8]/span/cw-rt-evaluation-alternative-choices/div/button");
	        Reporter.log("Click on Feasibility drop-down | ");
	        Thread.sleep(5000);
	        
	        //Select Feasible option from Feasibility drop-down
	        assertTextLink("Feasible");
	        clickBylinktext("Feasible");
	        Reporter.log("Select Feasible option from Feasibility drop-down | ");
	        Thread.sleep(5000);
	        
	        //Click on Action Drop-down
	        assertTextXpath("//*[@id='rist-treatment-alternative-evaluation']/tbody/tr[4]/td[10]/span/cw-rt-evaluation-alternative-choices/div/button");
	        clickByXpath("//*[@id='rist-treatment-alternative-evaluation']/tbody/tr[4]/td[10]/span/cw-rt-evaluation-alternative-choices/div/button");
	        Reporter.log("Click on Action Drop-down | ");
	        Thread.sleep(5000);
	        
	        //Select Enhance option from Action drop-down
	        assertTextLink("Enhance");
	        clickBylinktext("Enhance");
	        Reporter.log("Select Enhance option from Action drop-down | ");
	        Thread.sleep(5000);     */
	        	           
	        //Click on Risk Likelihood drop-down
	        assertTextXpath("//cw-risk-choices-select/div/button");
	        clickByXpath("//cw-risk-choices-select/div/button");
	        Reporter.log("Click on Risk Likelihood drop-down | ");
	        Thread.sleep(5000);
	        
	        //Select Moderate Option from Risk Likelihood drop-down
	        assertTextXpath("//cw-risk-choices-select/div/ul/li[4]/a");
	        clickByXpath("//cw-risk-choices-select/div/ul/li[4]/a");
	        Reporter.log("Select Moderate Option from Risk Likelihood drop-down | ");
	        Thread.sleep(5000);
	        
	        //Click on Risk Impact drop-down
	        assertTextXpath("//div[3]/div/cw-risk-choices-select/div/button");
	        clickByXpath("//div[3]/div/cw-risk-choices-select/div/button");
	        Reporter.log("Click on Risk Impact drop-down | ");
	        Thread.sleep(5000);
	        
	        //Select Major Option from Risk Likelihood drop-down
	        assertTextXpath("//div[3]/div/cw-risk-choices-select/div/ul/li[5]/a");
	        clickByXpath("//div[3]/div/cw-risk-choices-select/div/ul/li[5]/a");
	        Reporter.log("Select Major Option from Risk Likelihood drop-down | ");
	        Thread.sleep(5000);
	        
	        //Click on Keep Rating from Pop-up window
	        assertTextXpath("//div[3]/button[2]");
	        clickByXpath("//div[3]/button[2]");
	        Reporter.log("Click on Keep Rating from Pop-up window | ");
	        Thread.sleep(5000);
	        Thread.sleep(5000);
	        Thread.sleep(5000);
	        
	        // Click on Evaluated check-box
	        assertTextXpath("//*[@id='rtData']/div[4]/div/div[1]/div[2]/div[1]/div[2]/div");
	        clickByXpath("//*[@id='rtData']/div[4]/div/div[1]/div[2]/div[1]/div[2]/div");
	        Reporter.log("Click on Evaluated check-box | ");
	        Thread.sleep(5000);
	        Thread.sleep(5000);
	        
	        //Click on Approve Check-box
	        assertTextXpath("//*[@id='rtData']/div[4]/div/div[2]/div[2]/div/div[2]/div");
	        clickByXpath("//*[@id='rtData']/div[4]/div/div[2]/div[2]/div/div[2]/div");
	        Reporter.log("Click on Approve Check-box | ");
	        Thread.sleep(5000);
	        Thread.sleep(5000);
	        
	        //Click on 'Goto Implementation Planning' button 
	        clickByXpath("//*[@id='rtIp']");
	        Reporter.log("Click on 'Goto Implementation Planning' button | ");
	        Thread.sleep(5000);
	        Thread.sleep(5000);
	        Thread.sleep(5000);	        
        
	        //Enter some text in Description textarea
	        sendvaluebyxpath("//*[@id='ipData']/tbody/tr[1]/td[4]/cw-rr-text-area/div/textarea", "desc");
	        Reporter.log("Enter some text in Description textarea | ");
	        Thread.sleep(5000);
	        
	        //Enter some text in Plans for Monitoring Effectiveness textarea
   	        sendvaluebyxpath("//*[@id='ipData']/tbody/tr[1]/td[5]/cw-rr-text-area/div/textarea", "plans");
   	        Reporter.log("Enter some text in Plans for Monitoring Effectiveness textarea | ");
	        Thread.sleep(5000);
	        
	        //Click on Implementation Manager drop-down
	        clickByXpath("//*[@id='ipData']/tbody/tr[1]/td[6]/cw-rr-planning-choices/div/button");
	        Reporter.log("Click on Implementation Manager drop-down | ");
	        Thread.sleep(5000);
	        
	        // Select any option from Implementation Manager drop-down
	        clickByXpath("//cw-rr-planning-choices/div/ul/li[2]/a");
	        Reporter.log("Select any option from Implementation Manager drop-down| ");
	        Thread.sleep(5000);
	        
	        //Select Date from Implementation Due Date 
	        sendvaluebyxpath("//*[@id='ipData']/tbody/tr[1]/td[7]/div/input", "09/05/2017");
	        Reporter.log("Select Date from Implementation Due Date  | ");
	        Thread.sleep(5000);
	        Thread.sleep(5000);
	        
	        /*//Enter some text in Description textarea
	        sendvaluebyxpath("//*[@id='ipData']/tbody/tr[2]/td[4]/cw-rr-text-area/div/textarea", "desc");
	        Reporter.log("Enter some text in Description textarea | ");
	        Thread.sleep(5000);
	        
	        //Enter some text in Plans for Monitoring Effectiveness textarea
   	        sendvaluebyxpath("//*[@id='ipData']/tbody/tr[2]/td[5]/cw-rr-text-area/div/textarea", "plans");
   	        Reporter.log("Enter some text in Plans for Monitoring Effectiveness textarea | ");
	        Thread.sleep(5000);
	        
	        //Click on Implementation Manager drop-down
	        clickByXpath("//*[@id='ipData']/tbody/tr[2]/td[6]/cw-rr-planning-choices/div/button");
	        Reporter.log("Click on Implementation Manager drop-down | ");
	        Thread.sleep(5000);
	        
	        // Select any option from Implementation Manager drop-down
	        clickByXpath("//cw-rr-planning-choices/div/ul/li[2]/a");
	        Reporter.log("Select any option from Implementation Manager drop-down| ");
	        Thread.sleep(5000);
	        
	        //Select Date from Implementation Due Date 
	        sendvaluebyxpath("//*[@id='ipData']/tbody/tr[2]/td[7]/div/input", "09/05/2017");
	        Reporter.log("Select Date from Implementation Due Date  | ");
	        Thread.sleep(5000);
	        Thread.sleep(5000);
	        
	        //Enter some text in Description textarea
	        sendvaluebyxpath("//*[@id='ipData']/tbody/tr[3]/td[4]/cw-rr-text-area/div/textarea", "desc");
	        Reporter.log("Enter some text in Description textarea | ");
	        Thread.sleep(5000);
	        
	        //Enter some text in Plans for Monitoring Effectiveness textarea
   	        sendvaluebyxpath("//*[@id='ipData']/tbody/tr[3]/td[5]/cw-rr-text-area/div/textarea", "plans");
   	        Reporter.log("Enter some text in Plans for Monitoring Effectiveness textarea | ");
	        Thread.sleep(5000);
	        
	        //Click on Implementation Manager drop-down
	        clickByXpath("//*[@id='ipData']/tbody/tr[3]/td[6]/cw-rr-planning-choices/div/button");
	        Reporter.log("Click on Implementation Manager drop-down | ");
	        Thread.sleep(5000);
	        
	        // Select any option from Implementation Manager drop-down
	        clickByXpath("//cw-rr-planning-choices/div/ul/li[2]/a");
	        Reporter.log("Select any option from Implementation Manager drop-down| ");
	        Thread.sleep(5000);
	        
	        //Select Date from Implementation Due Date 
	        sendvaluebyxpath("//*[@id='ipData']/tbody/tr[3]/td[7]/div/input", "09/05/2017");
	        Reporter.log("Select Date from Implementation Due Date  | ");
	        Thread.sleep(5000);
	        Thread.sleep(5000);
*/	        
	        //Click on Planned Check-box
	        clickByXpath("//*[@id='chkPlanned']");
	        Reporter.log("Click on Planned Check-box | ");
	        Thread.sleep(5000);
	        Thread.sleep(5000);
	        Thread.sleep(5000);
	        
	        // Click on Go To Risk Action Plan button
	        clickBylinktext("Go To Risk Action Plan");
	        Reporter.log("Click on Go To Risk Action Plan button | ");
	        Thread.sleep(5000);
	        Thread.sleep(5000);
	        Thread.sleep(5000);
	        
	        // Select Priority from drop-down
	        selectByXpath_Visibletext("//*[@id='content']/tr[1]/td[6]/div/select","High");
	        Reporter.log("Select Priority from drop-down | ");
	        Thread.sleep(5000);
	        
	        //Select Completed Date
	        sendvaluebyxpath("//*[@id='content']/tr[1]/td[8]/div/input", "09/22/2017");
	        Reporter.log("Select Completed Date | ");
	        Thread.sleep(5000);
	        
	        //Click on Plan Status drop-down
	        clickByXpath("//*[@id='content']/tr[1]/td[9]/div/select");
	        Reporter.log("Click on Plan Status drop-down | ");
	        Thread.sleep(2000);
	        
	        //Select Implemented option from Plan Status drop-down
	        clickByXpath("//*[@id='content']/tr[1]/td[9]/div/select/option[2]");
	        Reporter.log("Select Implemented option from Plan Status drop-down | ");
	        Thread.sleep(5000);
	        	        
	        // Click on Proceed Button
	        clickByXpath("html/body/div[5]/div/div/div[3]/button[2]");
	        Reporter.log("Click on Proceed Button | ");	        
	        Thread.sleep(5000);
	        Thread.sleep(5000);
	        
	        /*// Select Priority from drop-down
	        selectByXpath_Visibletext("//*[@id='content']/tr[3]/td[6]/div/select","High");
	        Reporter.log("Select Priority from drop-down | ");
	        Thread.sleep(5000);
	        
	        //Select Completed Date
	        sendvaluebyxpath("//*[@id='content']/tr[3]/td[8]/div/input", "09/22/2017");
	        Reporter.log("Select Completed Date | ");
	        Thread.sleep(5000);
	        
	        //Click on Plan Status drop-down
	        clickByXpath("//*[@id='content']/tr[3]/td[9]/div/select");
	        Reporter.log("Click on Plan Status drop-down | ");
	        Thread.sleep(2000);
	        
	        //Select Implemented option from Plan Status drop-down
	        clickByXpath("//*[@id='content']/tr[3]/td[9]/div/select/option[2]");
	        Reporter.log("Select Implemented option from Plan Status drop-down | ");
	        Thread.sleep(5000);
	        	        
	        // Click on Proceed Button
	        clickByXpath("html/body/div[5]/div/div/div[3]/button[2]");
	        Reporter.log("Click on Proceed Button | ");	        
	        Thread.sleep(5000);
	        Thread.sleep(5000);
	        
	        // Select Priority from drop-down
	        selectByXpath_Visibletext("//*[@id='content']/tr[5]/td[6]/div/select","High");
	        Reporter.log("Select Priority from drop-down | ");
	        Thread.sleep(5000);
	        
	        //Select Completed Date
	        sendvaluebyxpath("//*[@id='content']/tr[5]/td[8]/div/input", "09/22/2017");
	        Reporter.log("Select Completed Date | ");
	        Thread.sleep(5000);
	        
	        //Click on Plan Status drop-down
	        clickByXpath("//*[@id='content']/tr[5]/td[9]/div/select");
	        Reporter.log("Click on Plan Status drop-down | ");
	        Thread.sleep(2000);
	        
	        //Select Implemented option from Plan Status drop-down
	        clickByXpath("//*[@id='content']/tr[5]/td[9]/div/select/option[2]");
	        Reporter.log("Select Implemented option from Plan Status drop-down | ");
	        Thread.sleep(5000);
	        	        
	        // Click on Proceed Button
	        clickByXpath("html/body/div[5]/div/div/div[3]/button[2]");
	        Reporter.log("Click on Proceed Button | ");	        
	        Thread.sleep(5000);
	        Thread.sleep(5000);*/
	        	        
	       /* // Click on RiskCouncilation Button
	        clickByXpath("//*[@id='bottomNav']/span");
	        Reporter.log("Click on RiskCouncilation Button | ");
	        Thread.sleep(5000);
	        Thread.sleep(5000);
	        Thread.sleep(5000);
	        Thread.sleep(5000);
	        Thread.sleep(5000);*/
	        
	        //Select Risk Reconciliation List
	        clickBylinktext("Risk Reconciliation");
	        Reporter.log("Select Risk Reconciliation sub-Module | ");
	        Thread.sleep(5000);
	        Thread.sleep(5000);
	        Thread.sleep(5000);
	        
	        //Click on Risk Likelihood drop-down
	        assertTextXpath("//*[@id='riskLikelihoodSelect']/cw-simple-risk-choices/div/button");
	        clickByXpath("//*[@id='riskLikelihoodSelect']/cw-simple-risk-choices/div/button");
	        Reporter.log("Click on Risk Likelihood drop-down | ");
	        Thread.sleep(5000);
	        
	        //Select Moderate Option from Risk Likelihood drop-down
	        assertTextXpath("//*[@id='riskLikelihoodSelect']/cw-simple-risk-choices/div/ul/li[5]/a");
	        clickByXpath("//*[@id='riskLikelihoodSelect']/cw-simple-risk-choices/div/ul/li[5]/a");
	        Reporter.log("Select Moderate Option from Risk Likelihood drop-down | ");
	        Thread.sleep(5000);
	        
	        //Click on Risk Impact drop-down
	        assertTextXpath("//*[@id='riskImpactSelect']/cw-simple-risk-choices/div/button");
	        clickByXpath("//*[@id='riskImpactSelect']/cw-simple-risk-choices/div/button");
	        Reporter.log("Click on Risk Impact drop-down | ");
	        Thread.sleep(5000);
	        
	        //Select Major Option from Risk Likelihood drop-down
	        assertTextXpath("//*[@id='riskImpactSelect']/cw-simple-risk-choices/div/ul/li[6]/a");
	        clickByXpath("//*[@id='riskImpactSelect']/cw-simple-risk-choices/div/ul/li[6]/a");
	        Reporter.log("Select Major Option from Risk Likelihood drop-down | ");
	        Thread.sleep(5000);
	        
	        //Click on proceed button from Warning Pop-up window
	        assertTextXpath("html/body/div[4]/div/div/div[3]/button[2]");
	        clickByXpath("html/body/div[4]/div/div/div[3]/button[2]");
	        Reporter.log("Click on proceed button from Warning Pop-up window | ");
	        Thread.sleep(5000);
	        Thread.sleep(5000);  
	        
	              
	   }
	   
	   @Test(priority=2, enabled = true)
	   public void SecondListmedia() throws IOException, InterruptedException {
		    
		    Thread.sleep(5000);
	        Thread.sleep(5000);
	        
	        //Click on Risk Response List Sub-module
	        assertTextLink("Risk Response List");
	        clickBylinktext("Risk Response List");
	        Reporter.log("Click on Risk Response List Sub-module | ");
	        Thread.sleep(5000);
	        Thread.sleep(5000);
	        
	        //Click on TBD Button 
	        assertTextXpath("//tr[1]/td[8]/div/div/cw-section-change-button-caller/div/span");
	        clickByXpath("//tr[1]/td[8]/div/div/cw-section-change-button-caller/div/span");
	        Reporter.log("Click on TBD Button | ");
	        Thread.sleep(5000);
	        Thread.sleep(5000);
	        Thread.sleep(5000);
	        
	        // Click on Risk Treatment Type drop-down
	        assertTextXpath("//cw-risk-treatment-treatment-choices/div/button");
	        clickByXpath("//cw-risk-treatment-treatment-choices/div/button");
	        Reporter.log("Click on Risk Treatment Type drop-down | ");
	        Thread.sleep(5000);
	        Thread.sleep(5000);
	        
	        //Select Transfer option from Risk Treatment Type
	        assertTextLink("Transfer");
	        clickBylinktext("Transfer");
	        Reporter.log("Select Transfer option from Risk Treatment Type | ");
	        Thread.sleep(5000);
	       
	        // Click on Effectiveness drop-down
	        assertTextXpath("//cw-rt-evaluation-alternative-choices/div/button");
	        clickByXpath("//cw-rt-evaluation-alternative-choices/div/button");
	        Reporter.log("Click on Effectiveness drop-down | ");
	        Thread.sleep(5000);
	        
	        // Select Effective option from Effectiveness drop-down
	        assertTextLink("Effective");
	        clickBylinktext("Effective");
	        Reporter.log("Select Effective option from Effectiveness drop-down | ");
	        Thread.sleep(5000);
	        Thread.sleep(5000);
	        
	        //Click on Feasibility drop-down
	        assertTextXpath("//td[8]/span/cw-rt-evaluation-alternative-choices/div/button");
	        clickByXpath("//td[8]/span/cw-rt-evaluation-alternative-choices/div/button");
	        Reporter.log("Click on Feasibility drop-down | ");
	        Thread.sleep(5000);
	        
	        //Select Feasible option from Feasibility drop-down
	        assertTextLink("Feasible");
	        clickBylinktext("Feasible");
	        Reporter.log("Select Feasible option from Feasibility drop-down | ");
	        Thread.sleep(5000);
	        
	        //Click on Action Drop-down
	        assertTextXpath("//td[10]/span/cw-rt-evaluation-alternative-choices/div/button");
	        clickByXpath("//td[10]/span/cw-rt-evaluation-alternative-choices/div/button");
	        Reporter.log("Click on Action Drop-down | ");
	        Thread.sleep(5000);
	        
	        //Select Enhance option from Action drop-down
	        assertTextLink("Enhance");
	        clickBylinktext("Enhance");
	        Reporter.log("Select Enhance option from Action drop-down | ");
	        Thread.sleep(5000);
	               
	        //Click on Risk Likelihood drop-down
	        assertTextXpath("//cw-risk-choices-select/div/button");
	        clickByXpath("//cw-risk-choices-select/div/button");
	        Reporter.log("Click on Risk Likelihood drop-down | ");
	        Thread.sleep(5000);
	        
	        //Select Moderate Option from Risk Likelihood drop-down
	        assertTextXpath("//cw-risk-choices-select/div/ul/li[4]/a");
	        clickByXpath("//cw-risk-choices-select/div/ul/li[4]/a");
	        Reporter.log("Select Moderate Option from Risk Likelihood drop-down | ");
	        Thread.sleep(5000);
	        
	        //Click on Risk Impact drop-down
	        assertTextXpath("//div[3]/div/cw-risk-choices-select/div/button");
	        clickByXpath("//div[3]/div/cw-risk-choices-select/div/button");
	        Reporter.log("Click on Risk Impact drop-down | ");
	        Thread.sleep(5000);
	        
	        //Select Major Option from Risk Likelihood drop-down
	        assertTextXpath("//div[3]/div/cw-risk-choices-select/div/ul/li[5]/a");
	        clickByXpath("//div[3]/div/cw-risk-choices-select/div/ul/li[5]/a");
	        Reporter.log("Select Major Option from Risk Likelihood drop-down | ");
	        Thread.sleep(5000);
	        
	        //Click on Keep Rating from Pop-up window
	        assertTextXpath("//div[3]/button[2]");
	        clickByXpath("//div[3]/button[2]");
	        Reporter.log("Click on Keep Rating from Pop-up window | ");
	        Thread.sleep(5000);
	        Thread.sleep(5000);
	        Thread.sleep(5000);
	        
	        // Click on Evaluated check-box
	        assertTextXpath("//*[@id='rtData']/div[4]/div/div[1]/div[2]/div[1]/div[2]/div");
	        clickByXpath("//*[@id='rtData']/div[4]/div/div[1]/div[2]/div[1]/div[2]/div");
	        Reporter.log("Click on Evaluated check-box | ");
	        Thread.sleep(5000);
	        Thread.sleep(5000);
	        
	        //Click on Approve Check-box
	        assertTextXpath("//*[@id='rtData']/div[4]/div/div[2]/div[2]/div/div[2]/div");
	        clickByXpath("//*[@id='rtData']/div[4]/div/div[2]/div[2]/div/div[2]/div");
	        Reporter.log("Click on Approve Check-box | ");
	        Thread.sleep(5000);
	        Thread.sleep(5000);
	        
	        //Click on 'Goto Implementation Planning' button 
	        clickByXpath("//*[@id='rtIp']");
	        Reporter.log("Click on 'Goto Implementation Planning' button | ");
	        Thread.sleep(5000);
	        Thread.sleep(5000);
	        Thread.sleep(5000);
	        
	        //Enter some text in Description textarea
	        sendvaluebyxpath("//textarea", "desc");
	        Reporter.log("Enter some text in Description textarea | ");
	        Thread.sleep(5000);
	        
	        //Enter some text in Plans for Monitoring Effectiveness textarea
   	        sendvaluebyxpath("//td[5]/cw-rr-text-area/div/textarea", "plans");
   	        Reporter.log("Enter some text in Plans for Monitoring Effectiveness textarea | ");
	        Thread.sleep(5000);
	        
	        //Click on Implementation Manager drop-down
	        clickByXpath("//cw-rr-planning-choices/div/button");
	        Reporter.log("Click on Implementation Manager drop-down | ");
	        Thread.sleep(5000);
	        
	        // Select any option from Implementation Manager drop-down
	        clickByXpath("//cw-rr-planning-choices/div/ul/li[2]/a");
	        Reporter.log("Select any option from Implementation Manager drop-down| ");
	        Thread.sleep(5000);
	        
	        //Select Date from Implementation Due Date 
	        sendvaluebyxpath("//td[7]/div/input", "09/05/2017");
	        Reporter.log("Select Date from Implementation Due Date  | ");
	        Thread.sleep(5000);
	        Thread.sleep(5000);
	        
	        //Click on Planned Check-box
	        clickByXpath("//*[@id='chkPlanned']");
	        Reporter.log("Click on Planned Check-box | ");
	        Thread.sleep(5000);
	        Thread.sleep(5000);
	        Thread.sleep(5000);
	        
	        // Click on Go To Risk Action Plan button
	        clickBylinktext("Go To Risk Action Plan");
	        Reporter.log("Click on Go To Risk Action Plan button | ");
	        Thread.sleep(5000);
	        Thread.sleep(5000);
	        Thread.sleep(5000);
	        
	        // Select Priority from drop-down
	        selectByXpath_Visibletext("//td[6]/div/select","High");
	        Reporter.log("Select Priority from drop-down | ");
	        Thread.sleep(5000);
	        
	        //Select Completed Date
	        sendvaluebyxpath("//td[8]/div/input", "09/22/2017");
	        Reporter.log("Select Completed Date | ");
	        Thread.sleep(5000);
	        
	        //Click on Plan Status drop-down
	        clickByXpath("//*[@id='content']/tr[1]/td[9]/div/select");
	        Reporter.log("Click on Plan Status drop-down | ");
	        Thread.sleep(2000);
	        
	        //Select Implemented option from Plan Status drop-down
	        clickByXpath("//*[@id='content']/tr[1]/td[9]/div/select/option[2]");
	        Reporter.log("Select Implemented option from Plan Status drop-down | ");
	        Thread.sleep(5000);
	        	        
	        // Click on Proceed Button
	        clickByXpath("html/body/div[5]/div/div/div[3]/button[2]");
	        Reporter.log("Click on Proceed Button | ");	        
	        Thread.sleep(5000);
	        Thread.sleep(5000);
	        Thread.sleep(5000);
	        Thread.sleep(5000);
	        
	        //Select Risk Reconciliation List
	        clickBylinktext("Risk Reconciliation");
	        Reporter.log("Select Risk Reconciliation sub-Module | ");
	        Thread.sleep(5000);
	        
	        //Click on Risk Likelihood drop-down
	        assertTextXpath("//*[@id='riskLikelihoodSelect']/cw-simple-risk-choices/div/button");
	        clickByXpath("//*[@id='riskLikelihoodSelect']/cw-simple-risk-choices/div/button");
	        Reporter.log("Click on Risk Likelihood drop-down | ");
	        Thread.sleep(5000);
	        
	        //Select Moderate Option from Risk Likelihood drop-down
	        assertTextXpath("//*[@id='riskLikelihoodSelect']/cw-simple-risk-choices/div/ul/li[5]/a");
	        clickByXpath("//*[@id='riskLikelihoodSelect']/cw-simple-risk-choices/div/ul/li[5]/a");
	        Reporter.log("Select Moderate Option from Risk Likelihood drop-down | ");
	        Thread.sleep(5000);
	        
	        //Click on Risk Impact drop-down
	        assertTextXpath("//*[@id='riskImpactSelect']/cw-simple-risk-choices/div/button");
	        clickByXpath("//*[@id='riskImpactSelect']/cw-simple-risk-choices/div/button");
	        Reporter.log("Click on Risk Impact drop-down | ");
	        Thread.sleep(5000);
	        
	        //Select Major Option from Risk Likelihood drop-down
	        assertTextXpath("//*[@id='riskImpactSelect']/cw-simple-risk-choices/div/ul/li[6]/a");
	        clickByXpath("//*[@id='riskImpactSelect']/cw-simple-risk-choices/div/ul/li[6]/a");
	        Reporter.log("Select Major Option from Risk Likelihood drop-down | ");
	        Thread.sleep(5000);
	        
	        //Click on proceed button from Warning Pop-up window
	        assertTextXpath("html/body/div[4]/div/div/div[3]/button[2]");
	        clickByXpath("html/body/div[4]/div/div/div[3]/button[2]");
	        Reporter.log("Click on proceed button from Warning Pop-up window | ");
	        Thread.sleep(5000);
	        Thread.sleep(5000);
	        Thread.sleep(5000);
	        Thread.sleep(5000);
	        
}  
	   @Test(priority=3, enabled = true)
	   public void ThirdListmedia() throws IOException, InterruptedException {
		    
		    Thread.sleep(5000);
	        Thread.sleep(5000);
	        
	        //Click on Risk Response List Sub-module
	        assertTextLink("Risk Response List");
	        clickBylinktext("Risk Response List");
	        Reporter.log("Click on Risk Response List Sub-module | ");
	        Thread.sleep(5000);
	        Thread.sleep(5000);
	        
	        //Click on TBD Button 
	        assertTextXpath("//tr[2]/td[8]/div/div/cw-section-change-button-caller/div/span");
	        clickByXpath("//tr[2]/td[8]/div/div/cw-section-change-button-caller/div/span");
	        Reporter.log("Click on TBD Button | ");
	        Thread.sleep(5000);
	        Thread.sleep(5000);
	        Thread.sleep(5000);
	        
	        // Click on Risk Treatment Type drop-down
	        assertTextXpath("//cw-risk-treatment-treatment-choices/div/button");
	        clickByXpath("//cw-risk-treatment-treatment-choices/div/button");
	        Reporter.log("Click on Risk Treatment Type drop-down | ");
	        Thread.sleep(5000);
	        Thread.sleep(5000);
	        
	        //Select Transfer option from Risk Treatment Type
	        assertTextLink("Transfer");
	        clickBylinktext("Transfer");
	        Reporter.log("Select Transfer option from Risk Treatment Type | ");
	        Thread.sleep(5000);
	       
	        // Click on Effectiveness drop-down
	        assertTextXpath("//cw-rt-evaluation-alternative-choices/div/button");
	        clickByXpath("//cw-rt-evaluation-alternative-choices/div/button");
	        Reporter.log("Click on Effectiveness drop-down | ");
	        Thread.sleep(5000);
	        
	        // Select Effective option from Effectiveness drop-down
	        assertTextLink("Effective");
	        clickBylinktext("Effective");
	        Reporter.log("Select Effective option from Effectiveness drop-down | ");
	        Thread.sleep(5000);
	        Thread.sleep(5000);
	        
	        //Click on Feasibility drop-down
	        assertTextXpath("//td[8]/span/cw-rt-evaluation-alternative-choices/div/button");
	        clickByXpath("//td[8]/span/cw-rt-evaluation-alternative-choices/div/button");
	        Reporter.log("Click on Feasibility drop-down | ");
	        Thread.sleep(5000);
	        
	        //Select Feasible option from Feasibility drop-down
	        assertTextLink("Feasible");
	        clickBylinktext("Feasible");
	        Reporter.log("Select Feasible option from Feasibility drop-down | ");
	        Thread.sleep(5000);
	        
	        //Click on Action Drop-down
	        assertTextXpath("//td[10]/span/cw-rt-evaluation-alternative-choices/div/button");
	        clickByXpath("//td[10]/span/cw-rt-evaluation-alternative-choices/div/button");
	        Reporter.log("Click on Action Drop-down | ");
	        Thread.sleep(5000);
	        
	        //Select Enhance option from Action drop-down
	        assertTextLink("Enhance");
	        clickBylinktext("Enhance");
	        Reporter.log("Select Enhance option from Action drop-down | ");
	        Thread.sleep(5000);
	               
	        //Click on Risk Likelihood drop-down
	        assertTextXpath("//cw-risk-choices-select/div/button");
	        clickByXpath("//cw-risk-choices-select/div/button");
	        Reporter.log("Click on Risk Likelihood drop-down | ");
	        Thread.sleep(5000);
	        
	        //Select Moderate Option from Risk Likelihood drop-down
	        assertTextXpath("//cw-risk-choices-select/div/ul/li[4]/a");
	        clickByXpath("//cw-risk-choices-select/div/ul/li[4]/a");
	        Reporter.log("Select Moderate Option from Risk Likelihood drop-down | ");
	        Thread.sleep(5000);
	        
	        //Click on Risk Impact drop-down
	        assertTextXpath("//div[3]/div/cw-risk-choices-select/div/button");
	        clickByXpath("//div[3]/div/cw-risk-choices-select/div/button");
	        Reporter.log("Click on Risk Impact drop-down | ");
	        Thread.sleep(5000);
	        
	        //Select Major Option from Risk Likelihood drop-down
	        assertTextXpath("//div[3]/div/cw-risk-choices-select/div/ul/li[5]/a");
	        clickByXpath("//div[3]/div/cw-risk-choices-select/div/ul/li[5]/a");
	        Reporter.log("Select Major Option from Risk Likelihood drop-down | ");
	        Thread.sleep(5000);
	        
	        //Click on Keep Rating from Pop-up window
	        assertTextXpath("//div[3]/button[2]");
	        clickByXpath("//div[3]/button[2]");
	        Reporter.log("Click on Keep Rating from Pop-up window | ");
	        Thread.sleep(5000);
	        Thread.sleep(5000);
	        Thread.sleep(5000);
	        
	        // Click on Evaluated check-box
	        assertTextXpath("//*[@id='rtData']/div[4]/div/div[1]/div[2]/div[1]/div[2]/div");
	        clickByXpath("//*[@id='rtData']/div[4]/div/div[1]/div[2]/div[1]/div[2]/div");
	        Reporter.log("Click on Evaluated check-box | ");
	        Thread.sleep(5000);
	        Thread.sleep(5000);
	        
	        //Click on Approve Check-box
	        assertTextXpath("//*[@id='rtData']/div[4]/div/div[2]/div[2]/div/div[2]/div");
	        clickByXpath("//*[@id='rtData']/div[4]/div/div[2]/div[2]/div/div[2]/div");
	        Reporter.log("Click on Approve Check-box | ");
	        Thread.sleep(5000);
	        Thread.sleep(5000);
	        
	        //Click on 'Goto Implementation Planning' button 
	        clickByXpath("//*[@id='rtIp']");
	        Reporter.log("Click on 'Goto Implementation Planning' button | ");
	        Thread.sleep(5000);
	        Thread.sleep(5000);
	        Thread.sleep(5000);
	        
	        //Enter some text in Description textarea
	        sendvaluebyxpath("//textarea", "desc");
	        Reporter.log("Enter some text in Description textarea | ");
	        Thread.sleep(5000);
	        
	        //Enter some text in Plans for Monitoring Effectiveness textarea
   	        sendvaluebyxpath("//td[5]/cw-rr-text-area/div/textarea", "plans");
   	        Reporter.log("Enter some text in Plans for Monitoring Effectiveness textarea | ");
	        Thread.sleep(5000);
	        
	        //Click on Implementation Manager drop-down
	        clickByXpath("//cw-rr-planning-choices/div/button");
	        Reporter.log("Click on Implementation Manager drop-down | ");
	        Thread.sleep(5000);
	        
	        // Select any option from Implementation Manager drop-down
	        clickByXpath("//cw-rr-planning-choices/div/ul/li[2]/a");
	        Reporter.log("Select any option from Implementation Manager drop-down| ");
	        Thread.sleep(5000);
	        
	        //Select Date from Implementation Due Date 
	        sendvaluebyxpath("//td[7]/div/input", "09/05/2017");
	        Reporter.log("Select Date from Implementation Due Date  | ");
	        Thread.sleep(5000);
	        Thread.sleep(5000);
	        
	        //Click on Planned Check-box
	        clickByXpath("//*[@id='chkPlanned']");
	        Reporter.log("Click on Planned Check-box | ");
	        Thread.sleep(5000);
	        Thread.sleep(5000);
	        Thread.sleep(5000);
	        
	        // Click on Go To Risk Action Plan button
	        clickBylinktext("Go To Risk Action Plan");
	        Reporter.log("Click on Go To Risk Action Plan button | ");
	        Thread.sleep(5000);
	        Thread.sleep(5000);
	        Thread.sleep(5000);
	        
	        // Select Priority from drop-down
	        selectByXpath_Visibletext("//td[6]/div/select","High");
	        Reporter.log("Select Priority from drop-down | ");
	        Thread.sleep(5000);
	        
	        //Select Completed Date
	        sendvaluebyxpath("//td[8]/div/input", "09/22/2017");
	        Reporter.log("Select Completed Date | ");
	        Thread.sleep(5000);
	        
	        //Click on Plan Status drop-down
	        clickByXpath("//*[@id='content']/tr[1]/td[9]/div/select");
	        Reporter.log("Click on Plan Status drop-down | ");
	        Thread.sleep(2000);
	        
	        //Select Implemented option from Plan Status drop-down
	        clickByXpath("//*[@id='content']/tr[1]/td[9]/div/select/option[2]");
	        Reporter.log("Select Implemented option from Plan Status drop-down | ");
	        Thread.sleep(5000);
	        	        
	        // Click on Proceed Button
	        clickByXpath("html/body/div[5]/div/div/div[3]/button[2]");
	        Reporter.log("Click on Proceed Button | ");	        
	        Thread.sleep(5000);
	        Thread.sleep(5000);
	        Thread.sleep(5000);
	        Thread.sleep(5000);
	        
	        //Select Risk Reconciliation List
	        clickBylinktext("Risk Reconciliation");
	        Reporter.log("Select Risk Reconciliation sub-Module | ");
	        Thread.sleep(5000);
	        
	        //Click on Risk Likelihood drop-down
	        assertTextXpath("//tr[3]/td[15]/cw-simple-risk-choices/div/button");
	        clickByXpath("//tr[3]/td[15]/cw-simple-risk-choices/div/button");
	        Reporter.log("Click on Risk Likelihood drop-down | ");
	        Thread.sleep(5000);
	        
	        //Select Moderate Option from Risk Likelihood drop-down
	        assertTextXpath("//*[@id='riskLikelihoodSelect']/cw-simple-risk-choices/div/ul/li[5]/a");
	        clickByXpath("//*[@id='riskLikelihoodSelect']/cw-simple-risk-choices/div/ul/li[5]/a");
	        Reporter.log("Select Moderate Option from Risk Likelihood drop-down | ");
	        Thread.sleep(5000);
	        
	        //Click on Risk Impact drop-down
	        assertTextXpath("//tr[3]/td[16]/cw-simple-risk-choices/div/button");
	        clickByXpath("//tr[3]/td[16]/cw-simple-risk-choices/div/button");
	        Reporter.log("Click on Risk Impact drop-down | ");
	        Thread.sleep(5000);
	        
	        //Select Major Option from Risk Likelihood drop-down
	        assertTextXpath("//*[@id='riskImpactSelect']/cw-simple-risk-choices/div/ul/li[6]/a");
	        clickByXpath("//*[@id='riskImpactSelect']/cw-simple-risk-choices/div/ul/li[6]/a");
	        Reporter.log("Select Major Option from Risk Likelihood drop-down | ");
	        Thread.sleep(5000);
	        
	        //Click on proceed button from Warning Pop-up window
	        assertTextXpath("html/body/div[4]/div/div/div[3]/button[2]");
	        clickByXpath("html/body/div[4]/div/div/div[3]/button[2]");
	        Reporter.log("Click on proceed button from Warning Pop-up window | ");
	        Thread.sleep(5000);
	        Thread.sleep(5000);
	        Thread.sleep(5000);
	        Thread.sleep(5000);
	        
} 
	   @Test(priority=4, enabled =true)
	   public void FourthListedmedia() throws IOException, InterruptedException {
		  
		    Thread.sleep(5000);
	        Thread.sleep(5000);
	        
	        //Click on Risk Response List Sub-module
	        assertTextLink("Risk Response List");
	        clickBylinktext("Risk Response List");
	        Reporter.log("Click on Risk Response List Sub-module | ");
	        Thread.sleep(5000);
	        Thread.sleep(5000);
	        
	        //Click on TBD Button 
	        assertTextXpath("//tr[3]/td[8]/div/div/cw-section-change-button-caller/div/span");
	        clickByXpath("//tr[3]/td[8]/div/div/cw-section-change-button-caller/div/span");
	        Reporter.log("Click on TBD Button | ");
	        Thread.sleep(5000);
	        Thread.sleep(5000);
	        Thread.sleep(5000);
	        
	        // Click on Risk Treatment Type drop-down
	        assertTextXpath("//cw-risk-treatment-treatment-choices/div/button");
	        clickByXpath("//cw-risk-treatment-treatment-choices/div/button");
	        Reporter.log("Click on Risk Treatment Type drop-down | ");
	        Thread.sleep(5000);
	        Thread.sleep(5000);
	        
	        //Select Transfer option from Risk Treatment Type
	        assertTextLink("Transfer");
	        clickBylinktext("Transfer");
	        Reporter.log("Select Transfer option from Risk Treatment Type | ");
	        Thread.sleep(5000);
	       
	        // Click on Effectiveness drop-down
	        assertTextXpath("//cw-rt-evaluation-alternative-choices/div/button");
	        clickByXpath("//cw-rt-evaluation-alternative-choices/div/button");
	        Reporter.log("Click on Effectiveness drop-down | ");
	        Thread.sleep(5000);
	        
	        // Select Effective option from Effectiveness drop-down
	        assertTextLink("Effective");
	        clickBylinktext("Effective");
	        Reporter.log("Select Effective option from Effectiveness drop-down | ");
	        Thread.sleep(5000);
	        Thread.sleep(5000);
	        
	        //Click on Feasibility drop-down
	        assertTextXpath("//td[8]/span/cw-rt-evaluation-alternative-choices/div/button");
	        clickByXpath("//td[8]/span/cw-rt-evaluation-alternative-choices/div/button");
	        Reporter.log("Click on Feasibility drop-down | ");
	        Thread.sleep(5000);
	        
	        //Select Feasible option from Feasibility drop-down
	        assertTextLink("Feasible");
	        clickBylinktext("Feasible");
	        Reporter.log("Select Feasible option from Feasibility drop-down | ");
	        Thread.sleep(5000);
	        
	        //Click on Action Drop-down
	        assertTextXpath("//td[10]/span/cw-rt-evaluation-alternative-choices/div/button");
	        clickByXpath("//td[10]/span/cw-rt-evaluation-alternative-choices/div/button");
	        Reporter.log("Click on Action Drop-down | ");
	        Thread.sleep(5000);
	        
	        //Select Enhance option from Action drop-down
	        assertTextLink("Enhance");
	        clickBylinktext("Enhance");
	        Reporter.log("Select Enhance option from Action drop-down | ");
	        Thread.sleep(5000);
	        
	        //Click on Risk Likelihood drop-down
	        assertTextXpath("//cw-risk-choices-select/div/button");
	        clickByXpath("//cw-risk-choices-select/div/button");
	        Reporter.log("Click on Risk Likelihood drop-down | ");
	        Thread.sleep(5000);
	        
	        //Select Moderate Option from Risk Likelihood drop-down
	        assertTextXpath("//cw-risk-choices-select/div/ul/li[4]/a");
	        clickByXpath("//cw-risk-choices-select/div/ul/li[4]/a");
	        Reporter.log("Select Moderate Option from Risk Likelihood drop-down | ");
	        Thread.sleep(5000);
	        
	        //Click on Risk Impact drop-down
	        assertTextXpath("//div[3]/div/cw-risk-choices-select/div/button");
	        clickByXpath("//div[3]/div/cw-risk-choices-select/div/button");
	        Reporter.log("Click on Risk Impact drop-down | ");
	        Thread.sleep(5000);
	        
	        //Select Major Option from Risk Likelihood drop-down
	        assertTextXpath("//div[3]/div/cw-risk-choices-select/div/ul/li[5]/a");
	        clickByXpath("//div[3]/div/cw-risk-choices-select/div/ul/li[5]/a");
	        Reporter.log("Select Major Option from Risk Likelihood drop-down | ");
	        Thread.sleep(5000);
	        
	        //Click on Keep Rating from Pop-up window
	        assertTextXpath("//div[3]/button[2]");
	        clickByXpath("//div[3]/button[2]");
	        Reporter.log("Click on Keep Rating from Pop-up window | ");
	        Thread.sleep(5000);
	        Thread.sleep(5000);
	        Thread.sleep(5000);
	        
	        // Click on Evaluated check-box
	        assertTextXpath("//*[@id='rtData']/div[4]/div/div[1]/div[2]/div[1]/div[2]/div");
	        clickByXpath("//*[@id='rtData']/div[4]/div/div[1]/div[2]/div[1]/div[2]/div");
	        Reporter.log("Click on Evaluated check-box | ");
	        Thread.sleep(5000);
	        Thread.sleep(5000);
	        
	        //Click on Approve Check-box
	        assertTextXpath("//*[@id='rtData']/div[4]/div/div[2]/div[2]/div/div[2]/div");
	        clickByXpath("//*[@id='rtData']/div[4]/div/div[2]/div[2]/div/div[2]/div");
	        Reporter.log("Click on Approve Check-box | ");
	        Thread.sleep(5000);
	        Thread.sleep(5000);
	        
	        //Click on 'Goto Implementation Planning' button 
	        clickByXpath("//*[@id='rtIp']");
	        Reporter.log("Click on 'Goto Implementation Planning' button | ");
	        Thread.sleep(5000);
	        Thread.sleep(5000);
	        Thread.sleep(5000);
	        
	        //Enter some text in Description textarea
	        sendvaluebyxpath("//textarea", "desc");
	        Reporter.log("Enter some text in Description textarea | ");
	        Thread.sleep(5000);
	        
	        //Enter some text in Plans for Monitoring Effectiveness textarea
   	        sendvaluebyxpath("//td[5]/cw-rr-text-area/div/textarea", "plans");
   	        Reporter.log("Enter some text in Plans for Monitoring Effectiveness textarea | ");
	        Thread.sleep(5000);
	        
	        //Click on Implementation Manager drop-down
	        clickByXpath("//cw-rr-planning-choices/div/button");
	        Reporter.log("Click on Implementation Manager drop-down | ");
	        Thread.sleep(5000);
	        
	        // Select any option from Implementation Manager drop-down
	        clickByXpath("//cw-rr-planning-choices/div/ul/li[2]/a");
	        Reporter.log("Select any option from Implementation Manager drop-down| ");
	        Thread.sleep(5000);
	        
	        //Select Date from Implementation Due Date 
	        sendvaluebyxpath("//td[7]/div/input", "09/05/2017");
	        Reporter.log("Select Date from Implementation Due Date  | ");
	        Thread.sleep(5000);
	        Thread.sleep(5000);
	        
	        //Click on Planned Check-box
	        clickByXpath("//*[@id='chkPlanned']");
	        Reporter.log("Click on Planned Check-box | ");
	        Thread.sleep(5000);
	        Thread.sleep(5000);
	        Thread.sleep(5000);
	        
	        // Click on Go To Risk Action Plan button
	        clickBylinktext("Go To Risk Action Plan");
	        Reporter.log("Click on Go To Risk Action Plan button | ");
	        Thread.sleep(5000);
	        Thread.sleep(5000);
	        Thread.sleep(5000);
	        
	        // Select Priority from drop-down
	        selectByXpath_Visibletext("//td[6]/div/select","High");
	        Reporter.log("Select Priority from drop-down | ");
	        Thread.sleep(5000);
	        
	        //Select Completed Date
	        sendvaluebyxpath("//td[8]/div/input", "09/22/2017");
	        Reporter.log("Select Completed Date | ");
	        Thread.sleep(5000);
	        
	        //Click on Plan Status drop-down
	        clickByXpath("//*[@id='content']/tr[1]/td[9]/div/select");
	        Reporter.log("Click on Plan Status drop-down | ");
	        Thread.sleep(2000);
	        
	        //Select Implemented option from Plan Status drop-down
	        clickByXpath("//*[@id='content']/tr[1]/td[9]/div/select/option[2]");
	        Reporter.log("Select Implemented option from Plan Status drop-down | ");
	        Thread.sleep(5000);
	        	        
	        // Click on Proceed Button
	        clickByXpath("html/body/div[5]/div/div/div[3]/button[2]");
	        Reporter.log("Click on Proceed Button | ");	        
	        Thread.sleep(5000);
	        Thread.sleep(5000);
	        
	        //Select Risk Reconciliation List
	        clickBylinktext("Risk Reconciliation");
	        Reporter.log("Select Risk Reconciliation sub-Module | ");
	        Thread.sleep(5000);
	        Thread.sleep(5000);
	        Thread.sleep(5000);
	        Thread.sleep(5000);
	        
	        //Click on Risk Likelihood drop-down
	        assertTextXpath("//tr[5]/td[15]/cw-simple-risk-choices/div/button");
	        clickByXpath("//tr[5]/td[15]/cw-simple-risk-choices/div/button");
	        Reporter.log("Click on Risk Likelihood drop-down | ");
	        Thread.sleep(5000);
	        
	        //Select Moderate Option from Risk Likelihood drop-down
	        assertTextXpath("//*[@id='riskLikelihoodSelect']/cw-simple-risk-choices/div/ul/li[5]/a");
	        clickByXpath("//*[@id='riskLikelihoodSelect']/cw-simple-risk-choices/div/ul/li[5]/a");
	        Reporter.log("Select Moderate Option from Risk Likelihood drop-down | ");
	        Thread.sleep(5000);
	        
	        //Click on Risk Impact drop-down
	        assertTextXpath("//tr[5]/td[16]/cw-simple-risk-choices/div/button");
	        clickByXpath("//tr[5]/td[16]/cw-simple-risk-choices/div/button");
	        Reporter.log("Click on Risk Impact drop-down | ");
	        Thread.sleep(5000);
	        
	        //Select Major Option from Risk Likelihood drop-down
	        assertTextXpath("//*[@id='riskImpactSelect']/cw-simple-risk-choices/div/ul/li[6]/a");
	        clickByXpath("//*[@id='riskImpactSelect']/cw-simple-risk-choices/div/ul/li[6]/a");
	        Reporter.log("Select Major Option from Risk Likelihood drop-down | ");
	        Thread.sleep(5000);
	        
	        //Click on proceed button from Warning Pop-up window
	        assertTextXpath("html/body/div[4]/div/div/div[3]/button[2]");
	        clickByXpath("html/body/div[4]/div/div/div[3]/button[2]");
	        Reporter.log("Click on proceed button from Warning Pop-up window | ");
	        Thread.sleep(5000);
	        Thread.sleep(5000);
	        
} 	   
	   
	   @Test(priority=5, enabled =true)
	   public void FifthListedmedia() throws IOException, InterruptedException {
		  
		    Thread.sleep(5000);
	        Thread.sleep(5000);
	        
	        //Click on Risk Response List Sub-module
	        assertTextLink("Risk Response List");
	        clickBylinktext("Risk Response List");
	        Reporter.log("Click on Risk Response List Sub-module | ");
	        Thread.sleep(5000);
	        Thread.sleep(5000);
	        
	        //Click on TBD Button 
	        assertTextXpath("//tr[4]/td[8]/div/div/cw-section-change-button-caller/div/span");
	        clickByXpath("//tr[4]/td[8]/div/div/cw-section-change-button-caller/div/span");
	        Reporter.log("Click on TBD Button | ");
	        Thread.sleep(5000);
	        Thread.sleep(5000);
	        Thread.sleep(5000);
	        
	        // Click on Risk Treatment Type drop-down
	        assertTextXpath("//cw-risk-treatment-treatment-choices/div/button");
	        clickByXpath("//cw-risk-treatment-treatment-choices/div/button");
	        Reporter.log("Click on Risk Treatment Type drop-down | ");
	        Thread.sleep(5000);
	        Thread.sleep(5000);
	        
	        //Select Transfer option from Risk Treatment Type
	        assertTextLink("Transfer");
	        clickBylinktext("Transfer");
	        Reporter.log("Select Transfer option from Risk Treatment Type | ");
	        Thread.sleep(5000);
	       
	        // Click on Effectiveness drop-down
	        assertTextXpath("//cw-rt-evaluation-alternative-choices/div/button");
	        clickByXpath("//cw-rt-evaluation-alternative-choices/div/button");
	        Reporter.log("Click on Effectiveness drop-down | ");
	        Thread.sleep(5000);
	        
	        // Select Effective option from Effectiveness drop-down
	        assertTextLink("Effective");
	        clickBylinktext("Effective");
	        Reporter.log("Select Effective option from Effectiveness drop-down | ");
	        Thread.sleep(5000);
	        Thread.sleep(5000);
	        
	        //Click on Feasibility drop-down
	        assertTextXpath("//td[8]/span/cw-rt-evaluation-alternative-choices/div/button");
	        clickByXpath("//td[8]/span/cw-rt-evaluation-alternative-choices/div/button");
	        Reporter.log("Click on Feasibility drop-down | ");
	        Thread.sleep(5000);
	        
	        //Select Feasible option from Feasibility drop-down
	        assertTextLink("Feasible");
	        clickBylinktext("Feasible");
	        Reporter.log("Select Feasible option from Feasibility drop-down | ");
	        Thread.sleep(5000);
	        
	        //Click on Action Drop-down
	        assertTextXpath("//td[10]/span/cw-rt-evaluation-alternative-choices/div/button");
	        clickByXpath("//td[10]/span/cw-rt-evaluation-alternative-choices/div/button");
	        Reporter.log("Click on Action Drop-down | ");
	        Thread.sleep(5000);
	        
	        //Select Enhance option from Action drop-down
	        assertTextLink("Enhance");
	        clickBylinktext("Enhance");
	        Reporter.log("Select Enhance option from Action drop-down | ");
	        Thread.sleep(5000);
	        
	        //Click on Risk Likelihood drop-down
	        assertTextXpath("//cw-risk-choices-select/div/button");
	        clickByXpath("//cw-risk-choices-select/div/button");
	        Reporter.log("Click on Risk Likelihood drop-down | ");
	        Thread.sleep(5000);
	        
	        //Select Moderate Option from Risk Likelihood drop-down
	        assertTextXpath("//cw-risk-choices-select/div/ul/li[4]/a");
	        clickByXpath("//cw-risk-choices-select/div/ul/li[4]/a");
	        Reporter.log("Select Moderate Option from Risk Likelihood drop-down | ");
	        Thread.sleep(5000);
	        
	        //Click on Risk Impact drop-down
	        assertTextXpath("//div[3]/div/cw-risk-choices-select/div/button");
	        clickByXpath("//div[3]/div/cw-risk-choices-select/div/button");
	        Reporter.log("Click on Risk Impact drop-down | ");
	        Thread.sleep(5000);
	        
	        //Select Major Option from Risk Likelihood drop-down
	        assertTextXpath("//div[3]/div/cw-risk-choices-select/div/ul/li[5]/a");
	        clickByXpath("//div[3]/div/cw-risk-choices-select/div/ul/li[5]/a");
	        Reporter.log("Select Major Option from Risk Likelihood drop-down | ");
	        Thread.sleep(5000);
	        
	        //Click on Keep Rating from Pop-up window
	        assertTextXpath("//div[3]/button[2]");
	        clickByXpath("//div[3]/button[2]");
	        Reporter.log("Click on Keep Rating from Pop-up window | ");
	        Thread.sleep(5000);
	        Thread.sleep(5000);
	        Thread.sleep(5000);
	        
	        // Click on Evaluated check-box
	        assertTextXpath("//*[@id='rtData']/div[4]/div/div[1]/div[2]/div[1]/div[2]/div");
	        clickByXpath("//*[@id='rtData']/div[4]/div/div[1]/div[2]/div[1]/div[2]/div");
	        Reporter.log("Click on Evaluated check-box | ");
	        Thread.sleep(5000);
	        Thread.sleep(5000);
	        
	        //Click on Approve Check-box
	        assertTextXpath("//*[@id='rtData']/div[4]/div/div[2]/div[2]/div/div[2]/div");
	        clickByXpath("//*[@id='rtData']/div[4]/div/div[2]/div[2]/div/div[2]/div");
	        Reporter.log("Click on Approve Check-box | ");
	        Thread.sleep(5000);
	        Thread.sleep(5000);
	        
	        //Click on 'Goto Implementation Planning' button 
	        clickByXpath("//*[@id='rtIp']");
	        Reporter.log("Click on 'Goto Implementation Planning' button | ");
	        Thread.sleep(5000);
	        Thread.sleep(5000);
	        Thread.sleep(5000);
	        
	        //Enter some text in Description textarea
	        sendvaluebyxpath("//textarea", "desc");
	        Reporter.log("Enter some text in Description textarea | ");
	        Thread.sleep(5000);
	        
	        //Enter some text in Plans for Monitoring Effectiveness textarea
   	        sendvaluebyxpath("//td[5]/cw-rr-text-area/div/textarea", "plans");
   	        Reporter.log("Enter some text in Plans for Monitoring Effectiveness textarea | ");
	        Thread.sleep(5000);
	        
	        //Click on Implementation Manager drop-down
	        clickByXpath("//cw-rr-planning-choices/div/button");
	        Reporter.log("Click on Implementation Manager drop-down | ");
	        Thread.sleep(5000);
	        
	        // Select any option from Implementation Manager drop-down
	        clickByXpath("//cw-rr-planning-choices/div/ul/li[2]/a");
	        Reporter.log("Select any option from Implementation Manager drop-down| ");
	        Thread.sleep(5000);
	        
	        //Select Date from Implementation Due Date 
	        sendvaluebyxpath("//td[7]/div/input", "09/05/2017");
	        Reporter.log("Select Date from Implementation Due Date  | ");
	        Thread.sleep(5000);
	        Thread.sleep(5000);
	        
	        //Click on Planned Check-box
	        clickByXpath("//*[@id='chkPlanned']");
	        Reporter.log("Click on Planned Check-box | ");
	        Thread.sleep(5000);
	        Thread.sleep(5000);
	        Thread.sleep(5000);
	        
	        // Click on Go To Risk Action Plan button
	        clickBylinktext("Go To Risk Action Plan");
	        Reporter.log("Click on Go To Risk Action Plan button | ");
	        Thread.sleep(5000);
	        Thread.sleep(5000);
	        Thread.sleep(5000);
	        
	        // Select Priority from drop-down
	        selectByXpath_Visibletext("//td[6]/div/select","High");
	        Reporter.log("Select Priority from drop-down | ");
	        Thread.sleep(5000);
	        
	        //Select Completed Date
	        sendvaluebyxpath("//td[8]/div/input", "09/22/2017");
	        Reporter.log("Select Completed Date | ");
	        Thread.sleep(5000);
	        
	        //Click on Plan Status drop-down
	        clickByXpath("//*[@id='content']/tr[1]/td[9]/div/select");
	        Reporter.log("Click on Plan Status drop-down | ");
	        Thread.sleep(5000);
	        
	        //Select Implemented option from Plan Status drop-down
	        clickByXpath("//*[@id='content']/tr[1]/td[9]/div/select/option[2]");
	        Reporter.log("Select Implemented option from Plan Status drop-down | ");
	        Thread.sleep(5000);
	        Thread.sleep(5000);
	        	        	        
	        /*// Click on Proceed Button
	        clickByXpath("html/body/div[5]/div/div/div[3]/button[2]");
	        Reporter.log("Click on Proceed Button | ");	        
	        Thread.sleep(5000);
	        Thread.sleep(5000);*/
	        
	        //Select Risk Reconciliation List
	        clickBylinktext("Risk Reconciliation");
	        Reporter.log("Select Risk Reconciliation sub-Module | ");
	        Thread.sleep(5000);
	        Thread.sleep(5000);
	        Thread.sleep(5000);
	        Thread.sleep(5000);
	        
	        //Click on Risk Likelihood drop-down
	        assertTextXpath("//tr[7]/td[15]/cw-simple-risk-choices/div/button");
	        clickByXpath("//tr[7]/td[15]/cw-simple-risk-choices/div/button");
	        Reporter.log("Click on Risk Likelihood drop-down | ");
	        Thread.sleep(5000);
	        
	        //Select Moderate Option from Risk Likelihood drop-down
	        assertTextXpath("//*[@id='riskLikelihoodSelect']/cw-simple-risk-choices/div/ul/li[5]/a");
	        clickByXpath("//*[@id='riskLikelihoodSelect']/cw-simple-risk-choices/div/ul/li[5]/a");
	        Reporter.log("Select Moderate Option from Risk Likelihood drop-down | ");
	        Thread.sleep(5000);
	        
	        //Click on Risk Impact drop-down
	        assertTextXpath("//tr[7]/td[16]/cw-simple-risk-choices/div/button");
	        clickByXpath("//tr[7]/td[16]/cw-simple-risk-choices/div/button");
	        Reporter.log("Click on Risk Impact drop-down | ");
	        Thread.sleep(5000);
	        
	        //Select Major Option from Risk Likelihood drop-down
	        assertTextXpath("//*[@id='riskImpactSelect']/cw-simple-risk-choices/div/ul/li[6]/a");
	        clickByXpath("//*[@id='riskImpactSelect']/cw-simple-risk-choices/div/ul/li[6]/a");
	        Reporter.log("Select Major Option from Risk Likelihood drop-down | ");
	        Thread.sleep(5000);
	        
	        //Click on proceed button from Warning Pop-up window
	        assertTextXpath("html/body/div[4]/div/div/div[3]/button[2]");
	        clickByXpath("html/body/div[4]/div/div/div[3]/button[2]");
	        Reporter.log("Click on proceed button from Warning Pop-up window | ");
	        Thread.sleep(5000);
	        Thread.sleep(5000);
	        
} 		   
	   @AfterClass
	   public void RiskResponseLogout() throws IOException, InterruptedException {
	 	  
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

