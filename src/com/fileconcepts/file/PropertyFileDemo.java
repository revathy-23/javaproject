package com.fileconcepts.file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PropertyFileDemo {
	public static void main(String[] args) throws IOException {
		WebDriver driver = null;
		Properties properties;


		FileInputStream stream=new FileInputStream("C:\\Users\\kapali\\Documents\\AIITE programs\\New Javaproject\\NewJavaProject\\src\\com\\fileconcepts\\file\\config.properties");
		properties=new Properties();

		properties.load(stream);
		String browser=properties.getProperty("browser");
		String location=properties.getProperty("driverLocation");
		String send=properties.getProperty("text");


		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", location);
			driver=new ChromeDriver();


		}
		else if(browser.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver", location);
			driver=new EdgeDriver();

		}

		driver.get("https://www.google.com/");
		WebElement click= driver.findElement(By.id("APjFqb"));
		click.sendKeys(send,Keys.ESCAPE);
		click.submit();

	}

}

