package JenkinsJob2;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestingMaven {
	@Test
	public void BrowserAutomation1() {
		System.setProperty("webdriver.chrome.driver", "D:\\Mydhili\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://mithuntechnologies.com/devops/DevOpsToolsMithunTechnologies.html");
		System.out.println("BrowserAutomation");
		driver.findElement(By.xpath("//div[12]//div[3]//p[1]//a[1]")).click();
	}
}
