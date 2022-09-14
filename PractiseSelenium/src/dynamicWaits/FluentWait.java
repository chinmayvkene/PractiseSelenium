package dynamicWaits;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import io.github.bonigarcia.wdm.WebDriverManager;
public class FluentWait {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
		driver.findElement(By.id("display-other-button")).click();
		org.openqa.selenium.support.ui.FluentWait<WebDriver> wait = new org.openqa.selenium.support.ui.FluentWait<WebDriver>(driver)
																								.withTimeout(Duration.ofSeconds(10))
																								.pollingEvery(Duration.ofSeconds(5))
																								.ignoring(NoSuchElementException.class);
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#hidden")));
		driver.findElement(By.cssSelector("#hidden")).click();
		driver.quit();						
	}
}
