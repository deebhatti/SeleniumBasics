package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FramesDemo {
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.manage().window().maximize();

		driver.get("http://seleniumhq.github.io/selenium/docs/api/java/index.html");
		
		driver.switchTo().frame("classFrame");
		
		driver.findElement(By.linkText("TREE")).click();
	}

}
