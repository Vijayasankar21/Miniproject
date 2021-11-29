package com.task.selenium;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.logging.FileHandler;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazontask {

public static void main(String[] args) throws Throwable {
 
System.setProperty("webdriver.chrome.driver", "C:\\Users\\sankar\\eclipse-workspace\\SeleniumOct10\\driver\\chromedriver 2.exe");
		
WebDriver driver=new ChromeDriver();
driver.get("https://www.amazon.in/");
Thread.sleep(3000);
Actions a=new Actions(driver);
WebElement fashion = driver.findElement(By.xpath("//a[text()='Fashion']"));
a.moveToElement(fashion).perform();
a.contextClick().perform();

Robot b=new Robot();
b.keyPress(KeyEvent.VK_DOWN);
b.keyRelease(KeyEvent.VK_DOWN);
b.keyPress(KeyEvent.VK_ENTER);
b.keyRelease(KeyEvent.VK_ENTER);
Thread.sleep(3000);
WebElement Elect = driver.findElement(By.xpath("//a[text()=' Electronics ']"));
a.moveToElement(Elect).contextClick().perform();

b.keyPress(KeyEvent.VK_DOWN);
b.keyRelease(KeyEvent.VK_DOWN);
b.keyPress(KeyEvent.VK_ENTER);
b.keyRelease(KeyEvent.VK_ENTER);
Thread.sleep(2000);
WebElement mobile = driver.findElement(By.xpath("//a[text()='Mobiles']"));
a.moveToElement(mobile).contextClick().perform();
b.keyPress(KeyEvent.VK_DOWN);
b.keyRelease(KeyEvent.VK_DOWN);
b.keyPress(KeyEvent.VK_ENTER);
b.keyRelease(KeyEvent.VK_ENTER);
Thread.sleep(2000);

TakesScreenshot scr=(TakesScreenshot)driver;
File f = scr.getScreenshotAs(OutputType.FILE);
File g=new File("C:\\Users\\sankar\\eclipse-workspace\\SeleniumOct10\\screenshot//amazon.png");
org.openqa.selenium.io.FileHandler.copy(f, g);


		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
