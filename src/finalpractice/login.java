package finalpractice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class login {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
	
		String path=System.getProperty("user.dir")+"\\config.properties";
		FileInputStream fi=new FileInputStream(path);
		        Properties prop=new Properties();
		        prop.load(fi);
		        
		        driver.get(prop.getProperty("testsiteurl"));
		driver.findElement(By.xpath("(//input[@type= 'text'])[2]")).sendKeys(prop.getProperty("id"));
		driver.findElement(By.id("txtPassword")).sendKeys(prop.getProperty("pass"));
		//driver.findElement(By.id("btnLogin")).click();
		
	
		driver.findElement(By.partialLinkText("OrangeHRM, Inc")).click();
		driver.findElement(By.partialLinkText("OrangeHRM, Inc")).click();
		               Set<String> all = driver.getWindowHandles();
		        int m =all.size();
		       String s1 [] =new String[m];
		int i=0;
		       for(String ss: all ) {
		    	   s1[i] =ss;
		    	   i++;
		       }
		       driver.switchTo().window(s1[1]);
		       driver.findElement(By.xpath("/html/body/div[4]/div/div/div/div/div/a/button")).click();
		       
		       
		
		       
	}

}
