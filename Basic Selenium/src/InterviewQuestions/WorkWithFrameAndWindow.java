package InterviewQuestions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkWithFrameAndWindow {
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		
//		✅ 1. How to work with frame and window in Selenium?
//		Ans.(1)We can handle the frame by 3 ways
//		(1.1)By index
//		driver.switchTo().frame(0);
		
//		(1.2)By id or name
//		driver.switchTo().frame("frameName");
		
//		(1.3)By Locating the WebElement
//		driver.switchTo().frame(frameElement);
		
//		✅ 2. We can handle the window 
//		Ans. String parent=driver.getWindowHandle();
//		List<String> all=driver.getWindowHandles();
		
//		for(String win:all) {
//			if(!win.equals(parent)) {
//				driver.switchTo().window(win);
//			}
//		}
		
	}
}