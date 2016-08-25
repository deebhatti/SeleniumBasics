package assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assignment2 {
	
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://gmail.com");
		
		driver.findElement(By.id("Email")).sendKeys("obama2493@gmail.com");
		driver.findElement(By.id("next")).click();
		
		driver.findElement(By.id("Passwd")).sendKeys("obama007");
		driver.findElement(By.id("signIn")).click();
		
		String totalEmails = driver.findElement(By.xpath("//*[@id=':97']/span/b[3]")).getText();
		System.out.println("Total number of emails = " + totalEmails);
	}

}
