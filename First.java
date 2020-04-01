package tempTestNG;

import org.testng.annotations.Test;

public class First {
	
	@Test(priority = 0)
	public void Add_cust() 
	{
		//You should write the actual Selenium code here - ...
		//Currently only sysout statement is there.. 
		System.out.println("Test - Adding customer here");
	}

	@Test(priority = 10)
	public void Edit_cust() 
	{
		//You should write the actual Selenium code here - ...
		//Currently only sysout statement is there.. 
		System.out.println("Edit_Cust");
	}

	@Test(priority = 20)
	public void Delete_cust() 
	{
		//You should write the actual Selenium code here - ...
		//Currently only sysout statement is there.. 
		System.out.println("Delete_Cust");
	}
	
	
}
