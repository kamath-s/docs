
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;


// http://total-qa.com/auto-suggestion-auto-complete-text-box-visibilityofallelementslocatedby-example/

public class AutoSuggest2 {

	//@Test(description="Auto Suggest")
	public static void main(String[] args) throws InterruptedException 
	{
		//System.setProperty("webdriver.gecko.driver", "D:\\worksoft\\sln-brwsr-drivers\\geckodriver.exe");
		//FirefoxDriver driver = new FirefoxDriver();
		
		System.setProperty("webdriver.chrome.driver","D:\\worksoft\\latest-driver\\chromedriver.exe");	
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		driver.get("https://in.yahoo.com/?p=us");
		//driver.findElement(By.id("'header-search-input'")).sendKeys("Selenium");
		Thread.sleep(15000);
		driver.findElement(By.xpath("//input[@id='header-search-input']")).sendKeys("Selenium");
		
		/**
		 * Example for Visibility of Elements located by
		 */
		
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//ul[@role='listbox']//li")));
		
		List<WebElement> list = driver.findElements(By.xpath("//ul[@role='listbox']//li"));
		
		System.out.println("Auto Suggest List ::" + list.size());
		
		for(int i = 0 ;i< list.size();i++)
		{
			System.out.println(list.get(i).getText());
			
			if(list.get(i).getText().equals("selenium tutorial"))
			{
				list.get(i).click();
				break;
			}
		}
		
		/**
		 * Verify the Search Results
		 */
		
		
	}
	
}