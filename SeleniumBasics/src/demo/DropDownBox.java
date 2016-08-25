package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownBox {
	
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.manage().window().maximize();

		driver.get("http://newtours.demoaut.com/mercuryregister.php?osCsid=0803720ef0630b616689b5e01465b98d");
		
		WebElement x = driver.findElement(By.name("country"));
		
		Select drpDown = new Select(x);
		
		//drpDown.selectByVisibleText("VENEZUELA");
		
		drpDown.selectByIndex(58);
		
		
		
		
	}

}
