package com.XYZcompany.ecommerce.testscripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.XYZcompany.ecommerce.customlistener.RerunFailedTests;
import com.XYZcompany.ecommerce.logs.ExtentReportsLogs;
import com.XYZcompany.ecommerce.pagelibrary.MyAccount;
import com.XYZcompany.ecommerce.pagelibrary.SignIn;
import com.XYZcompany.ecommerce.testbase.Testbase;
import com.XYZcompany.ecommerce.utils.GenericMethods;
import com.XYZcompany.ecommerce.utils.TestConfig;
import com.relevantcodes.extentreports.LogStatus;

public class TC001_SigningIn extends TestConfig{
	SignIn signIn;
	GenericMethods genericMethods;	
	

	
	
	//------------------------------------------------------------------------------------------------------------
	@Test
	public void signIn() throws InterruptedException{
		signIn=new SignIn(driver);
		genericMethods=new GenericMethods(driver);
		
		
		extentreportlogs.initializeLogger("signInTest");//passs method name as parameter
		
		signIn.clickSignInlink();
		genericMethods.explicitlyWaitFor(signIn.LoginButton);	
		signIn.enterRegisteredEmail(repository.getProperty("username"));
		signIn.enterPassword(repository.getProperty("password"));
		signIn.clickSubmit();
		genericMethods.explicitlyWaitFor(MyAccount.myaccounttext);
		
		
		String title=driver.findElement(MyAccount.myaccounttext).getText();
		Assert.assertTrue(title.contains("Welcome"));				
			ExtentReportsLogs.logger.log(LogStatus.PASS, "successfully signed in");	
		
		
		
	}
	
	
	//---------------------------------------------------------------------------------------------------------------
	

	
	/*@Test(retryAnalyzer=RerunFailedTests.class)
	public void signIn2() throws InterruptedException{
		signIn=new SignIn(driver);
		genericMethods=new GenericMethods(driver);
			
		
		extentreportlogs.initializeLogger("signInTest2");
			 
		signIn.clickSignInlink();		
		genericMethods.explicitlyWaitFor(signIn.LoginButton);	
		signIn.enterRegisteredEmail(repository.getProperty("username"));		
		signIn.enterPassword(repository.getProperty("password"));		
		signIn.clickSubmit();		
		genericMethods.explicitlyWaitFor(MyAccount.myaccounttext);	
		
		String title=driver.findElement(MyAccount.myaccounttext).getText();
		
		Assert.assertTrue(title.contains("Welcome2"));				
		ExtentReportsLogs.logger.log(LogStatus.PASS, "successfully signed in");	
		
	
	
		
	}
	
	//-----------------------------------------------------------------------------------------------------------------
	/*
	@Test(retryAnalyzer=RerunFailedTests.class)
	public void signIn3() throws InterruptedException{
		
		extentreportlogs.initializeLogger("signInTest3");//passs method name as parameter
		
		signIn.clickSignInlink();
		genericMethods.explicitlyWaitFor(signIn.LoginButton);	
		signIn.enterRegisteredEmail(repository.getProperty("username"));
		signIn.enterPassword(repository.getProperty("password"));
		signIn.clickSubmit();
		genericMethods.explicitlyWaitFor(MyAccount.myaccounttext);
		
		String title=driver.findElement(MyAccount.myaccounttext).getText();		
		Assert.assertTrue(title.contains("Welcome2"));				
		ExtentReportsLogs.logger.log(LogStatus.PASS, "successfully signed in");		
	
		
		
	}
	
	@Test(retryAnalyzer=RerunFailedTests.class)
	public void signIn4() throws InterruptedException{
		
		extentreportlogs.initializeLogger("signInTest4");//passs method name as parameter
		
		signIn.clickSignInlink();
		genericMethods.explicitlyWaitFor(signIn.LoginButton);	
		signIn.enterRegisteredEmail(repository.getProperty("username"));
		signIn.enterPassword(repository.getProperty("password"));
		signIn.clickSubmit();
		genericMethods.explicitlyWaitFor(MyAccount.myaccounttext);
		
		String title=driver.findElement(MyAccount.myaccounttext).getText();		
		Assert.assertTrue(title.contains("Welcome2"));				
		ExtentReportsLogs.logger.log(LogStatus.PASS, "successfully signed in");		
	
		
	}
	
	@Test(retryAnalyzer=RerunFailedTests.class)
	public void signIn5() throws InterruptedException{
		
		extentreportlogs.initializeLogger("signInTest5");//passs method name as parameter
		
		signIn.clickSignInlink();
		genericMethods.explicitlyWaitFor(signIn.LoginButton);	
		signIn.enterRegisteredEmail(repository.getProperty("username"));
		signIn.enterPassword(repository.getProperty("password"));
		signIn.clickSubmit();
		genericMethods.explicitlyWaitFor(MyAccount.myaccounttext);
		
		String title=driver.findElement(MyAccount.myaccounttext).getText();		
		Assert.assertTrue(title.contains("Welcome2"));				
		ExtentReportsLogs.logger.log(LogStatus.PASS, "successfully signed in");		
	
		
	}
	
	@Test(retryAnalyzer=RerunFailedTests.class)
	public void signIn6() throws InterruptedException{
		
		extentreportlogs.initializeLogger("signInTest6");//passs method name as parameter
		
		signIn.clickSignInlink();
		genericMethods.explicitlyWaitFor(signIn.LoginButton);	
		signIn.enterRegisteredEmail(repository.getProperty("username"));
		signIn.enterPassword(repository.getProperty("password"));
		signIn.clickSubmit();
		genericMethods.explicitlyWaitFor(MyAccount.myaccounttext);
		
       String title=driver.findElement(MyAccount.myaccounttext).getText();
		
		Assert.assertTrue(title.contains("Welcome2"));				
		ExtentReportsLogs.logger.log(LogStatus.PASS, "successfully signed in");		
	
		
		
	}
	
	@Test(retryAnalyzer=RerunFailedTests.class)
	public void signIn7() throws InterruptedException{
		
		extentreportlogs.initializeLogger("signInTest7");//passs method name as parameter
		
		signIn.clickSignInlink();
		genericMethods.explicitlyWaitFor(signIn.LoginButton);	
		signIn.enterRegisteredEmail(repository.getProperty("username"));
		signIn.enterPassword(repository.getProperty("password"));
		signIn.clickSubmit();
		genericMethods.explicitlyWaitFor(MyAccount.myaccounttext);
		
		
		 String title=driver.findElement(MyAccount.myaccounttext).getText();
			
			Assert.assertTrue(title.contains("Welcome2"));				
			ExtentReportsLogs.logger.log(LogStatus.PASS, "successfully signed in");		
		
	}*/
	
