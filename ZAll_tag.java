package git;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZAll_tag {

	public int getnoofel(String url, String tag, WebDriver wd)
	{

		List<WebElement> el = wd.findElements(By.tagName(tag));
		int size = el.size();
		return size;
	}
	
	public void dispallobj(String url, String tag, WebDriver wd)
	{
		
		List<WebElement> el = wd.findElements(By.tagName(tag));
		int size = el.size();
		int n=0;
		for(int i=0; i<size;i++)
		{
			n=i+1;
			//System.out.println("Element no:"+n+" is :"+el.get(i).getText());
			//System.out.println("Element no:"+n+" is :"+el.get(i).getAttribute("class"));
			System.out.println("Element no:"+n+" is :"+el.get(i).getText());

			}
		
	}
	
	public static void main(String[] args) throws InterruptedException {
	
		
		System.setProperty("webdriver.chrome.driver","c://worksoft//chromedriver//chromedriver.exe");	
		WebDriver driver=new ChromeDriver();
		String url="http://rediff.com";
		driver.get(url);
		
		String tag;
		tag="a";
		
		ZAll_tag all = new ZAll_tag();
		int elcount = all.getnoofel(url, tag, driver);
		System.out.println("Element count is:"+elcount);
		
		all.dispallobj(url, tag, driver);
		System.out.println("E n d  O f  C o d e");
	}
}
