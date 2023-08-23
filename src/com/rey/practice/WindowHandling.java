package com.rey.practice;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.safari.SafariDriver.WindowType;

public class WindowHandling {
	public static void main(String[] args) {
		
	
	System.setProperty("webdriver.edge.driver",
			"C:\\Users\\kapali\\Documents\\AIITE programs\\New Javaproject\\NewJavaProject\\src\\driver\\msedgedriver.exe");
	
	WebDriver driver=new EdgeDriver();
	driver.manage().window().maximize();
	driver.get("https://leafground.com/window.xhtml");
	
	String oldWindowOne=driver.getWindowHandle();
	System.out.println(oldWindowOne);
	String url=driver.getCurrentUrl();
	System.out.println(url);
	
	WebElement oldWindow=driver.findElement(By.xpath("//span[text()='Open']"));
	
	oldWindow.click();
	
	Set<String> newWindow=driver.getWindowHandles();
	
	for (String allWindows : newWindow) {
		driver.switchTo().window(allWindows);
		
	}
	
	
driver.findElement(By.xpath("//*[@id=\'j_idt107\']/div[2]")).click();

//driver.close();

int numberWindows=driver.getWindowHandles().size();
System.out.println(numberWindows);

driver.switchTo().window(oldWindowOne);


driver.findElement(By.xpath("//span[text()='Open Multiple']")).click();

Set<String> listWindows=driver.getWindowHandles();

for (String windAll : listWindows) {
driver.switchTo().window(windAll);	
}
String url1=driver.getCurrentUrl();
System.out.println(url1);

int allSize=driver.getWindowHandles().size();
System.out.println(allSize);

//driver.close();

driver.switchTo().window(oldWindowOne);

WebElement dontClose=driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt93\"]/span[2]"));
dontClose.click();

Set<String> closeWindows= driver.getWindowHandles();

for (String close : closeWindows) {
	if(close.equals(oldWindow)) {
		driver.switchTo().window(close);
		driver.close();
	}
	
	String url2=driver.getCurrentUrl();
	System.out.println(url2);
	
int no=driver.getWindowHandles().size();
System.out.println(no);
}






}
}
