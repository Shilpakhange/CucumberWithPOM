package com.qa.crm.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.crm.base.Testbase;

public class Loginpage extends Testbase{

	@FindBy(name="username") WebElement uname;
	@FindBy(name="password") WebElement pword;
	@FindBy(xpath="//input[@type='submit']")WebElement loginbtn;
	
	void Loginpage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public Homepage verifyloginfunctionlity(String un,String pwd)
	{
		//username.sendKeys(prop.getProperty("username"));
		//password.sendKeys(prop.getProperty("password"));
		uname.sendKeys(un);
		pword.sendKeys(pwd);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", loginbtn);
		
		return new Homepage();
	}
}
