package WebElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program5 {
	public static void main(String[] args) {
		
		//Validators
		//isDisplayed
		//isEnabled
		//isSelected
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
//		driver.get("https://www.facebook.com/");
		
		driver.get("https://www.facebook.com/r.php?entry_point=login");
		
//		WebElement loginBtn=driver.findElement(By.name("login"));

//		System.out.println(loginBtn.isDisplayed());
//		System.out.println(loginBtn.isEnabled());

		WebElement radioBtn=driver.findElement(By.xpath("//label[text()='Female']/..//input"));
		radioBtn.click();
		System.out.println(radioBtn.isDisplayed());
		System.out.println(radioBtn.isEnabled());
		System.out.println(radioBtn.isSelected());
		
		
		driver.quit();
		
	}
}