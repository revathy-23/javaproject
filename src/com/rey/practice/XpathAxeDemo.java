package com.rey.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathAxeDemo {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\kapali\\Documents\\AIITE programs\\New Javaproject\\NewJavaProject\\src\\driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/forms");
		
		//driver.findElement(By.xpath("//*[@id='firstname']")).sendKeys("shiva");
		
		//driver.findElement(By.xpath("//*[@id='firstname']/following::input[1]")).sendKeys("reva");
		
		driver.findElement(By.xpath("//input[@id='lasttname']/preceding::input")).sendKeys("shiva");
		driver.findElement(By.xpath("//input[@id='lasttname']")).sendKeys("reva");
		driver.findElement(By.xpath("//*[@id='lasttname']/following::input[2]")).sendKeys("8778542560");
	}
	

}
