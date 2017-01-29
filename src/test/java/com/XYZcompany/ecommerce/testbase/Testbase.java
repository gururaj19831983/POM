package com.XYZcompany.ecommerce.testbase;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.XYZcompany.ecommerce.logs.ExtentReportsLogs;
import com.XYZcompany.ecommerce.utils.GenericMethods;

public class Testbase{
	public static Properties repository;
	public static WebDriver driver;
	public static ExtentReportsLogs extentreportlogs;
	
	public void extentreportinstance(){
	extentreportlogs=new ExtentReportsLogs();
	}
	
	public static void init() throws IOException{
		loadProperties();
		selectBrowser(repository.getProperty("browser"));		
		
		
	}
	
	
	public static void navigateToApp(){
		
		driver.get(repository.getProperty("application"));		
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	public void cleanBrowser(){
		System.out.println("clearing cookies");
		
		driver.manage().deleteAllCookies();
	}
	
	public static void loadProperties() throws IOException{
		repository=new Properties();
		File f=new File(System.getProperty("user.dir")+"/src/test/java/com/XYZcompany/ecommerce/utils/config.properties");
		FileInputStream fis=new FileInputStream(f);
		repository.load(fis);
	}
	
	public static void selectBrowser(String browser){
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
