package tempTestNG;

// https://howtodoinjava.com/testng/testng-executing-parallel-tests/

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Paralleltest2 {
	@BeforeMethod
	public void beforeMethod() {
		long id = Thread.currentThread().getId();
		System.out.println("------Before test-method. Thread id is: " + id);
	}

	@Test
	public void A_TestMethod() throws InterruptedException {
		long id = Thread.currentThread().getId();
		System.out.println("A_TestMethod. Thread id is: " + id);
		Thread.sleep(10000);
	}

	@Test
	public void B_TestMethod() throws InterruptedException {
		long id = Thread.currentThread().getId();
		System.out.println("B_TestMethod. Thread id is: " + id);
		Thread.sleep(10000);
	}


	
	@AfterMethod
	public void afterMethod() {
		long id = Thread.currentThread().getId();

		System.out.println("-----After test-method. Thread id is: " + id);
	}
}