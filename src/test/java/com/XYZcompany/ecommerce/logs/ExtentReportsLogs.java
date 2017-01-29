package com.XYZcompany.ecommerce.logs;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;

import com.XYZcompany.ecommerce.testbase.Testbase;
import com.XYZcompany.ecommerce.utils.GenericMethods;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;


public class ExtentReportsLogs extends Testbase{
	
	public  ExtentReports report;
	public static ExtentTest logger;
	String htmlreport;
	GenericMethods genericmethods;
  
	public void initializeReport(String modulename){
	htmlreport ="A:\\Selenium\\Neon_Workspace\\POM\\src\\test\\Resources\\Reports\\htmlreports\\"+modulename+System.currentTimeMillis()+".html";
	report = new ExtentReports(htmlreport);
	
	
	}
	
	public void initializeLogger(String methodname){
		
		logger=report.startTest(methodname);
	}
	
	public void generateReport(){
	report.endTest(logger);
	report.flush();
	}
    
	public void opentheReport(WebDriver driver) throws IOException{
		try{
		driver.get(htmlreport);
		}
		catch(Exception e){
			driver.quit();//in case report was unable to be open on Firefox
			System.setProperty("webdriver.chrome.driver", "A:\\Selenium\\my softwares\\ChromeDriver\\chromedriver.exe");
		    driver=new ChromeDriver();
		    driver.manage().deleteAllCookies();
		    driver.get(htmlreport);
		}
	}
	
	public void addscreenshotofFailedtest(WebDriver driver) throws IOException{
		GenericMethods genericmethods=new GenericMethods(driver);
		String image="";				
		String screenshot_path=genericmethods.captureScreenshot(driver);
		image=ExtentReportsLogs.logger.addScreenCapture(screenshot_path);		
		ExtentReportsLogs.logger.log(LogStatus.FAIL, image);
	}
	
  
}