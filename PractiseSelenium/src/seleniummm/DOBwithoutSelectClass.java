package seleniummm;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DOBwithoutSelectClass {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mbasic.facebook.com/");
		driver.findElement(By.cssSelector("#signup-button")).click();
		List<WebElement> yearlist = driver.findElements(By.cssSelector("#year option"));
		for (WebElement year : yearlist) {
			if (year.getText().contains("1996"))
				year.click();
		}

		List<WebElement> monthlist = driver.findElements(By.cssSelector("#month option"));
		for (WebElement month : monthlist) {
			if (month.getText().contains("Aug"))
				month.click();
		}

		List<WebElement> daylist = driver.findElements(By.cssSelector("#day option"));
		for (WebElement day : daylist) {
			if (day.getText().contains("5")) {
				day.click();
				break;
			}
		}
		driver.quit();
	}
}
