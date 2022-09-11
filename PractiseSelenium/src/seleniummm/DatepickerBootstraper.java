package seleniummm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DatepickerBootstraper {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Datepicker.html");
		driver.manage().timeouts().getPageLoadTimeout();
		driver.findElement(By.xpath("//img[@class='imgdp']")).click();
		int a = 1;
		while (a == 1) {
			String txt = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
			if (!(txt.equals("August 1996"))) {
				driver.findElement(By.xpath("//a[contains(@class,'prev ui-corner-all')]")).click();
			} 
			else
				break;
		}
		driver.findElement(By.xpath("//a[text()='5']")).click();
	}
}
