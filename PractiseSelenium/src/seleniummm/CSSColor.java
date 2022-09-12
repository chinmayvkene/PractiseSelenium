package seleniummm;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CSSColor {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com");
		driver.manage().timeouts().getPageLoadTimeout();
		driver.findElement(By.xpath("//a[text()='Slider']")).click();
		driver.findElement(By.xpath("//a[text()='Colorpicker']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement iframe = driver.findElement(By.cssSelector("#demo-frame"));
		driver.switchTo().frame(iframe);
		WebElement coloraddress = driver.findElement(By.cssSelector("#red div"));
		String colorvalue = coloraddress.getCssValue("color");
		System.out.println(colorvalue);
	}
}
