package com.task.selenium;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class DragandDrop {

public static void main(String[] args) throws Throwable {
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\sankar\\eclipse-workspace\\SeleniumOct10\\driver\\chromedriver 2.exe");	
	
WebDriver driver=new ChromeDriver();	

driver.get("http://demo.automationtesting.in/Static.html");
Thread.sleep(3000);
JavascriptExecutor js=(JavascriptExecutor)driver;

//Actions a=new Actions(driver);
WebElement drag = driver.findElement(By.xpath("//*[@id=\"angular\"]"));
WebElement drag1 = driver.findElement(By.xpath("//*[@id=\"mongo\"]"));
WebElement drag2 = driver.findElement(By.id("node"));
WebElement drop = driver.findElement(By.xpath("//*[@id=\"droparea\"]"));
js.executeScript("function createEvent(typeOfEvent) {\n" +"var event =document.createEvent(\"CustomEvent\");"
		+ "\n" +"event.initCustomEvent(typeOfEvent,true, true, null);\n" +"event.dataTransfer = {\n" +"data: {},\n" 
		+"setData: function (key, value) {\n" +"this.data[key] = value;\n" +"},\n" 
		+"getData: function (key) {\n" +"return this.data[key];\n" +"}\n" +"};\n" +"return event;\n" +"}\n" 
		+"\n" +"function dispatchEvent(element, event,transferData) {\n" +"if (transferData !== undefined) {\n" 
		+"event.dataTransfer = transferData;\n" +"}\n" +"if (element.dispatchEvent) {\n" 
		+ "element.dispatchEvent(event);\n" +"} else if (element.fireEvent) {\n" +"element.fireEvent(\"on\" "
				+ "+ event.type, event);\n" +"}\n" +"}\n" +"\n" +"function simulateHTML5DragAndDrop(element, destination) "
						+ "{\n" +"var dragStartEvent =createEvent('dragstart');\n" +"dispatchEvent(element, dragStartEvent);"
								+ "\n" +"var dropEvent = createEvent('drop');\n" 
						+"dispatchEvent(destination, dropEvent,dragStartEvent.dataTransfer);\n" 
								+"var dragEndEvent = createEvent('dragend');\n" 
						+"dispatchEvent(element, dragEndEvent,dropEvent.dataTransfer);\n" 
								+"}\n" +"\n" +"var source = arguments[0];\n" +"var destination = arguments[1];\n" 
						+"simulateHTML5DragAndDrop(source,destination);", drag , drop);
Thread.sleep(2000);
js.executeScript("function createEvent(typeOfEvent) {\n" +"var event =document.createEvent(\"CustomEvent\");"
		+ "\n" +"event.initCustomEvent(typeOfEvent,true, true, null);\n" +"event.dataTransfer = {\n" +"data: {},\n" 
		+"setData: function (key, value) {\n" +"this.data[key] = value;\n" +"},\n" 
		+"getData: function (key) {\n" +"return this.data[key];\n" +"}\n" +"};\n" +"return event;\n" +"}\n" 
		+"\n" +"function dispatchEvent(element, event,transferData) {\n" +"if (transferData !== undefined) {\n" 
		+"event.dataTransfer = transferData;\n" +"}\n" +"if (element.dispatchEvent) {\n" 
		+ "element.dispatchEvent(event);\n" +"} else if (element.fireEvent) {\n" +"element.fireEvent(\"on\" "
				+ "+ event.type, event);\n" +"}\n" +"}\n" +"\n" +"function simulateHTML5DragAndDrop(element, destination) "
						+ "{\n" +"var dragStartEvent =createEvent('dragstart');\n" +"dispatchEvent(element, dragStartEvent);"
								+ "\n" +"var dropEvent = createEvent('drop');\n" 
						+"dispatchEvent(destination, dropEvent,dragStartEvent.dataTransfer);\n" 
								+"var dragEndEvent = createEvent('dragend');\n" 
						+"dispatchEvent(element, dragEndEvent,dropEvent.dataTransfer);\n" 
								+"}\n" +"\n" +"var source = arguments[0];\n" +"var destination = arguments[1];\n" 
						+"simulateHTML5DragAndDrop(source,destination);", drag1 , drop);
Thread.sleep(2000);
js.executeScript("function createEvent(typeOfEvent) {\n" +"var event =document.createEvent(\"CustomEvent\");"
		+ "\n" +"event.initCustomEvent(typeOfEvent,true, true, null);\n" +"event.dataTransfer = {\n" +"data: {},\n" 
		+"setData: function (key, value) {\n" +"this.data[key] = value;\n" +"},\n" 
		+"getData: function (key) {\n" +"return this.data[key];\n" +"}\n" +"};\n" +"return event;\n" +"}\n" 
		+"\n" +"function dispatchEvent(element, event,transferData) {\n" +"if (transferData !== undefined) {\n" 
		+"event.dataTransfer = transferData;\n" +"}\n" +"if (element.dispatchEvent) {\n" 
		+ "element.dispatchEvent(event);\n" +"} else if (element.fireEvent) {\n" +"element.fireEvent(\"on\" "
				+ "+ event.type, event);\n" +"}\n" +"}\n" +"\n" +"function simulateHTML5DragAndDrop(element, destination) "
						+ "{\n" +"var dragStartEvent =createEvent('dragstart');\n" +"dispatchEvent(element, dragStartEvent);"
								+ "\n" +"var dropEvent = createEvent('drop');\n" 
						+"dispatchEvent(destination, dropEvent,dragStartEvent.dataTransfer);\n" 
								+"var dragEndEvent = createEvent('dragend');\n" 
						+"dispatchEvent(element, dragEndEvent,dropEvent.dataTransfer);\n" 
								+"}\n" +"\n" +"var source = arguments[0];\n" +"var destination = arguments[1];\n" 
						+"simulateHTML5DragAndDrop(source,destination);", drag2 , drop);
	Thread.sleep(3000);
	TakesScreenshot scr =(TakesScreenshot) driver;
	File a = scr.getScreenshotAs(OutputType.FILE);
	File b=new File("C:\\Users\\sankar\\eclipse-workspace\\SeleniumOct10\\screenshot\\dranddrop.png");
	FileHandler.copy(a, b);
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}

}
