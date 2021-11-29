package com.task.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrshot3 {

	public static void main(String[] args) throws Throwable {
    System.setProperty("webdriver.chrome.driver",
    		"C:\\Users\\sankar\\eclipse-workspace\\SeleniumOct10\\driver\\chromedriver.exe");

    WebDriver driver=new ChromeDriver();
    driver.get("https://demoqa.com/automation-practice-form");
    driver.findElement(By.id("firstName")).sendKeys("vijayasankar");
    driver.findElement(By.id("lastName")).sendKeys("P");
    driver.findElement(By.id("userEmail")).sendKeys("vijayasankar@gmail.com");
    Thread.sleep(3000);
    driver.findElement(By.id("gender-radio-1")).click();
    
    
    
	}

}
