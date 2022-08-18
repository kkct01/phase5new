package testNG;

import org.testng.annotations.Test;

public class LoanTest {
	
	@Test(groups = {"sanity"})
	public void PersonalLoanTest1() {
		System.out.println("Inside PL1");
	}

}
