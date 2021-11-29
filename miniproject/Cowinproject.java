package miniproject;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class Cowinproject {

public static void main(String[] args) throws Throwable {
	
System.setProperty("webdriver.chrome.driver", "C:\\Users\\sankar\\eclipse-workspace\\SeleniumOct10\\driver\\chromedriver 2.exe");		

WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.cowin.gov.in/");

String title = driver.getTitle();
System.out.println("Page title "+ title);
String url = driver.getCurrentUrl();
System.out.println("Page url" + url);
Thread.sleep(3000);
driver.findElement(By.xpath("//div[@id=\"mat-select-value-1\"]")).click();
Actions act =new Actions(driver);
WebElement state = driver.findElement(By.xpath("//span[text()=' Tamil Nadu ']"));
act.moveToElement(state).click().perform();
System.out.println(driver.findElement(By.xpath("//*[@id=\"mat-select-value-1\"]")).getAttribute("value"));


driver.findElement(By.xpath("//div[@id='mat-select-value-3']")).click();
WebElement dist = driver.findElement(By.xpath("//span[text()=' Chennai ']"));
act.moveToElement(dist).click().perform();
System.out.println(driver.findElement(By.xpath("//*[@id=\"mat-select-value-3\"]")).getAttribute("value"));

driver.findElement(By.xpath("//button[text()='Search']")).click();
Thread.sleep(3000);
driver.findElement(By.xpath("//label[text()='18 & Above']")).click();
driver.findElement(By.xpath("//label[text()='Paid']")).click();
driver.findElement(By.xpath("//label[text()='Free']")).click();
driver.findElement(By.xpath("//label[text()='Covishield']")).click();
Thread.sleep(3000);
TakesScreenshot scr=(TakesScreenshot)driver;
File a = scr.getScreenshotAs(OutputType.FILE);
File b=new File("C:\\Users\\sankar\\eclipse-workspace\\SeleniumOct10\\screenshot//cowin.png");
FileHandler.copy(a, b);

System.out.println(driver.findElement(By.xpath("/html/body/app-root/div/section/app-home/div[6]/div/appointment-table/div/div/div/div/div/div/div/div/div/div/div[2]/form/div/div/div[5]/div[3]/div/div/div/div[1]/div/div/div[1]/div")).getText());



		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
