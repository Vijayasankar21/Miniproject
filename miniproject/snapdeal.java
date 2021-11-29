package miniproject;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
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

public class snapdeal {

public static void main(String[] args) throws Throwable {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\sankar\\eclipse-workspace\\SeleniumOct10\\driver\\chromedriver 2.exe");

WebDriver driver= new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.snapdeal.com/");
Thread.sleep(4000);
System.out.println(driver.getTitle());
System.out.println(driver.getCurrentUrl());
JavascriptExecutor js=(JavascriptExecutor)driver;

driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
Actions a = new Actions(driver);
WebElement electronics = driver.findElement(By.xpath("//span[text()='Electronics']"));
System.out.println("Selected category :" + electronics.getText());
a.moveToElement(electronics).perform();
WebElement semi = electronics.findElement(By.xpath("//span[text()='Semi Automatic']"));
System.out.println("Washing machine type :" +semi.getText());
a.moveToElement(semi).click().perform();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
WebElement gaming = driver.findElement(By.xpath("//a[@title='TVs, Audio/Video & Gaming']"));
gaming.click();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
WebElement dth = driver.findElement(By.xpath("//div[text()='DTH Services']"));
System.out.println(dth.getText());
a.moveToElement(dth).click().perform();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
WebElement d2h = driver.findElement(By.xpath("//p[text()='TATA Sky HD TATASKY HD Set Top Box 1 Month Hindi Lite Pack with 1 month Subscription Free']"));
//js.executeScript("arguments[0].scrollIntoView();",d2h);
a.moveToElement(d2h).perform();
System.out.println("Selected DTH Operator :" +d2h.getText());
WebElement quickview = driver.findElement(By.xpath("//div[contains(text(),'Quick View')][@pogid='677477486836']"));
a.moveToElement(quickview).click().perform();
Thread.sleep(6000);
//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//WebElement tamil = driver.findElement(By.xpath("//span[text()=' Tamil']"));
//a.moveToElement(tamil).click().perform();

TakesScreenshot scr=(TakesScreenshot)driver;
File b = scr.getScreenshotAs(OutputType.FILE);
File c=new File("C:\\Users\\sankar\\eclipse-workspace\\SeleniumOct10\\screenshot\\snapdeal20.png");
FileHandler.copy(b, c);
driver.findElement(By.xpath("//a[contains(text(),'view details')]")).click();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
/*WebElement pincode = driver.findElement(By.id("pincode-check"));
js.executeScript("arguments[0].scrollIntoView();", pincode);
pincode.sendKeys("624301");
WebElement check = driver.findElement(By.xpath("//div[@id='pincode-check-bttn']//span[text()='check']"));
a.moveToElement(check).click().perform();*/
//Thread.sleep(3000);
driver.findElement(By.xpath("//span[text()='add to cart']")).click();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
WebElement menu = driver.findElement(By.className("menuIconBar"));
a.moveToElement(menu).perform();
WebElement mens = driver.findElement(By.xpath("//a[@class='menuLinks leftCategoriesProduct '] //span[contains(text(),'Men')]"));
a.moveToElement(mens).perform();
WebElement jackets = driver.findElement(By.xpath("//span[text()='Jackets']"));
a.moveToElement(jackets).click().perform();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
WebElement fromval = driver.findElement(By.name("fromVal"));
fromval.clear();
fromval.sendKeys("500");
WebElement toval = driver.findElement(By.name("toVal"));
toval.clear();
toval.sendKeys("1000");
driver.findElement(By.xpath("//div[contains(text(),'GO')]")).click();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

WebElement blue = driver.findElement(By.xpath("//p[contains(text(),'Maniac Blue Casual Jacket')]"));
js.executeScript("arguments[0].scrollIntoView();", blue);
a.moveToElement(blue).click().perform();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
Set<String> window = driver.getWindowHandles();
List<String> list=new ArrayList<String>(window);
driver.switchTo().window(list.get(1));
WebElement size = driver.findElement(By.xpath("//div[@selectedattr='L']"));
a.moveToElement(size).click().perform();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
WebElement cart = driver.findElement(By.xpath("//span[text()='add to cart']"));
a.moveToElement(cart).click().perform();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
WebElement vcart = driver.findElement(By.xpath("//div[text()='View Cart']"));
a.moveToElement(vcart).click().perform();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
