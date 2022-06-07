package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import configurationPath.ConfigurationPath;

public class Tests {
	WebDriver driver;
	POM abd;
	
	@BeforeClass
	public void Web() {
		Base abc= new Base();
		abc.driverInit();
		driver = new ChromeDriver();
		 abd=new POM(driver);
		}
		
		@AfterClass
		public void CloseBrowser() {
			
			driver.quit();
			}
		
		@BeforeMethod
		public void OpenBrowser() {
			driver.get(ConfigurationPath.UrlLink);	
		}
		
		@AfterMethod
		public void Refresh() {
			driver.get(ConfigurationPath.UrlLink);
		}
		@Test
		public void TC01() {
			abd.enterL_Name("Suraj");
			abd.enter_Password("4334");
			//abd.button();
			
		}
		@Test
		public void TC02() {
			abd.enterL_Name("adgkdka");
			abd.enter_Password("hjgjg");
			//abd.button();
		}

}
