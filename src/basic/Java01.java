package basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Java01 {
public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\Software testing\\Crome browser\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();

		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		driver.navigate().to("https://google-chrome.en.uptodown.com/windows/download");
		driver.navigate().back();
		
	}

}
