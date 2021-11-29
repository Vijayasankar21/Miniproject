package miniproject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class myntra {

public static void main(String[] args) throws Throwable {
	
System.setProperty("webdriver.chrome.driver", "C:\\Users\\sankar\\eclipse-workspace\\SeleniumOct10\\driver\\chromedriver 2.exe");	
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.myntra.com/");
Thread.sleep(4000);
System.out.println(driver.getTitle());
System.out.println(driver.getCurrentUrl());

JavascriptExecutor js=(JavascriptExecutor) driver;

//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//WebElement brand = driver.findElement(By.xpath("//h4[text()='Explore Top Brands']"));
//js.executeScript("window.scrollBy(0,3000);");
//Thread.sleep(3000);
WebElement handbag = driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/main/div/div[10]/div/div/div/div/div[5]/div/div/div/div/div/div/div/div"));		
js.executeScript("window.scrollBy(0,4000);", handbag);
Thread.sleep(4000);
Actions a= new Actions(driver);
js.executeScript("window.scrollBy(0,2000);");
a.moveToElement(handbag).click().perform();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
driver.findElement(By.xpath("/html/body/div[2]/div/div/main/div[3]/div/section/div/div[2]/ul/li[4]/label")).click();
Thread.sleep(4000);
WebElement price = driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/main/div[3]/div[1]/section/div/div[4]/ul/li[1]/label"));
js.executeScript("window.scrollBy(0,1000);",price);
a.moveToElement(price).click().perform();
//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


		
		
		
		
		
		
		
		
		
		
		
		
}

}
