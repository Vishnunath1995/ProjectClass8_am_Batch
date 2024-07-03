package org.facebookloginpojo;

import javax.xml.xpath.XPath;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class LoginPojo extends BaseClass {
	
	public LoginPojo() {
		PageFactory.initElements(driver,this);
	}
	@FindBy(id="email")
	WebElement getusername;
public WebElement getGetusername() {
		return getusername;
	}
	public WebElement getClicklogin() {
		return clicklogin;
	}
		@FindBys({@FindBy(xpath="//input[@type='password']"),@FindBy(xpath="//input[@id='pass']")})
	WebElement getpassword;
public WebElement getGetpassword() {
			return getpassword;
		}
	//	@FindAll({@FindBy(xpath="//input[@type='password']"),@FindBy(id="passs")})
	@FindBy(xpath="//button[@name='login']")
	WebElement clicklogin;
	

}
