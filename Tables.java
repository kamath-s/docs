package git;

import java.awt.Toolkit;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Tables {

	@Test
	public void tableprint() {
	//public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "c://worksoft//chromedriver//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		WebElement table = driver.findElement(By.xpath("//table[@id='customers']"));
		List<WebElement> noofrows = table.findElements(By.tagName("tr"));
		// System.out.println("Row details :"+noofrows);
		System.out.println("no of rows :" + noofrows.size());
		int i = 0;
		for (WebElement eachrow : noofrows) {
			// finding number of columns
			List<WebElement> eachcolumn = eachrow.findElements(By.tagName("td"));
			i++;
			
			System.out.println("no of columns in " + i + " row are:" + eachcolumn.size());

			for (WebElement col : eachcolumn) {
				System.out.print(" | " + col.getText());
			}
			System.out.println(" ");

		}

		Toolkit.getDefaultToolkit().beep();
		System.out.println("End of code");

	}

}
