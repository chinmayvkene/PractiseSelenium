package seleniummm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectClass {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mbasic.facebook.com/");
		driver.manage().timeouts().getPageLoadTimeout();
		driver.findElement(By.xpath("//input[@name='sign_up']")).click();
		WebElement day = driver.findElement(By.xpath("//select[@name='birthday_day']"));
		WebElement month = driver.findElement(By.xpath("//select[@name='birthday_month']"));
		WebElement year = driver.findElement(By.xpath("//select[@name='birthday_year']"));

		Select selyear = new Select(year);
		selyear.selectByValue("1996");

		Select selmonth = new Select(month);
		selmonth.selectByIndex(8);

		Select selday = new Select(day);
		selday.selectByVisibleText("5");

		Thread.sleep(2000);

		driver.quit();
	}
}
