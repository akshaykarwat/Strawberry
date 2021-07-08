package testng12;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class explicitWait {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","F:\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	
		driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");


	   
	driver.findElement(By.xpath("//*[@id=\"checkbox\"]")).click();
//	WebDriverWait wait= new WebDriverWait(driver,10);
//	wait.until(ExpectedConditions.elementSelectionStateToBe(By.xpath("//*[@id=\"ch\"]"), true));
//	driver.findElement(By.xpath("//*[@id=\"ch\"]")).click();

	FluentWait<WebDriver>w= new FluentWait<WebDriver> (driver).withTimeout(9, TimeUnit.SECONDS).pollingEvery(9, TimeUnit.SECONDS);
	w.until(ExpectedConditions.elementSelectionStateToBe(By.xpath("//*[@id=\"ch\"]"), true));
	driver.findElement(By.xpath("//*[@id=\"ch\"]")).click();
	
	
                                                                 	                                                                                  
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
