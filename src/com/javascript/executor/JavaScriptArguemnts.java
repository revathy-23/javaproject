package com.javascript.executor;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptArguemnts {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\kapali\\Documents\\AIITE programs\\New Javaproject\\NewJavaProject\\src\\driver\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement login=driver.findElement(By.id("email"));
		js.executeScript("arguments[0].value='shiva' ", login);
		js.executeScript("document.getElementById('pass').value='reva'", "");
		WebElement clic=driver.findElement(By.name("login"));
		js.executeScript("arguments[0].click();", clic);







	}
}

