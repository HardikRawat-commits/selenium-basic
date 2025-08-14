package AssignmentForLocators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Question2 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://demoqa.com/automation-practice-form");
		
		driver.findElement(By.id("firstName")).sendKeys("Hulk");
		driver.findElement(By.id("lastName")).sendKeys("Gujjar");
		driver.findElement(By.id("userEmail")).sendKeys("GujjarHulkfatehpuriya@gmail.com");
		driver.findElement(By.xpath("//label[text()='Male']")).click();
		driver.findElement(By.id("userNumber")).sendKeys("9786586767");
		
		driver.findElement(By.cssSelector("input#subjectsInput")).sendKeys("Maths");
		driver.findElement(By.cssSelector("input#subjectsInput")).sendKeys("English");
		
		driver.findElement(By.xpath("//label[text()='Sports']")).click();
		driver.findElement(By.id("uploadPicture")).sendKeys("C:\\Users\\hp\\Downloads\\Hulk.webp");
		driver.findElement(By.id("currentAddress")).sendKeys("Asola Fathepur Beri");
		
		
		Select stateSelect=new Select(driver.findElement(By.id("state")));
		stateSelect.selectByVisibleText("NCR");
		
		Select citySelect=new Select(driver.findElement(By.id("city")));
		citySelect.selectByVisibleText("Delhi");
		
        driver.findElement(By.id("submit")).click();
      
	}
}
