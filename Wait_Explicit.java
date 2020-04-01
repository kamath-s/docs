package git;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;
//import org.testng.annotations.Test;

public class Wait_Explicit {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","D:\\worksoft\\sln-brwsr-drivers\\chromedriver.exe");	
		//System.setProperty("webdriver.gecko.driver","c://worksoft//gd//geckodriver.exe");
		//WebDriver driver=new FirefoxDriver();
		WebDriver driver = new ChromeDriver();
		

		
		driver.get("http://automationpractice.com/index.php" );
		
		/*
		WebElement oh = driver.findElement(By.xpath("//span[contains(text(),'Order history and details')]"));
		oh.click();
		*/
		
		WebDriverWait wait=new WebDriverWait(driver, 20);

		WebElement gsl;
		gsl= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Order history and details')]")));
		
		//gsl=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath))
		gsl.click();
		
		System.out.println("E n d  O f  C o d e");
		}

}


