package actionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider {
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));	
		
		driver.get("https://jqueryui.com/slider/");
		
		WebElement iframe=driver.findElement(By.className("demo-frame"));
		
		driver.switchTo().frame(iframe);
		
		WebElement slider=driver.findElement(By.id("slider"));

		Actions act=new Actions(driver);
		act.moveToElement(slider,50,0).click().build().perform();
		
		//right click of mouse
		act.contextClick().build().perform();
		
	}
}