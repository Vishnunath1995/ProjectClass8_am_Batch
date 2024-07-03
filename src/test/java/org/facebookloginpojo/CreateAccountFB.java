package org.facebookloginpojo;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class CreateAccountFB extends BaseClass {
	public CreateAccountFB() {
		PageFactory.initElements(driver, this);
		
		
	
	}
	@FindBys({@FindBy(xpath=("//a[text()='Create new account']")),@FindBy(xpath=("(//div[@class='_6ltg'])[2]"))})
	WebElement clickcreate;
	public WebElement getClickcreate() {
		return clickcreate;
	}
	
	@FindBy(xpath=("//input[@aria-label='Mobile number or email address']"))
	WebElement mobileno;
	
	public WebElement getmobileno() {
		return mobileno;
	}
	
	public WebElement getMobileno() {
		return mobileno;
	}
	public WebElement getFirstname() {
		return firstname;
	}
	public WebElement getLastname() {
		return lastname;
	}
	public WebElement getNewpassword() {
		return newpassword;
	}
	@FindBy(xpath=("//input[@name='firstname']"))
	WebElement firstname;
	
	@FindBy(xpath=("//input[@name='lastname']"))
	WebElement lastname;

	public WebElement getnewpassword() {
		return newpassword;
	}
	@FindBy(id="password_step_input")
	WebElement newpassword;
	

	

}
