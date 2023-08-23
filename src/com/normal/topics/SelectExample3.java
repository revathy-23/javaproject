package com.normal.topics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectExample3 {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",

				"C:\\Users\\kapali\\Documents\\AIITE programs\\New Javaproject\\NewJavaProject\\src\\driver\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://leafground.com/select.xhtml");
		
		WebElement tool=driver.findElement(By.className("ui-selectonemenu"));
		Select s=new Select(tool);
		s.selectByVisibleText("Selenium");
		
		driver.findElement(By.xpath("//label[contains(@class,'ui-selectonemenu')][1]")).click();
	driver.findElement(By.xpath("//li[text()='India']")).click();
	
	/*driver.findElement(By.xpath("//label[contains(@class,'ui-selectonemenu')][2]")).click();
	driver.findElement(By.xpath("//li[text()='Chennai']")).click();*/

	driver.findElement(By.xpath("//label[contains(@class,'ui-selectonemenu')][3]")).click();
		
		
}
}
