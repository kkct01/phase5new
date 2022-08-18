package appTest;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class FbSignUp {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		System.setProperty("webdriver.firefox.driver", "geckodriver.exe");
		
		WebDriver driver = new ChromeDriver();
//		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		
		WebElement SignUp = driver.findElement(By.xpath("//a[text()='Create New Account']"));
		SignUp.click();
		
		WebElement Day = driver.findElement(By.id("day"));
		Select ddDay = new Select(Day);
		ddDay.selectByVisibleText("15");
		
		List<WebElement> Months = driver.findElements(By.xpath("//select[@id='month']/option"));
		
		for(WebElement month: Months) {
			System.out.println(month.getText());
		}
		
		WebElement SelYear = driver.findElement(By.xpath("//select[@id='year']/option[@selected='1']"));
		System.out.println("Selected year is " + SelYear.getText());
		
//		WebElement Gender = driver.findElement(By.xpath("//input[@type='radio' and @value='-1']"));
//		Gender.click();
		
		String GenVal = "Male";
		
		WebElement DynamicGen = driver.findElement(By.xpath("//label[text()='" + GenVal + "']/following-sibling::input"));
		DynamicGen.click();
	}

}
