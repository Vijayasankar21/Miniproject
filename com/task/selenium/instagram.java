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

public class instagram {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sankar\\eclipse-workspace\\SeleniumOct10\\driver\\chromedriver 2.exe" );

       WebDriver driver=new ChromeDriver();		
		driver.get("https://www.instagram.com/");
		Thread.sleep(3000);
		WebElement header = driver.findElement(By.xpath("/html/body/div/section/main/article/div[2]/div/div/form/div/div/div/label/input"));
		header.sendKeys("vijayasankar@gmail.com");
		String insta = header.getAttribute("value");
		System.out.println(insta);
		WebElement name = driver.findElement(By.xpath("/html/body/div/section/main/article/div[2]/div/div/form/div/div/div/label/input"));
		name.sendKeys("vijayasankar@gmail.com");
		String c = name.getAttribute("value");
		System.out.println(c);
		WebElement pass = driver.findElement(By.xpath("/html/body/div/section/main/article/div[2]/div/div/form/div/div[2]/div/label/input"));
		pass.sendKeys("sankar");
		String d = pass.getText();
		System.out.println(d);
		driver.findElement(By.xpath("/html/body/div/section/main/article/div[2]/div/div/form/div/div[3]/button")).click();
		 
		TakesScreenshot scr=(TakesScreenshot)driver;
		File a = scr.getScreenshotAs(OutputType.FILE);
		File b=new File("C:\\Users\\sankar\\eclipse-workspace\\SeleniumOct10\\screenshot\\insta2.png");
		
		FileHandler.copy(a, b);
		
		
		
		
		
		
		
		
		
		
		
	}

}
