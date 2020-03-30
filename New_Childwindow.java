package git;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class New_Childwindow {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\worksoft\\chromedriver\\chromedriver.exe");
		WebDriver  driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//System.setProperty("webdriver.gecko.driver", "C:\\worksoft\\geckodriver\\geckodriver.exe");
		//WebDriver  driver = new FirefoxDriver();
		
		//driver.get("https://accounts.google.com/SignUp?continue=https%3A%2F%2Faccounts.google.com%2FManageAccount");
		
		driver.get("https://accounts.google.com/");
		driver.findElement(By.linkText("Privacy")).click();
		driver.findElement(By.linkText("Help")).click();
		driver.findElement(By.linkText("Terms")).click();
		
		System.out.println("Title of the main window is:"+driver.getTitle());
		
		//Get all window handles opened and keep it in a set ids
		//Set is a java feature
		//First window handle will be parentid - main window opened
		//later on all the child ids will be there in the Set
		//For help check this out - https://www.journaldev.com/13460/java-iterator

		Set<String> ids = driver.getWindowHandles();
		//driver.getWindowHandles()
		
		//Iterator can be used to iterate in the Set ids
		Iterator<String>it = ids.iterator();
		
		//You can think of an Iterator as an object that points to a page of a book. 
		//Whenever its next() method is invoked, it returns the current page and point to the next page.
		String mainwinid=it.next();
		
		String currentwin;
		while(it.hasNext())
		{
			currentwin = it.next();
			driver.switchTo().window(currentwin);
			Thread.sleep(5000);
			System.out.println("ID for reference is:"+currentwin);
			System.out.println("Title of window is:"+driver.getTitle());
			//driver.close();
		}
		
		driver.switchTo().window(mainwinid);
		System.out.println("Title of window after switching to main is:"+driver.getTitle());
/*
		//initially pointer will be in top
		//first time it.next takes to parent id
		//next tiem takes to child id
		
		String parentid = it.next();
		String childid = it.next();
		
		System.out.println(" ");
		System.out.println("Parent id for reference is: "+parentid);
		System.out.println("child id for reference is: "+childid);
		driver.switchTo().window(childid);
		System.out.println(" ");
		
		System.out.println("Title after switchto-child window : "+driver.getTitle());
		//Not getting new title - its printing blank in Firefox- need to check
		//however, in Chrome it is working fine
		//System.out.println(driver.getTitle());
		
		
		driver.switchTo().window(parentid);
		System.out.println("Title after switchto-parent win : "+driver.getTitle());
	*/	
		System.out.println("End of program ");
	}

}
