package akshya1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class datepicker {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://jqueryui.com/datepicker/");
		
		WebElement frame = driver.findElement(By.xpath("//*[@class='demo-frame']"));
		driver.switchTo().frame(frame);
		
		WebElement title = driver.findElement(By.xpath("//*[@id='datepicker']"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();", title);
		
		WebElement title1 = driver.findElement(By.xpath("//*[@id='datepicker']"));
		title1.click();
		
		while(true) {
	String boss	=driver.findElement(By.xpath("//*[@class='ui-datepicker-title']")).getText();
		System.out.println(boss);
		
		//jo paryant he same yet nai toh paryant click kr
		if(!(boss.equals("May 2020"))) {
			driver.findElement(By.xpath("//* [@class='ui-icon ui-icon-circle-triangle-w']")).click();
		}else {
			break;
		}
		
		}
		
		driver.findElement(By.xpath("//*[@id='ui-datepicker-div']//table//tbody//tr//td//a[text()='10']")).click();
		
	

	
	}}
