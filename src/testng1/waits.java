package testng1;

import java.util.concurrent.TimeUnit;

import javax.print.attribute.standard.JobHoldUntil;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class waits {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","F:\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
//		//driver.get("https://login.yahoo.com/?");
//		
//		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		
//	//driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
//	/	driver.findElement(By.xpath("//*[@id='login-username']")).sendKeys("akshaykarwatkar@yahoo.com");
//		
//		driver.findElement(By.xpath("//*[@id=\"login-signin\"]")).click();
//		
//		driver.findElement(By.xpath("//*[@id=\"login-passwd\"]")).sendKeys("9763868371");
//		
//		
//		driver.findElement(By.xpath("//*[@id=\"login-signin\"]")).click();
		
//============================================================================================================================

//Explicit wait
driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
//driver.findElement(By.xpath("//*[@id=\"enable-button\"]")).click();
//
//
//WebDriverWait wait=new WebDriverWait(driver,9);
//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"disable\"]")));
//driver.findElement(By.xpath("//*[@id=\"disable\"]")).click();


//driver.findElement(By.xpath("//*[@id=\"checkbox\"]")).click();
//WebDriverWait wait= new WebDriverWait(driver,60);
//wait.until(ExpectedConditions.elementSelectionStateToBe(By.xpath("//*[@id=\"ch\"]"), true));
//driver.findElement(By.xpath("//*[@id=\"ch\"]")).click();


//driver.findElement(By.xpath("//*[@id=\"populate-text\"]")).click();
//WebDriverWait wait= new WebDriverWait(driver,10);
//
//
//WebElement w = driver.findElement(By.xpath("//*[@id=\"h2\"]"));
////wait.until(ExpectedConditions.textToBePresentInElement(w, "p"));
//wait.until(ExpectedConditions.textToBePresentInElement(w, "Selenium Webdriver"));



//driver.findElement(By.xpath("//*[@id=\"alert\"]")).click();
//WebDriverWait wait= new WebDriverWait(driver,10);
//wait.until(ExpectedConditions.alertIsPresent());
//driver.switchTo().alert().accept();



//============================================================================================================================

                                           //FLUENT WAIT
//driver.findElement(By.xpath("//*[@id=\"checkbox\"]")).click();
//FluentWait<WebDriver> w=new FluentWait<WebDriver>(driver).withTimeout(10, TimeUnit.SECONDS).pollingEvery(1, TimeUnit.SECONDS);
//w.until(ExpectedConditions.elementSelectionStateToBe(By.xpath("//*[@id=\"ch\"]"), true));
//driver.findElement(By.xpath("//*[@id=\"ch\"]")).click();




driver.findElement(By.xpath("//*[@id=\"enable-button\"]")).click();

FluentWait<WebDriver> w=new FluentWait<WebDriver>(driver).withTimeout(9, TimeUnit.SECONDS).pollingEvery(2, TimeUnit.SECONDS);
w.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"disable\"]")));
driver.findElement(By.xpath("//*[@id=\"disable\"]")).click();


	}
	
	
	
}
