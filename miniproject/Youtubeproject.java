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
import org.openqa.selenium.io.FileHandler;

public class Youtubeproject {


public static void main(String[] args) throws Throwable {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\sankar\\eclipse-workspace\\SeleniumOct10\\driver\\chromedriver 2.exe");	
WebDriver driver=new ChromeDriver();
driver.get("https://www.youtube.com/");
driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
String title = driver.getTitle();
System.out.println(title);
WebElement search = driver.findElement(By.name("search_query"));
search.sendKeys("selenium");
Thread.sleep(1000);
driver.findElement(By.id("search-icon-legacy")).click();
driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
WebElement a = driver.findElement(By.xpath("//*[@id=\"contents\"]/ytd-video-renderer[1]"));

JavascriptExecutor js=(JavascriptExecutor)driver;
js.executeScript("window.scrollBy(0,300)", a);

WebElement text = driver.findElement(By.xpath("/html/body/ytd-app/div/ytd-page-manager/ytd-search/div[1]/ytd-two-column-search-results-renderer/div/ytd-section-list-renderer/div[2]/ytd-item-section-renderer[4]/div[3]/ytd-video-renderer[1]/div[1]/div/div[1]/div/h3/a"));
String b = text.getText();	
System.out.println("text from search");
System.out.println(b);
text.click();
Thread.sleep(2000);
driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
driver.findElement(By.xpath("//button[@title='Play (k)']")).click();
Thread.sleep(3000);

TakesScreenshot scr=(TakesScreenshot)driver;
File c = scr.getScreenshotAs(OutputType.FILE);
File d=new File("C:\\Users\\sankar\\eclipse-workspace\\SeleniumOct10\\screenshot\\youtube.png");	
FileHandler.copy(c, d);
driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
WebElement title2 = driver.findElement(By.xpath("//*[@id=\"container\"]/h1/yt-formatted-string"));
String e = title2.getText();	
System.out.println(e);	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
