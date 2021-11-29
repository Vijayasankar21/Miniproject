package miniproject;

import java.io.File;
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

public class AirAsia {

	public static void main(String[] args) throws Throwable {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\sankar\\eclipse-workspace\\SeleniumOct10\\driver\\chromedriver 2.exe");		

WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.airasia.co.in/home");
driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);

driver.findElement(By.xpath("//div[@data-testid='source-field']")).click();

driver.findElement(By.xpath("//div[text()='Mumbai']")).click();

//driver.findElement(By.xpath("//div[text()='Destination']")).click();
driver.findElement(By.xpath("//div[text()='Kolkata']")).click();
driver.findElement(By.xpath("(//div[@class='react-google-flight-datepicker'])[1]")).click();
JavascriptExecutor js=(JavascriptExecutor) driver;
WebElement date = driver.findElement(By.xpath("//div[text()='Dec 2021']"));
js.executeScript("arguments[0].scrollIntoView();",date );
Actions a=new Actions(driver);
WebElement dec31 = driver.findElement(By.xpath("(//div[@data-day-index='31'])[2]"));
a.moveToElement(dec31).click().perform();
driver.findElement(By.xpath("//button[text()='Back']")).click();
Thread.sleep(3000);

driver.findElement(By.xpath("//div[text()='Special Fares']")).click();
driver.findElement(By.xpath("(//img[@alt='plus'])[1]")).click();
driver.findElement(By.xpath("(//img[@alt='plus'])[1]")).click();
driver.findElement(By.xpath("(//img[@alt='plus'])[4]")).click();
Thread.sleep(2000);
TakesScreenshot scr1=(TakesScreenshot) driver;
File e = scr1.getScreenshotAs(OutputType.FILE);
File f=new File("C:\\Users\\sankar\\eclipse-workspace\\SeleniumOct10\\screenshot\\airasia1.png");
FileHandler.copy(e, f);
Thread.sleep(3000);
driver.findElement(By.xpath("//button[text()='Done']")).click();
driver.findElement(By.xpath("(//img[@alt='select'])")).click();
Thread.sleep(4000);
driver.findElement(By.xpath("//input[@name='onestop']")).click();
driver.findElement(By.xpath("(//label[text()='After 6 PM'])[2]")).click();
WebElement fare = driver.findElement(By.xpath("//input[@value='5423']"));
a.moveToElement(fare).click().perform();
Thread.sleep(3000);
TakesScreenshot scr=(TakesScreenshot) driver;
File c = scr.getScreenshotAs(OutputType.FILE);
File d=new File("C:\\Users\\sankar\\eclipse-workspace\\SeleniumOct10\\screenshot\\airasia.png");
FileHandler.copy(c, d);

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
