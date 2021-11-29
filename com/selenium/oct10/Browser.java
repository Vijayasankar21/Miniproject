package com.selenium.oct10;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sankar\\eclipse-workspace\\SeleniumOct10\\driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.navigate().to("https://www.instagram.com/accounts/login/");
		String title3 = driver.getTitle();
		System.out.println(title3);
		
		driver.navigate().back();
		
		driver.navigate().to("https://www.youtube.com/");
		String title = driver.getTitle();
		System.out.println(title);
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		driver.navigate().back();
		
		driver.navigate().to("https://twitter.com/?lang=en");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		String title2 = driver.getTitle();
		System.out.println(title2);
		String currentUrl2 = driver.getCurrentUrl();
		System.out.println(currentUrl2);
		
		
		driver.close();
	}

}
