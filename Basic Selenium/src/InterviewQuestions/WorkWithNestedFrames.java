package InterviewQuestions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkWithNestedFrames {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		// Switch to outer frame
		driver.switchTo().frame("outerFrame");

		// Switch to inner frame inside outer
		driver.switchTo().frame("InnerFrame");
		
		// Now perform action inside inner frame
		driver.findElement(By.id("element")).click();

		//goes one level up (to outer frame)
		driver.switchTo().parentFrame() ;
		
		// To come back to main page
		driver.switchTo().defaultContent();
		
	}
}
