package com.task.selenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Xpathtask {


	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sankar\\eclipse-workspace\\SeleniumOct10\\driver\\chromedriver 2.exe");
         
		WebDriver driver=new ChromeDriver();
		
	driver.get("https://www.facebook.com/login/");	
	
	WebElement login = driver.findElement(By.xpath("//div[contains(text(),'Log in to Facebook')]"));
	String b = login.getText();	
	System.out.println(b);	
WebElement signup = driver.findElement(By.xpath("//a[contains(text(),'Sign up')]"));		
		String c = signup.getText();
		System.out.println(c);
	driver.findElement(By.xpath("//a[contains(text(),'Sign up')]")).click();
	
	WebElement newpage = driver.findElement(By.xpath("//div[contains(text(),'Create a new account')]"));
	String d = newpage.getText();	
	System.out.println(d);
	
	WebElement head = driver.findElement(By.xpath("//div[contains(text(),'It')]"));
	String e = head.getText();	
	System.out.println(e);
	
	driver.findElement(By.name("firstname")).sendKeys("vijayasankar");	
	driver.findElement(By.name("lastname")).sendKeys("P");	
	driver.findElement(By.name("reg_email__")).sendKeys("vijayasankar@gmail.com");	
	driver.findElement(By.name("websubmit")).click();
	
	TakesScreenshot t=(TakesScreenshot)driver;
		File scr = t.getScreenshotAs(OutputType.FILE);
		File scrshot=new File("C:\\Users\\sankar\\eclipse-workspace\\SeleniumOct10\\screenshot\\fb5.png");
		FileHandler.copy(scr, scrshot);
}
}
