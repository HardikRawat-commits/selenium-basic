package AssignmentForLocators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://practicetestautomation.com/practice-test-login/");

		//Test Case 1-Positive Login test
		
		driver.findElement(By.id("username")).sendKeys("student");
		driver.findElement(By.id("password")).sendKeys("Password123");
		driver.findElement(By.id("submit")).click();
		
		driver.findElement(By.linkText("Log out")).click();
		
		Thread.sleep(2000);
		
		//Test Case 2-Negative username test
		
		driver.findElement(By.id("username")).sendKeys("incorrectUser");
		driver.findElement(By.id("password")).sendKeys("Password123");
		driver.findElement(By.id("submit")).click();
		
		Thread.sleep(2000);
			
		//Test Case 3-Negative password test
		driver.findElement(By.id("username")).sendKeys("student");
		driver.findElement(By.id("password")).sendKeys("incorrectPassword");
		driver.findElement(By.id("submit")).click();
		
		Thread.sleep(2000);
		driver.quit();
	}
}
