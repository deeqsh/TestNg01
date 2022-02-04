package com.selenium.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumExample2 {
	
	@Test
	
	public void facebook() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		
		WebDriverManager.firefoxdriver().setup();
		
		//WebDriverManager.edgedriver().setup();
		
		ChromeDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//FirefoxDriver driver = new FirefoxDriver();
		//EdgeDriver driver = new EdgeDriver();
		
				
				driver.get("http://facebook.com");
				
				driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
				
				//Thread.sleep(2000);
				
				
			    
				driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("First Name");
	            
				WebElement lastInput = driver.findElement(By.xpath("//input[@name='lastname']"));
				lastInput.sendKeys("LastName");
				
				
				WebElement mobileInput = driver.findElement(By.xpath("//input[@name='reg_email__']"));
				mobileInput.sendKeys("89389658946");
				
	
	}
}
