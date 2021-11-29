package com.task.selenium;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class automation {

	public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\sankar\\eclipse-workspace\\SeleniumOct10\\driver\\chromedriver 2.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://demo.automationtesting.in/Register.html");
	Thread.sleep(3000);
	WebElement skill = driver.findElement(By.xpath("//*[@id=\"Skills\"]"));
	Select skills=new Select(skill);
	skills.selectByVisibleText("Java");
	skills.selectByValue("Software");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"msdd\"]")).click();
    driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[7]/div/multi-select/div[2]/ul/li[8]")).click();
    driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[7]/div/multi-select/div[2]/ul/li[1]/a")).click();
	driver.findElement(By.id("checkbox1")).click();
	driver.findElement(By.id("checkbox2")).click();
	driver.findElement(By.id("checkbox3")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[5]/div/label[1]/input")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[10]/div/span/span[1]/span")).click();
	driver.findElement(By.xpath("//*[@id=\"select2-country-results\"]/li[6]")).click();
	WebElement year = driver.findElement(By.xpath("//*[@id=\"yearbox\"]"));
	Select years=new Select(year);
	years.selectByValue("1999");
	WebElement month = driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[11]/div[2]/select"));
    Select months=new Select(month);
    months.selectByValue("March");
    WebElement day = driver.findElement(By.xpath("//*[@id=\"daybox\"]"));
	Select days=new Select(day);
	days.selectByValue("21");
	driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[1]/input")).sendKeys("vijayasankar");
	driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[2]/input")).sendKeys("P");
	driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[2]/div/textarea")).sendKeys("13-7-5,valluvarnagar,chinnalapatti");
	driver.findElement(By.xpath("//*[@id=\"eid\"]/input")).sendKeys("pviajayasankar21@gmail.com");
	driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[4]/div/input")).sendKeys("9600874067");
	driver.findElement(By.xpath("//*[@id=\"firstpassword\"]")).sendKeys("Vijay@21");
	driver.findElement(By.xpath("//*[@id=\"secondpassword\"]")).sendKeys("Vijay@21");
	Thread.sleep(3000);
	TakesScreenshot scr=(TakesScreenshot)driver;
	File a = scr.getScreenshotAs(OutputType.FILE);
	File b=new File("C:\\Users\\sankar\\eclipse-workspace\\SeleniumOct10\\screenshot//register.png");
	FileHandler.copy(a, b);		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
