package testng1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import string.stringpractice;

public class baseTest {
	static WebDriver driver;
	@BeforeSuite
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\akshay\\Downloads\\selenium\\chromedriver.exe");
		 driver= new ChromeDriver();
		System.out.println("before suite");
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}
	@AfterSuite
	public void quit() {
		driver.close();
	}
	public static void main(String[] args) {
		
	}
	
}
