package git;

import java.awt.Toolkit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;



public class Asserts {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","D:\\worksoft\\latest-driver\\chromedriver.exe");	
		WebDriver driver=new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		
		driver.get("https://login.salesforce.com/");
		String actualtitle="";
		actualtitle=driver.getTitle();
		System.out.println("Title is :"+actualtitle);
		driver.manage().window().maximize();
		
		String expected="Login | Salesforce";
		//String expected="Login - Salesforce";
		
		//Assert.assertEquals(actual, expected);
		Assert.assertEquals(actualtitle, expected);
		
		//Assert.

		Toolkit.getDefaultToolkit().beep();
		

		

		
		System.out.println("E n d  O f  C o d e");

		
	}

}
