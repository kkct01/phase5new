package testNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AccountTest {
	
	@BeforeTest
	public void Method1() {
		System.out.println("Inside Befoer Test");
	}
	
	@BeforeMethod(alwaysRun = true)
	public void Setup() {
		System.out.println("Inside Setup");
	}
		
	@Test(enabled = true, priority = 1, description = "this test will be validating something")
	public void SavingAccountTest1() {
		
		System.out.println("Inside Saving Acc Test1");
	}
	
	@Test(priority = 0)
	public void SavingAccountTest2() {
		
		System.out.println("Inside Saving Acc Test2");
	}
	
	@Test(groups = {"sanity"})
	public void CheckingAccountTest2() {
		
		System.out.println("Inside Checking Acc Test1");
	}
	
	@AfterMethod
	public void TearDown() {
		System.out.println("Insde TearDown");
	}
	
	@AfterTest
	public void Method2() {
		System.out.println("Inside After Test");
	}	

}
