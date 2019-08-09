package testng_ex;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
public class Ex_01 {
	@BeforeClass
public void login() {
	System.out.println("login completed");
}
	@AfterClass
public void logout() {
	System.out.println("Logout completed");
}
	@Test(priority=1)
	public void addemp() {
		System.out.println("Add new emp");
	}
	@Test(priority=2)
	public void delemp() {
		System.out.println("delete an emp");
	}
}
