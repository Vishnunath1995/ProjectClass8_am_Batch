package org.facebook;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.base.BaseClass;
import org.bouncycastle.oer.its.ieee1609dot2.VerificationKeyIndicator;
import org.facebookloginpojo.LoginpojoFlipkart;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class FlipKart extends BaseClass {
	
	@Test
	private void filpKart() throws AWTException, InterruptedException {
		launchBrowser("edge");
		launchUrl("https://www.flipkart.com/");
		LoginpojoFlipkart l=new LoginpojoFlipkart();
	driver.findElement(By.xpath("//input[@class='Pke_EE']")).sendKeys("iphone",Keys.ENTER);
	
	
	WebElement iphone = driver.findElement(By.xpath("//div[contains(text(),'Apple iPhone 14 Plus (Starlight, 128 GB)')]"));
	
iphone.click();

String parentid = driver.getWindowHandle();

System.out.println("parent id "+parentid);

Set<String> allid = driver.getWindowHandles();
 System.out.println("print all id "+allid);

for(String eachid:allid)
if(!parentid.equals(eachid))
{
	driver.switchTo().window(eachid);
	
}
Thread.sleep(5000);
WebElement findElement = driver.findElement(By.xpath("//button[@class='QqFHMw vslbG+ In9uk2']"));
findElement.click();

List<String>a=new ArrayList<String>();
 a.addAll(allid);

String li = a.get(1);
driver.switchTo().window(li);




//String parentid1 = driver.getWindowHandle();
//
//Set<String> allid1 = driver.getWindowHandles();
//
//
//int count=1;
//for(String eachid1:allid1)
//	if(count==3)
//{
//	driver.switchTo().window(eachid1);
//	count++;
//}
Thread.sleep(5000);
driver.findElement(By.xpath("//a[text()='Contact Us']")).click();


	
	

	

	}
	

}
