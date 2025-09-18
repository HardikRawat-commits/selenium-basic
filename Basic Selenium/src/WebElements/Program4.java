package WebElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program4 {
public static void main(String[] args) {
	
	//Getters
	//(4)getCssValue
	//(5)getSize
	//(6)getLocator
	//(7)getRect--getRect me getSize or getLocator naam ke 2 tutch prani[methods] ka vaas hota hai
	
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	
	driver.get("https://www.facebook.com/");
	
	WebElement loginBtn=driver.findElement(By.name("login"));
	
//	System.out.println(loginBtn.getCssValue("color"));
	
//	System.out.println(loginBtn.getSize());

//	System.out.println(loginBtn.getLocation());
	
	
	Rectangle rect=loginBtn.getRect();
	System.out.println("X: " + rect.getX());
	System.out.println("Y: " + rect.getY());
	System.out.println("Width: " + rect.getWidth());
	System.out.println("Height: " + rect.getHeight());

	driver.quit();
	
	}
}