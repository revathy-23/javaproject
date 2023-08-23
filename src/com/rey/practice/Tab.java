package com.rey.practice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.safari.SafariDriver.WindowType;

public class Tab {

	
	public static void main(String[] args) throws InterruptedException, AWTException {
		
		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\kapali\\Documents\\AIITE programs\\New Javaproject\\NewJavaProject\\src\\driver\\msedgedriver.exe");
		
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
	String old=	driver.getWindowHandle();	
	ArrayList<String>newTab=new ArrayList(driver.getWindowHandles());
	newTab.remove(old);
	driver.switchTo().window(newTab.get(0));
	
}
}

