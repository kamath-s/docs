package cts_SEL_FT_Kol;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.commons.io.FileUtils;


public class Screenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","c://worksoft//chromedriver//chromedriver.exe");	
		WebDriver driver=new ChromeDriver();
		driver.get("http://drive.google.com");

		/*
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("d://worksoft//screenshot_selenium.png"));
		*/
		
		TakesScreenshot scrshot = ((TakesScreenshot)driver);
		
		File scrfile = scrshot.getScreenshotAs(OutputType.FILE);
		
		String destfile = "d://worksoft//screenshot_selenium.png";
		File targetfile = new File(destfile);
		
		FileUtils.copyFile(scrfile,targetfile);
				
		System.out.println("E n d  O f  C o d e");		
		
		//driver.get("http://google.com");

	}

}
