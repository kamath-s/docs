package git;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DC_3_headless {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","c://worksoft//chromedriver//chromedriver.exe");	

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless");
		
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		options.merge(capabilities);
		
		WebDriver driver = new ChromeDriver(options);		
		driver.get("https://google.co.in");
		
		String title = driver.getTitle();
		System.out.println("Running Chrome in headless mode!!");
		System.out.println("Page Title: " +title);
		driver.quit();
		}
	
}
