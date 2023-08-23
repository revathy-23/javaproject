package com.normal.topics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectExample {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",

				"C:\\Users\\kapali\\Documents\\AIITE programs\\New Javaproject\\NewJavaProject\\src\\driver\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();

		/*driver.get("https://www.wikipedia.org/");
		WebElement lang=driver.findElement(By.id("searchLanguage"));
		lang.sendKeys("Latina");
}*/

		driver.get("https://www.tamildailycalendar.com/tamil_monthly_calendar.php?");
		WebElement month=driver.findElement(By.id("month"));

		Select s=new Select(month);
		s.selectByIndex(3);
		s.selectByValue("09");
		WebElement first=	s.getFirstSelectedOption();
		System.out.println(first.getText());


		WebElement year=driver.findElement(By.name("year"));
		Select s1=new Select(year);
		//s1.selectByValue("2020");
		// driver.findElement(By.name("Submit")).submit();
		boolean ismultiple=s1.isMultiple();
		System.out.println(ismultiple);
		
		



	}
}

