package appTest;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsExample {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		System.setProperty("webdriver.firefox.driver", "geckodriver.exe");
		
		WebDriver driver = new ChromeDriver();
//		WebDriver driver = new FirefoxDriver();
		driver.get("https://demoqa.com/browser-windows");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		
		String ParentWin = driver.getWindowHandle();
		System.out.println("Before clicking new button: " + ParentWin);
		
		WebElement Tab = driver.findElement(By.id("tabButton"));
		Tab.click();
		
		Set<String> handles = driver.getWindowHandles();
		Iterator<String> itr = handles.iterator();
		
		while(itr.hasNext()) {
			
			String currentHandle = itr.next();
			System.out.println(currentHandle);
			
			if(!currentHandle.equals(ParentWin)) {
				driver.switchTo().window(currentHandle);
				break;
			}
		}
		
		WebElement ChildWinElem = driver.findElement(By.tagName("h1"));
		System.out.println("Text on new window is " + ChildWinElem.getText());
				driver.close();
		
		driver.switchTo().window(ParentWin);
		System.out.println("Back to Parent window");
		driver.close();
	}

}
