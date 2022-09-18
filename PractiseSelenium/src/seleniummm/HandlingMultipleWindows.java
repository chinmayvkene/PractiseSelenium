package seleniummm;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingMultipleWindows {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().getPageLoadTimeout();
		String winid1 = driver.getWindowHandle();
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementSelectionStateToBe(By.xpath("//a[text()='OrangeHRM, Inc']"), false));
		driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']")).click();
		Set<String> winids = driver.getWindowHandles();
		for(String winid:winids) {
			driver.switchTo().window(winid);
			if(!(winid.equals(winid1))) {
				driver.findElements(By.xpath("//button[contains(text(),'Contact Sales')]")).get(1).click();
			}
		}
		Thread.sleep(2000);
		driver.quit();
	}
}
