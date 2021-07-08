package testng1;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ss {

	
	public static void screnshot(WebDriver driver,String filename ) throws Throwable {
		TakesScreenshot src = (TakesScreenshot)driver;
	File source	=src.getScreenshotAs(OutputType.FILE);
		
	File destination=new File(System.getProperty("user.dir")+"//SsScreenshot//"+filename+".png");
	FileHandler.copy(source, destination);
	
	
	
	
	
	
	}
	
	
	
	
	
	
}
