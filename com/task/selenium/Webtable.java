package com.task.selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable {

	

	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\sankar\\eclipse-workspace\\SeleniumOct10\\driver\\chromedriver 2.exe");
		
WebDriver driver=new ChromeDriver();
		
driver.get("https://www.softwaretestingo.com/handle-static-web-table-in-selenium/");
System.out.println(driver.getTitle());

driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);

WebElement table = driver.findElement(By.tagName("tbody"));
List<WebElement> th = table.findElements(By.tagName("th"));
int columsize = th.size();
System.out.println(columsize);
List<WebElement> tr = table.findElements(By.tagName("tr"));
int rowsize = tr.size();
System.out.println(rowsize);

for (int i = 0; i < rowsize; i++) {
	List<WebElement> td = tr.get(i).findElements(By.tagName("td"));
	for (WebElement data : td) {
		if (data.getText().equals("JAVA")) {
			for(int j=0; j<columsize; j++)
			System.out.println(td.get(j).getText());
		}
	}
	
	
}driver.quit();








}	
} 		

		

		
		
		
		
		
		
		
		
		
		

	


