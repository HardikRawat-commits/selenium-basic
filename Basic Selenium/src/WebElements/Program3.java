package WebElements;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program3 {
	public static void main(String[] args) {

		//Getters
		//getText()
		//getAttribute()
		//getTagName()
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.facebook.com/");
		
		List<WebElement> links=driver.findElements(By.tagName("a"));
		 
		int n=1;
		
		for(WebElement link:links) {
			 String href = link.getAttribute("href");
			 //trim se extra white space / blank space hat gaya
			    String text = link.getText().trim();
			   
			    if (href != null && !href.isEmpty()) {
			    	 System.out.println("Link Text " + n + " : " + text );
			        System.out.println("url " + n + " : " + href);
			        n++;
			    }
			 }
				
		driver.quit();
		
	}
}