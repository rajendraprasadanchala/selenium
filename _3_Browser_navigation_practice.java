package selenium_Restart;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class _3_Browser_navigation_practice {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver.Chrome.Driver","\\\\C:\\Users\\Raja\\Downloads\\chromedriver_win32\\chromedriver.exe");
     	WebDriver driver = new ChromeDriver();
     	
     	// Code for Static Drop downs
//		driver.get("https://demoqa.com/");
//		driver.manage().deleteAllCookies();
//		driver.manage().window().maximize();
		
		//driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
//		
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		
//		driver.findElement(By.linkText("Sortable")).click();
//		
//		driver.navigate().back();	
//		System.out.println("I am back to home page");
//		driver.navigate().to("https://demoqa.com/");
//		System.out.println("I am on the chidl page");
//		driver.navigate().refresh();


		
		// Dynamic drop downs
		
		driver.get("https://spicejet.com");
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		
		driver.findElement(By.xpath("(//a[@value='GOI'])[2]")).click();
		
		
		
		
		
		
		
		
	}

}
