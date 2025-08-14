package webDriverMethods;

import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program3 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		
        // Get the current window handle
		String mainWindowHandle=driver.getWindowHandle();
		System.out.println("Main Window Handle: " + mainWindowHandle);

        // Open a new tab using JavaScript
		JavascriptExecutor jse=(JavascriptExecutor) driver;
		jse.executeScript("window.location=arguments[0]", "https://www.google.com");
	
		//Get all window Handles
		Set<String> allWindowHandles=driver.getWindowHandles();
		
        // Loop through all handles and switch to the new window
		for (String handle : allWindowHandles) {
			if(!handle.equals(mainWindowHandle)) {
				driver.switchTo().window(handle);
				System.out.println("Switched to new window:" +driver.getTitle());
				break;
			}
		}
		// Wait for a few seconds
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        //Switch back to the main window
        driver.switchTo().window(mainWindowHandle);
        System.out.println("Switched back to main window: "+driver.getTitle());
 
        driver.quit();
        
	}
}
