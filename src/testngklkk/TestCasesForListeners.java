package testngklkk;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCasesForListeners extends BaseTest {
	
	
	@Test
	public void login() {
	

		
		driver.findElement(By.xpath("(//input[@type= 'text'])[2]")).sendKeys("Admin");
//		username.sendKeys("Admin");
		
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		
		
		
		driver.findElement(By.id("btnLogin")).click();
	}
	
	@Test(dependsOnMethods= "login")
	public void home()
	{
		System.out.println("home method");
	}
	
	@Test
	public void profile()
	{
		System.out.println("profile method");
	}
	
	@Test
	public void dashboard()
	{
		System.out.println("dashboard method");
	}
	

}
