import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class selemium {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.selenium.dev/downloads/");
		
		List<WebElement> row = driver.findElements(By.xpath("//*[@class='data-list']/tbody/tr"));
		int rowsize = row.size();
		System.out.println(rowsize);
		
		
	 List<WebElement> col = driver.findElements(By.xpath("//*[@class='data-list']/thead/tr/th"));
		int colsize=col.size();
		System.out.println(colsize);
		
		WebElement values = driver.findElement(By.xpath("//*[@class='data-list']//tr["+3+"]/td["+3+"]"));
	System.out.print(values.getText()+"       ");
		
		
//		for(int i=1;i<=rowsize;i++) {
//			for(int j=1;j<=colsize;j++) {
//				WebElement values = driver.findElement(By.xpath("//*[@class='data-list']//tr["+i+"]/td["+j+"]"));
//				System.out.print(values.getText()+"       ");
//				
//				
//			}
//			System.out.println();
//		}
//		
		
		
		
		
		
		
		
	}
}
