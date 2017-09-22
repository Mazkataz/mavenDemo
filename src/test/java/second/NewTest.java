package second;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest {
	
	@Test
	public void f() {

	System.out.println("Test");

	}

	@Test     //executes once. 
	public void f2() {

		
		System.out.println("beforeTest");

	}

	@BeforeMethod // executes before every method
	public void beforeMethod() {
		System.out.println("now that is weird");

	}

	@AfterClass //executes after class
	public void afterClass() {
		System.out.println("afterClass");
		
	}
	
	
	@AfterMethod //executes after method
	public void afterMethod() {
		
		System.out.println("afterMethod");

	}
	
	
}
