package com.test;


import java.io.IOException;
import org.testng.Reporter;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import com.test.WrapperClass;

public class RiskDetermination extends WrapperClass{

	  private WebDriver driver;
	  String browser=null;
	   
	  @BeforeClass	  
	  public void RiskLogin() throws Exception {
			
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

			//Close the dashboard Module
		    assertTextXpath("//*[@id='sidebar-left']/ul/li[1]/a/span[2]");
		    clickByXpath("//*[@id='sidebar-left']/ul/li[1]/a/span[2]");
		    Reporter.log("Close the dashboard Module | ");
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
	        Thread.sleep(5000);
	  }  
	  
	  @Test(priority=1,enabled = true)
	  public void RQLBackUp() throws InterruptedException
	  {
		  
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
	       
	        // Click on 'continue' button of Media/Asset
	        try {
	        	assertTextXpath("//*[@id='content']/tr[1]/td[7]/div/div[1]/span");
	 	        clickByXpath("//*[@id='content']/tr[1]/td[7]/div/div[1]/span");
	 	        Reporter.log("Click on 'continue' button of Desktop Media/Asset | ");
            }catch(Exception e)
		    {
		         e.printStackTrace();
		         Reporter.log("Click on 'continue' button of Media/Asset doesn't work | ");
		    }
	        Thread.sleep(5000);
	       
	       // 1st page
	       // Select 'Yes' option in Response choice of listed Controls
	       try {
	    	   assertTextXpath("//*[@id='riskQuestionsControls']/tbody/tr[1]/td[5]/cw-s-response-choices/div/div/label[1]");
	 	       clickByXpath("//*[@id='riskQuestionsControls']/tbody/tr[1]/td[5]/cw-s-response-choices/div/div/label[1]");
	 	       Reporter.log("Select 'Yes' option in Response choice of listed Controls | ");
           }catch(Exception e)
		   {
		       e.printStackTrace();
		       Reporter.log("Select 'Yes' option in Response choice of listed Controls doesn't work | ");
		   }
	       Thread.sleep(5000);
	       
	       //Click on RiskLikehood drop-down
	       try {
	    	   assertTextXpath("//*[@id='riskLikelihoodSelect']/cw-risk-choices/div/button");
	 	       clickByXpath("//*[@id='riskLikelihoodSelect']/cw-risk-choices/div/button");
	 	       Reporter.log("Click on RiskLikehood drop-down | ");
           }catch(Exception e)
		   {
		        e.printStackTrace();
		        Reporter.log("Click on RiskLikehood drop-down doesn't work | ");
		   }
	       Thread.sleep(5000);
	       
	       //Select 'Moderate' option from Likehood drop-down
	       try {
	    	   assertTextXpath("//*[@id='riskLikelihoodSelect']/cw-risk-choices/div/ul/li[4]/a");
	 	       clickByXpath("//*[@id='riskLikelihoodSelect']/cw-risk-choices/div/ul/li[4]/a");
	 	       Reporter.log("Select 'Moderate' option from Likehood drop-down | ");
           }catch(Exception e)
		   {
		        e.printStackTrace();
		        Reporter.log("Select 'Moderate' option from Likehood drop-down doesn't reached | ");
		   }
	       Thread.sleep(5000);
	       
	        // Click on RiskImpact drop-down
	        try {
	        	assertTextXpath("//*[@id='riskImpactSelect']/cw-risk-choices/div/button");
	 	        clickByXpath("//*[@id='riskImpactSelect']/cw-risk-choices/div/button");
	 	        Reporter.log("Click on RiskImpact drop-down | ");
            }catch(Exception e)
		    {
		          e.printStackTrace();
		          Reporter.log("Click on RiskImpact drop-down doesn't reached | ");
		   }
	       Thread.sleep(5000);
	       
	        //Select 'Major' option from Impact drop-down
	        try {
	        	assertTextXpath("//*[@id='riskImpactSelect']/cw-risk-choices/div/ul/li[5]/a");
	 	        clickByXpath("//*[@id='riskImpactSelect']/cw-risk-choices/div/ul/li[5]/a");
	 	        Reporter.log("Select 'Major' option from Impact drop-down | ");
            }catch(Exception e)
		   {
		        e.printStackTrace();
		        Reporter.log("Select 'Major' option from Impact drop-down doesn't reached | ");
		   }
	       Thread.sleep(5000);
	       
	        // Click on 'GoTo next Thread' button
	        try {
	        	assertTextXpath("//*[@id='pVuln']");
	            clickByXpath("//*[@id='pVuln']");
	            Reporter.log("First page - Click on 'GoTo next Thread' button | ");
            }catch(Exception e)
		    {
		        e.printStackTrace();
		        Reporter.log("Click on 'GoTo next Thread' button doesn't reached | ");
		    }
	        Thread.sleep(5000);
	       
	        //2nd page
	        //Select 'Yes' option in Response choice of listed Controls
		    try {
		    	assertTextXpath("//*[@id='riskQuestionsControls']/tbody/tr[1]/td[5]/cw-s-response-choices/div/div/label[1]");
		 	    clickByXpath("//*[@id='riskQuestionsControls']/tbody/tr[1]/td[5]/cw-s-response-choices/div/div/label[1]");
		 	    Reporter.log("Select 'Yes' option in Response choice of listed Controls | ");
	        }catch(Exception e)
			{
			    e.printStackTrace();
			    Reporter.log("Select 'Yes' option in Response choice of listed Controls doesn't work | ");
			}
		    Thread.sleep(5000);
	       
	        // Select 'Yes' option in Response choice of listed Controls
		    try {
		    	assertTextXpath("//*[@id='riskQuestionsControls']/tbody/tr[2]/td[5]/cw-s-response-choices/div/div/label[1]");
		 	    clickByXpath("//*[@id='riskQuestionsControls']/tbody/tr[2]/td[5]/cw-s-response-choices/div/div/label[1]");
		 	    Reporter.log("Select 'Yes' option in Response choice of listed Controls | ");
	        }catch(Exception e)
			{
			    e.printStackTrace();
			    Reporter.log("Select 'Yes' option in Response choice of listed Controls doesn't work | ");
			}
		    Thread.sleep(5000);
	       
	        // Select 'Yes' option in Response choice of listed Controls
		    try {
		    	assertTextXpath("//*[@id='riskQuestionsControls']/tbody/tr[3]/td[5]/cw-s-response-choices/div/div/label[1]");
		 	    clickByXpath("//*[@id='riskQuestionsControls']/tbody/tr[3]/td[5]/cw-s-response-choices/div/div/label[1]");
		 	    Reporter.log("Select 'Yes' option in Response choice of listed Controls | ");
	        }catch(Exception e)
			{
			    e.printStackTrace();
			    Reporter.log("Select 'Yes' option in Response choice of listed Controls doesn't work | ");
			}
		    Thread.sleep(5000);
		       
	        //Click on RiskLikehood drop-down
	        try {
	        	assertTextXpath("//*[@id='riskLikelihoodSelect']/cw-risk-choices/div/button");
	 	        clickByXpath("//*[@id='riskLikelihoodSelect']/cw-risk-choices/div/button");
	 	        Reporter.log("Click on RiskLikehood drop-down | ");
            }catch(Exception e)
		    {
		        e.printStackTrace();
		        Reporter.log("Click on RiskLikehood drop-down doesn't work | ");
		   }
	       Thread.sleep(5000);
	       
	        //Select 'Moderate' option from Likehood drop-down
	        try {
	        	assertTextXpath("//*[@id='riskLikelihoodSelect']/cw-risk-choices/div/ul/li[4]/a");
	 	        clickByXpath("//*[@id='riskLikelihoodSelect']/cw-risk-choices/div/ul/li[4]/a");
	 	        Reporter.log("Select 'Moderate' option from Likehood drop-down | ");
            }catch(Exception e)
		    {
		        e.printStackTrace();
		        Reporter.log("Select 'Moderate' option from Likehood drop-down doesn't reached | ");
		    }
	        Thread.sleep(5000);
	       
	        // Click on RiskImpact drop-down
	        try {
	        	assertTextXpath("//*[@id='riskImpactSelect']/cw-risk-choices/div/button");
	 	        clickByXpath("//*[@id='riskImpactSelect']/cw-risk-choices/div/button");
	 	        Reporter.log("Click on RiskImpact drop-down | ");
            }catch(Exception e)
		    {
		         e.printStackTrace();
		         Reporter.log("Click on RiskImpact drop-down doesn't reached | ");
		    }
	        Thread.sleep(5000);
	       
	        //Select 'Major' option from Impact drop-down
	        try {
	        	assertTextXpath("//*[@id='riskImpactSelect']/cw-risk-choices/div/ul/li[5]/a");
	 	        clickByXpath("//*[@id='riskImpactSelect']/cw-risk-choices/div/ul/li[5]/a");
	 	        Reporter.log("Select 'Major' option from Impact drop-down | ");
            }catch(Exception e)
		    {
		        e.printStackTrace();
		        Reporter.log("Select 'Major' option from Impact drop-down doesn't reached | ");
		     }
	        Thread.sleep(5000);
	       
	        // Click on 'GoTo next Thread' button
	        try {
	        	assertTextXpath("//*[@id='pVuln']");
	            clickByXpath("//*[@id='pVuln']");
	            Reporter.log("Second Page - Click on 'GoTo next Thread' button | ");
             }catch(Exception e)
		     {
		        e.printStackTrace();
		        Reporter.log("Click on 'GoTo next Thread' button doesn't reached | ");
		     }
	         Thread.sleep(5000);
	       
	         //3rd page
	         // Select 'Yes' option in Response choice of listed Controls
		     try {
		    	 assertTextXpath("//*[@id='riskQuestionsControls']/tbody/tr[1]/td[5]/cw-s-response-choices/div/div/label[1]");
		 	     clickByXpath("//*[@id='riskQuestionsControls']/tbody/tr[1]/td[5]/cw-s-response-choices/div/div/label[1]");
		 	     Reporter.log("Select 'Yes' option in Response choice of listed Controls | ");
	          }catch(Exception e)
			  {
			      e.printStackTrace();
			      Reporter.log("Select 'Yes' option in Response choice of listed Controls doesn't work | ");
			   }
		       Thread.sleep(5000);
	       
		    // Select 'Yes' option in Response choice of listed Controls
		    try {
		    	assertTextXpath("//*[@id='riskQuestionsControls']/tbody/tr[2]/td[5]/cw-s-response-choices/div/div/label[1]");
		        clickByXpath("//*[@id='riskQuestionsControls']/tbody/tr[2]/td[5]/cw-s-response-choices/div/div/label[1]");
		        Reporter.log("Select 'Yes' option in Response choice of listed Controls | ");
            }catch(Exception e)
		    {
        	    e.printStackTrace();
	            Reporter.log("Select 'Yes' option in Response choice of listed Controls doesn't work | ");
	        }
		    Thread.sleep(5000);
	       
            // Select 'Yes' option in Response choice of listed Controls
		    try {
		    	assertTextXpath("//*[@id='riskQuestionsControls']/tbody/tr[3]/td[5]/cw-s-response-choices/div/div/label[1]");
		        clickByXpath("//*[@id='riskQuestionsControls']/tbody/tr[3]/td[5]/cw-s-response-choices/div/div/label[1]");
		        Reporter.log("Select 'Yes' option in Response choice of listed Controls | ");
		    }catch(Exception e)
		    {
		        e.printStackTrace();
		        Reporter.log("Select 'Yes' option in Response choice of listed Controls doesn't work | ");
		    }
		    Thread.sleep(5000);
	       
	        // Select 'Yes' option in Response choice of listed Controls
	        try {
	        	assertTextXpath("//*[@id='riskQuestionsControls']/tbody/tr[4]/td[5]/cw-s-response-choices/div/div/label[1]");
	            clickByXpath("//*[@id='riskQuestionsControls']/tbody/tr[4]/td[5]/cw-s-response-choices/div/div/label[1]");
	            Reporter.log("Select 'Yes' option in Response choice of listed Controls | ");
		    }catch(Exception e)
	        {
	            e.printStackTrace();
		        Reporter.log("Select 'Yes' option in Response choice of listed Controls doesn't work | ");
		    }
            Thread.sleep(5000);
	       
            // Select 'Yes' option in Response choice of listed Controls
            try {
            	assertTextXpath("//*[@id='riskQuestionsControls']/tbody/tr[5]/td[5]/cw-s-response-choices/div/div/label[1]");
	            clickByXpath("//*[@id='riskQuestionsControls']/tbody/tr[5]/td[5]/cw-s-response-choices/div/div/label[1]");
 	            Reporter.log("Select 'Yes' option in Response choice of listed Controls | ");
             }catch(Exception e)
             {
                e.printStackTrace();
                Reporter.log("Select 'Yes' option in Response choice of listed Controls doesn't work | ");
            }
            Thread.sleep(5000);
	 
            // Select 'Yes' option in Response choice of listed Controls
	        try {
	        	assertTextXpath("//*[@id='riskQuestionsControls']/tbody/tr[6]/td[5]/cw-s-response-choices/div/div/label[1]");
	            clickByXpath("//*[@id='riskQuestionsControls']/tbody/tr[6]/td[5]/cw-s-response-choices/div/div/label[1]");
	            Reporter.log("Select 'Yes' option in Response choice of listed Controls | ");
	        }catch(Exception e)
	        {
	            e.printStackTrace();
	            Reporter.log("Select 'Yes' option in Response choice of listed Controls doesn't work | ");
	        }
		    Thread.sleep(5000);
	       	       
	        //Click on RiskLikehood drop-down
	        try {
	        	assertTextXpath("//*[@id='riskLikelihoodSelect']/cw-risk-choices/div/button");
	 	        clickByXpath("//*[@id='riskLikelihoodSelect']/cw-risk-choices/div/button");
	 	        Reporter.log("Click on RiskLikehood drop-down | ");
            }catch(Exception e)
		    {
		         e.printStackTrace();
		         Reporter.log("Click on RiskLikehood drop-down doesn't work | ");
		    }
	        Thread.sleep(5000);
	       
	        //Select 'Moderate' option from Likehood drop-down
	        try {
	        	assertTextXpath("//*[@id='riskLikelihoodSelect']/cw-risk-choices/div/ul/li[4]/a");
	 	        clickByXpath("//*[@id='riskLikelihoodSelect']/cw-risk-choices/div/ul/li[4]/a");
	 	        Reporter.log("Select 'Moderate' option from Likehood drop-down | ");
            }catch(Exception e)
		    {
		        e.printStackTrace();
		        Reporter.log("Select 'Moderate' option from Likehood drop-down doesn't reached | ");
		    }
	        Thread.sleep(5000);
	       
	        // Click on RiskImpact drop-down
	        try {
	        	assertTextXpath("//*[@id='riskImpactSelect']/cw-risk-choices/div/button");
	 	        clickByXpath("//*[@id='riskImpactSelect']/cw-risk-choices/div/button");
	 	        Reporter.log("Click on RiskImpact drop-down | ");
            }catch(Exception e)
		    {
		        e.printStackTrace();
		        Reporter.log("Click on RiskImpact drop-down doesn't reached | ");
		    }
	        Thread.sleep(5000);
	       
	        //Select 'Major' option from Impact drop-down
	        try {
	        	assertTextXpath("//*[@id='riskImpactSelect']/cw-risk-choices/div/ul/li[5]/a");
	 	        clickByXpath("//*[@id='riskImpactSelect']/cw-risk-choices/div/ul/li[5]/a");
	 	        Reporter.log("Select 'Major' option from Impact drop-down | ");
            }catch(Exception e)
		    {
		         e.printStackTrace();
		         Reporter.log("Select 'Major' option from Impact drop-down doesn't reached | ");
		    }
	        Thread.sleep(5000);
	       
	        // Click on 'GoTo next Thread' button
	        try {
	        	assertTextXpath("//*[@id='pVuln']");
	            clickByXpath("//*[@id='pVuln']");
	            Reporter.log("Third Page - Click on 'GoTo next Thread' button | ");
            }catch(Exception e)
		    {
		         e.printStackTrace();
		         Reporter.log("Click on 'GoTo next Thread' button doesn't reached | ");
		    }
	        Thread.sleep(5000);
	       
	        // 4th page
	        // Select 'Yes' option in Response choice of listed Controls
		    try {
		    	assertTextXpath("//*[@id='riskQuestionsControls']/tbody/tr[1]/td[5]/cw-s-response-choices/div/div/label[1]");
		 	    clickByXpath("//*[@id='riskQuestionsControls']/tbody/tr[1]/td[5]/cw-s-response-choices/div/div/label[1]");
		 	    Reporter.log("Select 'Yes' option in Response choice of listed Controls | ");
	         }catch(Exception e)
			 {
			    e.printStackTrace();
			    Reporter.log("Select 'Yes' option in Response choice of listed Controls doesn't work | ");
			 }
		     Thread.sleep(5000);
	       
	         //Click on RiskLikehood drop-down
	         try {
	        	 assertTextXpath("//*[@id='riskLikelihoodSelect']/cw-risk-choices/div/button");
	 	         clickByXpath("//*[@id='riskLikelihoodSelect']/cw-risk-choices/div/button");
	 	         Reporter.log("Click on RiskLikehood drop-down | ");
              }catch(Exception e)
		      {
		         e.printStackTrace();
		         Reporter.log("Click on RiskLikehood drop-down doesn't work | ");
		       }
	          Thread.sleep(5000);
	       
	          //Select 'Moderate' option from Likehood drop-down
	          try {
	        	  assertTextXpath("//*[@id='riskLikelihoodSelect']/cw-risk-choices/div/ul/li[4]/a");
	 	          clickByXpath("//*[@id='riskLikelihoodSelect']/cw-risk-choices/div/ul/li[4]/a");
	 	          Reporter.log("Select 'Moderate' option from Likehood drop-down | ");
              }catch(Exception e)
		      {
		          e.printStackTrace();
		          Reporter.log("Select 'Moderate' option from Likehood drop-down doesn't reached | ");
		      }
	          Thread.sleep(5000);
	       
	          // Click on RiskImpact drop-down
	          try {
	        	  assertTextXpath("//*[@id='riskImpactSelect']/cw-risk-choices/div/button");
	 	          clickByXpath("//*[@id='riskImpactSelect']/cw-risk-choices/div/button");
	 	          Reporter.log("Click on RiskImpact drop-down | ");
               }catch(Exception e)
		       {
		          e.printStackTrace();
		          Reporter.log("Click on RiskImpact drop-down doesn't reached | ");
		       }
	           Thread.sleep(5000);
	       
	          //Select 'Major' option from Impact drop-down
	          try {
	        	  assertTextXpath("//*[@id='riskImpactSelect']/cw-risk-choices/div/ul/li[5]/a");
	 	          clickByXpath("//*[@id='riskImpactSelect']/cw-risk-choices/div/ul/li[5]/a");
	 	          Reporter.log("Select 'Major' option from Impact drop-down | ");
              }catch(Exception e)
		      {
		           e.printStackTrace();
		           Reporter.log("Select 'Major' option from Impact drop-down doesn't reached | ");
		      }
	          Thread.sleep(5000);
	       
	          // Click on 'GoTo next Thread' button
	          try {
	        	  assertTextXpath("//*[@id='pVuln']");
	              clickByXpath("//*[@id='pVuln']");
	              Reporter.log("Fourth Page - Click on 'GoTo next Thread' button | ");
              }catch(Exception e)
		      {
		           e.printStackTrace();
		           Reporter.log("Click on 'GoTo next Thread' button doesn't reached | ");
		      }
	          Thread.sleep(5000);
	       
	         //5th page
	         // Select 'Yes' option in Response choice of listed Controls
		     try {
		    	 assertTextXpath("//*[@id='riskQuestionsControls']/tbody/tr[1]/td[5]/cw-s-response-choices/div/div/label[1]");
		 	     clickByXpath("//*[@id='riskQuestionsControls']/tbody/tr[1]/td[5]/cw-s-response-choices/div/div/label[1]");
		 	     Reporter.log("Select 'Yes' option in Response choice of listed Controls | ");
	          }catch(Exception e)
			  {
			     e.printStackTrace();
			     Reporter.log("Select 'Yes' option in Response choice of listed Controls doesn't work | ");
			  }
		      Thread.sleep(5000);
	       
		     // Select 'Yes' option in Response choice of listed Controls
			 try { 
				 assertTextXpath("//*[@id='riskQuestionsControls']/tbody/tr[2]/td[5]/cw-s-response-choices/div/div/label[1]");
			     clickByXpath("//*[@id='riskQuestionsControls']/tbody/tr[2]/td[5]/cw-s-response-choices/div/div/label[1]");
			     Reporter.log("Select 'Yes' option in Response choice of listed Controls | ");
		      }catch(Exception e)
			  {
			      e.printStackTrace();
			      Reporter.log("Select 'Yes' option in Response choice of listed Controls doesn't work | ");
			  }
			  Thread.sleep(5000);
	       
	          //Click on RiskLikehood drop-down
	          try {
	        	  assertTextXpath("//*[@id='riskLikelihoodSelect']/cw-risk-choices/div/button");
	 	          clickByXpath("//*[@id='riskLikelihoodSelect']/cw-risk-choices/div/button");
	 	          Reporter.log("Click on RiskLikehood drop-down | ");
              }catch(Exception e)
		      {
		         e.printStackTrace();
		         Reporter.log("Click on RiskLikehood drop-down doesn't work | ");
		      }
	          Thread.sleep(5000);
	       
	         //Select 'Moderate' option from Likehood drop-down
	         try {
	        	 assertTextXpath("//*[@id='riskLikelihoodSelect']/cw-risk-choices/div/ul/li[4]/a");
	 	         clickByXpath("//*[@id='riskLikelihoodSelect']/cw-risk-choices/div/ul/li[4]/a");
	 	         Reporter.log("Select 'Moderate' option from Likehood drop-down | ");
             }catch(Exception e)
		     {
		          e.printStackTrace();
		          Reporter.log("Select 'Moderate' option from Likehood drop-down doesn't reached | ");
		     }
	         Thread.sleep(5000);
	       
	         // Click on RiskImpact drop-down
	         try {
	        	 assertTextXpath("//*[@id='riskImpactSelect']/cw-risk-choices/div/button");
	 	         clickByXpath("//*[@id='riskImpactSelect']/cw-risk-choices/div/button");
	 	         Reporter.log("Click on RiskImpact drop-down | ");
             }catch(Exception e)
		     {
		         e.printStackTrace();
		         Reporter.log("Click on RiskImpact drop-down doesn't reached | ");
		     }
	         Thread.sleep(5000);
	       
	         //Select 'Major' option from Impact drop-down
	         try {
	        	 assertTextXpath("//*[@id='riskImpactSelect']/cw-risk-choices/div/ul/li[5]/a");
	 	         clickByXpath("//*[@id='riskImpactSelect']/cw-risk-choices/div/ul/li[5]/a");
	 	         Reporter.log("Select 'Major' option from Impact drop-down | ");
             }catch(Exception e)
		     {
		         e.printStackTrace();
		         Reporter.log("Select 'Major' option from Impact drop-down doesn't reached | ");
		     }
	         Thread.sleep(5000);
	       
	          // Click on 'GoTo next Thread' button
	          try {
	        	  assertTextXpath("//*[@id='pVuln']");
	              clickByXpath("//*[@id='pVuln']");
	              Reporter.log("Fifth Page - Click on 'GoTo next Thread' button | ");
             }catch(Exception e)
		     {
		          e.printStackTrace();
		          Reporter.log("Click on 'GoTo next Thread' button doesn't reached | ");
		     }
	         Thread.sleep(5000);
	       
	          //6th page
	          // Select 'Yes' option in Response choice of listed Controls
		      try {
		    	  assertTextXpath("//*[@id='riskQuestionsControls']/tbody/tr[1]/td[5]/cw-s-response-choices/div/div/label[1]");
		 	      clickByXpath("//*[@id='riskQuestionsControls']/tbody/tr[1]/td[5]/cw-s-response-choices/div/div/label[1]");
		 	      Reporter.log("Select 'Yes' option in Response choice of listed Controls | ");
	           }catch(Exception e)
			   {
			       e.printStackTrace();
			       Reporter.log("Select 'Yes' option in Response choice of listed Controls doesn't work | ");
			   }
		       Thread.sleep(5000);
		       
		       
		       // Select 'Yes' option in Response choice of listed Controls
			   try {
				   assertTextXpath("//*[@id='riskQuestionsControls']/tbody/tr[2]/td[5]/cw-s-response-choices/div/div/label[1]");
			 	   clickByXpath("//*[@id='riskQuestionsControls']/tbody/tr[2]/td[5]/cw-s-response-choices/div/div/label[1]");
			 	   Reporter.log("Select 'Yes' option in Response choice of listed Controls | ");
		       }catch(Exception e)
			   {
				   e.printStackTrace();
				   Reporter.log("Select 'Yes' option in Response choice of listed Controls doesn't work | ");
			   }
			   Thread.sleep(5000);
	       
	           // Select 'Yes' option in Response choice of listed Controls
		       try {
		    	   assertTextXpath("//*[@id='riskQuestionsControls']/tbody/tr[3]/td[5]/cw-s-response-choices/div/div/label[1]");
		           clickByXpath("//*[@id='riskQuestionsControls']/tbody/tr[3]/td[5]/cw-s-response-choices/div/div/label[1]");
			       Reporter.log("Select 'Yes' option in Response choice of listed Controls | ");
			   }catch(Exception e)
			   {
			       e.printStackTrace();
			       Reporter.log("Select 'Yes' option in Response choice of listed Controls doesn't work | ");
			   }
			   Thread.sleep(5000);
	       
	           //Click on RiskLikehood drop-down
	           try {
	        	   assertTextXpath("//*[@id='riskLikelihoodSelect']/cw-risk-choices/div/button");
	 	           clickByXpath("//*[@id='riskLikelihoodSelect']/cw-risk-choices/div/button");
	 	           Reporter.log("Click on RiskLikehood drop-down | ");
               }catch(Exception e)
		       {
		           e.printStackTrace();
		           Reporter.log("Click on RiskLikehood drop-down doesn't work | ");
		       }
	           Thread.sleep(5000);
	           Thread.sleep(5000);
	       
	           //Select 'Moderate' option from Likehood drop-down
	           try {
	        	   assertTextXpath("//*[@id='riskLikelihoodSelect']/cw-risk-choices/div/ul/li[4]/a");
	 	           clickByXpath("//*[@id='riskLikelihoodSelect']/cw-risk-choices/div/ul/li[4]/a");
	 	           Reporter.log("Select 'Moderate' option from Likehood drop-down | ");
               }catch(Exception e)
		       {
		           e.printStackTrace();
		           Reporter.log("Select 'Moderate' option from Likehood drop-down doesn't reached | ");
		       }
	           Thread.sleep(5000);
	           Thread.sleep(5000);
	        
	           // Click on RiskImpact drop-down
	           try {
	        	   assertTextXpath("//*[@id='riskImpactSelect']/cw-risk-choices/div/button");
	 	           clickByXpath("//*[@id='riskImpactSelect']/cw-risk-choices/div/button");
	 	           Reporter.log("Click on RiskImpact drop-down | ");
                }catch(Exception e)
		        {
		           e.printStackTrace();
		           Reporter.log("Click on RiskImpact drop-down doesn't reached | ");
		        }
	            Thread.sleep(5000);
	            Thread.sleep(5000);
	       
	           //Select 'Major' option from Impact drop-down
	           try {
	        	   assertTextXpath("//*[@id='riskImpactSelect']/cw-risk-choices/div/ul/li[5]/a");
	 	           clickByXpath("//*[@id='riskImpactSelect']/cw-risk-choices/div/ul/li[5]/a");
	 	           Reporter.log("Select 'Major' option from Impact drop-down | ");
               }catch(Exception e)
		       {
		          e.printStackTrace();
		          Reporter.log("Select 'Major' option from Impact drop-down doesn't reached | ");
		       }
	           Thread.sleep(5000);
	           Thread.sleep(5000);
	       
	           // Click on 'GoTo next Thread' button
	           try {
	        	   assertTextXpath("//*[@id='pVuln']");
	               clickByXpath("//*[@id='pVuln']");
	               Reporter.log("Sixth Page - Click on 'GoTo next Thread' button | ");
               }catch(Exception e)
		       {
		          e.printStackTrace();
		          Reporter.log("Click on 'GoTo next Thread' button doesn't reached | ");
		       }
	           Thread.sleep(5000);
	           Thread.sleep(5000);
	       
	           //7th page
	           // Select 'Yes' option in Response choice of listed Controls
		       try {
		    	   assertTextXpath("//*[@id='riskQuestionsControls']/tbody/tr[1]/td[5]/cw-s-response-choices/div/div/label[1]");
		 	       clickByXpath("//*[@id='riskQuestionsControls']/tbody/tr[1]/td[5]/cw-s-response-choices/div/div/label[1]");
		 	       Reporter.log("Select 'Yes' option in Response choice of listed Controls | ");
	           }catch(Exception e)
			   {
			        e.printStackTrace();
			        Reporter.log("Select 'Yes' option in Response choice of listed Controls doesn't work | ");
			   }
		       Thread.sleep(5000);
		       Thread.sleep(5000);
	       
	           //Click on RiskLikehood drop-down
	           try {
	        	   assertTextXpath("//*[@id='riskLikelihoodSelect']/cw-risk-choices/div/button");
	 	           clickByXpath("//*[@id='riskLikelihoodSelect']/cw-risk-choices/div/button");
	 	           Reporter.log("Click on RiskLikehood drop-down | ");
               }catch(Exception e)
		       {
		           e.printStackTrace();
		           Reporter.log("Click on RiskLikehood drop-down doesn't work | ");
		       }
	           Thread.sleep(5000);
	           Thread.sleep(5000);
	       
	           //Select 'Moderate' option from Likehood drop-down
	           try {
	        	   assertTextXpath("//*[@id='riskLikelihoodSelect']/cw-risk-choices/div/ul/li[4]/a");
	 	           clickByXpath("//*[@id='riskLikelihoodSelect']/cw-risk-choices/div/ul/li[4]/a");
	 	           Reporter.log("Select 'Moderate' option from Likehood drop-down | ");
               }catch(Exception e)
		       {
		            e.printStackTrace();
		            Reporter.log("Select 'Moderate' option from Likehood drop-down doesn't reached | ");
		       }
	           Thread.sleep(5000);
	           Thread.sleep(5000);
	       
	           // Click on RiskImpact drop-down
	           try {
	        	   assertTextXpath("//*[@id='riskImpactSelect']/cw-risk-choices/div/button");
	 	           clickByXpath("//*[@id='riskImpactSelect']/cw-risk-choices/div/button");
	 	           Reporter.log("Click on RiskImpact drop-down | ");
               }catch(Exception e)
		       {
		           e.printStackTrace();
		           Reporter.log("Click on RiskImpact drop-down doesn't reached | ");
		       }
	           Thread.sleep(5000);
	           Thread.sleep(5000);
	       
	           //Select 'Major' option from Impact drop-down
	           try {
	        	   assertTextXpath("//*[@id='riskImpactSelect']/cw-risk-choices/div/ul/li[5]/a");
	 	           clickByXpath("//*[@id='riskImpactSelect']/cw-risk-choices/div/ul/li[5]/a");
	 	           Reporter.log("Select 'Major' option from Impact drop-down | ");
               }catch(Exception e)
		       {
		            e.printStackTrace();
		            Reporter.log("Select 'Major' option from Impact drop-down doesn't reached | ");
		        }
	            Thread.sleep(5000);
	            Thread.sleep(5000);
	       
	            // Click on 'GoTo next Thread' button
	            try {
	            	assertTextXpath("//*[@id='pVuln']");
	                clickByXpath("//*[@id='pVuln']");
	                Reporter.log("Seventh Page - Click on 'GoTo next Thread' button | ");
                }catch(Exception e)
		        {
		            e.printStackTrace();
		            Reporter.log("Click on 'GoTo next Thread' button doesn't reached | ");
		        }
	            Thread.sleep(5000);
	            Thread.sleep(5000);
	       
	            //8th page
	            // Select 'Yes' option in Response choice of listed Controls
		        try {
		        	assertTextXpath("//*[@id='riskQuestionsControls']/tbody/tr[1]/td[5]/cw-s-response-choices/div/div/label[1]");
		 	        clickByXpath("//*[@id='riskQuestionsControls']/tbody/tr[1]/td[5]/cw-s-response-choices/div/div/label[1]");
		 	        Reporter.log("Select 'Yes' option in Response choice of listed Controls | ");
	            }catch(Exception e)
			    {
			         e.printStackTrace();
			        Reporter.log("Select 'Yes' option in Response choice of listed Controls doesn't work | ");
			    }
		        Thread.sleep(5000);  
		        Thread.sleep(5000);
	       
	           //Click on RiskLikehood drop-down
	           try {
	        	   assertTextXpath("//*[@id='riskLikelihoodSelect']/cw-risk-choices/div/button");
	 	           clickByXpath("//*[@id='riskLikelihoodSelect']/cw-risk-choices/div/button");
	 	           Reporter.log("Click on RiskLikehood drop-down | ");
               }catch(Exception e)
		       {
		           e.printStackTrace();
		           Reporter.log("Click on RiskLikehood drop-down doesn't work | ");
		        }
	            Thread.sleep(5000);
	            Thread.sleep(5000);
	       
	            //Select 'Moderate' option from Likehood drop-down
	            try {
	            	assertTextXpath("//*[@id='riskLikelihoodSelect']/cw-risk-choices/div/ul/li[4]/a");
	 	            clickByXpath("//*[@id='riskLikelihoodSelect']/cw-risk-choices/div/ul/li[4]/a");
	 	            Reporter.log("Select 'Moderate' option from Likehood drop-down | ");
                }catch(Exception e)
		        {
		            e.printStackTrace();
		            Reporter.log("Select 'Moderate' option from Likehood drop-down doesn't reached | ");
		        }
	             Thread.sleep(5000);
	             Thread.sleep(5000);
	       
	            // Click on RiskImpact drop-down
	            try {
	            	assertTextXpath("//*[@id='riskImpactSelect']/cw-risk-choices/div/button");
	 	            clickByXpath("//*[@id='riskImpactSelect']/cw-risk-choices/div/button");
	 	            Reporter.log("Click on RiskImpact drop-down | ");
                 }catch(Exception e)
		        {
		             e.printStackTrace();
		             Reporter.log("Click on RiskImpact drop-down doesn't reached | ");
		         }
	             Thread.sleep(5000);
	             Thread.sleep(5000);
	       
	            //Select 'Major' option from Impact drop-down
	            try {
	            	assertTextXpath("//*[@id='riskImpactSelect']/cw-risk-choices/div/ul/li[5]/a");
	 	            clickByXpath("//*[@id='riskImpactSelect']/cw-risk-choices/div/ul/li[5]/a");
	 	            Reporter.log("Select 'Major' option from Impact drop-down | ");
                }catch(Exception e)
		        {
		             e.printStackTrace();
		             Reporter.log("Select 'Major' option from Impact drop-down doesn't reached | ");
		        }
	            Thread.sleep(5000);
	            Thread.sleep(5000);
	       
	            // Click on 'GoTo next Thread' button
	            try {
	    	        assertTextXpath("//*[@id='pVuln']");
	                clickByXpath("//*[@id='pVuln']");
	                Reporter.log("Eight Page - Click on 'GoTo next Thread' button | ");
                 }catch(Exception e)
		         {
		            e.printStackTrace();
		            Reporter.log("Click on 'GoTo next Thread' button doesn't reached | ");
		         }
	             Thread.sleep(5000);
	             Thread.sleep(5000);
	       
	            //9th page
	            // Select 'Yes' option in Response choice of listed Controls
		       try {
		    	    assertTextXpath("//*[@id='riskQuestionsControls']/tbody/tr[1]/td[5]/cw-s-response-choices/div/div/label[1]");
		 	        clickByXpath("//*[@id='riskQuestionsControls']/tbody/tr[1]/td[5]/cw-s-response-choices/div/div/label[1]");
		 	        Reporter.log("Select 'Yes' option in Response choice of listed Controls | ");
	           }catch(Exception e)
			   {
			        e.printStackTrace();
			        Reporter.log("Select 'Yes' option in Response choice of listed Controls doesn't work | ");
			   }
		       Thread.sleep(5000);
		       Thread.sleep(5000);
	       
	          //Click on RiskLikehood drop-down
	          try {
	    	      assertTextXpath("//*[@id='riskLikelihoodSelect']/cw-risk-choices/div/button");
	 	          clickByXpath("//*[@id='riskLikelihoodSelect']/cw-risk-choices/div/button");
	 	          Reporter.log("Click on RiskLikehood drop-down | ");
              }catch(Exception e)
		      {
		          e.printStackTrace();
		          Reporter.log("Click on RiskLikehood drop-down doesn't work | ");
		      }
	          Thread.sleep(5000);
	          Thread.sleep(5000);
	       
	         //Select 'Moderate' option from Likehood drop-down
	         try {
	    	     assertTextXpath("//*[@id='riskLikelihoodSelect']/cw-risk-choices/div/ul/li[4]/a");
	 	         clickByXpath("//*[@id='riskLikelihoodSelect']/cw-risk-choices/div/ul/li[4]/a");
	 	         Reporter.log("Select 'Moderate' option from Likehood drop-down | ");
             }catch(Exception e)
		     {
		         e.printStackTrace();
		         Reporter.log("Select 'Moderate' option from Likehood drop-down doesn't reached | ");
		     }
	         Thread.sleep(5000);
	         Thread.sleep(5000);
	       
	         // Click on RiskImpact drop-down
	         try {
	    	     assertTextXpath("//*[@id='riskImpactSelect']/cw-risk-choices/div/button");
	 	         clickByXpath("//*[@id='riskImpactSelect']/cw-risk-choices/div/button");
	 	         Reporter.log("Click on RiskImpact drop-down | ");
            }catch(Exception e)
		    {
		         e.printStackTrace();
		         Reporter.log("Click on RiskImpact drop-down doesn't reached | ");
		    }
	        Thread.sleep(5000);
	        Thread.sleep(5000);
	       
	       //Select 'Major' option from Impact drop-down
	       try {
	    	   assertTextXpath("//*[@id='riskImpactSelect']/cw-risk-choices/div/ul/li[5]/a");
	 	       clickByXpath("//*[@id='riskImpactSelect']/cw-risk-choices/div/ul/li[5]/a");
	 	       Reporter.log("Select 'Major' option from Impact drop-down | ");
            }catch(Exception e)
		    {
		        e.printStackTrace();
		        Reporter.log("Select 'Major' option from Impact drop-down doesn't reached | ");
		    }
	        Thread.sleep(5000);
	        Thread.sleep(5000);
	       
	        // Click on 'GoTo next Thread' button
	        try {
	    	    assertTextXpath("//*[@id='pVuln']");
	            clickByXpath("//*[@id='pVuln']");
	            Reporter.log("Nine page - Click on 'GoTo next Thread' button | ");
             }catch(Exception e)
		    {
		         e.printStackTrace();
		         Reporter.log("Click on 'GoTo next Thread' button doesn't reached | ");
		    }
	        Thread.sleep(5000);
	        Thread.sleep(5000);
	       
	        //10th page
	        // Select 'Yes' option in Response choice of listed Controls
		    try {
		        assertTextXpath("//*[@id='riskQuestionsControls']/tbody/tr[1]/td[5]/cw-s-response-choices/div/div/label[1]");
		 	    clickByXpath("//*[@id='riskQuestionsControls']/tbody/tr[1]/td[5]/cw-s-response-choices/div/div/label[1]");
		 	    Reporter.log("Select 'Yes' option in Response choice of listed Controls | ");
	        }catch(Exception e)
			{
			    e.printStackTrace();
			    Reporter.log("Select 'Yes' option in Response choice of listed Controls doesn't work | ");
			}
		    Thread.sleep(5000);  
		    Thread.sleep(5000);
	     
	        //Click on RiskLikehood drop-down
	        try {
	    	    assertTextXpath("//*[@id='riskLikelihoodSelect']/cw-risk-choices/div/button");
	 	        clickByXpath("//*[@id='riskLikelihoodSelect']/cw-risk-choices/div/button");
	 	        Reporter.log("Click on RiskLikehood drop-down | ");
            }catch(Exception e)
		    {
		        e.printStackTrace();
		        Reporter.log("Click on RiskLikehood drop-down doesn't work | ");
		    }
	        Thread.sleep(5000);
	        Thread.sleep(5000);
	       
	        //Select 'Moderate' option from Likehood drop-down
	        try {
	    	    assertTextXpath("//*[@id='riskLikelihoodSelect']/cw-risk-choices/div/ul/li[4]/a");
	 	        clickByXpath("//*[@id='riskLikelihoodSelect']/cw-risk-choices/div/ul/li[4]/a");
	 	        Reporter.log("Select 'Moderate' option from Likehood drop-down | ");
            }catch(Exception e)
		    {
		         e.printStackTrace();
		         Reporter.log("Select 'Moderate' option from Likehood drop-down doesn't reached | ");
		    }
	        Thread.sleep(5000);
	        Thread.sleep(5000);
	       
	         // Click on RiskImpact drop-down
	         try {
	    	     assertTextXpath("//*[@id='riskImpactSelect']/cw-risk-choices/div/button");
	 	         clickByXpath("//*[@id='riskImpactSelect']/cw-risk-choices/div/button");
	 	         Reporter.log("Click on RiskImpact drop-down | ");
             }catch(Exception e)
		     {
		          e.printStackTrace();
		          Reporter.log("Click on RiskImpact drop-down doesn't reached | ");
		     }
	         Thread.sleep(5000);
	         Thread.sleep(5000);
	       
	         //Select 'Major' option from Impact drop-down
	         try {
	    	     assertTextXpath("//*[@id='riskImpactSelect']/cw-risk-choices/div/ul/li[5]/a");
	 	         clickByXpath("//*[@id='riskImpactSelect']/cw-risk-choices/div/ul/li[5]/a");
	 	         Reporter.log("Select 'Major' option from Impact drop-down | ");
             }catch(Exception e)
		     {
		         e.printStackTrace();
		         Reporter.log("Select 'Major' option from Impact drop-down doesn't reached | ");
		     }
	         Thread.sleep(5000);
	         Thread.sleep(5000);
	       
	         // Click on 'GoTo next Thread' button
	         try {
	    	      assertTextXpath("//*[@id='pVuln']");
	              clickByXpath("//*[@id='pVuln']");
	              Reporter.log("Tenth Page - Click on 'GoTo next Thread' button | ");
              }catch(Exception e)
		      {
		          e.printStackTrace();
		          Reporter.log("Click on 'GoTo next Thread' button doesn't reached | ");
		      }
	          Thread.sleep(5000);
	          Thread.sleep(5000);
	       
	          //11th page
	          // Select 'Yes' option in Response choice of listed Controls
		      try {
		    	  assertTextXpath("//*[@id='riskQuestionsControls']/tbody/tr[1]/td[5]/cw-s-response-choices/div/div/label[1]");
		 	      clickByXpath("//*[@id='riskQuestionsControls']/tbody/tr[1]/td[5]/cw-s-response-choices/div/div/label[1]");
		 	      Reporter.log("Select 'Yes' option in Response choice of listed Controls | ");
	           }catch(Exception e)
			   {
			      e.printStackTrace();
			      Reporter.log("Select 'Yes' option in Response choice of listed Controls doesn't work | ");
			   }
		       Thread.sleep(5000);
		       Thread.sleep(5000);
	       
	           //Click on RiskLikehood drop-down
	           try {
	    	       assertTextXpath("//*[@id='riskLikelihoodSelect']/cw-risk-choices/div/button");
	 	           clickByXpath("//*[@id='riskLikelihoodSelect']/cw-risk-choices/div/button");
	 	           Reporter.log("Click on RiskLikehood drop-down | ");
                }catch(Exception e)
		        {
		           e.printStackTrace();
		           Reporter.log("Click on RiskLikehood drop-down doesn't work | ");
		        }
	            Thread.sleep(5000);
	            Thread.sleep(5000);
	       
	            //Select 'Moderate' option from Likehood drop-down
	            try {
	    	        assertTextXpath("//*[@id='riskLikelihoodSelect']/cw-risk-choices/div/ul/li[4]/a");
	 	            clickByXpath("//*[@id='riskLikelihoodSelect']/cw-risk-choices/div/ul/li[4]/a");
	 	            Reporter.log("Select 'Moderate' option from Likehood drop-down | ");
                 }catch(Exception e)
		        {
		             e.printStackTrace();
		             Reporter.log("Select 'Moderate' option from Likehood drop-down doesn't reached | ");
		        }
	            Thread.sleep(5000);
	            Thread.sleep(5000);
	       
	            // Click on RiskImpact drop-down
	            try {
	    	        assertTextXpath("//*[@id='riskImpactSelect']/cw-risk-choices/div/button");
	 	            clickByXpath("//*[@id='riskImpactSelect']/cw-risk-choices/div/button");
	 	            Reporter.log("Click on RiskImpact drop-down | ");
                }catch(Exception e)
		        {
		            e.printStackTrace();
		            Reporter.log("Click on RiskImpact drop-down doesn't reached | ");
		        }
	            Thread.sleep(5000);
	            Thread.sleep(5000);
	       
	            //Select 'Major' option from Impact drop-down
	            try {
	    	        assertTextXpath("//*[@id='riskImpactSelect']/cw-risk-choices/div/ul/li[5]/a");
	 	            clickByXpath("//*[@id='riskImpactSelect']/cw-risk-choices/div/ul/li[5]/a");
	 	            Reporter.log("Select 'Major' option from Impact drop-down | ");
                }catch(Exception e)
		        {
		            e.printStackTrace();
		            Reporter.log("Select 'Major' option from Impact drop-down doesn't reached | ");
		         }
	             Thread.sleep(5000);
	             Thread.sleep(5000);
	       
	            // Click on 'GoTo next Thread' button
	            try {
	    	        assertTextXpath("//*[@id='pVuln']");
	                clickByXpath("//*[@id='pVuln']");
	                Reporter.log("11th page - Click on 'GoTo next Thread' button | ");
                 }catch(Exception e)
		        {
		            e.printStackTrace();
		            Reporter.log("Click on 'GoTo next Thread' button doesn't reached | ");
		         }
	             Thread.sleep(5000);
	             Thread.sleep(5000);
	       
	             //12th page
	             // Select 'Yes' option in Response choice of listed Controls
		         try {
		    	     assertTextXpath("//*[@id='riskQuestionsControls']/tbody/tr[1]/td[5]/cw-s-response-choices/div/div/label[1]");
		 	         clickByXpath("//*[@id='riskQuestionsControls']/tbody/tr[1]/td[5]/cw-s-response-choices/div/div/label[1]");
		 	         Reporter.log("Select 'Yes' option in Response choice of listed Controls | ");
	             }catch(Exception e)
			     {
			          e.printStackTrace();
			         Reporter.log("Select 'Yes' option in Response choice of listed Controls doesn't work | ");
			     }
		         Thread.sleep(5000);
		         Thread.sleep(5000);
	       
	             //Click on RiskLikehood drop-down
	             try {
	    	         assertTextXpath("//*[@id='riskLikelihoodSelect']/cw-risk-choices/div/button");
	 	             clickByXpath("//*[@id='riskLikelihoodSelect']/cw-risk-choices/div/button");
	 	             Reporter.log("Click on RiskLikehood drop-down | ");
                  }catch(Exception e)
		         {
		             e.printStackTrace();
		             Reporter.log("Click on RiskLikehood drop-down doesn't work | ");
		         }
	             Thread.sleep(5000);
	             Thread.sleep(5000);
	       
	             //Select 'Moderate' option from Likehood drop-down
	             try {
	    	         assertTextXpath("//*[@id='riskLikelihoodSelect']/cw-risk-choices/div/ul/li[4]/a");
	 	             clickByXpath("//*[@id='riskLikelihoodSelect']/cw-risk-choices/div/ul/li[4]/a");
	 	             Reporter.log("Select 'Moderate' option from Likehood drop-down | ");
                  }catch(Exception e)
		          {
		              e.printStackTrace();
		              Reporter.log("Select 'Moderate' option from Likehood drop-down doesn't reached | ");
		          }
	              Thread.sleep(5000);
	              Thread.sleep(5000);
	       
	              // Click on RiskImpact drop-down
	              try {
	    	          assertTextXpath("//*[@id='riskImpactSelect']/cw-risk-choices/div/button");
	 	              clickByXpath("//*[@id='riskImpactSelect']/cw-risk-choices/div/button");
	 	              Reporter.log("Click on RiskImpact drop-down | ");
                  }catch(Exception e)
		          {
		               e.printStackTrace();
		               Reporter.log("Click on RiskImpact drop-down doesn't reached | ");
		          }
	              Thread.sleep(5000);
	             
	       
	              //Select 'Major' option from Impact drop-down
	              try {
	    	          assertTextXpath("//*[@id='riskImpactSelect']/cw-risk-choices/div/ul/li[5]/a");
	 	              clickByXpath("//*[@id='riskImpactSelect']/cw-risk-choices/div/ul/li[5]/a");
	 	              Reporter.log("Select 'Major' option from Impact drop-down | ");
                  }catch(Exception e)
		          {
		              e.printStackTrace();
		              Reporter.log("Select 'Major' option from Impact drop-down doesn't reached | ");
		           }
	               Thread.sleep(5000);
	               Thread.sleep(5000);
	       
	              // Click on 'save' button
	              try {
	    	          assertTextXpath("//*[@id='pMedia']");
	                  clickByXpath("//*[@id='pMedia']");
	                  Reporter.log("Select save button | ");
                  }catch(Exception e)
		          {
		              e.printStackTrace();
		              Reporter.log("click on save button doesn't work | ");
		           }
	               Thread.sleep(5000);
	               Thread.sleep(5000);
	               Thread.sleep(5000);
	               Thread.sleep(5000);
	               
	  }       
	  
