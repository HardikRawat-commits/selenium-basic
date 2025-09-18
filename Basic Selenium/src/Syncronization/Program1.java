package Syncronization;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Program1 {
		public static void main(String[] args) throws InterruptedException {
			
			//Syncronization
//			(1)Thread wait
//			(2)Implicit wait
//			(3)Explicit wait
//			(4)Fluent wait
			
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			
			driver.get("https://www.facebook.com/");
			
//			WebElement email=driver.findElement(By.id("email"));
//			email.click();
//			Thread.sleep(5000);
//			email.sendKeys("Varun");
			
			
//			WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(15));
//			WebElement email=wait.until(ExpectedConditions.elementToBeClickable(By.id("email")));
//			email.sendKeys("Varun");

			Wait<WebDriver> wait=new FluentWait<WebDriver>(driver)
					.withTimeout(Duration.ofSeconds(15))
					.pollingEvery(Duration.ofMillis(500))
					.ignoring(NoSuchElementException.class);
			
			WebElement emailField=wait.until(new Function<WebDriver, WebElement>() {
			public WebElement apply(WebDriver driver) {
			WebElement email=driver.findElement(By.id("email"));
			if(email.isDisplayed() && email.isEnabled() ) {
				return email;
			}
			else {
				return null;
			}
				
			}
			});
			
			emailField.sendKeys("Varun");
	        System.out.println("Email entered using FluentWait.");
			
			driver.quit();
			
	}
	
}