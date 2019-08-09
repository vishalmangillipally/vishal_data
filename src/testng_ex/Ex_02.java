package testng_ex;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Ex_02 {
	@BeforeMethod
	public void login() {
		System.out.println("login complete");
		
	}
	@AfterMethod
	public void openApplication() {
		System.out.println("application opened");
		
	}
	@Test
	public void addEmp() {
		System.out.println("added employee");
		
	}
	@Test
	public void closeApplication() {
		System.out.println("closed application");
		
	}
}
