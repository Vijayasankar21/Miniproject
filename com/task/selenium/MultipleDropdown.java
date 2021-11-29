package com.task.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleDropdown {

	public static void main(String[] args) throws Throwable {
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\sankar\\eclipse-workspace\\SeleniumOct10\\driver\\chromedriver 2.exe");
		
	WebDriver driver=new ChromeDriver();
	driver.get("https://demoqa.com/select-menu");
	Thread.sleep(3000);
	WebElement se = driver.findElement(By.id("cars"));
	Select select=new Select(se);
	boolean multi = select.isMultiple();
	System.out.println(multi);
	select.selectByIndex(2);
	select.selectByValue("volvo");
	select.selectByVisibleText("Saab");
	List<WebElement> b = select.getAllSelectedOptions();
		for (WebElement web : b) {
			System.out.println(web.getText());
			
		}
	WebElement option = select.getFirstSelectedOption();	
		
	String c = option.getText();	
		System.out.println(c);
		
		
		

	}

}
