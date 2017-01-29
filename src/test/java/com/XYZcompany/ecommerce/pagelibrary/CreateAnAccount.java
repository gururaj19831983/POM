package com.XYZcompany.ecommerce.pagelibrary;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import com.XYZcompany.ecommerce.logs.ExtentReportsLogs;
import com.relevantcodes.extentreports.LogStatus;

public class CreateAnAccount extends ExtentReportsLogs{

	public WebDriver driver;

	public CreateAnAccount(WebDriver driver){
		
		this.driver=driver;
	}

    

  By Mister=By.id("id_gender1");
  By Miss=By.id("id_gender2");
  By firstname=By.id("customer_firstname");
  By lastname=By.id("customer_lastname");
  By email=By.id("email");
  By password=By.id("passwd");
  By days=By.id("days");
  By months=By.id("months");
  By years=By.id("years");
  By newsletter=By.id("newsletter");
  By spOffer=By.id("optin");
  By firstname2=By.id("firstname");
  By lastname2=By.id("lastname");
  By company=By.id("company");
  By address1=By.id("address1");
  By address2=By.id("address2");
  By city=By.id("city");
  By state=By.id("id_state");
  By postcode=By.id("postcode");
  By country=By.id("id_country");
  By additional=By.id("other");
  By hphone=By.id("phone");
  By mobile=By.id("phone_mobile");
  By alias=By.id("alias");
  By submitaccount=By.id("submitAccount");
  
  Select select1,select2,select3,select4,select5;
  
  public void SelectGender(String gender){
	  if(gender.equals("Mr"))
		  driver.findElement(Mister).click();
	  else if(gender.equals("Mrs"))
		  driver.findElement(Miss).click();
	  else
		  System.out.println("Enter gender as Mr or Mrs");
	  
	  ExtentReportsLogs.logger.log(LogStatus.INFO, "Gender selected");
	  
  }
  
  public void enterFirstname(String namefirst){
	  driver.findElement(firstname).sendKeys(namefirst);
	  ExtentReportsLogs.logger.log(LogStatus.INFO, "First name entered");
  }
  
  public void enterLastname(String namelast){
	  driver.findElement(lastname).sendKeys(namelast);
	  ExtentReportsLogs.logger.log(LogStatus.INFO, "last name entered");
  }

  public void enterPassword(String in_password){
	  driver.findElement(password).sendKeys(in_password);
	  ExtentReportsLogs.logger.log(LogStatus.INFO, "password entered");
  }
 public void selectDay(String day){
	 select1=new Select(driver.findElement(days));
	 select1.selectByValue(day);
	 ExtentReportsLogs.logger.log(LogStatus.INFO, "selected day");
 }
 
 public void selectMonth(String month){
	 select2=new Select(driver.findElement(months));
	 select2.selectByValue(month);
	 ExtentReportsLogs.logger.log(LogStatus.INFO, "selected month");
 }
 
 public void selectYear(String year){
	 select3=new Select(driver.findElement(years));
	 select3.selectByValue(year);
	 ExtentReportsLogs.logger.log(LogStatus.INFO, "selected year");
 }

 public void selectNewsletter(){
	 driver.findElement(newsletter).click();
	 ExtentReportsLogs.logger.log(LogStatus.INFO, "newsletter selected");
 }
 
 public void selectSpoffer(){
	driver.findElement(spOffer).click(); 
 }
 public void enterFirstname2(String namefirst){
	  driver.findElement(firstname2).sendKeys(namefirst);
	  ExtentReportsLogs.logger.log(LogStatus.INFO, "entered first name in address");
 }
 public void enterLastname2(String namelast){
	  driver.findElement(lastname2).sendKeys(namelast);
	  ExtentReportsLogs.logger.log(LogStatus.INFO, "entered last name in address");
}
 
 public void enterCompany(String in_company){
	 driver.findElement(company).sendKeys(in_company);
	 ExtentReportsLogs.logger.log(LogStatus.INFO, "Entered company name");
 }
 
 public void enterAddress1(String in_address1)
 {
	driver.findElement(address1).sendKeys(in_address1);
	ExtentReportsLogs.logger.log(LogStatus.INFO, "Entered address 1");
 }

 public void enterAddress2(String in_address2)
 {
	driver.findElement(address2).sendKeys(in_address2);
	ExtentReportsLogs.logger.log(LogStatus.INFO, "entered address 2");
 }

public void enterCity(String in_city){
	
	driver.findElement(city).sendKeys(in_city);
	ExtentReportsLogs.logger.log(LogStatus.INFO, "entered city");
}

public void selectState(String in_state){
	
	select4=new Select(driver.findElement(state));
	select4.selectByVisibleText(in_state);
	ExtentReportsLogs.logger.log(LogStatus.INFO, "entered state");
    
}

public void enterPostcode(String zip){
	
	driver.findElement(postcode).sendKeys(zip);
	ExtentReportsLogs.logger.log(LogStatus.INFO, "entered zip");
}

public void enterAdditional(String in_addition){
	
	driver.findElement(additional).sendKeys(in_addition);
	ExtentReportsLogs.logger.log(LogStatus.INFO, "entered additional info");
}

public void enterHomephone(String in_phone){
	driver.findElement(hphone).sendKeys(in_phone);
	ExtentReportsLogs.logger.log(LogStatus.INFO, "entered phone");
}
public void enterMobile(String in_mobile){
	driver.findElement(mobile).sendKeys(in_mobile);
	ExtentReportsLogs.logger.log(LogStatus.INFO, "entered mobile");
}

public void enterAlias(String in_alias){
	driver.findElement(alias).clear();
	driver.findElement(alias).sendKeys(in_alias);
	ExtentReportsLogs.logger.log(LogStatus.INFO, "entered alias");
}

public void clickSubmit(){
	
	driver.findElement(submitaccount).click();
	ExtentReportsLogs.logger.log(LogStatus.INFO, "clicked submit");
}

}





