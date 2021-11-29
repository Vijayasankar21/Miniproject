package com.task.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sankar\\eclipse-workspace\\SeleniumOct10\\driver\\chromedriver 2.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://practice.automationtesting.in/");
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div/div[2]/div/div/div/div/div[2]/div[2]/div/div/ul/li/a[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div/div[2]/div/div/div/div/div[2]/div[3]/div/div/ul/li/a[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div/div[2]/div/div/div/div/div[2]/div[3]/div/div/ul/li/a[3]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[1]/div/div/div/a")).click();
		Thread.sleep(3000);
		
		WebElement state = driver.findElement(By.xpath("//select[@title='State / County *']"));
		Select s=new Select(state);
		s.selectByValue("TN");
		
		
		
		
		
		
		
		
		
		
		
	}

}
