package seleniummm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Iframee {

	public static void main(String[] args) {
		WebDriverManager.chromiumdriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/frames");
		driver.manage().timeouts().getPageLoadTimeout();
		WebElement iframe = driver.findElement(By.id("frame1"));
		driver.switchTo().frame(iframe);
		String data = driver.findElements(By.xpath("//h1[@id='sampleHeading']")).get(0).getText();
		System.out.println(data);
		driver.quit();
	}
}
