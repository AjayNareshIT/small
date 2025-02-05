package asdf;
import java.io.File;
import java.io.IOException;



import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
//import com.aventstack.extentreports.reporter.FileUtil;

public class yui {


			public static void main(String[] args) throws IOException {
				
					//System.setProperty("Webdriver.chrome.driver", "C:\\Users\\USER\\Downloads\\chromedriver-win64.exe");
					WebDriverManager.chromedriver().setup();
					WebDriver driver = new ChromeDriver();
					driver.get("https:/www.google.com");
					
					TakesScreenshot shot = (TakesScreenshot) driver;
				    File source = shot.getScreenshotAs(OutputType.FILE);
					
					File fs = new File("D:\\" + ".png");
					FileUtils.copyFile(source, fs);
				      fs.getAbsolutePath();
				      driver.close();
		}
		

	
}
