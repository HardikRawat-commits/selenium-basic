package searchContextMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program2 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.instagram.com/");
		
		//By using xpath locator
		driver.findElement(By.xpath("//label/input")).sendKeys("");
		
		//By using CSS Selector 
		driver.findElement(By.cssSelector("input[name='password']")).sendKeys("");
		
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		
		Thread.sleep(7000);
		
		driver.findElement(By.cssSelector("div[role='button']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("svg[aria-label='Settings']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[text()='Log out']")).click();
		
		Thread.sleep(3000);
		driver.quit();
		
	}
}