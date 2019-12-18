package JenkinsJob2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BrowserAutomation {
	@Test
	public void BrowserAutomationTest() {
		System.setProperty("webdriver.chrome.driver", "D:\\Mydhili\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");
		System.out.println("BrowserAutomation");
		driver.findElement(By.cssSelector("input[name='q']")).sendKeys("C S Sastry");
		driver.findElement(By.xpath("//input[@name='q']")).submit();
	}
}
