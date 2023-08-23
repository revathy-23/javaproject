package com.normal.topics;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonsExample {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",

				"C:\\Users\\kapali\\Documents\\AIITE programs\\New Javaproject\\NewJavaProject\\src\\driver\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://leafground.com/button.xhtml");

		String parentWindow=driver.getWindowHandle();


		//Click and Confirm title
		/*WebElement title=	driver.findElement(By.xpath("//*[text()='Click']"));

		String text=title.getText();
		System.out.println(text);
		title.click();
		 */


		//find the posotion
		/*WebElement position=driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt94\"]/span[2]"));
		Point point=position.getLocation();
		int xpoint=point.getX();
		int ypoint=point.getY();
		System.out.println("x axis position:" +xpoint);
		System.out.println("y axis position:" +ypoint);
		position.submit();
*/

		//find the color

		/*WebElement color=driver.findElement(By.xpath("//*[text()='Save']"));
		String color1=	color.getCssValue("background-color");
		System.out.println(color1);
		*/
		
	}
}










