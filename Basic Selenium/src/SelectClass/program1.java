package SelectClass;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class program1 {
	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.facebook.com/r.php?entry_point=login");
		
		WebElement day=driver.findElement(By.id("day"));
		
		Select sel=new Select(day);
//		sel.selectByIndex(1);
//		sel.selectByValue("3");
//		sel.selectByVisibleText("3");
	    List<WebElement> options=sel.getOptions();
	 
	    
	for (WebElement opt : options) {
	    System.out.println(opt.getText());
	}

		driver.quit();
		
	}
}
