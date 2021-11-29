package com.task.selenium;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class Flipkart {

public static void main(String[] args) throws Throwable {
	
System.setProperty("webdriver.chrome.driver", "C:\\Users\\sankar\\eclipse-workspace\\SeleniumOct10\\driver\\chromedriver 2.exe");
	
WebDriver driver=new ChromeDriver();

driver.get("https://www.flipkart.com/");
Thread.sleep(3000);
String title = driver.getTitle();
System.out.println(title);
System.out.println("Url : "+driver.getCurrentUrl());

WebElement username = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input"));
username.sendKeys("9600874067");
driver.findElement(By.xpath("//input[@type='password']")).sendKeys("sankar2103");
driver.findElement(By.xpath("(//span[text()='Login'])[2]")).click();
Thread.sleep(3000);
WebElement mobile = driver.findElement(By.xpath("//div[text()='Mobiles']"));
System.out.println("Selected category :"+mobile.getText());
Actions a =new Actions(driver);	
mobile.click();	
Thread.sleep(4000);
//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
JavascriptExecutor js=(JavascriptExecutor) driver;

//WebElement realme=driver.findElement(By.xpath("//img[@alt='Shop Now']/parent::div[1]"));
//js.executeScript("arguments[0].scrollIntoView();", realme);
//a.moveToElement(realme).click().perform();
//System.out.println("Brand name :"+realme.getText());

//driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
//driver.findElement(By.xpath("//div[text()='6 GB & Above']")).click();
//Thread.sleep(4000);
driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Realme 7 pro");
driver.findElement(By.xpath("//button[@type='submit']")).click();
driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
WebElement pro7 = driver.findElement(By.xpath("(//div[text()='realme 7 Pro (Mirror Silver, 128 GB)'])[1]"));
System.out.println(pro7.getText());
pro7.click();
Thread.sleep(4000);
Set<String> window = driver.getWindowHandles();

List<String> list=new ArrayList<String>(window);
driver.switchTo().window(list.get(1));
Thread.sleep(3000);
System.out.println(driver.getTitle());
WebElement cart = driver.findElement(By.xpath("//button[text()='ADD TO CART']"));
js.executeScript("arguments[0].scrollIntoView();", cart);
cart.click();
Thread.sleep(5000);
TakesScreenshot scr=(TakesScreenshot) driver;
File b = scr.getScreenshotAs(OutputType.FILE);
File c=new File("C:\\Users\\sankar\\eclipse-workspace\\SeleniumOct10\\screenshot\\flipcart.png");
FileHandler.copy(b, c);	
	
	
	
	
	
	
	
	
	
	
}

}
