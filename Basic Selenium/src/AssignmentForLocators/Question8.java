package AssignmentForLocators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question8 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://demoqa.com/webtables");
		
		driver.findElement(By.id("addNewRecordButton")).click();
		
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Bryan");
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Danielson");
		driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys("Danielbryan@gmail.com");
		driver.findElement(By.xpath("//input[@id='age']")).sendKeys("10");
		driver.findElement(By.xpath("//input[@id='salary']")).sendKeys("170000");
		driver.findElement(By.xpath("//input[@id='department']")).sendKeys("WWE Smackdown");
		
		driver.findElement(By.xpath("//button[@id='submit']")).click();

		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@id='edit-record-4']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='age']")).clear();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='age']")).sendKeys("78");
		driver.findElement(By.xpath("//button[@id='submit']")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@id='delete-record-4']")).click();
		
		Thread.sleep(3000);
		driver.quit();
		
	}
}