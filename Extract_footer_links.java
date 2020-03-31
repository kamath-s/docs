package git;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Extract_footer_links {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\worksoft\\chromedriver\\chromedriver.exe");
		WebDriver  driver = new ChromeDriver();
		
		driver.get("https://www.ebay.com/");
		
		int links = driver.findElements(By.tagName("a")).size();
		
		System.out.println("Total # of links :"+links);
		
		
		
		WebElement footer = driver.findElement(By.xpath("//footer[@id='glbfooter']"));
		int footerlinks = footer.findElements(By.tagName("a")).size();
		//footer.findElement(arg0)
				
		System.out.println("Footer # of links :"+footerlinks);
		
		String linktext;
		int j;
		// print all the links in the sell section
		for(int i=0; i<footerlinks;i++)
		{
			
			linktext = footer.findElements(By.tagName("a")).get(i).getText();
			//linktext=footer.findElements(By.tagName("a"));
			j=i+1;
			System.out.println("Link "+j+" "+linktext);
		}
		
		System.out.println("End of Code");
		
/*
		//footer section 2 - sell section
		WebElement fsection = driver.findElement(By.xpath("//html//div[@id='footerFragment']//td[2]/ul[1]"));
		int fsectionlinks = fsection.findElements(By.tagName("a")).size();
		
		System.out.println("Footer Section # of links :"+fsectionlinks);
		
		String linktext;
		int j;
		// print all the links in the sell section
		for(int i=0; i<fsectionlinks;i++)
		{
			
			linktext = fsection.findElements(By.tagName("a")).get(i).getText();
			j=i+1;
			System.out.println("Link "+j+" "+linktext);
		}
		
		//footer section 4 - About section - to click on sitemap
		WebElement fsection4 = driver.findElement(By.xpath("//html//td[4]/ul[1]"));
		int fsectionlinks4 = fsection.findElements(By.tagName("a")).size();
			
		String beforeclick = null;
		String afterclick = null;

		for(int i=0; i<fsectionlinks4;i++)
		{
			
			if(fsection4.findElements(By.tagName("a")).get(i).getText().contains("Site Map"))
			{
				System.out.println("Before click on sitemap"+driver.getTitle());
				beforeclick = driver.getTitle();
				fsection4.findElements(By.tagName("a")).get(i).click();
				afterclick = driver.getTitle();
				break;
			}

		}
		System.out.println("After click on sitemap"+driver.getTitle());
		
		//Validation - whether title of the page has changed or not
		if(beforeclick!=afterclick)
		{
			boolean abc = driver.findElement(By.xpath("//html/body[@bgcolor='#FFFFFF']/table[@border='0']/tbody/tr/td/table[@border='0']/tbody/tr[5]/td[1]/table[1]/tbody[1]/tr[1]/td[2]")).isDisplayed();
			if (abc==true)
					{
			System.out.println("Pass");
					}
		}
		else
		{
			System.out.println("Fail");
		}
			
		
		System.out.println("End of code");
		
		
		
		
*/
	}

}
