package com.selenium.tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.Assert;
import org.testng.annotations.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MercuryTours {

	WebDriver driver1;
	
	
	
 @BeforeClass
	public void setup() throws InterruptedException {
	
	    WebDriverManager.chromedriver().setup();
		driver1=new ChromeDriver();
		driver1.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver1.manage().window().maximize();
		driver1.get("https://demo.guru99.com/test/newtours/");	
	}

	@Test
	public void login() {
		
		
		driver1.findElement(By.name("userName")).sendKeys("test");
		driver1.findElement(By.name("password")).sendKeys("test");
		driver1.findElement(By.name("submit")).click();
		WebElement e = driver1.findElement(By.xpath("//*['Thank you for Loggin.']"));
		//WebElement msg=driver1.findElement(By.id("Thank you for Loggin."));
		Boolean actualtext=e.getText().contains("Thank you for Loggin");
	    Boolean exptext = true;
		Assert.assertEquals(actualtext, exptext);
		
	
		//click on Flights
		
		driver1.findElement(By.xpath("//a[@href='reservation.php']")).click();
		
		//click on "One Way" radio button
		driver1.findElement(By.xpath("//input[@value='oneway']")).click();
		
		//select on passenger 2 from drop down 
		
		WebElement passengerElement = driver1.findElement(By.xpath("//select[@name='passCount']"));
		Select select = new Select(passengerElement);
	    select.selectByValue("2");
	    
		//select "London" from Departing From Drop Down
	    
		WebElement departingElement = driver1.findElement(By.xpath("//select[@name='fromPort']"));
		Select select1 = new Select(departingElement);
	    select1.selectByValue("London");
	    
		//Select on month ="January"  and  date= "20"
	    
		WebElement fromElement = driver1.findElement(By.xpath("//select[@name='fromMonth']"));
	    Select select2 = new Select(fromElement );
		select2.selectByValue("1");

	    
		WebElement fromdayElement = driver1.findElement(By.xpath("//select[@name='fromDay']"));
	    Select selectD = new Select(fromdayElement);
		selectD.selectByValue("20");
	
	    
		//Select Arriving In "New York"
	    
	    WebElement arrivingElement = driver1.findElement(By.xpath("//select[@name='toPort']"));
		Select selectin = new Select(arrivingElement);
	    selectin.selectByValue("New York");
	    
		//Returning "February" "20"
	    
	    WebElement toElement = driver1.findElement(By.xpath("//select[@name='toMonth']"));
	    Select selectto = new Select(toElement );
		selectto.selectByValue("2");

		WebElement todayElement = driver1.findElement(By.xpath("//select[@name='toDay']"));
	    Select selectt = new Select(todayElement );
		selectt.selectByValue("20");
	   
	    
		//Select Preference Service Class Radio button "Economy class"
	    driver1.findElement(By.xpath("//input[@value='Coach']")).click();
	    
		//Select Airline as "Blue Skies Airlines" 
	    WebElement airlineElement = driver1.findElement(By.xpath("//select[@name='airline']"));
		Select selectA = new Select(airlineElement);
	    selectA.selectByVisibleText("Blue Skies Airlines");
		//selectA.selectBy("Blue Skies Airlines");
	    
	    WebDriverWait wait = new WebDriverWait(driver1,30);
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='findFlights']")));
	    
		//click on continue
	    driver1.findElement(By.xpath("//input[@name='findFlights']")).click();
		//click on "sign on"
	    
	    driver1.findElement(By.xpath("//a[@href='login.php']")).click();
	    
	}
	
	@AfterClass
	public void close() {
	driver1.close();}
}


