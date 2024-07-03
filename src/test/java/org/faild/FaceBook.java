package org.faild;

import java.util.Date;
import java.util.Set;

import org.base.BaseClass;
import org.facebookloginpojo.CreateAccountFB;
import org.facebookloginpojo.LoginPojo;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.IRetryAnalyzer;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;
@Listeners(WithOutKnown.class)
public class FaceBook extends BaseClass {
	
	@BeforeClass(groups="smoke")
	private void browserOpen() {
//		WebDriverManager.chromedriver().setup();
//		driver=new ChromeDriver();
		launchBrowser("ch");
	
		maxmizewindow();
		

	}
	@BeforeMethod
	private void LauncTime() {
	Date date = date();
	//System.out.println("Launch Time-------------> "+date);

	}
	//@Test(priority=1,groups= {"smoke","sanity"},retryAnalyzer=WithKnown.class)
	@Test(priority=1,groups= {"smoke","sanity"})
	private void tsetLogin() {
		System.out.println("1 of 1-----> "+Thread.currentThread().getId());
		//SoftAssert s=new SoftAssert();
		launchUrl("https://www.facebook.com/");
		LoginPojo l=new LoginPojo();
		sendkey(l.getGetusername(), "vishnunath");
		String att = AttributeValue(l.getGetusername());
		Assert.assertEquals("vishnunat", att,"faile assert");
		
		sendkey(l.getGetpassword(), "554489621");
		clickButton(l.getClicklogin());
		
	//	s.assertAll();

	}
	@Test(priority=2,groups="smoke")
	private void CreatenewAccount() throws InterruptedException {
	//	System.out.println("1 of 2-----> "+Thread.currentThread().getId());
		launchUrl("https://www.facebook.com/");
		CreateAccountFB c=new CreateAccountFB();
		clickButton(c.getClickcreate());
		
		Thread.sleep(5000);
		sendkey(c.getmobileno(), "9944077673");	
		
		sendkey(c.getnewpassword(), "vishnu");
		sendkey(c.getFirstname(), "akhila");
		sendkey(c.getLastname(), "naren");
		
		
		
	}
	
	@AfterMethod
	
	private void browserClosingTime() {
		Date date = date();
		System.out.println("each test ends time" +date);

	}
	
	@AfterClass
	private void ccloseBrowser() {
		
		
		
	}
	
		
		

	}
	


