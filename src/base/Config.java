package base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Config {

		public WebDriver driver=null;
			
			
		

		@BeforeTest
		public void beforeTestStart(){
//			System.setProperty("webdriver.chrome.driver", "C:\\Users\\mdjal\\Desktop\\QA Course\\US Bank Project\\Drivers\\chromedriver.exe");		// init the chrome driver
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\drivers\\chromedriver.exe");			
			driver = new ChromeDriver();
			// lets go to facebook.com
			driver.get("https://www.usbank.com/index.html");
			// maximize the window 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		} 
		@AfterTest
		public void closewindow(){
			driver.close();
		}
		
}
			
			
			
			
			
			
			
			
			
			
		

	


