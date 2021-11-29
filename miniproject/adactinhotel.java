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
import org.openqa.selenium.support.ui.Select;

public class adactinhotel {
	
public static void main(String[] args) throws Throwable {
	
System.setProperty("webdriver.chrome.driver", "C:\\Users\\sankar\\eclipse-workspace\\SeleniumOct10\\driver\\chromedriver 2.exe");	
	
WebDriver driver=new ChromeDriver();
driver.get("https://adactinhotelapp.com/index.php");
System.out.println("Title :" +driver.getTitle());
System.out.println("Url :" +driver.getCurrentUrl());	
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
driver.findElement(By.id("username")).sendKeys("vijayasankar21");
driver.findElement(By.id("password")).sendKeys("Vijayasankar@21");
driver.findElement(By.xpath("//input[@value='Login']")).click();
Thread.sleep(4000);
WebElement location = driver.findElement(By.id("location"));	
Select s= new Select(location);
s.selectByVisibleText("Melbourne");
WebElement locations = s.getFirstSelectedOption();
System.out.println("Selected Location :" +locations.getText());

WebElement hotels = driver.findElement(By.id("hotels"));
Select s1= new Select(hotels);	
s1.selectByVisibleText("Hotel Sunshine");
WebElement hotel = s1.getFirstSelectedOption();
System.out.println("Selected Hotel "+hotel.getText());

WebElement room = driver.findElement(By.id("room_type"));	
Select s2= new Select(room);	
s2.selectByVisibleText("Double");
WebElement roomtype = s2.getFirstSelectedOption();
System.out.println("Room Type :"+ roomtype.getText());

WebElement roomno = driver.findElement(By.id("room_nos"));	
Select s3= new Select(roomno);
s3.selectByVisibleText("2 - Two");
WebElement roomnos = s3.getFirstSelectedOption();
System.out.println("Room no's :"+ roomnos.getText());
WebElement indate = driver.findElement(By.id("datepick_in"));
indate.clear();
indate.sendKeys("25/11/2021");
WebElement outdate = driver.findElement(By.id("datepick_out"));
outdate.clear();
outdate.sendKeys("27/11/2021");
WebElement adultroom = driver.findElement(By.id("adult_room"));
Select s4= new Select(adultroom);	
s4.selectByVisibleText("2 - Two");
driver.findElement(By.id("Submit")).click();
Thread.sleep(4000);
driver.findElement(By.xpath("//input[@name='radiobutton_0']")).click();
driver.findElement(By.id("continue")).click();
Thread.sleep(4000);
WebElement firstname = driver.findElement(By.name("first_name"));
JavascriptExecutor js=(JavascriptExecutor)driver;
js.executeScript("arguments[0].scrollBy(0,1000);", firstname);
	
firstname.sendKeys("Vijayasankar");	
driver.findElement(By.name("last_name")).sendKeys("P");
driver.findElement(By.name("address")).sendKeys("13-7-5,valluvar nagar,chinnalapatti");
driver.findElement(By.name("cc_num")).sendKeys("4567123404562103");	
WebElement cardtype = driver.findElement(By.name("cc_type"));	
Select s5=new Select(cardtype);
s5.selectByVisibleText("Master Card");
WebElement month = driver.findElement(By.name("cc_exp_month"));	
Select s6=new Select(month);
s6.selectByVisibleText("December");
WebElement year = driver.findElement(By.name("cc_exp_year"));	
Select s7=new Select(year);
s7.selectByVisibleText("2022");
driver.findElement(By.name("cc_cvv")).sendKeys("233");	
driver.findElement(By.name("book_now")).click();
Thread.sleep(5000);
driver.findElement(By.name("my_itinerary")).click();
Thread.sleep(4000);
TakesScreenshot scr=(TakesScreenshot) driver;	
File a = scr.getScreenshotAs(OutputType.FILE);	
File b =new File("C:\\Users\\sankar\\eclipse-workspace\\SeleniumOct10\\screenshot\\adactin.png");
FileHandler.copy(a, b);

	
	
	
	
	
}	

}
