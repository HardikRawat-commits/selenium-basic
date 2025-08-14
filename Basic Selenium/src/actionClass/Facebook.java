package actionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Facebook {
	public static void main(String[] args) throws InterruptedException{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.facebook.com/");
		
		Actions act=new Actions(driver);
		act.sendKeys("Hardik").build().perform();
		Thread.sleep(2000);
		
		// we have to copy Username and paste it in password field by Ctrl + c +v
		act.keyDown(Keys.CONTROL)
		.sendKeys("a")
		.sendKeys("c")
		.keyUp(Keys.CONTROL)
		.build().perform();
		
		WebElement pwd=driver.findElement(By.name("pass"));
		act.click(pwd).keyDown(Keys.CONTROL)
		.sendKeys("v")
		.keyUp(Keys.CONTROL)
		.build().perform();
		
		pwd.sendKeys(args);
		
		Thread.sleep(3000);
		driver.quit();
		
	}
}