package actionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardingActions {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://facebook.com/");
		
		WebElement pwd=driver.findElement(By.name("pass"));
		
		Actions act=new Actions(driver);
		act.sendKeys("Admin").build().perform();
//		
//		act.keyDown(Keys.CONTROL)
//		.sendKeys("a")
//		.sendKeys("c")
//		.keyUp(Keys.CONTROL)
//		.build().perform();
//		
//		act.click(pwd).keyDown(Keys.CONTROL)
//		.sendKeys("v")
//		.keyUp(Keys.CONTROL)
//		.keyDown(Keys.ENTER)
//		.build().perform();
	
		act.sendKeys(pwd,"Admin" + Keys.ENTER).build().perform();
		
		Thread.sleep(3000);
		
		driver.quit();
		
	}
}