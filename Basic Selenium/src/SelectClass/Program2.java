package SelectClass;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Program2 {
public static void main(String[] args) throws InterruptedException {

	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	
	driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple");
    driver.switchTo().frame("iframeResult");

	WebElement msdd=driver.findElement(By.id("cars"));
	
	Select sel=new Select(msdd);
	
//	sel.selectByValue("volvo");
//	Thread.sleep(3000);
//	sel.deselectByValue("volvo");
//	
//	sel.selectByVisibleText("Volvo");
//	Thread.sleep(3000);
//	sel.deselectByVisibleText("Volvo");

	sel.isMultiple();
	Thread.sleep(3000);
	
	WebElement fso= sel.getFirstSelectedOption();
	System.out.println(fso);
	
	List<WebElement> aso=sel.getAllSelectedOptions();
	System.out.println(aso);
	
	driver.quit();
	
}
}
