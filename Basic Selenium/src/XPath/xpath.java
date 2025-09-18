package XPath;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath {
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
//		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(2));
		
		driver.get("https://simplifyscript.com/");
		
//		(1)X-path by attribute
//	WebElement searchBox=	driver.findElement(By.xpath("//input[@name='q']"));
//		searchBox.sendKeys("Laptop");
	
//		(2)X-path by text function
//		WebElement searchBox2=driver.findElement(By.xpath("//span[text()='Home & Furniture']"));
//		searchBox2.click();

//		(3)X-path by contains
//		(3.1)xpath by contains attribute
//		driver.findElement(By.xpath("//img[contains(@src,'https://rukminim2.flixcart.com/fk-p-flap/128/128/image/5f2ee7f883cdb774.png?q=100')]")).click();
		
//		(3.2)X-path by contains text function
//		driver.findElement(By.xpath("//a[contains( and text(),'Become a Seller')]")).click();
		
//		(4)X-path by multiple attribute
//		driver.findElement(By.xpath("//a[(@title='Become a Seller' and @class='_3RX0a- _3jeYYh')]")).click();
		
//		(5)X-path by sorroundings
		driver.findElement(By.xpath("//span[text()='React Js']/../..//span[@class='wp-block-navigation__submenu-icon']")).click();
		
//		(6)X-path by axes
//		driver.findElement(By.xpath("//label[contains(text(), 'Male')]/descendant::input")).click();
		
//		(7)X-path by indexing
//		driver.findElement(By.xpath("(//input[@name='sex'])[1]")).click();
		
	}
	
}