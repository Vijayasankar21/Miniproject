package com.task.selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class irctctask {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sankar\\eclipse-workspace\\SeleniumOct10\\driver\\chromedriver 2.exe");

		WebDriver driver=new ChromeDriver();
//		driver.get("https://www.irctc.co.in/nget/train-search");
//		Thread.sleep(2000);
//		driver.switchTo().alert().accept();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[@onclick='alertbox()']")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		
		driver.findElement(By.xpath("//a[@href='#CancelTab']")).click();
		driver.findElement(By.xpath("//button[@onclick='confirmbox()']")).click();

		driver.switchTo().alert().dismiss();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@href='#Textbox']")).click();
		driver.findElement(By.xpath("//button[@onclick='promptbox()']")).click();
		Alert al = driver.switchTo().alert();
		al.sendKeys("vijayasankar");
		String a = al.getText();
		System.out.println(a);
		al.accept();
		WebElement p = driver.findElement(By.xpath("//p[@id='demo1']"));
		String g = p.getText();
		System.out.println(g);
//		driver.get("https://demoqa.com/alerts");
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//button[@id='alertButton']")).click();
//		driver.switchTo().alert().accept();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//button[@id='timerAlertButton']")).click();
//		Thread.sleep(6000);
//		driver.switchTo().alert().accept();
//		driver.findElement(By.xpath("//button[@id='confirmButton']")).click();
//		Thread.sleep(2000);
//		driver.switchTo().alert().accept();
//		
//		Thread.sleep(2000);
//		WebElement name = driver.findElement(By.xpath("//button[@id='promtButton']"));
//		name.click();
//		Thread.sleep(3000);
//		Alert d = driver.switchTo().alert();
//		d.sendKeys("vijayasankar");
//		Thread.sleep(2000);
//		String b = d.getText();
//		System.out.println(b);
//		d.accept();
//	
//		
		
	
//		
		
	
		
		
	}

}
