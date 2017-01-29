package com.XYZcompany.ecommerce.pagelibrary;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.XYZcompany.ecommerce.testbase.Testbase;

public class MyAccount extends Testbase{
	
	
	public MyAccount(WebDriver driver){
		this.driver=driver;
	}
	
	
	public static By myaccounttext=By.xpath("//p[contains(text(),'Welcome to your')]");

}
