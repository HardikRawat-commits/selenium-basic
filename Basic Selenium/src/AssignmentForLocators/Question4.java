package AssignmentForLocators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question4 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://www.wikipedia.org/");

		driver.findElement(By.partialLinkText("English")).click();
		Thread.sleep(3000);
		driver.navigate().back();
		
		driver.findElement(By.partialLinkText("Italiano")).click();
		Thread.sleep(3000);
		driver.navigate().back();
		
		driver.quit();
		
	}
}
