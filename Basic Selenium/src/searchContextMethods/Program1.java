package searchContextMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.facebook.com/");
		
		//By using id locator
		WebElement email=driver.findElement(By.id("email"));
		email.sendKeys("Admin");
		
		//By using name locator
		WebElement password=driver.findElement(By.name("pass"));
		password.sendKeys("Admin@123");
		
		//By using tagName locator
//		WebElement Login=driver.findElement(By.tagName("button"));
//		Login.click();
	
		
		//By using linkText locator
//		driver.findElement(By.linkText("Forgotten password?")).click();
		
		//By using partialLinkText
		driver.findElement(By.partialLinkText("Create")).click();
		
		driver.navigate().back();
		Thread.sleep(3000);
		
		driver.quit();
		
	}
}