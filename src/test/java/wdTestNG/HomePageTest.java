package wdTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import pages.LoginPage;

public class HomePageTest extends BaseClass {
	
	@Test
	public void Test1() {
		
		LoginPage login = new LoginPage(driver);
		login.LoginFunction("abc@xyz.com", "Abc@1234");
		
	}

}
