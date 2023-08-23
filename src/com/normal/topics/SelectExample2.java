package com.normal.topics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectExample2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",

				"C:\\Users\\kapali\\Documents\\AIITE programs\\New Javaproject\\NewJavaProject\\src\\driver\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/dropdowns");
		WebElement fruits=	driver.findElement(By.id("fruits"));
		Select fruit=new Select(fruits);
		fruit.selectByVisibleText("Apple");

		WebElement multiple=driver.findElement(By.id("superheros"));

		Select multi=new Select(multiple);
		boolean mul=multi.isMultiple();
		System.out.println(mul);

		multi.selectByIndex(2);
		multi.selectByVisibleText("Captain America");
		multi.selectByValue("ff");
		List<WebElement> allOptions=multi.getAllSelectedOptions();
		for(int i=0;i<allOptions.size();i++) {
			System.out.println(allOptions.get(i).getText());
		}

		WebElement language=driver.findElement(By.id("lang"));

		Select lang=new Select(language);
		lang.selectByIndex(4);
		List<WebElement>langAll=lang.getOptions();
		System.out.println(langAll.size());


		for(int i=0;i<langAll.size();i++) {

			System.out.println(langAll.get(i).getText());



		}

		WebElement country=driver.findElement(By.id("country"));
		Select count=new Select(country);
		count.selectByValue("India");
		WebElement value=count.getFirstSelectedOption();
		System.out.println(value.getText());


	}
}

