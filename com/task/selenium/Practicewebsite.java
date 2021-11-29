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

public class Practicewebsite {

	public static void main(String[] args) throws Throwable {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\sankar\\eclipse-workspace\\SeleniumOct10\\driver\\chromedriver 2.exe");

WebDriver driver=new ChromeDriver();
driver.get("http://practice.automationtesting.in/");
Thread.sleep(3000);
driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div/div[2]/div/div/div/div/div[2]/div[2]/div/div/ul/li/a[2]")).click();
Thread.sleep(3000);
driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div/div[2]/div/div/div/div/div[2]/div[3]/div/div/ul/li/a[2]")).click();
Thread.sleep(3000);
driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div/div[2]/div/div/div/div/div[2]/div[3]/div/div/ul/li/a[3]")).click();
Thread.sleep(3000);
System.out.println(driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[1]/form/table/tbody/tr[1]")).getText());
System.out.println(driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[1]/form/table/tbody/tr[2]")).getText());
driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[1]/div/div/div/a")).click();
Thread.sleep(3000);

System.out.println(driver.findElement(By.xpath("//*[@id=\"customer_details\"]/div[1]/div/h3")).getText());
driver.findElement(By.xpath("//input[@id=\"billing_first_name\"]")).sendKeys("vijayasankar");
driver.findElement(By.xpath("//*[@id=\"billing_last_name\"]")).sendKeys("P");
driver.findElement(By.name("billing_email")).sendKeys("vijayasankar21@gmail.com");

driver.findElement(By.name("billing_phone")).sendKeys("9600874067");
driver.findElement(By.name("billing_address_1")).sendKeys("13-7-5,valluvarnagar,chinnalapatti");
driver.findElement(By.name("billing_city")).sendKeys("Dindigul");
Thread.sleep(3000);
WebElement stat = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[1]/form[3]/div[1]/div[1]/div/p[10]/div"));
Select state=new Select(stat);
state.selectByValue("TN");
driver.findElement(By.name("billing_postcode")).sendKeys("624301");
driver.findElement(By.id("createaccount")).click();
Thread.sleep(2000);
driver.findElement(By.name("account_password")).sendKeys("Vijayasankar@21");
driver.findElement(By.id("payment_method_cod")).click();
driver.findElement(By.id("place_order")).click();
Thread.sleep(4000);

TakesScreenshot scr=(TakesScreenshot)driver;
File a = scr.getScreenshotAs(OutputType.FILE);
File b=new File("C:\\Users\\sankar\\eclipse-workspace\\SeleniumOct10\\screenshot//practice.png");
FileHandler.copy(a, b);




		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
