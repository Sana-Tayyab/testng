package test;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginXpath {
	
	@Test
	
	
	public void loginXpathtest () throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		 
		  WebDriver driver = new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  driver.manage().deleteAllCookies();
		  driver.manage().window().maximize();		  
		   driver.get("http://techfios.com/test/billing/?ng=admin");
		  
		   Thread .sleep(3000);
		   driver .findElement(By .xpath("//input[@type='text']")) .sendKeys("techfiosdemo@gmail.com");
		   Thread .sleep(3000);
		
		   driver .findElement(By .xpath("//input[@id='password']")) .sendKeys("abc123");
		   Thread .sleep(2000);
		   driver .findElement(By .xpath("//button[@type='submit']")) .click();
		   

		   Thread .sleep(2000);
		   
		  
		   
		   driver .close();
		   driver .quit();
		
		
		
		
	}
	
	

}
