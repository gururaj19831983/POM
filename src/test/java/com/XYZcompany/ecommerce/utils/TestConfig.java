package com.XYZcompany.ecommerce.utils;

import java.io.IOException;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.XYZcompany.ecommerce.logs.ExtentReportsLogs;
import com.XYZcompany.ecommerce.testbase.Testbase;


public class TestConfig extends Testbase{
	
	public static boolean passBrowserFromConfig=false;

	@AfterSuite
	public void reporting() throws IOException{		
		extentreportlogs.generateReport();
		extentreportlogs.opentheReport(driver);
		
		}
	
	@BeforeSuite
	public void setup() throws IOException{		
	
		extentreportinstance();
		extentreportlogs.initializeReport("SigninModule");// pass class/module name as parameter
		loadProperties();
		if(repository.getProperty("ConfigBrowser").equals("true")){
			passBrowserFromConfig=true;	
			selectBrowser(repository.getProperty("browser"));	
			}		
	
	
	}
	
	
	@BeforeTest
	@Parameters("browser")
	public void selectBrowserfromxml(String browser){
		if(passBrowserFromConfig==false)
		{
			
			
			if(browser.toUpperCase().equals("FIREFOX"))
		{
		   System.setProperty("webdriver.gecko.driver", "A:\\Selenium\\my softwares\\Firefox\\geckodriver.exe");
		   driver=new FirefoxDriver();
		   
		}
		
		else if(browser.toUpperCase().equals("CHROME"))
			{
			System.setProperty("webdriver.chrome.driver", "A:\\Selenium\\my softwares\\ChromeDriver\\chromedriver.exe");
		    driver=new ChromeDriver();
		    
			}
		else if(browser.toUpperCase().equals("IE"))
		{
			DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
			capabilities.setCapability(InternetExplorerDriver.IE_ENSURE_CLEAN_SESSION, true);
			System.setProperty("webdriver.ie.driver", "A:\\Selenium\\my softwares\\IEDriver\\IEDriverServer.exe");		
			driver=new InternetExplorerDriver(capabilities);
	    }
		else
			System.out.println("browser name should be chrome,ie or Firefox");
		}
	}
	
	
	

	
	
	@BeforeMethod
	public void methodinitialize() throws IOException{
		
		navigateToApp();
		
     }
	
	@AfterMethod
	public void teardown(ITestResult result) throws IOException{
		if(result.getStatus()==ITestResult.FAILURE){
		
		extentreportlogs.addscreenshotofFailedtest(driver);
		}
		cleanBrowser();
		
		
		
	}
	
	
	
	
	
	
	
	

	
	
	
}


