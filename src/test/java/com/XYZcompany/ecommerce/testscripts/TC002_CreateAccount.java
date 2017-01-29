package com.XYZcompany.ecommerce.testscripts;

import java.io.IOException;
import java.util.Arrays;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.XYZcompany.ecommerce.Excelreader.ExcelReader;
import com.XYZcompany.ecommerce.customlistener.RerunFailedTests;
import com.XYZcompany.ecommerce.logs.ExtentReportsLogs;
import com.XYZcompany.ecommerce.pagelibrary.CreateAnAccount;
import com.XYZcompany.ecommerce.pagelibrary.MyAccount;
import com.XYZcompany.ecommerce.pagelibrary.SignIn;
import com.XYZcompany.ecommerce.testbase.Testbase;
import com.XYZcompany.ecommerce.utils.GenericMethods;
import com.XYZcompany.ecommerce.utils.TestConfig;
import com.relevantcodes.extentreports.LogStatus;

public class TC002_CreateAccount extends TestConfig{
	
	
	SignIn signIn;
	GenericMethods genericMethods;	
	CreateAnAccount createanaccount;
	ExcelReader excelreader;
	
	@DataProvider(name="userdetails")
	public String[][] readuserdetails() throws IOException, InterruptedException{
		
		excelreader=new ExcelReader();
		String[][] obj;
		
		 obj=excelreader.readMysheet("A:\\Selenium\\Neon_Workspace\\POM\\src\\test\\Resources\\testdata\\testdata.xlsx", "Sheet1");	
		
		return obj;
		
	}
	
	

	//------------------------------------------------------------------------------------------------------------
	@Test(dataProvider="userdetails")
	public void createAccount(String gender,String firstname,String lastname,String password,String DOB,String company,String addr1,String addr2,String city,String postcode,String state,String additional,String hphone,String mobile,String alias) throws InterruptedException, IOException{
		signIn=new SignIn(driver);
		genericMethods=new GenericMethods(driver);
		createanaccount=new CreateAnAccount(driver);
		
		extentreportlogs.initializeLogger("createAccount");//passs method name as parameter
		
		
		String[] date=DOB.split("-");
		String email="test"+System.currentTimeMillis()+"@gmail.com";
		
		
		
		signIn.clickSignInlink();
		signIn.EnterUnregisteredEmail(email);
		signIn.clickCreateAccount();
		createanaccount.SelectGender(gender);
		createanaccount.enterFirstname(firstname);
		createanaccount.enterLastname(lastname);
		createanaccount.enterPassword(password);
		createanaccount.selectDay(date[0]);
		createanaccount.selectMonth(date[1]);
		createanaccount.selectYear(date[2]);
		createanaccount.selectNewsletter();
		createanaccount.selectSpoffer();
		//createanaccount.enterFirstname2(firstname);
		//createanaccount.enterLastname2(lastname);
		createanaccount.enterCompany(company);
		createanaccount.enterAddress1(addr1);
		createanaccount.enterAddress2(addr2);
		createanaccount.enterCity(city);
		createanaccount.selectState(state);
		createanaccount.enterPostcode(postcode);
		createanaccount.enterAdditional(additional);
		createanaccount.enterHomephone(hphone);
		createanaccount.enterMobile(mobile);
		createanaccount.enterAlias(alias);
		createanaccount.clickSubmit();
		
		
		String title=driver.findElement(MyAccount.myaccounttext).getText();
		Assert.assertTrue(title.contains("Welcome"));				
			ExtentReportsLogs.logger.log(LogStatus.PASS, "successfully created a new account");	
		
		
		
	}
	

}
