package seleniummm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragandDrop {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().timeouts().getPageLoadTimeout();
		WebElement source = driver.findElement(By.xpath("//*[text()=' 5000 ']"));
		WebElement target = driver.findElements(By.xpath("//li[@class='placeholder']")).get(1);
		Actions act = new Actions(driver);
		//act.dragAndDrop(source, target).build().perform();
		act.clickAndHold(source).moveToElement(target).release().build().perform();
		driver.quit();
	}
}
