package tempTestNG;

import org.testng.annotations.Test;

public class Dependsclass {
	

	
	@Test(dependsOnMethods= {"cmethod","zmethod"})
	public void amethod()
	{
		System.out.println("a method - depends on both - c method -- d method");
	}
	
	@Test
	public void bmethod()
	{
		System.out.println("b method");
	}

	@Test
	public void cmethod()
	{
		System.out.println("c method");
	}

	@Test
	public void zmethod()
	{
		System.out.println("z method");
	}

	@Test(enabled=false)
	public void donotrunmethod()
	{
		System.out.println("should not run - enabled false");
	}	



}
