package com.task.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementstask {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sankar\\eclipse-workspace\\SeleniumOct10\\driver\\chromedriver.exe" );

    WebDriver driver=new ChromeDriver();		
	driver.manage().window().maximize();
//	driver.get("http://demo.automationtesting.in/Register.html");
//		
//	WebElement name = driver.findElement(By.name("firstname"));	
//	name.sendKeys("vijayasankar");
	driver.get("https://www.facebook.com/");
	WebElement name=driver.findElement(By.id("email"));
	name.sendKeys("9600874067");
		
	WebElement password=driver.findElement(By.id("pass"));
	password.sendKeys("sankar");
	WebElement login=driver.findElement(By.name("login"));
	login.click();	
		
		
		
	}

}
