package finalpractice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class automate_web {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();   
		driver.get("https://testautomationpractice.blogspot.com");
		
		
//		driver.findElement(By.xpath("//*[@id='datepicker']")).click();
//		while(true) {
//			String title = driver.findElement(By.xpath("//*[@class='ui-datepicker-title']")).getText();
//			System.out.println(title);
//			
//			if(!(title.equals("April 2020"))) {
//				driver.findElement(By.xpath("//*[@class='ui-icon ui-icon-circle-triangle-w']")).click();
//			}else {
//				break;
//			}
//			
//			
//		}
//		driver.findElement(By.xpath("//*[@class ='ui-state-default'][text()='10']")).click();
//		
//		Thread.sleep(2000);
//	
	Actions act=new Actions(driver);
		 WebElement drag = driver.findElement(By.xpath("//*[@id='draggable']"));
		WebElement drop = driver.findElement(By.xpath("//*[@id='droppable']"));
		act.dragAndDrop(drag, drop).perform();
		
		Thread.sleep(2000);
		
//		WebElement star = driver.findElement(By.xpath("//*[@class='ui-slider-handle ui-corner-all ui-state-default ui-state-hover']"));
//		act.clickAndHold(star).moveByOffset(0, 50).build().perform();
		
		
//		driver.get("https://jqueryui.com/slider/");
//		
//		WebElement frame = driver.findElement(By.xpath("//*[@class='demo-frame']"));
//		driver.switchTo().frame(frame);
//		
//		WebElement web = driver.findElement(By.xpath("//*[@class='ui-slider-handle ui-corner-all ui-state-default']"));
//		act.clickAndHold(web).moveByOffset(70, 0).moveByOffset(-50, 0).build().perform();
//	}
		
		
		WebElement ebs = driver.findElement(By.xpath("//*[@id=\"frame-one1434677811\"]"));
		
		driver.switchTo().frame(ebs);
		
		WebElement r = driver.findElement(By.xpath("//*[@id='RESULT_TextField-1']"));
		act.sendKeys(r,"akshay").sendKeys(Keys.TAB).sendKeys("omkar").sendKeys(Keys.TAB).sendKeys("9822996293").sendKeys(Keys.TAB).sendKeys("INDIA").sendKeys(Keys.TAB).sendKeys("warora").sendKeys(Keys.TAB).sendKeys("akshaykar@gmail.com").build().perform();
		
		
		List<WebElement> one = driver.findElements(By.xpath("//*[contains(@for,'RESULT_CheckBox-8_')]"));
		int i=0;
		for(WebElement ss:one) {
			String xx = ss.getText();
			System.out.println(xx);
			if(i%2==0){
				ss.click();
			}
			i++;
			driver.switchTo().parentFrame();
			WebElement k = driver.findElement(By.xpath("//*[text()='Copy Text']"));
			act.doubleClick(k).perform();
			
			
			WebElement re = driver.findElement(By.xpath("//*[text()='Click Me']"));
			re.click();
			String q=re.getText();
			System.out.println("//*[text()='Click Me']");
			driver.switchTo().alert().accept();
			
			
			
//		WebDriverWait wait=new WebDriverWait(driver,60);
			//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 List<WebElement> driv = driver.findElements(By.xpath("(//*[@name='speed'])//option"));
			
	
		for(WebElement f:driv) {
			String pp = f.getText();
			System.out.println(pp);
			if(pp.equals("Medium")) {
				f.click();
				
			}
		}
		}
		
		
		
		
      
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		
	


}
