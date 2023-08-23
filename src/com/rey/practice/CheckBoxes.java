package com.rey.practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxes {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				
				"C:\\Users\\kapali\\Documents\\AIITE programs\\New Javaproject\\NewJavaProject\\src\\driver\\chromedriver.exe");
					
					WebDriver driver=new ChromeDriver();
					
					driver.manage().window().maximize();
					
					driver.get("https://leafground.com/checkbox.xhtml;jsessionid=node0l3h271ferh49181o3gmsuzbwe422483.node0");
					
			List<WebElement> common=driver.findElements(By.xpath("//*[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default']"));
			
			for(WebElement all:common) {
				all.click();
			}
					
	}

}
