package com.rey.practice;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLink {
public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver",
				
	"C:\\Users\\kapali\\Documents\\AIITE programs\\New Javaproject\\NewJavaProject\\src\\driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://www.deadlinkcity.com/");
		
		
		Set<String>brokenLink=new HashSet<String>();
	List<WebElement> link=	driver.findElements(By.tagName("a"));
	System.out.println(link.size());
	
	for(WebElement newLink:link) {
	String url=	newLink.getAttribute("href");
	URL newurl=new URL(url);
	
	URLConnection urlconnect=newurl.openConnection();
	HttpURLConnection httpurlconnection=(HttpURLConnection)urlconnect;
	
	httpurlconnection.setConnectTimeout(5000);
	httpurlconnection.connect();
	//if(httpurlconnection.getResponseCode()==200) {
	if(httpurlconnection.getResponseCode()!=200) {
		
		brokenLink.add(url);
		/*System.out.println(url+"-"+httpurlconnection.getResponseCode()+"-"+httpurlconnection.getResponseMessage());
		
		
	}
	else {
		System.err.println(url+"-"+httpurlconnection.getResponseCode()+"-"+httpurlconnection.getResponseMessage());*/
		httpurlconnection.disconnect();
	}
	
	//driver.quit();
	for (String brokenlinkurls : brokenLink) {
		System.err.println(brokenlinkurls);
		
		
	}
	
	}
	

}
}