package com.task.selenium;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScrShot {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sankar\\eclipse-workspace\\SeleniumOct10\\driver\\chromedriver 2.exe");
	
		WebDriver driver= new ChromeDriver();	
		driver.get("https://www.facebook.com/login/");
		Thread.sleep(4000);
		
        driver.findElement(By.id("email")).sendKeys("vijayasankar21@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("sankar");
		driver.findElement(By.id("loginbutton")).click();
		Thread.sleep(3000);	
		driver.navigate().back();
		driver.findElement(By.xpath("//a[contains(text(),'Sign up')]")).click();
		
		
		driver.findElement(By.name("firstname")).sendKeys("vijayasankar");
		driver.findElement(By.name("lastname")).sendKeys("P");
		driver.findElement(By.name("reg_email__")).sendKeys("vijayasankar@gmail.com");
		driver.findElement(By.xpath("//input[@value='2']")).click();
		Thread.sleep(3000);
		
		TakesScreenshot scr1=(TakesScreenshot)driver;
		File c=scr1.getScreenshotAs(OutputType.FILE);
		
		File d=new File("C:\\Users\\sankar\\eclipse-workspace\\SeleniumOct10\\screenshot//fb.png");
		
		FileHandler.copy(c, d);
		
		
		
		
		
		
		
	}

}
