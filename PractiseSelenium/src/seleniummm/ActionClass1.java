package seleniummm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionClass1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().getPageLoadTimeout();
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		Actions act = new Actions(driver);
		WebElement target = driver.findElement(By.xpath("//*[text()='Fashion']"));
		act.moveToElement(target).build().perform();
		act.moveToElement(driver.findElement(By.xpath("//*[@class='_6WOcW9 _2-k99T']"))).build().perform();
		driver.findElement(By.xpath("//*[text()='All']")).click();
		Thread.sleep(2000);
		
		driver.navigate().to("https://demo.guru99.com/test/simple_context_menu.html");
		WebElement target1 = driver.findElement(By.xpath("//*[text()='right click me']"));
		act.contextClick(target1).build().perform();
		driver.findElement(By.xpath("//*[text()='Quit']")).click();
		driver.switchTo().alert().accept();
		
		act.doubleClick(driver.findElement(By.xpath("//*[text()='Double-Click Me To See Alert']"))).build().perform();
		driver.switchTo().alert().accept();
	}
}
