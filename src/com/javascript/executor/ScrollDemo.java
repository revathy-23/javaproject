package com.javascript.executor;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollDemo {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\kapali\\Documents\\AIITE programs\\New Javaproject\\NewJavaProject\\src\\driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.guru99.com/execute-javascript-selenium-webdriver.html");
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scroll(0,1500)", "");
		Thread.sleep(2000);
		js.executeScript("window.scroll(0,-1500)", "");
	
		
		/*
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)", "");
		Thread.sleep(2000);
		js.executeScript("window.scroll(0,0)", "");
		*/
		
		WebElement link=driver.findElement(By.linkText("https://demo.guru99.com/V4/"));
		js.executeScript("arguments[0].scrollIntoView(true);", link);
		Thread.sleep(2000);
		js.executeScript("window.scroll(0,0)", "");
		
		
		
		

}
}

