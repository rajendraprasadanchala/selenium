package selenium_Restart;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class _1_Xpath_CSS_Practice {

	public static void main(String[] args) {


		System.setProperty("WebDriver.Chrome.Driver","\\\\C:\\Users\\Raja\\Downloads\\chromedriver_win32\\chromedriver.exe");
     	WebDriver driver = new ChromeDriver();
		driver.get("https://www.salesforce.com");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		Actions action1 = new Actions(driver);
		
		action1.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Login')]"))).build().perform();
		
		driver.findElement(By.xpath("//a[contains(text(),'Login')]")).click();
		
		// navigation using css selector
		
		driver.findElement(By.cssSelector("[name='username']")).sendKeys("Rajendra");

		driver.findElement(By.xpath("//input[@name='pw']")).sendKeys("prasad");  // passing the password
		
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		//driver.findElement(By.cssSelector("#Login")).click();
		
				
		
		
		//driver.quit();
		
	}

}
