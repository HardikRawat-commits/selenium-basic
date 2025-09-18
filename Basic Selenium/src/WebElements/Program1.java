package WebElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program1 {
	public static void main(String[] args) throws InterruptedException {
		//Actions
		//(1)click
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.flipkart.com/");
//	    WebElement MobileandTablets=driver.findElement(By.xpath("//span[text()='Mobiles & Tablets']"));
		
//	    MobileandTablets.click();
	    
		
	    //(2)sendkeys and clear
	    
	    WebElement searchBox=driver.findElement(By.xpath("//input[@title='Search for Products, Brands and More']"));
	    
//	    searchBox.sendKeys("Fridge");
//	    Thread.sleep(3000);
//	    
//	    WebElement searchBox1=driver.findElement(By.xpath("//input[@title='Search for Products, Brands and More']"));
//
//	    searchBox1.clear();
	   
	    
//	    (3)Submit
	   WebElement Fashion=driver.findElement(By.xpath("//span[text()='Fashion']"));
	   Fashion.submit();
	   
	    Thread.sleep(3000);

	    driver.quit();
		    
	}
}
