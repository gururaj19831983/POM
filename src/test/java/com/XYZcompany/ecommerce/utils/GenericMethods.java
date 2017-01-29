package com.XYZcompany.ecommerce.utils;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.support.ui.WebDriverWait;
import com.XYZcompany.ecommerce.testbase.Testbase;




public class GenericMethods extends Testbase{
	
	public WebDriver driver;
    
    public GenericMethods(WebDriver driver){
    	this.driver=driver;
    }
    
    
    

	public void explicitlyWaitFor(By loc){
	
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		try{wait.until(ExpectedConditions.presenceOfElementLocated(loc));
		//System.out.println(loc+"element found");
		}
		catch(Exception e){
			//System.out.println(loc+"element not found");
		}
	}
	
	public void wait(int sec) throws InterruptedException{
		
		Thread.sleep(sec*1000);
	}
	
	public String captureScreenshot(WebDriver driver) throws IOException{
		
		File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String destination="A:\\Selenium\\Reports\\Screenshots\\"+System.currentTimeMillis()+".png";
	   FileUtils.copyFile(src,new File(destination));
	   return destination;
		
		
		}

}
