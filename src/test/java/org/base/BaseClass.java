package org.base;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.bouncycastle.cert.path.validations.ParentCertIssuedValidation;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	public static void launchUrl(String url) {
		driver.get(url);
		

	}
	public static void launchBrowser(String Browser)
	{
		if(Browser.equals("ch"))
		{
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		else
		{
			if(Browser.equals("edge"))
			{
				WebDriverManager.edgedriver().setup();
				driver=new EdgeDriver();
			}
		}
		
	}
	
	public static void screenshot(String name) throws IOException {
		TakesScreenshot tk=(TakesScreenshot) driver;
		File src = tk.getScreenshotAs(OutputType.FILE);
		File dec=new File("D:\\New folder\\Z\\myscreenshoot\\"+name+".png");
		FileUtils.copyFile(src, dec);
		

	}
	
	public static void maxmizewindow() {
		driver.manage().window().maximize();
		

	}
	public static String AttributeValue(WebElement e) {
		String attribute = e.getAttribute("value");
		return attribute;
		

	}
	public static String gettext(WebElement e) {
		String text = e.getText();
		return text;

	}
	
public static void wiatt() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

public static Date date() {
	Date d=new Date();
	return d;

}
public static void sendkey(WebElement e,String value) {
	
e.sendKeys(value);
}
	public static void closeBrowser() {
		driver.close();

	}
	public static void quitebrowser() {
		driver.quit();

	}
	
	public static void clickButton(WebElement e) {
		
e.click();
	}
	
	public static String pagesource() {
		String pageSource = driver.getPageSource();
		return pageSource;

	}
	
	public static String currenturl() {
		String currentUrl = driver.getCurrentUrl();
		return currentUrl;

	}
	
	public static void navigateBack() {
		driver.navigate().back();

	}
	public static void refresh() {
		driver.navigate().refresh();

	}
	
	public static void navigateForward() {
	driver.navigate().forward();

	}
	
	public static String windowHandle() {
		String parentid = driver.getWindowHandle();
		return parentid;

	}
	
	public static String windowhandls(String parentid,String p) {
		Set<String> allid = driver.getWindowHandles();
		for(String eachid:allid)
			if(!parentid.equals(eachid))
			{
				driver.switchTo().window(eachid);
			}
		return p;
		
	

	}
	
	
	
	
	

}
