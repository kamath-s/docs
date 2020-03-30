package git;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class JSE_Frames {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\worksoft\\chromedriver\\chromedriver.exe");
		WebDriver  driver = new ChromeDriver();
		
		driver.get("http://jqueryui.com/droppable/");
		
		driver.manage().window().maximize();
		
		//driver.findElement(By.id("draggable")).click();
		
		//We can either use # of frame or string (id, if known) or webelement - using webelement here
		//driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		
		Thread.sleep(5000);
		
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		driver.findElement(By.id("draggable")).click();
		

		//For interactions, actions class is used - D & D etc.
		Actions act = new Actions(driver);
		
		WebElement source1 = driver.findElement(By.id("draggable"));
		WebElement target1= driver.findElement(By.id("droppable"));
		
		//for Drag and drop - source and target are parameters

		act.dragAndDrop(source1, target1).build().perform();
		
		Thread.sleep(5000);
		
		
		
		// driver.findElement(By.id("draggable")).click();
		
		//act.contextClick(source1).build().perform();
	
		//To get focus back to main area, need to give switch to default content
		//else, focus will remain in frame and any command would go to the frame
		

		driver.switchTo().defaultContent();
		
		Actions act2 = new Actions(driver);
	
		WebElement tomousehover = driver.findElement(By.xpath("//a[contains(text(),'Contribute')]"));

		act2.moveToElement(tomousehover).build().perform();

		Thread.sleep(4000);
		
		
		// Code to double click and right click
		WebElement target2= driver.findElement(By.xpath("//h2[contains(text(),'Examples')]"));
		//WebElement target2= driver.findElement(By.xpath("//p[contains(text(),'Enable any DOM element to be droppable, a target f')]"));
		act2.doubleClick(target2).build().perform();	
		//act2. - right click (context click)
		
		act2.contextClick().build().perform();
		Thread.sleep(5000);

	
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,100)");
		Thread.sleep(5000);
		
		
		// WebElement scrolldownbyvisibility = driver.findElement(By.xpath("//a[contains(text(),'jQuery License')]"));
		//  js.executeScript("arguments[0].scrollIntoView();", scrolldownbyvisibility );
     
		
		System.out.println("End of Code");
		Thread.sleep(2000);
		driver.close();
		
		
		/*
		System.out.println("Number of frames is :");
		System.out.println(driver.findElements(By.tagName("iframe")).size());
			*/

		
		
	}

}
