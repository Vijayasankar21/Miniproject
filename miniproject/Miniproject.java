package miniproject;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class Miniproject {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sankar\\eclipse-workspace\\SeleniumOct10\\driver\\chromedriver 2.exe");
    WebDriver driver=new ChromeDriver();
	System.out.println("Starting time 12:10pm");
	
		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		Thread.sleep(3000);
		String title = driver.getTitle();
		System.out.println("Page title :" +title);
		
		WebElement mail=driver.findElement(By.xpath("//label[@for='email_create']"));
		String emailid = mail.getText();
		System.out.println(emailid);
		
		//using id
		WebElement email = driver.findElement(By.id("email_create"));
		email.sendKeys("vijayasemkar@gmail.com");
		String a=email.getAttribute("value");
		System.out.println(a);
		
		//using absolute Xpath
		driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/div[1]/form/div/div[3]/button")).click();
		Thread.sleep(10000);
		
		String url=driver.getCurrentUrl();
		System.out.println(url);
		String title2 = driver.getTitle();
		System.out.println(title2);
		
		//using Classname
		WebElement acc = driver.findElement(By.className("page-heading"));
		String b = acc.getText();
		System.out.println(b);
		WebElement subheader = driver.findElement(By.className("page-subheading"));
		String c = subheader.getText();
		System.out.println(c);
		Thread.sleep(4000);
		
		//using Relative Xpath
		driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/form/div[1]/div[1]/div[1]/label/div")).click();
		WebElement name = driver.findElement(By.xpath("//*[@id=\"account-creation_form\"]/div[1]/div[2]/label"));
		String na = name.getText();
		System.out.println(na);
		
		//using Name
		WebElement fname = driver.findElement(By.name("customer_firstname"));
		fname.sendKeys("vijayasankar");
		String att = fname.getAttribute("value");
		System.out.println(att);
		
		WebElement lname = driver.findElement(By.xpath("//*[@id=\"account-creation_form\"]/div[1]/div[3]/label"));
		String ln = lname.getText();
		System.out.println(ln);
		WebElement lastname = driver.findElement(By.name("customer_lastname"));
		lastname.sendKeys("P");
		String lnam = lastname.getAttribute("value");
		System.out.println(lnam);
		
		WebElement mailid = driver.findElement(By.xpath("//*[@id=\"account-creation_form\"]/div[1]/div[4]/label"));
		String d = mailid.getText();
		System.out.println(d);
		WebElement element = driver.findElement(By.xpath("//input[@data-validate='isEmail']"));
		String att2 = element.getAttribute("value");
        System.out.println(att2);
        
        WebElement password = driver.findElement(By.xpath("//label[@for='passwd']"));
		String passw = password.getText();
        System.out.println(passw);
        WebElement pass = driver.findElement(By.id("passwd"));
        pass.sendKeys("vijay@21");
        String att3 = pass.getAttribute("value");
        System.out.println(att3);
        
        WebElement days = driver.findElement(By.id("days"));
        Select day=new Select(days);
        //by usingIndex
        day.selectByIndex(20);
        WebElement months = driver.findElement(By.name("months"));
        Select month=new Select(months);
        //by using visibleText
        month.selectByVisibleText("March ");
        WebElement years = driver.findElement(By.name("years"));
        Select year=new Select(years);
        //by using value
        year.selectByValue("1999");
        WebElement subheading = driver.findElement(By.xpath("//h3[contains(text(),'Your address')]"));
        String address = subheading.getText();
        System.out.println(address);
        driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys("vijayasankar");
        driver.findElement(By.xpath("//input[@id='lastname']")).sendKeys("P");
        driver.findElement(By.name("company")).sendKeys("vijayasankar");
        WebElement addres = driver.findElement(By.xpath("//label[@for='address1']"));
        String add = addres.getText();
		System.out.println(add);
		WebElement addresses = driver.findElement(By.name("address1"));
		addresses.sendKeys("13-7-5,valluvarnagar,chinnalapatti");
		String att4 = addresses.getAttribute("value");
		System.out.println(att4);
		
		WebElement city=driver.findElement(By.id("city"));
		city.sendKeys("dindigul");
		String att5 = city.getAttribute("value");
		System.out.println(att5);
		
		WebElement state = driver.findElement(By.name("id_state"));
		Select states=new Select(state);
		states.selectByVisibleText("California");
		boolean f=state.isSelected();
		System.out.println(f);
		WebElement postcode = driver.findElement(By.name("postcode"));
		postcode.sendKeys("62430");
		String att6 = postcode.getAttribute("value");
		System.out.println(att6);
		WebElement phoneno = driver.findElement(By.xpath("//label[@for='phone_mobile']"));
		String phno = phoneno.getText();
		System.out.println(phno);
		WebElement mobileno = driver.findElement(By.name("phone_mobile"));
		mobileno.sendKeys("9600874067");
		String att7 = mobileno.getAttribute("value");
		System.out.println(att7); 
		driver.findElement(By.id("alias")).sendKeys("BF 1,venkatesh enclave");
		driver.findElement(By.xpath("//*[@id=\"submitAccount\"]")).click();
		
		Thread.sleep(5000);
		
		TakesScreenshot scr=(TakesScreenshot)driver;
		File scr1 = scr.getScreenshotAs(OutputType.FILE);
		File i=new File("C:\\Users\\sankar\\eclipse-workspace\\SeleniumOct10\\screenshot//miniprojrct3.png");
		FileHandler.copy(scr1, i);
		
		
		
		
		
		
	}

}
