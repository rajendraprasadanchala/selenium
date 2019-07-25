package selenium_Restart;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class _2_Dropdown_Select {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("WebDriver.Chrome.Driver","\\\\C:\\Users\\Raja\\Downloads\\chromedriver_win32\\chromedriver.exe");
     	WebDriver driver = new ChromeDriver();
		driver.get("http://toolsqa.com/automation-practice-form/");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
		
		// Exercise 1: https://www.toolsqa.com/selenium-webdriver/dropdown-multiple-select-operations/
		
		Select osel = new Select(driver.findElement(By.xpath("//select[@name='continents']")));  //CREATING A select object for the dropdown
		
		Thread.sleep(2000);
		osel.selectByIndex(1);  // selecting Asia
		
		Thread.sleep(2000);
		osel.selectByVisibleText("Africa");  //selection by Visual Text
		
		List<WebElement> list1 = osel.getOptions();
		
	 for( int i=0 ; i<list1.size();i++)
	 {
		 String Optionval = osel.getOptions().get(i).getText();
		 
		 System.out.println("List of all Options are "+ Optionval);  //Printing all options
		 
		 osel.selectByIndex(i);

	 }
		
	 Thread.sleep(2000);
	 // Exercise 2 in https://www.toolsqa.com/selenium-webdriver/dropdown-multiple-select-operations/
	 Select multi = new Select(driver.findElement(By.xpath("//select[@id='selenium_commands']")));
	 
	 List<WebElement> allopt = multi.getOptions();
	 
	 int sizemult = allopt.size();
	 
	 for (int j =0; j<sizemult;j++) {
		 String multival = multi.getOptions().get(j).getText();
		 System.out.println("all options are "+multival);
		 
		 if (multival.equals("Browser Commands"))
		 {
			 multi.selectByIndex(j);
			 System.out.println("Selected Browser Commands");
			 multi.deselectByIndex(j);
			 System.out.println("deselected Browser Commands");
		 }
		 
		 if (multival.equals("Navigation Commands"))
		 {
			 multi.selectByIndex(j);
			 System.out.println("Selected navigation Commands");
			 multi.deselectByIndex(j);
			 System.out.println("Deselected Navigation Commands");
		 }
		 
		 
	 }
	 
	 Thread.sleep(2000);
	 multi.deselectAll();
	 System.out.println("deselected all Options");
		
		driver.quit();
		
		
	}


	

}
