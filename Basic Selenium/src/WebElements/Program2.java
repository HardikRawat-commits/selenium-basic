package WebElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program2 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.facebook.com/");
		//submit
		//submit only works with the webelements inside form
		//submit works with the webelement having the attribute type='submit'
		driver.findElement(By.id("email")).sendKeys("Varun");
	WebElement pwd=	driver.findElement(By.id("pass"));
		pwd.sendKeys("Vatts");
		pwd.submit();
		
	}
}
