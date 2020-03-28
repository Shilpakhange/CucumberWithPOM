package com.qa.crm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.crm.base.Testbase;

public class Homepage extends Testbase {

	@FindBy(xpath = "//td[contains(text(),'User: shilpa khandge')]")
	WebElement userdisplay;

	@FindBy(xpath = "//a[contains(text(),'Contacts')]")
	WebElement contactsLink;

	@FindBy(xpath = "//a[contains(text(),'Deals')]")
	WebElement dealsLink;

	@FindBy(xpath = "//form//td[3]//div[1]//input[1]")
	WebElement searchbtn;

	@FindBy(xpath = "//a[contains(text(),'New Contact')]")
	WebElement newcontact;

	public Homepage() {
		PageFactory.initElements(driver, this);
	}

	public String correctTitledisplay() {
		String title = driver.getTitle();
		return title;
	}

	public boolean correctuserdisplay() {
		driver.switchTo().frame("mainpanel");
		boolean flag = userdisplay.isDisplayed();
		return flag;
	}

	public boolean contactsTabdisplay() {
		boolean flag = contactsLink.isDisplayed();
		return flag;
	}

	public boolean dealsTabdisplay() {
		boolean flag = dealsLink.isDisplayed();
		return flag;
	}

}
