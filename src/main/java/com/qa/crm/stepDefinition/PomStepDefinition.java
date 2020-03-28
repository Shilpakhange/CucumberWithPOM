package com.qa.crm.stepDefinition;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.openqa.selenium.support.PageFactory;

import com.qa.crm.base.Testbase;
import com.qa.crm.pages.Homepage;
import com.qa.crm.pages.Loginpage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PomStepDefinition extends Testbase {
	
	//Loginpage loginpage;
	Homepage homepage=new Homepage();

	@Given("^user opens the application$")
	public void user_opens_the_application() throws Throwable {
		initialization();
	}

	@When("^user enters username and password$")
	public void user_enters_username_and_password() throws Throwable {
		
		Loginpage loginpage=PageFactory.initElements(driver, Loginpage.class);//Here we need to use initElemnets method otherwise we will get null pointer exceptions.
		//Loginpage loginpage=new Loginpage();

		homepage=loginpage.verifyloginfunctionlity(prop.getProperty("username"),prop.getProperty("password"));
	}

	@Then("^user is on homepage$")
	public void user_is_on_homepage() throws Throwable {
		String title=homepage.correctTitledisplay();
		assertEquals("CRMPRO", title);
		System.out.println("User is on homepage");
	}
	
@Then("^user verifies correctuser is displayed$")
	public void user_verifies_correctuser_is_displayed() throws Throwable {
	//Homepage homepage=PageFactory.initElements(driver, Homepage.class);
		boolean b=homepage.correctuserdisplay();
		assertTrue("incorrect user", b);
			}

	@Then("^user verifies the contacts tab$")
	public void user_verifies_the_contacts_tab() throws Throwable {
		boolean tab1=homepage.contactsTabdisplay();
	assertTrue(tab1);
	if(tab1==true)
	{
		System.out.println("contacts tab displayed");
	}
	}

	@Then("^user verifies the deals tab$")
	public void user_verifies_the_deals_tab() throws Throwable {
		
		boolean tab2=homepage.dealsTabdisplay();
		if(tab2==true)
		{
			System.out.println("deals tab displayed");
			
		}
		
	}
	
	@Then("^close the browser$")
	public void close_the_browser() throws Throwable {
		driver.quit();
	}



}
