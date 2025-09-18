package TakeScreenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShotOfWebPage {
	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.facebook.com/");
		
		TakesScreenshot tks=(TakesScreenshot) driver;
		
		File source=tks.getScreenshotAs(OutputType.FILE);
		File destination=new File("C:\\Users\\hp\\git\\repository2\\Basic Selenium\\Screenshots\\ScreenShot1.png");
		
		FileHandler.copy(source, destination);
		
		driver.quit();
		
	}
}