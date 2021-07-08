package finalpractice;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.bouncycastle.jcajce.provider.symmetric.RC2.PBEWithMD5AndRC2;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class sele {

	public static void ss(WebDriver driver,String filename) throws Throwable {
		
		TakesScreenshot src = (TakesScreenshot)driver;
		File source = src.getScreenshotAs(OutputType.FILE);
		File destination=new File(System.getProperty("user.dir")+"//SsScreenshot//"+filename+".png");
		FileHandler.copy(source, destination);
		
	}
	
//	public  static void  mn( WebDriver driver) throws Throwable {
//		
//		JavascriptExecutor js=(JavascriptExecutor)driver;
//		js.executeScript("window.scrollBy(0,2000)");
//		Thread.sleep(2000);
//		js.executeScript("window.scrollBy(0,-2000)");
//		Thread.sleep(2000);
//		
//		WebElement rrr = driver.findElement(By.xpath("//*[text()='Tooltips']"));
//   js.executeScript("arguments[0].scrollIntoView();",rrr);
//	}
	
	public static void nm(WebDriver driver) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement rrr = driver.findElement(By.xpath("//*[@id=\"age\"]"));
		   js.executeScript("arguments[0].scrollIntoView();",rrr);
	}
	
	
	
	
	
	
	
	
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();   
		driver.get("https://testautomationpractice.blogspot.com");
		
		sele.nm(driver);
//		 List<WebElement> driv = driver.findElements(By.xpath("(//*[@name='speed'])//option"));
//
//		for(WebElement f:driv) {
//			String pp = f.getText();
//			System.out.println(pp);
//			if(pp.equals("Medium")) {
//				f.click();
//				
//			}
//	}
//		sele.ss(driver, "akshay");
		
	Actions act= new Actions(driver);
		driver.findElement(By.xpath("//*[@id='field1']")).click();
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();

		act.sendKeys(Keys.TAB).keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
		
		
WebElement ebs = driver.findElement(By.xpath("//*[@id=\"frame-one1434677811\"]"));
driver.switchTo().frame(ebs);

     WebElement rt = driver.findElement(By.xpath("//*[@for='RESULT_RadioButton-7_0']"));
	
		JavascriptExecutor k = (JavascriptExecutor)driver;
				k.executeScript("arguments[0].click();",rt);
		
}


	
	
	
	
	
}
