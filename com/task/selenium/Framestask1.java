package com.task.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Framestask1 {

public static void main(String[] args) throws Throwable {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\sankar\\eclipse-workspace\\SeleniumOct10\\driver\\chromedriver 2.exe");

WebDriver driver=new ChromeDriver();
driver.get("https://demoqa.com/frames");
driver.switchTo().frame("frame1");
WebElement text = driver.findElement(By.xpath("//h1[@ id=\"sampleHeading\"][1]"));
String b = text.getText();
System.out.println(b);
driver.switchTo().defaultContent();
driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[1]/div/div/div[3]/div/ul/li[4]")).click();
Thread.sleep(2000);
driver.switchTo().frame("frame1");
WebElement child = driver.findElement(By.xpath("//iframe[contains(@srcdoc,\"Child Iframe\")]"));
driver.switchTo().frame(child);
WebElement cframe = driver.findElement(By.xpath("//p[contains(text(),\"Child Iframe\")]"));
String c = cframe.getText();
System.out.println(c);
driver.switchTo().parentFrame();
WebElement parent = driver.findElement(By.xpath("//body[contains(text(),\"Parent frame\")]"));
String pframe = parent.getText();		
		System.out.println(pframe);
driver.switchTo().defaultContent();


		
		
		
		
		
		
		
	}

}
