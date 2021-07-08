package testng1;
import static org.testng.Assert.fail;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class loginTest extends baseTest {

	@Test(priority = 0)
	public void login() {
		WebElement username=driver.findElement(By.id("txtUsername"));
		username.sendKeys("Admin");

	}
	
	
	@Test(priority = 1)
	public void login1() {
		WebElement Password=driver.findElement(By.id("txtPassword"));
		Password.sendKeys("admin123");
		Assert.fail();
	}
	
	
	@Test(dependsOnMethods = "login1")
	public void login2() {
		WebElement submit =driver.findElement(By.name("Submit"));
		submit.click();
	}
	
	
	
	
	
}
