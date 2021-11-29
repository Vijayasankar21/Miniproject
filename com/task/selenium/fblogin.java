package com.task.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class fblogin {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sankar\\eclipse-workspace\\SeleniumOct10\\driver\\chromedriver 2.exe");
	
		WebDriver driver= new ChromeDriver();	
		driver.get("https://www.facebook.com/login/");
		Thread.sleep(4000);
        driver.findElement(By.xpath("//a[contains(text(),'Sign up')]")).click();
		
		
		driver.findElement(By.name("firstname")).sendKeys("vijayasankar");
		driver.findElement(By.name("lastname")).sendKeys("P");
		driver.findElement(By.name("reg_email__")).sendKeys("vijayasankar@gmail.com");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("vijayasankar21@gmail.com");
		driver.findElement(By.id("password_step_input")).sendKeys("sankar");
		driver.findElement(By.xpath("//input[@value='2']")).click();
		WebElement date = driver.findElement(By.id("day"));
		Select a= new Select(date);
		a.selectByValue("21");
		WebElement month = driver.findElement(By.id("month"));
		Select b=new Select(month);
		b.selectByIndex(2);
		WebElement year=driver.findElement(By.id("year"));
		Select c=new Select(year);
		c.selectByVisibleText("1999");
		
		List<WebElement> op = b.getOptions();
		int size = op.size();
		System.out.println(size);
		
		for (int i = 0; i <=0; i++) {
			
		 
			System.out.println(op.get(0).getText());
		
		}	
		for (int j = 11; j <=11; j++) {
			System.out.println(op.get(11).getText());
		}	
		for (int k = 0; k < size; k++) {
			System.out.println(op.get(k).getText());
		}
		
		
		
		
		
//		Thread.sleep(3000);
//		TakesScreenshot scr1=(TakesScreenshot)driver;
//		File d=scr1.getScreenshotAs(OutputType.FILE);
//		
//		File e=new File("C:\\Users\\sankar\\eclipse-workspace\\SeleniumOct10\\screenshot//fb.png");
//		
//		FileHandler.copy(d, e);
		
		
		

		
		
		
		
		
		
		


	
	}
}