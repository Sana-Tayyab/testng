package test;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleTest {

	@Test
	public void openGoogleSite() throws InterruptedException {
		// Setting ChromeDriver properties

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		// Create an object of ChromeDriver. will open ChromeBrowser
		WebDriver driver = new ChromeDriver();

		// Implicit Wait

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// Delete cookies and History
		driver.manage().deleteAllCookies();
		// Maximize Browser
		driver.manage().window().maximize();

		// open site
		driver.get("http://objectspy.space/");

		// slow down Java 1000 ms = 1 sec
		Thread.sleep(3000);

		// Click on Radio Button Male
		driver.findElement(By.id("sex-0")).click();
		Thread.sleep(3000);

		// Type something in Field
		driver.findElement(By.name("firstname")).sendKeys("Mesham");
		Thread.sleep(3000);

		// click on Link Text
//		   driver.findElement(By .linkText("Link Test : New Page")) .click();
//		   Thread.sleep(3000);
//		   
		// Click on Partial Linl
		driver.findElement(By.partialLinkText("OS-API Product FrontEnd")).click();

		// Close the Browser
		driver.close();
		// Quit the Browser
		driver.quit();

	}

}
