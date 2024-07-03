package org.facebookloginpojo;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class LoginpojoFlipkart extends BaseClass {

	public LoginpojoFlipkart()  {
		PageFactory.initElements(driver, this);
	}
	
	@FindBys({@FindBy(xpath="//input[@class='Pke_EE']")})
	WebElement searchitem;

	public WebElement getSearchitem() {
		return searchitem;
	}
	
}
