package com.rey.practice;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class WindowHandle2 {
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.edge.driver",
			"C:\\Users\\kapali\\Documents\\AIITE programs\\New Javaproject\\NewJavaProject\\src\\driver\\msedgedriver.exe");
	
	WebDriver driver=new EdgeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
	
	String parentWindow=driver.getWindowHandle();
	System.out.println(parentWindow);
	
	WebElement oldWindow=driver.findElement(By.id("newWindowBtn"));
	
	
	//for(int i=1;i<=10;i++) {
		
		//oldWindow.click();
	
	oldWindow.click();
	
	Set<String> newWindow=driver.getWindowHandles();
	for(String newOne:newWindow) {
		if(!newOne.contains(parentWindow)) {
			driver.switchTo().window(newOne);
			driver.manage().window().maximize();
			driver.findElement(By.id("firstName")).sendKeys("shivalingam");
			driver.findElement(By.id("lastName")).sendKeys("revathy");
			driver.close();
			driver.switchTo().window(parentWindow);
			driver.findElement(By.id("newWindowsBtn")).click();
			Set<String> newChild=driver.getWindowHandles();
			for(String child:newChild) {
				System.out.println(child);
		
				if(!child.contains(parentWindow)) {
					driver.switchTo().window(child);
					String url=driver.getCurrentUrl();
					System.out.println(url);
					driver.findElement(By.id("firstName")).sendKeys("shivalingam");
				int totalwindow=driver.getWindowHandles().size();
				System.out.println(totalwindow);
			
					
				}
			}
			
			
				}
			
	}
}}
			
			
			
		
		

	

