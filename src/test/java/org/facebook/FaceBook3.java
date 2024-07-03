package org.facebook;

import java.util.Date;
import java.util.Set;

import org.base.BaseClass;
import org.facebookloginpojo.CreateAccountFB;
import org.facebookloginpojo.LoginPojo;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBook3 extends BaseClass {
	
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
	System.out.println("Launch Time-------------> "+date);

	}
	@Test(priority=1,groups= {"smoke","sanity"})
	
	private void tsetLogin() 
	{
	//	System.out.println("3 of 1-----> "+Thread.currentThread().getId());
		SoftAssert s=new SoftAssert();
		launchUrl("https://www.facebook.com/");
		LoginPojo l=new LoginPojo();
		sendkey(l.getGetusername(), "vishnunath");
		String att = AttributeValue(l.getGetusername());
		s.assertEquals("vishnunath", att,"assertfail");
		sendkey(l.getGetpassword(), "554489621");
		
		
		clickButton(l.getClicklogin());
		String crl = currenturl();
		boolean c = crl.contains("privacy_mutation_token");
		s.assertTrue(c, "verify the url");
		s.assertAll();
		

	}
	
	@Test(priority=2,dataProvider="login",dataProviderClass=DataProviderss.class,groups="smoke")
	private void CreatenewAccount(String user,String pass) throws InterruptedException {
//		System.out.println("3 of 2-----> "+Thread.currentThread().getId());
		launchUrl("https://www.facebook.com/");
		CreateAccountFB c=new CreateAccountFB();
		clickButton(c.getClickcreate());
		
		Thread.sleep(5000);
		sendkey(c.getmobileno(), "9944077673");	
		sendkey(c.getnewpassword(), "vishnu");
		sendkey(c.getFirstname(), user);
		sendkey(c.getLastname(), pass);
		

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
	


