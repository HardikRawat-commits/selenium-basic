package PopUps;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class childPopup {
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.dream11.com/");
		
		String parentWindow=driver.getWindowHandle();
		
		Set<String> allWindows=driver.getWindowHandles();
		
		for(String handle:allWindows) {
			if(!handle.equals(parentWindow)) {
				driver.switchTo().window(handle);
			}
		}
		driver.quit();
		
	}
}
