package com.selenium.tests;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.firefox.FirefoxDriver;



public class SeleniumExample1 {
	
	@Test 
	
	//public void signfacebook() {
		//System.setProperty("webdriver.chrome.driver","/Users/piyush/Downloads/chromedriver");
		
		//System.setProperty("webdriver.gecko.driver","/Users/piyush/Downloads/geckodriver");
		//ChromeDriver driver = new ChromeDriver();
		
	//	FirefoxDriver driver = new FirefoxDriver();
		
		
		//driver.get("https://facebook.com");
		
		//}
	
public static void main(String []str) {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
	driver.navigate().to("https://www.facebook.com/");
	String title = driver.getTitle();
	System.out.println(title);
	//driver.quit();
	
	
}
	
	
}
