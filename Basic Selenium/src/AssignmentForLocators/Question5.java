package AssignmentForLocators;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question5 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	
		driver.get("https://www.selenium.dev/");
		
		List<WebElement> allLinks=driver.findElements(By.tagName("a"));
		
		for(WebElement link:allLinks) {
		String href=link.getAttribute("href");
		if(href!=null && !href.isEmpty()) {
			System.out.println(href);
		}
		}
		driver.quit();
		
	}
}
