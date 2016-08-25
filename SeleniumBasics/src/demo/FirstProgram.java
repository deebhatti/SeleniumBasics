package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstProgram {

	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.manage().window().maximize();

		//driver.get("https://www.facebook.com");
		
		driver.navigate().to("https://www.facebook.com");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();

		driver.findElement(By.id("email")).sendKeys("abc@gmail.com");

		driver.findElement(By.id("pass")).sendKeys("password");

		driver.findElement(By.xpath("//*[@id='loginbutton']")).click();
		
		String expectedError = "The password that you've entered is incorrect. Forgotten password?";
		
		String actualTitle = driver.findElement(By.xpath("//*[@id='globalContainer']/div[3]/div/div/div")).getText();
		
		if (expectedError.equals(actualTitle)){
			System.out.println("Test Case Passed");
		}
		
		else {
			System.out.println("Test Case Failed");
		}
		
		driver.close(); //Closes only the most recently opened window.
		driver.quit();  //Closes all the windows which are opened during test execution

	}

}
