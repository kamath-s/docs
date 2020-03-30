package git;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZAll_tag2 {


	public static void main(String[] args) throws InterruptedException {
	
		
		System.setProperty("webdriver.chrome.driver","c://worksoft//chromedriver//chromedriver.exe");	
		WebDriver driver=new ChromeDriver();
		String url="https://register.rediff.com/register/register.php?FormName=user_details";
		driver.get(url);
		
		// Q1
		// What would happen in case the XPATH returns more than one object normally?
		// how is it handled?
		// Q2
		//  What would findelement return in case it does not find an object?
		//  What would findelements return in case it does not find an object?
		
		/*
		WebElement username = driver.findElement(By.xpath("//input[@*]"));
		username.sendKeys("Hello from java code");
		*/
		
		String tag;
		tag="a";
		
		List<WebElement> inputlist = driver.findElements(By.xpath("//input[@*]"));
		int size = inputlist.size();
		System.out.println("Size of input list is:"+size);
		
		String name="";
		int i=0;
		for(i=0;i<size;i++)
		{
			name=inputlist.get(i).getAttribute("name");
			System.out.println("Attribute for "+i+" is :"+name);
		}
		
		

	}
}
