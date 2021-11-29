package com.task.selenium;

import java.util.List;
import java.io.File;
import java.util.ArrayList;
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

public class Amazonpurchase {

public static void main(String[] args) throws Throwable {
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\sankar\\eclipse-workspace\\SeleniumOct10\\driver\\chromedriver 2.exe" );		
		
WebDriver driver=new ChromeDriver();
driver.get("https://www.amazon.in/");
driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);

String title = driver.getTitle();
System.out.println(title);
String url = driver.getCurrentUrl();
System.out.println(url);

Actions a=new Actions(driver);
WebElement electronics = driver.findElement(By.xpath("//a[text()=' Electronics ']"));
System.out.println("selected category  "+electronics.getText());
a.moveToElement(electronics).click().perform();

driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
WebElement mobile = driver.findElement(By.xpath("(//span[contains(text(),'Mobiles ')])[1]"));
System.out.println(mobile.getText());
a.moveToElement(mobile).click().perform();
Thread.sleep(3000);
WebElement mi = driver.findElement(By.xpath("//span[text()='Redmi']"));
System.out.println(mi.getText());
JavascriptExecutor js=(JavascriptExecutor) driver;
js.executeScript("window.scrollBy(0,1000);");
a.moveToElement(mi).click().perform();

Thread.sleep(4000);
js.executeScript("window.scrollBy(0,2000);");
WebElement pricerange = driver.findElement(By.xpath("//span[text()='₹10,000 - ₹20,000']"));
System.out.println("Price Range :"+pricerange.getText());
pricerange.click();
Thread.sleep(3000);
WebElement redmi = driver.findElement(By.xpath("//span[contains(text(),'Redmi 10 Prime (Phantom Black 4GB RAM 64GB ')]"));
System.out.println("selected mobile :"+redmi.getText());
redmi.click();

Thread.sleep(3000);

Set<String> window = driver.getWindowHandles();
List<String> list=new ArrayList<String>(window);
driver.switchTo().window(list.get(1));
String url2 = driver.getCurrentUrl();
System.out.println(url2);
js.executeScript("window.scrollBy(0,1000);");
driver.findElement(By.id("add-to-cart-button")).click();
Thread.sleep(3000);	
driver.findElement(By.xpath("/html/body/div[4]/div[3]/div/div/div[1]/div[3]/div[1]/div[2]/div[3]/form/span/span/input")).click();
Thread.sleep(3000);
TakesScreenshot scr=(TakesScreenshot) driver;
File c = scr.getScreenshotAs(OutputType.FILE);
File b=new File("C:\\Users\\sankar\\eclipse-workspace\\SeleniumOct10\\screenshot\\amazon1.png");
FileHandler.copy(c, b);
		
		
		
		
		
		
		
		
		

	}

}
