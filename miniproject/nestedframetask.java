package miniproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class nestedframetask {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\sankar\\eclipse-workspace\\SeleniumOct10\\driver\\chromedriver 2.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://the-internet.herokuapp.com/nested_frames");
	
	WebElement frame1 = driver.findElement(By.xpath("/html/frameset/frame[1]"));
	driver.switchTo().frame(frame1);
	
	WebElement leftfr = driver.findElement(By.xpath("//frame[@name='frame-left']"));
	driver.switchTo().frame(leftfr);
	WebElement middle = driver.findElement(By.xpath("//frame[@name='frame-middle']"));
driver.switchTo().frame(middle);
	
	
	
	
	
	
	
	
}
}
