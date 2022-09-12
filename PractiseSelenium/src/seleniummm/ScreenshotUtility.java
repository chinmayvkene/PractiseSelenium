package seleniummm;

import java.io.File;
import java.io.IOException;

import org.apache.commons.compress.archivers.dump.DumpArchiveEntry.TYPE;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenshotUtility {
	public static WebDriver driver;

	public void scrnutility() throws IOException {
		TakesScreenshot screen = (TakesScreenshot) driver;
		File source = screen.getScreenshotAs(OutputType.FILE);
		File destination = new File("E:\\Selenium Screenshot\\flpscrnshot.png");
		FileHandler.copy(source, destination);
	}

	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		ScreenshotUtility obj = new ScreenshotUtility();
		obj.scrnutility();
		Thread.sleep(1000);
		driver.quit();
	}
}
