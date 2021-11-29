package com.task.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElements {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sankar\\eclipse-workspace\\SeleniumOct10\\driver\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/automation-practice-form");
		WebElement fname=driver.findElement(By.id("firstName"));
		String at = fname.getAttribute("placeholder");
		System.out.println(at);
		fname.sendKeys("vijayasankar");
		String att = fname.getAttribute("value");
		System.out.println(att);
		boolean a = fname.isDisplayed();
		System.out.println(a);
		
		WebElement lname=driver.findElement(By.id("lastName"));
		lname.sendKeys("P");
		WebElement email = driver.findElement(By.id("userEmail"));
		email.sendKeys("pvijayasankar21@gmail.com");
		
		WebElement gender = driver.findElement(By.id("gender-radio-1"));
		String b = gender.getAttribute("name");
		System.out.println(b);
		gender.click();
	
		
		
		
		
		
	}

}
