package dynamicWaits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitWait {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
		driver.findElement(By.id("alert")).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.alertIsPresent());
		driver.switchTo().alert().accept();
		
		WebElement word = driver.findElement(By.xpath("//h2[@id='h2']"));
		String txt = word.getText();
		System.out.println(txt);
		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.findElement(By.id("populate-text")).click();
		wait1.until(ExpectedConditions.textToBePresentInElementLocated((By.cssSelector(".target-text")), "Selenium Webdriver"));	
		String text = driver.findElement(By.xpath("//h2[@id='h2']")).getText();
		System.out.println(text);
	}
}
