package webDriverMethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		String Title=driver.getTitle();
		System.out.println(Title);
		
		String CUrl=driver.getCurrentUrl();
		System.out.println(CUrl);
		
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
//		driver.manage().window().minimize();
//		Thread.sleep(2000);
//		
//		driver.manage().window().fullscreen();
//		Thread.sleep(2000);
		
		Dimension ref= driver.manage().window().getSize();
		int Width=ref.getWidth();
		int Height=ref.getHeight();
		System.out.println("Width: " + Width + ", Height: " + Height);		
		Thread.sleep(2000);
		
		driver.manage().window().setSize(new Dimension(500, 1000));
		
		Point point=driver.manage().window().getPosition();
		int x=point.getX();
		int y=point.getY();
		System.out.println("X=" +x+ ",Y=" +y);
		
		driver.manage().window().setPosition(new Point(100,200));

		driver.close();
		driver.quit();

		
	}
}