package com.task.selenium;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Xpath {



public static void main(String[] args)throws Throwable {
	
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\sankar\\eclipse-workspace\\SeleniumOct10\\driver\\chromedriver 2.exe");	
	WebDriver driver=new ChromeDriver();
	driver.get("https://demoqa.com/automation-practice-form");
	WebElement header=driver.findElement(By.xpath("//div[text()='Practice Form']"));
	String title=header.getText();
	System.out.println(title);
	
	WebElement form=driver.findElement(By.xpath("//h5[text()='Student Registration Form']"));
	String title1=form.getText();
	System.out.println(title1);
	WebElement name = driver.findElement(By.id("firstName"));
	name.sendKeys("vijayasankar");
	String att = name.getAttribute("placeholder");
	System.out.println(att);
	driver.findElement(By.id("lastName")).sendKeys("P");
	
	WebElement mail = driver.findElement(By.id("userEmail"));
	String att2 = mail.getAttribute("placeholder");
	System.out.println(att2); 
	mail.sendKeys("vijayasankar@gmail.com");
	
	WebElement number = driver.findElement(By.id("userNumber"));
	String mobile = number.getAttribute("placeholder");
	System.out.println(mobile);
	number.sendKeys("9600****67");
//	  WebElement dob = driver.findElement(By.id("dateOfBirthInput"));
//	dob.sendKeys("21-03-1999");
//	driver.findElement(By.xpath("//div[@class='subjects-auto-complete__value-container subjects-auto-complete__value-container--is-multi css-1hwfws3']")).sendKeys("selenium with java");
//	driver.findElement(By.id("currentAddress")).sendKeys("chennai");
//	
//	driver.findElement(By.xpath("//div[@class=' css-1wa3eu0-placeholder'][1]")).sendKeys("Tamilnadu");
//	
	TakesScreenshot scr=(TakesScreenshot)driver;
	File scrshot = scr.getScreenshotAs(OutputType.FILE);
	
	File a=new File("C:\\Users\\sankar\\eclipse-workspace\\SeleniumOct10\\screenshot//selenium.png");
	FileHandler.copy(scrshot, a);
	
	
	
	
	
}

}
