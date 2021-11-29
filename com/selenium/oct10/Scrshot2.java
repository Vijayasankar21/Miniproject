package com.selenium.oct10;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Scrshot2 {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sankar\\eclipse-workspace\\SeleniumOct10\\driver\\chromedriver.exe");
       WebDriver driver=new ChromeDriver();
       
       driver.get("https://www.instagram.com/");
       driver.findElement(By.name("username")).sendKeys("vijayasankar@gmail.com");
       driver.findElement(By.name("password")).sendKeys("sankar");
       
       TakesScreenshot scr=(TakesScreenshot)driver;
       File a = scr.getScreenshotAs(OutputType.FILE);
       
       File b=new File("C:\\Users\\sankar\\eclipse-workspace\\SeleniumOct10\\screenshot\\insta.png");
       
       FileHandler.copy(a, b);
       
	}

}
