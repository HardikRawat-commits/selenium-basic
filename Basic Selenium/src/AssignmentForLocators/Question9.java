package AssignmentForLocators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question9 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://demoqa.com/upload-download");
		
		WebElement uploadElement=driver.findElement(By.id("uploadFile"));
		
		String filePath="C:\\Users\\hp\\Downloads\\Hulk.webp";

		uploadElement.sendKeys(filePath);

		Thread.sleep(4000);

		driver.quit();
		
	}
}