	/*@Test
	public void signIn8() throws InterruptedException{
		
		extentreportlogs.initializeLogger("signInTest8");//passs method name as parameter
		
		signIn.clickSignInlink();
		genericMethods.explicitlyWaitFor(signIn.LoginButton);	
		signIn.enterRegisteredEmail(repository.getProperty("username"));
		signIn.enterPassword(repository.getProperty("password"));
		signIn.clickSubmit();
		genericMethods.explicitlyWaitFor(MyAccount.myaccounttext);
		
		
		String title=driver.findElement(MyAccount.myaccounttext).getText();
		if(title.contains("Welcome"))			
			ExtentReportsLogs.logger.log(LogStatus.PASS, "successfully signed in");		
		else		
			ExtentReportsLogs.logger.log(LogStatus.FAIL, "signed in failed");
		
	}
	
	@Test
	public void signIn9() throws InterruptedException{
		
		extentreportlogs.initializeLogger("signInTest9");//passs method name as parameter
		
		signIn.clickSignInlink();
		genericMethods.explicitlyWaitFor(signIn.LoginButton);	
		signIn.enterRegisteredEmail(repository.getProperty("username"));
		signIn.enterPassword(repository.getProperty("password"));
		signIn.clickSubmit();
		genericMethods.explicitlyWaitFor(MyAccount.myaccounttext);
		
		
		String title=driver.findElement(MyAccount.myaccounttext).getText();
		if(title.contains("Welcome"))			
			ExtentReportsLogs.logger.log(LogStatus.PASS, "successfully signed in");		
		else		
			ExtentReportsLogs.logger.log(LogStatus.FAIL, "signed in failed");
		
	}
	
	@Test
	public void signIn10() throws InterruptedException{
		
		extentreportlogs.initializeLogger("signInTest10");//passs method name as parameter
		
		signIn.clickSignInlink();
		genericMethods.explicitlyWaitFor(signIn.LoginButton);	
		signIn.enterRegisteredEmail(repository.getProperty("username"));
		signIn.enterPassword(repository.getProperty("password"));
		signIn.clickSubmit();
		genericMethods.explicitlyWaitFor(MyAccount.myaccounttext);
		
		
		String title=driver.findElement(MyAccount.myaccounttext).getText();
		if(title.contains("Welcome"))			
			ExtentReportsLogs.logger.log(LogStatus.PASS, "successfully signed in");		
		else		
			ExtentReportsLogs.logger.log(LogStatus.FAIL, "signed in failed");
		
	}
	
	@Test
	public void signIn11() throws InterruptedException{
		
		extentreportlogs.initializeLogger("signInTest11");//passs method name as parameter
		
		signIn.clickSignInlink();
		genericMethods.explicitlyWaitFor(signIn.LoginButton);	
		signIn.enterRegisteredEmail(repository.getProperty("username"));
		signIn.enterPassword(repository.getProperty("password"));
		signIn.clickSubmit();
		genericMethods.explicitlyWaitFor(MyAccount.myaccounttext);
		
		
		String title=driver.findElement(MyAccount.myaccounttext).getText();
		if(title.contains("Welcome"))			
			ExtentReportsLogs.logger.log(LogStatus.PASS, "successfully signed in");		
		else		
			ExtentReportsLogs.logger.log(LogStatus.FAIL, "signed in failed");
		
	}
	
	@Test
	public void signIn12() throws InterruptedException{
		
		extentreportlogs.initializeLogger("signInTest12");//passs method name as parameter
		
		signIn.clickSignInlink();
		genericMethods.explicitlyWaitFor(signIn.LoginButton);	
		signIn.enterRegisteredEmail(repository.getProperty("username"));
		signIn.enterPassword(repository.getProperty("password"));
		signIn.clickSubmit();
		genericMethods.explicitlyWaitFor(MyAccount.myaccounttext);
		
		
		String title=driver.findElement(MyAccount.myaccounttext).getText();
		if(title.contains("Welcome"))			
			ExtentReportsLogs.logger.log(LogStatus.PASS, "successfully signed in");		
		else		
			ExtentReportsLogs.logger.log(LogStatus.FAIL, "signed in failed");
		
	}
	
	@Test
	public void signIn13() throws InterruptedException{
		
		extentreportlogs.initializeLogger("signInTest13");//passs method name as parameter
		
		signIn.clickSignInlink();
		genericMethods.explicitlyWaitFor(signIn.LoginButton);	
		signIn.enterRegisteredEmail(repository.getProperty("username"));
		signIn.enterPassword(repository.getProperty("password"));
		signIn.clickSubmit();
		genericMethods.explicitlyWaitFor(MyAccount.myaccounttext);
		
		
		String title=driver.findElement(MyAccount.myaccounttext).getText();
		if(title.contains("Welcome"))			
			ExtentReportsLogs.logger.log(LogStatus.PASS, "successfully signed in");		
		else		
			ExtentReportsLogs.logger.log(LogStatus.FAIL, "signed in failed");
		
	}
	
	@Test
	public void signIn14() throws InterruptedException{
		
		extentreportlogs.initializeLogger("signInTest14");//passs method name as parameter
		
		signIn.clickSignInlink();
		genericMethods.explicitlyWaitFor(signIn.LoginButton);	
		signIn.enterRegisteredEmail(repository.getProperty("username"));
		signIn.enterPassword(repository.getProperty("password"));
		signIn.clickSubmit();
		genericMethods.explicitlyWaitFor(MyAccount.myaccounttext);
		
		
		String title=driver.findElement(MyAccount.myaccounttext).getText();
		if(title.contains("Welcome"))			
			ExtentReportsLogs.logger.log(LogStatus.PASS, "successfully signed in");		
		else		
			ExtentReportsLogs.logger.log(LogStatus.FAIL, "signed in failed");
		
	}
	
	@Test
	public void signIn15() throws InterruptedException{
		
		extentreportlogs.initializeLogger("signInTest15");//passs method name as parameter
		
		signIn.clickSignInlink();
		genericMethods.explicitlyWaitFor(signIn.LoginButton);	
		signIn.enterRegisteredEmail(repository.getProperty("username"));
		signIn.enterPassword(repository.getProperty("password"));
		signIn.clickSubmit();
		genericMethods.explicitlyWaitFor(MyAccount.myaccounttext);
		
		
		String title=driver.findElement(MyAccount.myaccounttext).getText();
		if(title.contains("Welcome"))			
			ExtentReportsLogs.logger.log(LogStatus.PASS, "successfully signed in");		
		else		
			ExtentReportsLogs.logger.log(LogStatus.FAIL, "signed in failed");
		
	}
	
	@Test
	public void signIn16() throws InterruptedException{
		
		extentreportlogs.initializeLogger("signInTest16");//passs method name as parameter
		
		signIn.clickSignInlink();
		genericMethods.explicitlyWaitFor(signIn.LoginButton);	
		signIn.enterRegisteredEmail(repository.getProperty("username"));
		signIn.enterPassword(repository.getProperty("password"));
		signIn.clickSubmit();
		genericMethods.explicitlyWaitFor(MyAccount.myaccounttext);
		
		
		String title=driver.findElement(MyAccount.myaccounttext).getText();
		if(title.contains("Welcome"))			
			ExtentReportsLogs.logger.log(LogStatus.PASS, "successfully signed in");		
		else		
			ExtentReportsLogs.logger.log(LogStatus.FAIL, "signed in failed");
		
	}
	
	@Test
	public void signIn17() throws InterruptedException{
		
		extentreportlogs.initializeLogger("signInTest17");//passs method name as parameter
		
		signIn.clickSignInlink();
		genericMethods.explicitlyWaitFor(signIn.LoginButton);	
		signIn.enterRegisteredEmail(repository.getProperty("username"));
		signIn.enterPassword(repository.getProperty("password"));
		signIn.clickSubmit();
		genericMethods.explicitlyWaitFor(MyAccount.myaccounttext);
		
		
		String title=driver.findElement(MyAccount.myaccounttext).getText();
		if(title.contains("Welcome"))			
			ExtentReportsLogs.logger.log(LogStatus.PASS, "successfully signed in");		
		else		
			ExtentReportsLogs.logger.log(LogStatus.FAIL, "signed in failed");
		
	}
	
	@Test
	public void signIn18() throws InterruptedException{
		
		extentreportlogs.initializeLogger("signInTest18");//passs method name as parameter
		
		signIn.clickSignInlink();
		genericMethods.explicitlyWaitFor(signIn.LoginButton);	
		signIn.enterRegisteredEmail(repository.getProperty("username"));
		signIn.enterPassword(repository.getProperty("password"));
		signIn.clickSubmit();
		genericMethods.explicitlyWaitFor(MyAccount.myaccounttext);
		
		
		String title=driver.findElement(MyAccount.myaccounttext).getText();
		if(title.contains("Welcome"))			
			ExtentReportsLogs.logger.log(LogStatus.PASS, "successfully signed in");		
		else		
			ExtentReportsLogs.logger.log(LogStatus.FAIL, "signed in failed");
		
	}
	
	@Test
	public void signIn19() throws InterruptedException{
		
		extentreportlogs.initializeLogger("signInTest19");//passs method name as parameter
		
		signIn.clickSignInlink();
		genericMethods.explicitlyWaitFor(signIn.LoginButton);	
		signIn.enterRegisteredEmail(repository.getProperty("username"));
		signIn.enterPassword(repository.getProperty("password"));
		signIn.clickSubmit();
		genericMethods.explicitlyWaitFor(MyAccount.myaccounttext);
		
		
		String title=driver.findElement(MyAccount.myaccounttext).getText();
		if(title.contains("Welcome"))			
			ExtentReportsLogs.logger.log(LogStatus.PASS, "successfully signed in");		
		else		
			ExtentReportsLogs.logger.log(LogStatus.FAIL, "signed in failed");
		
	}
	
	@Test
	public void signIn20() throws InterruptedException{
		
		extentreportlogs.initializeLogger("signInTest20");//passs method name as parameter
		
		signIn.clickSignInlink();
		genericMethods.explicitlyWaitFor(signIn.LoginButton);	
		signIn.enterRegisteredEmail(repository.getProperty("username"));
		signIn.enterPassword(repository.getProperty("password"));
		signIn.clickSubmit();
		genericMethods.explicitlyWaitFor(MyAccount.myaccounttext);
		
		
		String title=driver.findElement(MyAccount.myaccounttext).getText();
		if(title.contains("Welcome"))			
			ExtentReportsLogs.logger.log(LogStatus.PASS, "successfully signed in");		
		else		
			ExtentReportsLogs.logger.log(LogStatus.FAIL, "signed in failed");
		
	}
	
	@Test
	public void signIn21() throws InterruptedException{
		
		extentreportlogs.initializeLogger("signInTest21");//passs method name as parameter
		
		signIn.clickSignInlink();
		genericMethods.explicitlyWaitFor(signIn.LoginButton);	
		signIn.enterRegisteredEmail(repository.getProperty("username"));
		signIn.enterPassword(repository.getProperty("password"));
		signIn.clickSubmit();
		genericMethods.explicitlyWaitFor(MyAccount.myaccounttext);
		
		
		String title=driver.findElement(MyAccount.myaccounttext).getText();
		if(title.contains("Welcome"))			
			ExtentReportsLogs.logger.log(LogStatus.PASS, "successfully signed in");		
		else		
			ExtentReportsLogs.logger.log(LogStatus.FAIL, "signed in failed");
		
	}
	
	@Test
	public void signIn22() throws InterruptedException{
		
		extentreportlogs.initializeLogger("signInTest22");//passs method name as parameter
		
		signIn.clickSignInlink();
		genericMethods.explicitlyWaitFor(signIn.LoginButton);	
		signIn.enterRegisteredEmail(repository.getProperty("username"));
		signIn.enterPassword(repository.getProperty("password"));
		signIn.clickSubmit();
		genericMethods.explicitlyWaitFor(MyAccount.myaccounttext);
		
		
		String title=driver.findElement(MyAccount.myaccounttext).getText();
		if(title.contains("Welcome"))			
			ExtentReportsLogs.logger.log(LogStatus.PASS, "successfully signed in");		
		else		
			ExtentReportsLogs.logger.log(LogStatus.FAIL, "signed in failed");
		
	}
	
	@Test
	public void signIn23() throws InterruptedException{
		
		extentreportlogs.initializeLogger("signInTest23");//passs method name as parameter
		
		signIn.clickSignInlink();
		genericMethods.explicitlyWaitFor(signIn.LoginButton);	
		signIn.enterRegisteredEmail(repository.getProperty("username"));
		signIn.enterPassword(repository.getProperty("password"));
		signIn.clickSubmit();
		genericMethods.explicitlyWaitFor(MyAccount.myaccounttext);
		
		
		String title=driver.findElement(MyAccount.myaccounttext).getText();
		if(title.contains("Welcome"))			
			ExtentReportsLogs.logger.log(LogStatus.PASS, "successfully signed in");		
		else		
			ExtentReportsLogs.logger.log(LogStatus.FAIL, "signed in failed");
		
	}
	
	@Test
	public void signIn24() throws InterruptedException{
		
		extentreportlogs.initializeLogger("signInTest24");//passs method name as parameter
		
		signIn.clickSignInlink();
		genericMethods.explicitlyWaitFor(signIn.LoginButton);	
		signIn.enterRegisteredEmail(repository.getProperty("username"));
		signIn.enterPassword(repository.getProperty("password"));
		signIn.clickSubmit();
		genericMethods.explicitlyWaitFor(MyAccount.myaccounttext);
		
		
		String title=driver.findElement(MyAccount.myaccounttext).getText();
		if(title.contains("Welcome2"))			
			ExtentReportsLogs.logger.log(LogStatus.PASS, "successfully signed in");		
		else		
			ExtentReportsLogs.logger.log(LogStatus.FAIL, "signed in failed");
		
	}
	@Test
	public void signIn25() throws InterruptedException{
		
		extentreportlogs.initializeLogger("signInTest25");//passs method name as parameter
		
		signIn.clickSignInlink();
		genericMethods.explicitlyWaitFor(signIn.LoginButton);	
		signIn.enterRegisteredEmail(repository.getProperty("username"));
		signIn.enterPassword(repository.getProperty("password"));
		signIn.clickSubmit();
		genericMethods.explicitlyWaitFor(MyAccount.myaccounttext);
		
		
		String title=driver.findElement(MyAccount.myaccounttext).getText();
		if(title.contains("Welcome2"))			
			ExtentReportsLogs.logger.log(LogStatus.PASS, "successfully signed in");		
		else		
			ExtentReportsLogs.logger.log(LogStatus.FAIL, "signed in failed");
		
		
		
	}*/
	
}
