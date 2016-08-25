package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingAlertBoxes {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.manage().window().maximize();

		driver.get("https://www.amtrak.com/home");
		
		driver.findElement(By.xpath("//*[@id='subscribe_home']/div[1]/a")).click();
		
		Thread.sleep(5000);
		
		driver.switchTo().alert().accept();
	} 

}
