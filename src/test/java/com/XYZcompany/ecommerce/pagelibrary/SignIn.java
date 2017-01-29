package com.XYZcompany.ecommerce.pagelibrary;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.XYZcompany.ecommerce.logs.ExtentReportsLogs;


import com.relevantcodes.extentreports.LogStatus;

public class SignIn extends ExtentReportsLogs {

	public WebDriver driver;
	
	
	
	public SignIn(WebDriver driver){
		
		this.driver=driver;
	}

   //locators
   By signIn=By.xpath("//a[contains(text(),'Sign in')]");
  // By signIn=By.className("login");
   By unregisteedEmail=By.xpath(".//*[@id='email_create']");   
   By createAcButton=By.xpath(".//*[@id='SubmitCreate']");   
   By registeredEmail=By.xpath("//input[@id='email']");
   By passwordbox=By.id("passwd");
   public By LoginButton=By.id("SubmitLogin");   
   
   
   
   //methods
   
   public void clickSignInlink(){
	   driver.findElement(signIn).click();
	   ExtentReportsLogs.logger.log(LogStatus.INFO, "Clicked on Sign in");
	   
	   
   }
   
   public void EnterUnregisteredEmail(String email1){
	   driver.findElement(unregisteedEmail).sendKeys(email1);
   }

   public void clickCreateAccount(){
	   driver.findElement(createAcButton).click();
   }
   public void enterRegisteredEmail(String email2){
	   //driver.findElement(registeredEmail).clear();
	   driver.findElement(registeredEmail).sendKeys(email2);
	   ExtentReportsLogs.logger.log(LogStatus.INFO, "Entered email");
	   
   }
   
   public void enterPassword(String password){
	   //driver.findElement(passwordbox).clear();
	   driver.findElement(passwordbox).sendKeys(password);
	   ExtentReportsLogs.logger.log(LogStatus.INFO, "Entered password");
	   
   }
   
   public void clickSubmit(){
	   driver.findElement(LoginButton).click();
	   ExtentReportsLogs.logger.log(LogStatus.INFO, "Clicked on submit");
	   
   }
}