      @Test(priority=2, enabled =true)
      public void RQLPager() throws InterruptedException, IOException { 
    	  
    	  
    	  Thread.sleep(5000);
          Thread.sleep(5000);
          Thread.sleep(5000);
          Thread.sleep(5000);

          // Click on 'continue' button of Media/Asset
          try {
        	  assertTextXpath("//*[@id='content']/tr[8]/td[7]/div/div[1]/span");
        	  clickByXpath("//*[@id='content']/tr[8]/td[7]/div/div[1]/span");
        	  Reporter.log("Click on 'continue' button of Pager Media/Asset | ");
          }catch(Exception e)
          {
        	  e.printStackTrace();
        	  Reporter.log("Click on 'continue' button of Pager doesn't work | ");
          }
          Thread.sleep(5000);          
          Thread.sleep(5000);

          //2nd page
          // Select 'Yes' option in Response choice of listed Controls
          try {
        	  assertTextXpath("//*[@id='riskQuestionsControls']/tbody/tr[1]/td[5]/cw-s-response-choices/div/div/label[1]");
        	  clickByXpath("//*[@id='riskQuestionsControls']/tbody/tr[1]/td[5]/cw-s-response-choices/div/div/label[1]");
        	  Reporter.log("Select 'Yes' option in Response choice of listed Controls | ");
          }catch(Exception e)
          {
        	  e.printStackTrace();
        	  Reporter.log("Select 'Yes' option in Response choice of listed Controls doesn't work | ");
          }
          Thread.sleep(5000);
  
          // Select 'Yes' option in Response choice of listed Controls
          try {
        	  assertTextXpath("//*[@id='riskQuestionsControls']/tbody/tr[2]/td[5]/cw-s-response-choices/div/div/label[1]");
        	  clickByXpath("//*[@id='riskQuestionsControls']/tbody/tr[2]/td[5]/cw-s-response-choices/div/div/label[1]");
        	  Reporter.log("Select 'Yes' option in Response choice of listed Controls | ");
          }catch(Exception e)
          {
        	  e.printStackTrace();
        	  Reporter.log("Select 'Yes' option in Response choice of listed Controls doesn't work | ");
          }
          Thread.sleep(5000);   
             		       	       	   	       
          //Click on RiskLikehood drop-down
          try {
        	  assertTextXpath("//*[@id='riskLikelihoodSelect']/cw-risk-choices/div/button");
        	  clickByXpath("//*[@id='riskLikelihoodSelect']/cw-risk-choices/div/button");
        	  Reporter.log("Click on RiskLikehood drop-down | ");
          }catch(Exception e)
          {
        	  e.printStackTrace();
        	  Reporter.log("Click on RiskLikehood drop-down doesn't work | ");
          }
          Thread.sleep(5000);
     
          //Select 'Moderate' option from Likehood drop-down
          try {
        	  assertTextXpath("//*[@id='riskLikelihoodSelect']/cw-risk-choices/div/ul/li[4]/a");
        	  clickByXpath("//*[@id='riskLikelihoodSelect']/cw-risk-choices/div/ul/li[4]/a");
        	  Reporter.log("Select 'Moderate' option from Likehood drop-down | ");
          }catch(Exception e)
          {
        	  e.printStackTrace();
        	  Reporter.log("Select 'Moderate' option from Likehood drop-down doesn't reached | ");
          }
          Thread.sleep(5000);
     
          // Click on RiskImpact drop-down
          try {
        	  assertTextXpath("//*[@id='riskImpactSelect']/cw-risk-choices/div/button");
        	  clickByXpath("//*[@id='riskImpactSelect']/cw-risk-choices/div/button");
        	  Reporter.log("Click on RiskImpact drop-down | ");
          }catch(Exception e)
          {
	     	    e.printStackTrace();
	     	    Reporter.log("Click on RiskImpact drop-down doesn't reached | ");
          }
          Thread.sleep(5000);
     
          //Select 'Major' option from Impact drop-down
          try {
        	  assertTextXpath("//*[@id='riskImpactSelect']/cw-risk-choices/div/ul/li[5]/a");
        	  clickByXpath("//*[@id='riskImpactSelect']/cw-risk-choices/div/ul/li[5]/a");
        	  Reporter.log("Select 'Major' option from Impact drop-down | ");
          }catch(Exception e)
          {
        	  e.printStackTrace();
        	  Reporter.log("Select 'Major' option from Impact drop-down doesn't reached | ");
          }
          Thread.sleep(5000);
          
          // Click on 'GoTo next Thread' button
          try {
        	  assertTextXpath("//*[@id='pVuln']");
        	  clickByXpath("//*[@id='pVuln']");
        	  Reporter.log("First page - Click on 'GoTo next Thread' button | ");
          }catch(Exception e)
          {
        	  e.printStackTrace();
        	  Reporter.log("Click on 'GoTo next Thread' button doesn't reached | ");
          }
          Thread.sleep(5000);

            //3rd page
          // Select 'Yes' option in Response choice of listed Controls
          try {
        	  assertTextXpath("//*[@id='riskQuestionsControls']/tbody/tr[1]/td[5]/cw-s-response-choices/div/div/label[1]");
        	  clickByXpath("//*[@id='riskQuestionsControls']/tbody/tr[1]/td[5]/cw-s-response-choices/div/div/label[1]");
        	  Reporter.log("Select 'Yes' option in Response choice of listed Controls | ");
          }catch(Exception e)
          {
        	  e.printStackTrace();
        	  Reporter.log("Select 'Yes' option in Response choice of listed Controls doesn't work | ");
          }
          Thread.sleep(5000);
  	   	        	       	       	   	       
          //Click on RiskLikehood drop-down
          try {
        	  assertTextXpath("//*[@id='riskLikelihoodSelect']/cw-risk-choices/div/button");
        	  clickByXpath("//*[@id='riskLikelihoodSelect']/cw-risk-choices/div/button");
        	  Reporter.log("Click on RiskLikehood drop-down | ");
          }catch(Exception e)
          {
        	  e.printStackTrace();
        	  Reporter.log("Click on RiskLikehood drop-down doesn't work | ");
          }
          Thread.sleep(5000);
          
          //Select 'Moderate' option from Likehood drop-down
          try {
        	  assertTextXpath("//*[@id='riskLikelihoodSelect']/cw-risk-choices/div/ul/li[4]/a");
        	  clickByXpath("//*[@id='riskLikelihoodSelect']/cw-risk-choices/div/ul/li[4]/a");
        	  Reporter.log("Select 'Moderate' option from Likehood drop-down | ");
          	}catch(Exception e)
          	{
          		e.printStackTrace();
          		Reporter.log("Select 'Moderate' option from Likehood drop-down doesn't reached | ");
          	}
          	Thread.sleep(5000);
     
          	// Click on RiskImpact drop-down
          	try {
          		assertTextXpath("//*[@id='riskImpactSelect']/cw-risk-choices/div/button");
          		clickByXpath("//*[@id='riskImpactSelect']/cw-risk-choices/div/button");
          		Reporter.log("Click on RiskImpact drop-down | ");
          	}catch(Exception e)
          	{
          		e.printStackTrace();
          		Reporter.log("Click on RiskImpact drop-down doesn't reached | ");
          	}
          	Thread.sleep(5000);
     
          	//Select 'Major' option from Impact drop-down
        	try {
        		assertTextXpath("//*[@id='riskImpactSelect']/cw-risk-choices/div/ul/li[5]/a");
        		clickByXpath("//*[@id='riskImpactSelect']/cw-risk-choices/div/ul/li[5]/a");
        		Reporter.log("Select 'Major' option from Impact drop-down | ");
        	}catch(Exception e)
        	{
        		e.printStackTrace();
        		Reporter.log("Select 'Major' option from Impact drop-down doesn't reached | ");
        	}
        	Thread.sleep(5000);
     
        	// Click on 'GoTo next Thread' button
        	try {
        		assertTextXpath("//*[@id='pVuln']");
        		clickByXpath("//*[@id='pVuln']");
        		Reporter.log("First page - Click on 'GoTo next Thread' button | ");
        	}catch(Exception e)
        	{
        		e.printStackTrace();
        		Reporter.log("Click on 'GoTo next Thread' button doesn't reached | ");
        	}
        	Thread.sleep(5000);
     
        	// 4th page
        	// Select 'Yes' option in Response choice of listed Controls
        	try {
        		assertTextXpath("//*[@id='riskQuestionsControls']/tbody/tr[1]/td[5]/cw-s-response-choices/div/div/label[1]");
        		clickByXpath("//*[@id='riskQuestionsControls']/tbody/tr[1]/td[5]/cw-s-response-choices/div/div/label[1]");
        		Reporter.log("Select 'Yes' option in Response choice of listed Controls | ");
        	}catch(Exception e)
        	{
        		e.printStackTrace();
        		Reporter.log("Select 'Yes' option in Response choice of listed Controls doesn't work | ");
        	}
        	Thread.sleep(5000);
  
        	// Select 'Yes' option in Response choice of listed Controls
        	try {
        		assertTextXpath("//*[@id='riskQuestionsControls']/tbody/tr[2]/td[5]/cw-s-response-choices/div/div/label[1]");
        		clickByXpath("//*[@id='riskQuestionsControls']/tbody/tr[2]/td[5]/cw-s-response-choices/div/div/label[1]");
        		Reporter.log("Select 'Yes' option in Response choice of listed Controls | ");
        	}catch(Exception e)
        	{
        		e.printStackTrace();
        		Reporter.log("Select 'Yes' option in Response choice of listed Controls doesn't work | ");
        	}
        	Thread.sleep(5000);
  
        	// Select 'Yes' option in Response choice of listed Controls
        	try {
        		assertTextXpath("//*[@id='riskQuestionsControls']/tbody/tr[3]/td[5]/cw-s-response-choices/div/div/label[1]");
        		clickByXpath("//*[@id='riskQuestionsControls']/tbody/tr[3]/td[5]/cw-s-response-choices/div/div/label[1]");
        		Reporter.log("Select 'Yes' option in Response choice of listed Controls | ");
        	}catch(Exception e)
        	{
        		e.printStackTrace();
        		Reporter.log("Select 'Yes' option in Response choice of listed Controls doesn't work | ");
        	}
        	Thread.sleep(5000);
 
  	       	   	       
        	//Click on RiskLikehood drop-down
        	try {
        		assertTextXpath("//*[@id='riskLikelihoodSelect']/cw-risk-choices/div/button");
        		clickByXpath("//*[@id='riskLikelihoodSelect']/cw-risk-choices/div/button");
        		Reporter.log("Click on RiskLikehood drop-down | ");
        	}catch(Exception e)
        	{
        		e.printStackTrace();
        		Reporter.log("Click on RiskLikehood drop-down doesn't work | ");
        	}
        	Thread.sleep(5000);
     
        	//Select 'Moderate' option from Likehood drop-down
        	try {
        		assertTextXpath("//*[@id='riskLikelihoodSelect']/cw-risk-choices/div/ul/li[4]/a");
        		clickByXpath("//*[@id='riskLikelihoodSelect']/cw-risk-choices/div/ul/li[4]/a");
        		Reporter.log("Select 'Moderate' option from Likehood drop-down | ");
        	}catch(Exception e)
        	{
        		e.printStackTrace();
        		Reporter.log("Select 'Moderate' option from Likehood drop-down doesn't reached | ");
        	}
        	Thread.sleep(5000);
     
        	// Click on RiskImpact drop-down
        	try {
        		assertTextXpath("//*[@id='riskImpactSelect']/cw-risk-choices/div/button");
        		clickByXpath("//*[@id='riskImpactSelect']/cw-risk-choices/div/button");
        		Reporter.log("Click on RiskImpact drop-down | ");
        	}catch(Exception e)
        	{
        		e.printStackTrace();
        		Reporter.log("Click on RiskImpact drop-down doesn't reached | ");
        	}
        	Thread.sleep(5000);
     
        	//Select 'Major' option from Impact drop-down
        	try {
        		assertTextXpath("//*[@id='riskImpactSelect']/cw-risk-choices/div/ul/li[5]/a");
        		clickByXpath("//*[@id='riskImpactSelect']/cw-risk-choices/div/ul/li[5]/a");
        		Reporter.log("Select 'Major' option from Impact drop-down | ");
        	}catch(Exception e)
        	{
        		e.printStackTrace();
        		Reporter.log("Select 'Major' option from Impact drop-down doesn't reached | ");
        	}
        	Thread.sleep(5000);
     
        	// Click on 'GoTo next Thread' button
        	try {
        		assertTextXpath("//*[@id='pVuln']");
        		clickByXpath("//*[@id='pVuln']");
        		Reporter.log("First page - Click on 'GoTo next Thread' button | ");
        	}catch(Exception e)
        	{
        		e.printStackTrace();
        		Reporter.log("Click on 'GoTo next Thread' button doesn't reached | ");
        	}
        	Thread.sleep(5000);

        	//5th page
        	// Select 'Yes' option in Response choice of listed Controls
        	try {
        		assertTextXpath("//*[@id='riskQuestionsControls']/tbody/tr[1]/td[5]/cw-s-response-choices/div/div/label[1]");
        		clickByXpath("//*[@id='riskQuestionsControls']/tbody/tr[1]/td[5]/cw-s-response-choices/div/div/label[1]");
        		Reporter.log("Select 'Yes' option in Response choice of listed Controls | ");
        	}catch(Exception e)
        	{
        		e.printStackTrace();
        		Reporter.log("Select 'Yes' option in Response choice of listed Controls doesn't work | ");
        	}
        	Thread.sleep(5000);  
      		       	       	   	       
        	//Click on RiskLikehood drop-down
        	try {
        		assertTextXpath("//*[@id='riskLikelihoodSelect']/cw-risk-choices/div/button");
        		clickByXpath("//*[@id='riskLikelihoodSelect']/cw-risk-choices/div/button");
        		Reporter.log("Click on RiskLikehood drop-down | ");
        	}catch(Exception e)
        	{
        		e.printStackTrace();
        		Reporter.log("Click on RiskLikehood drop-down doesn't work | ");
        	}
        	Thread.sleep(5000);
     
        	//Select 'Moderate' option from Likehood drop-down
        	try {
        		assertTextXpath("//*[@id='riskLikelihoodSelect']/cw-risk-choices/div/ul/li[4]/a");
        		clickByXpath("//*[@id='riskLikelihoodSelect']/cw-risk-choices/div/ul/li[4]/a");
        		Reporter.log("Select 'Moderate' option from Likehood drop-down | ");
        	}catch(Exception e)
        	{
        		e.printStackTrace();
        		Reporter.log("Select 'Moderate' option from Likehood drop-down doesn't reached | ");
        	}
        	Thread.sleep(5000);
     
        	// Click on RiskImpact drop-down
        	try {
        		assertTextXpath("//*[@id='riskImpactSelect']/cw-risk-choices/div/button");
        		clickByXpath("//*[@id='riskImpactSelect']/cw-risk-choices/div/button");
        		Reporter.log("Click on RiskImpact drop-down | ");
        	}catch(Exception e)
        	{
        		e.printStackTrace();
        		Reporter.log("Click on RiskImpact drop-down doesn't reached | ");
        	}
        	Thread.sleep(5000);
     
        	//Select 'Major' option from Impact drop-down
        	try {
        		assertTextXpath("//*[@id='riskImpactSelect']/cw-risk-choices/div/ul/li[5]/a");
        		clickByXpath("//*[@id='riskImpactSelect']/cw-risk-choices/div/ul/li[5]/a");
        		Reporter.log("Select 'Major' option from Impact drop-down | ");
        	}catch(Exception e)
        	{
        		e.printStackTrace();
        		Reporter.log("Select 'Major' option from Impact drop-down doesn't reached | ");
        	}
        	Thread.sleep(5000);
     
        	// Click on 'GoTo next Thread' button
        	try {
        		assertTextXpath("//*[@id='pVuln']");
        		clickByXpath("//*[@id='pVuln']");
        		Reporter.log("First page - Click on 'GoTo next Thread' button | ");
        	}catch(Exception e)
        	{
        		e.printStackTrace();
        		Reporter.log("Click on 'GoTo next Thread' button doesn't reached | ");
        	}
        	Thread.sleep(5000);

        	//6th page
        	// Select 'Yes' option in Response choice of listed Controls
        	try {
        		assertTextXpath("//*[@id='riskQuestionsControls']/tbody/tr[1]/td[5]/cw-s-response-choices/div/div/label[1]");
        		clickByXpath("//*[@id='riskQuestionsControls']/tbody/tr[1]/td[5]/cw-s-response-choices/div/div/label[1]");
        		Reporter.log("Select 'Yes' option in Response choice of listed Controls | ");
        	}catch(Exception e)
        	{
        		e.printStackTrace();
        		Reporter.log("Select 'Yes' option in Response choice of listed Controls doesn't work | ");
        	}
        	Thread.sleep(5000);  
      		       	       	   	       
        	//Click on RiskLikehood drop-down
        	try {
        		assertTextXpath("//*[@id='riskLikelihoodSelect']/cw-risk-choices/div/button");
        		clickByXpath("//*[@id='riskLikelihoodSelect']/cw-risk-choices/div/button");
        		Reporter.log("Click on RiskLikehood drop-down | ");
        	}catch(Exception e)
        	{
        		e.printStackTrace();
        		Reporter.log("Click on RiskLikehood drop-down doesn't work | ");
        	}
        	Thread.sleep(5000);
     
        	//Select 'Moderate' option from Likehood drop-down
        	try {
        		assertTextXpath("//*[@id='riskLikelihoodSelect']/cw-risk-choices/div/ul/li[4]/a");
        		clickByXpath("//*[@id='riskLikelihoodSelect']/cw-risk-choices/div/ul/li[4]/a");
        		Reporter.log("Select 'Moderate' option from Likehood drop-down | ");
        	}catch(Exception e)
        	{
        		e.printStackTrace();
        		Reporter.log("Select 'Moderate' option from Likehood drop-down doesn't reached | ");
        	}
        	Thread.sleep(5000);
     
        	// Click on RiskImpact drop-down
        	try {
        		assertTextXpath("//*[@id='riskImpactSelect']/cw-risk-choices/div/button");
        		clickByXpath("//*[@id='riskImpactSelect']/cw-risk-choices/div/button");
        		Reporter.log("Click on RiskImpact drop-down | ");
        	}catch(Exception e)
        	{
        		e.printStackTrace();
        		Reporter.log("Click on RiskImpact drop-down doesn't reached | ");
        	}
        	Thread.sleep(5000);
     
        	//Select 'Major' option from Impact drop-down
        	try {
        		assertTextXpath("//*[@id='riskImpactSelect']/cw-risk-choices/div/ul/li[5]/a");
        		clickByXpath("//*[@id='riskImpactSelect']/cw-risk-choices/div/ul/li[5]/a");
        		Reporter.log("Select 'Major' option from Impact drop-down | ");
        	}catch(Exception e)
        	{
        		e.printStackTrace();
        		Reporter.log("Select 'Major' option from Impact drop-down doesn't reached | ");
        	}
        	Thread.sleep(5000);
        		
        	// Click on 'GoTo next Thread' button
        	try {
        		assertTextXpath("//*[@id='pVuln']");
        		clickByXpath("//*[@id='pVuln']");
        		Reporter.log("First page - Click on 'GoTo next Thread' button | ");
        	}catch(Exception e)
        	{
        			e.printStackTrace();
        			Reporter.log("Click on 'GoTo next Thread' button doesn't reached | ");
        	}
        	Thread.sleep(5000);

        	//7th page
        	// Select 'Yes' option in Response choice of listed Controls
        	try {
        		assertTextXpath("//*[@id='riskQuestionsControls']/tbody/tr[1]/td[5]/cw-s-response-choices/div/div/label[1]");
        		clickByXpath("//*[@id='riskQuestionsControls']/tbody/tr[1]/td[5]/cw-s-response-choices/div/div/label[1]");
        		Reporter.log("Select 'Yes' option in Response choice of listed Controls | ");
        	}catch(Exception e)
        	{
        		e.printStackTrace();
        		Reporter.log("Select 'Yes' option in Response choice of listed Controls doesn't work | ");
        	}
        	Thread.sleep(5000);  
      		       	       	   	       
        	//Click on RiskLikehood drop-down
        	try {
        		assertTextXpath("//*[@id='riskLikelihoodSelect']/cw-risk-choices/div/button");
        		clickByXpath("//*[@id='riskLikelihoodSelect']/cw-risk-choices/div/button");
        		Reporter.log("Click on RiskLikehood drop-down | ");
        	}catch(Exception e)
        	{
        		e.printStackTrace();
        		Reporter.log("Click on RiskLikehood drop-down doesn't work | ");
        	}
        	Thread.sleep(5000);
     
        	//Select 'Moderate' option from Likehood drop-down
        	try {
        		assertTextXpath("//*[@id='riskLikelihoodSelect']/cw-risk-choices/div/ul/li[4]/a");
        		clickByXpath("//*[@id='riskLikelihoodSelect']/cw-risk-choices/div/ul/li[4]/a");
        		Reporter.log("Select 'Moderate' option from Likehood drop-down | ");
        	}catch(Exception e)
        	{
        		e.printStackTrace();
        		Reporter.log("Select 'Moderate' option from Likehood drop-down doesn't reached | ");
        	}
        	Thread.sleep(5000);
     
        	// Click on RiskImpact drop-down
        	try {
        		assertTextXpath("//*[@id='riskImpactSelect']/cw-risk-choices/div/button");
        		clickByXpath("//*[@id='riskImpactSelect']/cw-risk-choices/div/button");
        		Reporter.log("Click on RiskImpact drop-down | ");
        	}catch(Exception e)
        	{
        		e.printStackTrace();
        		Reporter.log("Click on RiskImpact drop-down doesn't reached | ");
        	}
        	Thread.sleep(5000);
     
        	//Select 'Major' option from Impact drop-down
        	try {
        		assertTextXpath("//*[@id='riskImpactSelect']/cw-risk-choices/div/ul/li[5]/a");
        		clickByXpath("//*[@id='riskImpactSelect']/cw-risk-choices/div/ul/li[5]/a");
        		Reporter.log("Select 'Major' option from Impact drop-down | ");
        	}catch(Exception e)
        	{
        		e.printStackTrace();
        		Reporter.log("Select 'Major' option from Impact drop-down doesn't reached | ");
        	}
        	Thread.sleep(5000);
        	Thread.sleep(5000);
     
        	 // Click on 'save' button
            try {
  	          assertTextXpath("//*[@id='pMedia']");
                clickByXpath("//*[@id='pMedia']");
                Reporter.log("Select save button | ");
            }catch(Exception e)
	          {
	              e.printStackTrace();
	              Reporter.log("click on save button doesn't work | ");
	           }
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

