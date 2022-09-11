package seleniummm;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChildWindowPopUp {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://groww.in/");
		String winid1 = driver.getWindowHandle();
		System.out.println(winid1);
		driver.findElement(By.xpath("//*[text()='Login/Register']")).click();
		String title = driver.getTitle();
		System.out.println(title);
		Set<String> winids = driver.getWindowHandles();
		for(String winid:winids) {
			if(!(winid.contains(title))) {
				driver.switchTo().window(winid);
				driver.findElement(By.id("login_email1")).sendKeys("Chinmay");
			}
		}
	}
}
