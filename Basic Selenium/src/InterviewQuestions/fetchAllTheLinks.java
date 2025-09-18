package InterviewQuestions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class fetchAllTheLinks {
public static void main(String[] args) {
	
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	
	driver.get("https://www.amazon.in/");
	
	List<WebElement> links=driver.findElements(By.tagName("a"));
	
	int index=1;
	for(WebElement link:links) {
		String href=link.getAttribute("href");
		if(href!=null && !href.isEmpty()) {
			System.out.println("Title-" +driver.getTitle());
			System.out.println("Link-" + index + ", URL=" +href);
			index++;
		}
	}
	
	driver.quit();
	
}
}
