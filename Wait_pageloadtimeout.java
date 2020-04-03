package git;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

// https://stackoverflow.com/questions/60114639/timed-out-receiving-message-from-renderer-0-100-log-messages-using-chromedriver

public class Wait_pageloadtimeout {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","D:\\worksoft\\latest-driver\\chromedriver.exe");	
	
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().pageLoadTimeout(5,TimeUnit.SECONDS);
	
		driver.get("https://www.rediff.com/");
		

		System.out.println("E n d  O f  C o d e");

		
	}

}
