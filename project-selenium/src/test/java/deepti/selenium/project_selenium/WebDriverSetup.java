package deepti.selenium.project_selenium;


		import java.util.concurrent.TimeUnit;
		import org.openqa.selenium.By;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.chrome.ChromeDriver;
		import org.openqa.selenium.edge.EdgeDriver;
		import org.openqa.selenium.firefox.FirefoxDriver;
		import org.openqa.selenium.ie.InternetExplorerDriver;
		import org.openqa.selenium.safari.SafariDriver;
		import org.openqa.selenium.support.ui.Select;
		import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
		//import io.github.bonigarcia.wdm.WebDriverManager;
		public class WebDriverSetup {
			
			@Test
			public void facebook() throws InterruptedException {
				WebDriverManager.chromedriver().setup();	
			//	WebDriverManager.firefoxdriver().setup();
			//	WebDriverManager.edgedriver().setup();
			
				
				ChromeDriver driver = new ChromeDriver();
			 //  FirefoxDriver driver = new FirefoxDriver();
			//	  EdgeDriver  driver = new EdgeDriver();
				  
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				
				//SafariDriver drive1r = new SafariDriver();
				//EdgeDriver driver1 =  new EdgeDriver();
				//InternetExplorerDriver ie1 = new InternetExplorerDriver();		
				//FirefoxDriver driver2 = new FirefoxDriver();
				
				driver.get("https://en-gb.facebook.com/");
				// 1 second = 1000 millisecond
				driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
				//Thread.sleep(20000);
				driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("First Name");
				
				WebElement lastInput = driver.findElement(By.xpath("//input[@name='lastname']"));
				lastInput.sendKeys("LastName");
				
				WebElement mobileInput = driver.findElement(By.xpath("//input[@name='reg_email__']"));
				mobileInput.sendKeys("89389658946");
				
				WebElement dayElement = driver.findElement(By.xpath("//select[@id='day']"));		
				Select select = new Select(dayElement);
				//select.selectByIndex(1);
				select.selectByVisibleText("1");
				
				WebElement monthElement = driver.findElement(By.id("month"));
				Select select1 = new Select(monthElement);
				//select1.selectByVisibleText("Apr");
				select1.selectByValue("2");
						
			}
	}


