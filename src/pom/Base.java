package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import configurationPath.ConfigurationPath;

public class Base {
	public WebDriver driverInit(){
		//System.setProperty("Webdriver.chrome.driver", ConfigurationPath.WebdriverPath);
		System.setProperty("webdriver.chrome.driver", ConfigurationPath.WebdriverPath);
		WebDriver driver=new ChromeDriver();
		return driver;
	
	}

}
