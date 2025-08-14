package AssignmentForLocators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Question7 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://demoqa.com/select-menu");
		// 1. Click to open the custom dropdown
		WebElement selVal = driver.findElement(By.cssSelector("div.css-tlfecz-indicatorContainer"));
		selVal.click();

		// 2. Wait briefly or use explicit wait (if needed)
		Thread.sleep(1000); // Or use WebDriverWait

		WebElement option = driver.findElement(By.xpath("//div[text()='Group 1, option 1']"));
		option.click();
		
		Thread.sleep(3000);
		
		WebElement selOne=driver.findElement(By.cssSelector("div.css-tlfecz-indicatorContainer"));
		selOne.click();
		
		Thread.sleep(2000);
		
		WebElement option2=driver.findElement(By.xpath("//div[text()='Mr.']"));
		option2.click();

		Thread.sleep(3000);
		
		WebElement selMenu=driver.findElement(By.id("oldSelectMenu"));
		Select sel=new Select(selMenu);
		
		sel.selectByValue("3");
		sel.selectByVisibleText("Yellow");
		
		WebElement msdd=driver.findElement(By.xpath("//div[7]/div/div/div"));
		msdd.click();
		WebElement opt1=driver.findElement(By.xpath("//div[text()='Black']"));
		opt1.click();
		Thread.sleep(1000);
		WebElement opt2=driver.findElement(By.xpath("//div[text()='Blue']"));
		opt2.click();
		Thread.sleep(1000);
		WebElement opt3=driver.findElement(By.xpath("//div[text()='Green']"));
		opt3.click();
		Thread.sleep(1000);
		WebElement opt4=driver.findElement(By.xpath("//div[text()='Red']"));
		opt4.click();
		Thread.sleep(1000);
		
		WebElement StdMS=driver.findElement(By.id("cars"));
		Select sel2=new Select(StdMS);
		sel2.selectByVisibleText("Volvo");
		sel2.selectByVisibleText("Saab");
		sel2.selectByVisibleText("Opel");
		sel2.selectByVisibleText("Audi");
		
		Thread.sleep(4000);
		driver.quit();
		
		
	}
}