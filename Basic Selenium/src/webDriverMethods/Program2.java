package webDriverMethods;

import java.time.Duration;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program2 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.facebook.com/");
		
	    driver.navigate().to("https://www.facebook.com/r.php?entry_point=login");
	    Thread.sleep(2000);
	    
	    driver.navigate().back();
	    Thread.sleep(2000);
	    
	    driver.navigate().forward();
	    Thread.sleep(2000);
	    
	    driver.navigate().refresh();
	    Thread.sleep(2000);
	    
	    
	}
}