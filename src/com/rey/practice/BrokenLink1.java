package com.rey.practice;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLink1 {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver",

				"C:\\Users\\kapali\\Documents\\AIITE programs\\New Javaproject\\NewJavaProject\\src\\driver\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://demo.guru99.com/selenium/newtours/");

		Set<String>brokenlink=new HashSet<String>();

		List<WebElement>link=	driver.findElements(By.tagName("a"));

		System.out.println(link.size());

		for(WebElement newlink:link) {
			String url=newlink.getAttribute("href");

			URL newurl=new URL(url);
			URLConnection urlconnect=newurl.openConnection();
			HttpURLConnection http=(HttpURLConnection) urlconnect;
			http.setConnectTimeout(5000);
			http.connect();

			if(http.getResponseCode()!=200) {
				brokenlink.add(url);

				/*if(http.getResponseCode()==200) {
					System.out.println(url+"-"+http.getResponseCode()+"-"+http.getResponseMessage());
				}
				else {
					System.err.println(url+"-"+http.getResponseCode()+"-"+http.getResponseMessage());*/


				http.disconnect();
			}

		}

		for(String broken:brokenlink) {
			System.err.println(broken);
		}
		driver.quit();
	}

}
