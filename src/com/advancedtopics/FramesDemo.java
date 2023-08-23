package com.advancedtopics;

import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FramesDemo {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				
				"C:\\Users\\kapali\\Documents\\AIITE programs\\New Javaproject\\NewJavaProject\\src\\driver\\chromedriver.exe");
					
					WebDriver driver=new ChromeDriver();
					
					driver.manage().window().maximize();
					
					//driver.get("https://netbanking.hdfcbank.com/netbanking/");
					
					//driver.switchTo().frame(0);
					
					//driver.findElement(By.name("fldLoginUserId")).sendKeys("revathy");
					
					//driver.findElement(By.xpath("//a[text()='CONTINUE']")).click();
					
				
					
					
					//driver.findElement(By.linkText("Forgot Customer ID")).click();
					
					//driver.get("https://letcode.in/selectable");
					//driver.switchTo().frame(4);
				
			    /*java.util.List<WebElement> selectable=driver.findElements(By.xpath("//*[@id='selectable']"));
					
				int size=	selectable.size();
				System.out.println(size);
				
				Actions act=new Actions(driver);
				act.clickAndHold(selectable.get(0));
				act.clickAndHold(selectable.get(1));
				act.clickAndHold(selectable.get(5));
				act.build().perform();
				*/
					
					driver.get("https://letcode.in/frame");
					//driver.switchTo().frame("firstFr");
					driver.switchTo().frame(0);
					driver.findElement(By.name("fname")).sendKeys("shiva");
					driver.findElement(By.name("lname")).sendKeys("lingam");
					
					//driver.switchTo().defaultContent();
					
					driver.switchTo().frame(1);
					driver.findElement(By.name("email")).sendKeys("gmail.com");
				
				
}
}
