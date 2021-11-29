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
import org.openqa.selenium.support.ui.Select;

public class miniproject2 {

public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\sankar\\eclipse-workspace\\SeleniumOct10\\driver\\chromedriver 2.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://automationpractice.com/index.php");
	Actions act=new Actions(driver);
	
	WebElement women=driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[1]/a"));
	act.moveToElement(women).perform();
	WebElement eve = driver.findElement(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[1]/ul/li[2]/ul/li[2]/a"));
	act.moveToElement(eve).click().perform();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li/div/div[1]/div/div[1]/a")).click();
	Thread.sleep(2000);
	WebElement frame = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/iframe"));
	driver.switchTo().frame(frame);
	Thread.sleep(3000);
	WebElement quantity = driver.findElement(By.xpath("//*[@id=\"quantity_wanted_p\"]/a[2]/span/i"));
	act.moveToElement(quantity).perform();
	act.click().perform();
	act.click().perform();
	WebElement size = driver.findElement(By.xpath("//*[@id=\"group_1\"]"));
	Select sizes=new Select(size);
	sizes.selectByValue("3");
	driver.findElement(By.xpath("//*[@id=\"color_24\"]")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@id=\"add_to_cart\"]/button")).click();
	Thread.sleep(3000);
	driver.switchTo().defaultContent();
	 driver.findElement(By.xpath("//a[@title='Proceed to checkout']")).click();
     Thread.sleep(3000);
	WebElement clik = driver.findElement(By.xpath("//span[text()='Proceed to checkout']"));
	act.moveToElement(clik).perform();
	clik.click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("vijayasankar@gmail.com");
	driver.findElement(By.xpath("//*[@id=\"passwd\"]")).sendKeys("Sankar@21");
	driver.findElement(By.xpath("//*[@id=\"SubmitLogin\"]")).click();
	Thread.sleep(3000);
driver.findElement(By.xpath("//*[@id=\"center_column\"]/form/p/button")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//*[@id=\"cgv\"]")).click();
	driver.findElement(By.xpath("//*[@id=\"form\"]/p/button")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"HOOK_PAYMENT\"]/div[1]/div/p/a")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@id=\"cart_navigation\"]/button")).click();
	Thread.sleep(3000);
	TakesScreenshot scr1=(TakesScreenshot)driver;
	File scrshot1 = scr1.getScreenshotAs(OutputType.FILE);
	File b=new File("C:\\Users\\sankar\\eclipse-workspace\\SeleniumOct10\\screenshot//project2.png");
	FileHandler.copy(scrshot1, b);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
